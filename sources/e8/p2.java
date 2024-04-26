package e8;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.t7;
import java.util.HashMap;
import java.util.Map;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class p2 implements f3 {

    /* renamed from: a  reason: collision with root package name */
    public static final f3 f15864a = new p2();

    public final void f(Object obj, Map map) {
        lc lcVar = (lc) obj;
        f3<t7> f3Var = q2.f16061a;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            e.K("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = lcVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z10 = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z10 = false;
            }
            hashMap.put(str2, Boolean.valueOf(z10));
        }
        ((f4) lcVar).O("openableURLs", hashMap);
    }
}
