package e8;

import com.google.android.gms.ads.internal.overlay.a;
import com.google.android.gms.internal.ads.t7;
import java.util.Map;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class v2 implements f3<t7> {
    public final /* synthetic */ void f(Object obj, Map map) {
        t7 t7Var = (t7) obj;
        if (t7Var.b0() != null) {
            t7Var.b0().z0();
        }
        a K = t7Var.K();
        if (K != null) {
            K.s6();
            return;
        }
        a Z = t7Var.Z();
        if (Z != null) {
            Z.s6();
        } else {
            e.K("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
