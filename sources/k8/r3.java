package k8;

import androidx.appcompat.widget.p;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class r3 extends k6<r3, q3> implements n7 {
    /* access modifiers changed from: private */
    public static final r3 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        r3 r3Var = new r3();
        zza = r3Var;
        k6.l(r3.class, r3Var);
    }

    public static /* synthetic */ void A(r3 r3Var, String str) {
        str.getClass();
        r3Var.zze |= 2;
        r3Var.zzg = str;
    }

    public static /* synthetic */ void B(r3 r3Var, String str) {
        str.getClass();
        r3Var.zze |= 4;
        r3Var.zzh = str;
    }

    public static /* synthetic */ void C(r3 r3Var) {
        r3Var.zze &= -5;
        r3Var.zzh = zza.zzh;
    }

    public static /* synthetic */ void D(r3 r3Var, long j10) {
        r3Var.zze |= 8;
        r3Var.zzi = j10;
    }

    public static /* synthetic */ void E(r3 r3Var) {
        r3Var.zze &= -9;
        r3Var.zzi = 0;
    }

    public static /* synthetic */ void F(r3 r3Var, double d10) {
        r3Var.zze |= 32;
        r3Var.zzk = d10;
    }

    public static /* synthetic */ void G(r3 r3Var) {
        r3Var.zze &= -33;
        r3Var.zzk = 0.0d;
    }

    public static q3 v() {
        return (q3) zza.n();
    }

    public static /* synthetic */ void z(r3 r3Var, long j10) {
        r3Var.zze |= 1;
        r3Var.zzf = j10;
    }

    public final boolean H() {
        return (this.zze & 32) != 0;
    }

    public final boolean I() {
        return (this.zze & 8) != 0;
    }

    public final boolean J() {
        return (this.zze & 1) != 0;
    }

    public final boolean K() {
        return (this.zze & 4) != 0;
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i11 == 3) {
            return new r3();
        } else {
            if (i11 == 4) {
                return new q3((p) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final double s() {
        return this.zzk;
    }

    public final long t() {
        return this.zzi;
    }

    public final long u() {
        return this.zzf;
    }

    public final String x() {
        return this.zzg;
    }

    public final String y() {
        return this.zzh;
    }
}
