package k8;

import androidx.appcompat.widget.p;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class g3 extends k6<g3, f3> implements n7 {
    /* access modifiers changed from: private */
    public static final g3 zza;
    private q6<i3> zze = v7.f20508d;

    static {
        g3 g3Var = new g3();
        zza = g3Var;
        k6.l(g3.class, g3Var);
    }

    public static f3 s() {
        return (f3) zza.n();
    }

    public static /* synthetic */ void w(g3 g3Var, i3 i3Var) {
        q6<i3> q6Var = g3Var.zze;
        if (!q6Var.e()) {
            g3Var.zze = k6.j(q6Var);
        }
        g3Var.zze.add(i3Var);
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", i3.class});
        } else if (i11 == 3) {
            return new g3();
        } else {
            if (i11 == 4) {
                return new f3((p) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final i3 u() {
        return this.zze.get(0);
    }

    public final List<i3> v() {
        return this.zze;
    }
}
