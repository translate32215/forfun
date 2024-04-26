package e8;

import com.google.android.gms.internal.ads.t7;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class d3 implements f3<t7> {
    public final /* synthetic */ void f(Object obj, Map map) {
        t7 t7Var = (t7) obj;
        if (map.keySet().contains("start")) {
            t7Var.e0(true);
        }
        if (map.keySet().contains("stop")) {
            t7Var.e0(false);
        }
    }
}
