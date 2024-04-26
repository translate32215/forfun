package k8;

import androidx.appcompat.widget.p;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class c3 extends k6<c3, b3> implements n7 {
    /* access modifiers changed from: private */
    public static final c3 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;
    private q6<c3> zzk = v7.f20508d;

    static {
        c3 c3Var = new c3();
        zza = c3Var;
        k6.l(c3.class, c3Var);
    }

    public static /* synthetic */ void B(c3 c3Var, String str) {
        str.getClass();
        c3Var.zze |= 1;
        c3Var.zzf = str;
    }

    public static /* synthetic */ void C(c3 c3Var, String str) {
        str.getClass();
        c3Var.zze |= 2;
        c3Var.zzg = str;
    }

    public static /* synthetic */ void D(c3 c3Var) {
        c3Var.zze &= -3;
        c3Var.zzg = zza.zzg;
    }

    public static /* synthetic */ void E(c3 c3Var, long j10) {
        c3Var.zze |= 4;
        c3Var.zzh = j10;
    }

    public static /* synthetic */ void F(c3 c3Var) {
        c3Var.zze &= -5;
        c3Var.zzh = 0;
    }

    public static /* synthetic */ void G(c3 c3Var, double d10) {
        c3Var.zze |= 16;
        c3Var.zzj = d10;
    }

    public static /* synthetic */ void H(c3 c3Var) {
        c3Var.zze &= -17;
        c3Var.zzj = 0.0d;
    }

    public static void I(c3 c3Var, c3 c3Var2) {
        q6<c3> q6Var = c3Var.zzk;
        if (!q6Var.e()) {
            c3Var.zzk = k6.j(q6Var);
        }
        c3Var.zzk.add(c3Var2);
    }

    public static void J(c3 c3Var, Iterable iterable) {
        q6<c3> q6Var = c3Var.zzk;
        if (!q6Var.e()) {
            c3Var.zzk = k6.j(q6Var);
        }
        g5.g(iterable, c3Var.zzk);
    }

    public static void K(c3 c3Var) {
        c3Var.zzk = v7.f20508d;
    }

    public static b3 w() {
        return (b3) zza.n();
    }

    public final List<c3> A() {
        return this.zzk;
    }

    public final boolean L() {
        return (this.zze & 16) != 0;
    }

    public final boolean M() {
        return (this.zze & 8) != 0;
    }

    public final boolean N() {
        return (this.zze & 4) != 0;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final boolean P() {
        return (this.zze & 2) != 0;
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", c3.class});
        } else if (i11 == 3) {
            return new c3();
        } else {
            if (i11 == 4) {
                return new b3((p) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final double s() {
        return this.zzj;
    }

    public final float t() {
        return this.zzi;
    }

    public final int u() {
        return this.zzk.size();
    }

    public final long v() {
        return this.zzh;
    }

    public final String y() {
        return this.zzf;
    }

    public final String z() {
        return this.zzg;
    }
}
