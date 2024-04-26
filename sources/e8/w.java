package e8;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.ih;
import com.google.android.gms.internal.ads.y6;
import d7.l;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public String f17181a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f17182b;

    /* renamed from: c  reason: collision with root package name */
    public Context f17183c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f17184d = null;

    public w(Context context, String str) {
        String str2;
        this.f17183c = context;
        this.f17184d = str;
        this.f17181a = (String) p0.f15859b.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f17182b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.f17182b.put("v", "3");
        this.f17182b.put("os", Build.VERSION.RELEASE);
        this.f17182b.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.f17182b;
        p pVar = l.B.f13186c;
        map.put("device", p.L());
        Map<String, String> map2 = this.f17182b;
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        map2.put("app", str2);
        Map<String, String> map3 = this.f17182b;
        p pVar2 = l.B.f13186c;
        map3.put("is_lite_sdk", p.m(context) ? "1" : "0");
        g2 g2Var = l.B.f13197n;
        Context context2 = this.f17183c;
        g2Var.getClass();
        p50 i10 = ((ih) h9.f14881a).i(new i7(g2Var, context2));
        try {
            this.f17182b.put("network_coarse", Integer.toString(((h7) i10.get()).f14873j));
            this.f17182b.put("network_fine", Integer.toString(((h7) i10.get()).f14874k));
        } catch (Exception e10) {
            y6 y6Var = l.B.f13190g;
            a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "CsiConfiguration.CsiConfiguration");
        }
    }
}
