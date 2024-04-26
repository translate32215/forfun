package k8;

import e.k;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class l2 extends k6<l2, j2> implements n7 {
    /* access modifiers changed from: private */
    public static final l2 zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        l2 l2Var = new l2();
        zza = l2Var;
        k6.l(l2.class, l2Var);
    }

    public static /* synthetic */ void v(l2 l2Var, String str) {
        str.getClass();
        l2Var.zze |= 1;
        l2Var.zzf = str;
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new l2();
        } else {
            if (i11 == 4) {
                return new j2((k) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return this.zzi;
    }

    public final String u() {
        return this.zzf;
    }

    public final boolean w() {
        return this.zzg;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zze & 8) != 0;
    }
}
