package k8;

import androidx.appcompat.widget.p;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class n3 extends k6<n3, m3> implements n7 {
    /* access modifiers changed from: private */
    public static final n3 zza;
    private p6 zze;
    private p6 zzf;
    private q6<w2> zzg;
    private q6<p3> zzh;

    static {
        n3 n3Var = new n3();
        zza = n3Var;
        k6.l(n3.class, n3Var);
    }

    public n3() {
        b7 b7Var = b7.f20077d;
        this.zze = b7Var;
        this.zzf = b7Var;
        v7<Object> v7Var = v7.f20508d;
        this.zzg = v7Var;
        this.zzh = v7Var;
    }

    public static void F(n3 n3Var, Iterable iterable) {
        p6 p6Var = n3Var.zze;
        if (!((h5) p6Var).f20240a) {
            n3Var.zze = k6.q(p6Var);
        }
        g5.g(iterable, n3Var.zze);
    }

    public static void G(n3 n3Var) {
        n3Var.zze = b7.f20077d;
    }

    public static void H(n3 n3Var, Iterable iterable) {
        p6 p6Var = n3Var.zzf;
        if (!((h5) p6Var).f20240a) {
            n3Var.zzf = k6.q(p6Var);
        }
        g5.g(iterable, n3Var.zzf);
    }

    public static void I(n3 n3Var) {
        n3Var.zzf = b7.f20077d;
    }

    public static void J(n3 n3Var, Iterable iterable) {
        q6<w2> q6Var = n3Var.zzg;
        if (!q6Var.e()) {
            n3Var.zzg = k6.j(q6Var);
        }
        g5.g(iterable, n3Var.zzg);
    }

    public static void K(n3 n3Var, int i10) {
        q6<w2> q6Var = n3Var.zzg;
        if (!q6Var.e()) {
            n3Var.zzg = k6.j(q6Var);
        }
        n3Var.zzg.remove(i10);
    }

    public static void L(n3 n3Var, Iterable iterable) {
        q6<p3> q6Var = n3Var.zzh;
        if (!q6Var.e()) {
            n3Var.zzh = k6.j(q6Var);
        }
        g5.g(iterable, n3Var.zzh);
    }

    public static void M(n3 n3Var, int i10) {
        q6<p3> q6Var = n3Var.zzh;
        if (!q6Var.e()) {
            n3Var.zzh = k6.j(q6Var);
        }
        n3Var.zzh.remove(i10);
    }

    public static m3 x() {
        return (m3) zza.n();
    }

    public static n3 z() {
        return zza;
    }

    public final p3 A(int i10) {
        return this.zzh.get(i10);
    }

    public final List<w2> B() {
        return this.zzg;
    }

    public final List<Long> C() {
        return this.zzf;
    }

    public final List<p3> D() {
        return this.zzh;
    }

    public final List<Long> E() {
        return this.zze;
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", w2.class, "zzh", p3.class});
        } else if (i11 == 3) {
            return new n3();
        } else {
            if (i11 == 4) {
                return new m3((p) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return this.zzg.size();
    }

    public final int t() {
        return ((b7) this.zzf).size();
    }

    public final int u() {
        return this.zzh.size();
    }

    public final int v() {
        return ((b7) this.zze).size();
    }

    public final w2 w(int i10) {
        return this.zzg.get(i10);
    }
}
