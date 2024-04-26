package k8;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class b4 extends k6<b4, y3> implements n7 {
    /* access modifiers changed from: private */
    public static final b4 zza;
    private int zze;
    private int zzf;
    private q6<b4> zzg = v7.f20508d;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        b4 b4Var = new b4();
        zza = b4Var;
        k6.l(b4.class, b4Var);
    }

    public final boolean A() {
        return (this.zze & 4) != 0;
    }

    public final int B() {
        int a10 = a4.a(this.zzf);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", z3.f20564a, "zzg", b4.class, "zzh", "zzi", "zzj", "zzk"});
        } else if (i11 == 3) {
            return new b4();
        } else {
            if (i11 == 4) {
                return new y3();
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

    public final String u() {
        return this.zzh;
    }

    public final String v() {
        return this.zzi;
    }

    public final List<b4> w() {
        return this.zzg;
    }

    public final boolean x() {
        return this.zzj;
    }

    public final boolean y() {
        return (this.zze & 8) != 0;
    }

    public final boolean z() {
        return (this.zze & 16) != 0;
    }
}
