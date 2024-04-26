package e8;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.d;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.nv;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;
import d7.l;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l0.e;

@TargetApi(11)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class nc extends s7 {
    public nc(t7 t7Var, nv nvVar, boolean z10) {
        super(t7Var, nvVar, z10);
    }

    public final WebResourceResponse S(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof t7)) {
            e.K("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        t7 t7Var = (t7) webView;
        h8 h8Var = this.A;
        if (h8Var != null) {
            h8Var.d(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return O(str, map);
        }
        if (t7Var.H() != null) {
            s7 s7Var = (s7) t7Var.H();
            synchronized (s7Var.f8092d) {
                s7Var.f8099s = false;
                s7Var.f8100t = true;
                o50 o50 = h9.f14885e;
                ((k9) o50).f15244a.execute(new e7.e(s7Var));
            }
        }
        if (t7Var.j().b()) {
            str2 = (String) ti0.f16763j.f16769f.a(t.F);
        } else if (t7Var.u()) {
            str2 = (String) ti0.f16763j.f16769f.a(t.E);
        } else {
            str2 = (String) ti0.f16763j.f16769f.a(t.D);
        }
        p pVar = l.B.f13186c;
        Context context = t7Var.getContext();
        String str3 = t7Var.c().f14544a;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", l.B.f13186c.H(context, str3));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str4 = (String) ((d7) new d(context).a(0, str2, hashMap, (byte[]) null)).get(60, TimeUnit.SECONDS);
            if (str4 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str4.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e10) {
            e.D("Could not fetch MRAID JS.", e10);
            return null;
        }
    }
}
