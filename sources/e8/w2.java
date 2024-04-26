package e8;

import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.tm;
import java.util.Map;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class w2 implements f3 {

    /* renamed from: a  reason: collision with root package name */
    public static final f3 f17204a = new w2();

    public final void f(Object obj, Map map) {
        qc qcVar = (qc) obj;
        f3<t7> f3Var = q2.f16061a;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            tm s10 = qcVar.s();
            if (s10 != null) {
                s10.f8207b.b(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            e.K("Could not parse touch parameters from gmsg.");
        }
    }
}
