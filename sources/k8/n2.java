package k8;

import e.k;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class n2 extends k6<n2, m2> implements n7 {
    /* access modifiers changed from: private */
    public static final n2 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private q6<p2> zzi;
    private q6<l2> zzj;
    private q6<u1> zzk;
    private String zzl;
    private boolean zzm;
    private q6<x3> zzn;

    static {
        n2 n2Var = new n2();
        zza = n2Var;
        k6.l(n2.class, n2Var);
    }

    public n2() {
        v7<Object> v7Var = v7.f20508d;
        this.zzi = v7Var;
        this.zzj = v7Var;
        this.zzk = v7Var;
        this.zzl = "";
        this.zzn = v7Var;
    }

    public static /* synthetic */ void D(n2 n2Var, int i10, l2 l2Var) {
        q6<l2> q6Var = n2Var.zzj;
        if (!q6Var.e()) {
            n2Var.zzj = k6.j(q6Var);
        }
        n2Var.zzj.set(i10, l2Var);
    }

    public static void E(n2 n2Var) {
        n2Var.zzk = v7.f20508d;
    }

    public static m2 w() {
        return (m2) zza.n();
    }

    public static n2 y() {
        return zza;
    }

    public final List<u1> A() {
        return this.zzk;
    }

    public final List<x3> B() {
        return this.zzn;
    }

    public final List<p2> C() {
        return this.zzi;
    }

    public final boolean F() {
        return this.zzm;
    }

    public final boolean G() {
        return (this.zze & 2) != 0;
    }

    public final boolean H() {
        return (this.zze & 1) != 0;
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", p2.class, "zzj", l2.class, "zzk", u1.class, "zzl", "zzm", "zzn", x3.class});
        } else if (i11 == 3) {
            return new n2();
        } else {
            if (i11 == 4) {
                return new m2((k) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return this.zzn.size();
    }

    public final int t() {
        return this.zzj.size();
    }

    public final long u() {
        return this.zzf;
    }

    public final l2 v(int i10) {
        return this.zzj.get(i10);
    }

    public final String z() {
        return this.zzg;
    }
}
