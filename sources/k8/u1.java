package k8;

import e.d;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class u1 extends k6<u1, t1> implements n7 {
    /* access modifiers changed from: private */
    public static final u1 zza;
    private int zze;
    private int zzf;
    private q6<e2> zzg;
    private q6<w1> zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        u1 u1Var = new u1();
        zza = u1Var;
        k6.l(u1.class, u1Var);
    }

    public u1() {
        v7<Object> v7Var = v7.f20508d;
        this.zzg = v7Var;
        this.zzh = v7Var;
    }

    public static /* synthetic */ void A(u1 u1Var, int i10, e2 e2Var) {
        q6<e2> q6Var = u1Var.zzg;
        if (!q6Var.e()) {
            u1Var.zzg = k6.j(q6Var);
        }
        u1Var.zzg.set(i10, e2Var);
    }

    public static /* synthetic */ void B(u1 u1Var, int i10, w1 w1Var) {
        q6<w1> q6Var = u1Var.zzh;
        if (!q6Var.e()) {
            u1Var.zzh = k6.j(q6Var);
        }
        u1Var.zzh.set(i10, w1Var);
    }

    public final boolean C() {
        return (this.zze & 1) != 0;
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", e2.class, "zzh", w1.class, "zzi", "zzj"});
        } else if (i11 == 3) {
            return new u1();
        } else {
            if (i11 == 4) {
                return new t1((d) null);
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

    public final int t() {
        return this.zzh.size();
    }

    public final int u() {
        return this.zzg.size();
    }

    public final w1 w(int i10) {
        return this.zzh.get(i10);
    }

    public final e2 x(int i10) {
        return this.zzg.get(i10);
    }

    public final List<w1> y() {
        return this.zzh;
    }

    public final List<e2> z() {
        return this.zzg;
    }
}
