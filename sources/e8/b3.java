package e8;

import com.google.android.gms.internal.ads.t7;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class b3 implements f3<t7> {
    public final /* synthetic */ void f(Object obj, Map map) {
        t7 t7Var = (t7) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            t7Var.v();
        } else if ("resume".equals(str)) {
            t7Var.P();
        }
    }
}
