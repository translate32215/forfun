package e8;

import com.google.android.gms.internal.ads.nv;
import com.google.android.gms.internal.ads.ov;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class e3 implements f3<t7> {
    public final void f(Object obj, Map map) {
        t7 t7Var = (t7) obj;
        if (map.keySet().contains("start")) {
            s7 s7Var = (s7) t7Var.H();
            synchronized (s7Var.f8092d) {
            }
            s7Var.D++;
            s7Var.F();
        } else if (map.keySet().contains("stop")) {
            s7 s7Var2 = (s7) t7Var.H();
            s7Var2.D--;
            s7Var2.F();
        } else if (map.keySet().contains("cancel")) {
            s7 s7Var3 = (s7) t7Var.H();
            nv nvVar = s7Var3.f8090b;
            if (nvVar != null) {
                nvVar.b(ov.DELAY_PAGE_LOAD_CANCELLED_AD);
            }
            s7Var3.C = true;
            s7Var3.F();
            s7Var3.f8089a.destroy();
        }
    }
}
