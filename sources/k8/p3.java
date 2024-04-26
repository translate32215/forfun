package k8;

import androidx.appcompat.widget.p;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class p3 extends k6<p3, o3> implements n7 {
    /* access modifiers changed from: private */
    public static final p3 zza;
    private int zze;
    private int zzf;
    private p6 zzg = b7.f20077d;

    static {
        p3 p3Var = new p3();
        zza = p3Var;
        k6.l(p3.class, p3Var);
    }

    public static o3 v() {
        return (o3) zza.n();
    }

    public static /* synthetic */ void y(p3 p3Var, int i10) {
        p3Var.zze |= 1;
        p3Var.zzf = i10;
    }

    public static void z(p3 p3Var, Iterable iterable) {
        p6 p6Var = p3Var.zzg;
        if (!((h5) p6Var).f20240a) {
            p3Var.zzg = k6.q(p6Var);
        }
        g5.g(iterable, p3Var.zzg);
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new p3();
        } else {
            if (i11 == 4) {
                return new o3((p) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return ((b7) this.zzg).size();
    }

    public final int t() {
        return this.zzf;
    }

    public final long u(int i10) {
        b7 b7Var = (b7) this.zzg;
        b7Var.o(i10);
        return b7Var.f20078b[i10];
    }

    public final List<Long> x() {
        return this.zzg;
    }
}
