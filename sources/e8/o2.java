package e8;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.i;
import com.google.android.gms.internal.ads.j;
import com.google.android.gms.internal.ads.k;
import com.google.android.gms.internal.ads.t7;
import d7.l;
import java.util.Map;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class o2 implements f3<t7> {
    public final void f(Object obj, Map map) {
        t7 t7Var = (t7) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                e.K("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                e.K("No timestamp given for CSI tick.");
            } else {
                try {
                    long parseLong = (Long.parseLong(str4) - l.B.f13193j.b()) + l.B.f13193j.a();
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    i i10 = t7Var.i();
                    k kVar = i10.f6910b;
                    j jVar = i10.f6909a.get(str3);
                    String[] strArr = {str2};
                    if (!(kVar == null || jVar == null)) {
                        kVar.a(jVar, parseLong, strArr);
                    }
                    Map<String, j> map2 = i10.f6909a;
                    k kVar2 = i10.f6910b;
                    j jVar2 = null;
                    if (kVar2 != null && kVar2.f7185a) {
                        jVar2 = new j(parseLong, (String) null, (j) null);
                    }
                    map2.put(str2, jVar2);
                } catch (NumberFormatException e10) {
                    e.D("Malformed timestamp for CSI tick.", e10);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                e.K("No value given for CSI experiment.");
                return;
            }
            k kVar3 = t7Var.i().f6910b;
            if (kVar3 == null) {
                e.K("No ticker for WebView, dropping experiment ID.");
            } else {
                kVar3.b("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                e.K("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                e.K("No name given for CSI extra.");
            } else {
                k kVar4 = t7Var.i().f6910b;
                if (kVar4 == null) {
                    e.K("No ticker for WebView, dropping extra parameter.");
                } else {
                    kVar4.b(str6, str7);
                }
            }
        }
    }
}
