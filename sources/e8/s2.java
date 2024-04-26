package e8;

import android.text.TextUtils;
import androidx.appcompat.widget.o;
import com.google.android.gms.internal.ads.t7;
import java.util.HashMap;
import java.util.Map;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class s2 implements f3 {

    /* renamed from: a  reason: collision with root package name */
    public static final f3 f16368a = new s2();

    public final void f(Object obj, Map map) {
        lc lcVar = (lc) obj;
        f3<t7> f3Var = q2.f16061a;
        if (!((Boolean) ti0.f16763j.f16769f.a(t.f16679w4)).booleanValue()) {
            e.K("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            e.K("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(lcVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        String valueOf2 = String.valueOf(valueOf);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + o.a(str, 13));
        sb2.append("/canOpenApp;");
        sb2.append(str);
        sb2.append(";");
        sb2.append(valueOf2);
        e.H(sb2.toString());
        ((f4) lcVar).O("openableApp", hashMap);
    }
}
