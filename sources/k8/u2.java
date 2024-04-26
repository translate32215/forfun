package k8;

import androidx.appcompat.widget.p;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class u2 extends k6<u2, t2> implements n7 {
    /* access modifiers changed from: private */
    public static final u2 zza;
    private int zze;
    private int zzf;
    private n3 zzg;
    private n3 zzh;
    private boolean zzi;

    static {
        u2 u2Var = new u2();
        zza = u2Var;
        k6.l(u2.class, u2Var);
    }

    public static /* synthetic */ void A(u2 u2Var, boolean z10) {
        u2Var.zze |= 8;
        u2Var.zzi = z10;
    }

    public static t2 t() {
        return (t2) zza.n();
    }

    public static /* synthetic */ void x(u2 u2Var, int i10) {
        u2Var.zze |= 1;
        u2Var.zzf = i10;
    }

    public static /* synthetic */ void y(u2 u2Var, n3 n3Var) {
        u2Var.zzg = n3Var;
        u2Var.zze |= 2;
    }

    public static /* synthetic */ void z(u2 u2Var, n3 n3Var) {
        u2Var.zzh = n3Var;
        u2Var.zze |= 4;
    }

    public final boolean B() {
        return this.zzi;
    }

    public final boolean C() {
        return (this.zze & 1) != 0;
    }

    public final boolean D() {
        return (this.zze & 8) != 0;
    }

    public final boolean E() {
        return (this.zze & 4) != 0;
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new u2();
        } else {
            if (i11 == 4) {
                return new t2((p) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return this.zzf;
    }

    public final n3 v() {
        n3 n3Var = this.zzg;
        return n3Var == null ? n3.z() : n3Var;
    }

    public final n3 w() {
        n3 n3Var = this.zzh;
        return n3Var == null ? n3.z() : n3Var;
    }
}
