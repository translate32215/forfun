package k8;

import e.d;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class y1 extends k6<y1, x1> implements n7 {
    /* access modifiers changed from: private */
    public static final y1 zza;
    private int zze;
    private i2 zzf;
    private c2 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        y1 y1Var = new y1();
        zza = y1Var;
        k6.l(y1.class, y1Var);
    }

    public static y1 t() {
        return zza;
    }

    public static /* synthetic */ void x(y1 y1Var, String str) {
        y1Var.zze |= 8;
        y1Var.zzi = str;
    }

    public final boolean A() {
        return (this.zze & 2) != 0;
    }

    public final boolean B() {
        return (this.zze & 8) != 0;
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
            return new w7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new y1();
        } else {
            if (i11 == 4) {
                return new x1((d) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final c2 u() {
        c2 c2Var = this.zzg;
        return c2Var == null ? c2.t() : c2Var;
    }

    public final i2 v() {
        i2 i2Var = this.zzf;
        return i2Var == null ? i2.u() : i2Var;
    }

    public final String w() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzh;
    }

    public final boolean z() {
        return (this.zze & 4) != 0;
    }
}
