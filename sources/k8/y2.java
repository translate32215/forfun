package k8;

import androidx.appcompat.widget.p;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class y2 extends k6<y2, x2> implements n7 {
    /* access modifiers changed from: private */
    public static final y2 zza;
    private int zze;
    private q6<c3> zzf = v7.f20508d;
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        y2 y2Var = new y2();
        zza = y2Var;
        k6.l(y2.class, y2Var);
    }

    public static /* synthetic */ void B(y2 y2Var, int i10, c3 c3Var) {
        c3Var.getClass();
        y2Var.M();
        y2Var.zzf.set(i10, c3Var);
    }

    public static /* synthetic */ void C(y2 y2Var, c3 c3Var) {
        c3Var.getClass();
        y2Var.M();
        y2Var.zzf.add(c3Var);
    }

    public static /* synthetic */ void D(y2 y2Var, Iterable iterable) {
        y2Var.M();
        g5.g(iterable, y2Var.zzf);
    }

    public static void E(y2 y2Var) {
        y2Var.zzf = v7.f20508d;
    }

    public static /* synthetic */ void F(y2 y2Var, int i10) {
        y2Var.M();
        y2Var.zzf.remove(i10);
    }

    public static /* synthetic */ void G(y2 y2Var, String str) {
        str.getClass();
        y2Var.zze |= 1;
        y2Var.zzg = str;
    }

    public static /* synthetic */ void H(y2 y2Var, long j10) {
        y2Var.zze |= 2;
        y2Var.zzh = j10;
    }

    public static /* synthetic */ void I(y2 y2Var, long j10) {
        y2Var.zze |= 4;
        y2Var.zzi = j10;
    }

    public static x2 w() {
        return (x2) zza.n();
    }

    public final List<c3> A() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zze & 8) != 0;
    }

    public final boolean K() {
        return (this.zze & 4) != 0;
    }

    public final boolean L() {
        return (this.zze & 2) != 0;
    }

    public final void M() {
        q6<c3> q6Var = this.zzf;
        if (!q6Var.e()) {
            this.zzf = k6.j(q6Var);
        }
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", c3.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new y2();
        } else {
            if (i11 == 4) {
                return new x2((p) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return this.zzj;
    }

    public final int t() {
        return this.zzf.size();
    }

    public final long u() {
        return this.zzi;
    }

    public final long v() {
        return this.zzh;
    }

    public final c3 y(int i10) {
        return this.zzf.get(i10);
    }

    public final String z() {
        return this.zzg;
    }
}
