package k8;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class i2 extends k6<i2, f2> implements n7 {
    /* access modifiers changed from: private */
    public static final i2 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private boolean zzh;
    private q6<String> zzi = v7.f20508d;

    static {
        i2 i2Var = new i2();
        zza = i2Var;
        k6.l(i2.class, i2Var);
    }

    public static i2 u() {
        return zza;
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    public final int B() {
        int a10 = h2.a(this.zzf);
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
            return new w7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", g2.f20218a, "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new i2();
        } else {
            if (i11 == 4) {
                return new f2();
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return this.zzi.size();
    }

    public final String v() {
        return this.zzg;
    }

    public final List<String> w() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zze & 4) != 0;
    }

    public final boolean z() {
        return (this.zze & 2) != 0;
    }
}
