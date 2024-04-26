package k8;

import e.d;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class e2 extends k6<e2, d2> implements n7 {
    /* access modifiers changed from: private */
    public static final e2 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private y1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        e2 e2Var = new e2();
        zza = e2Var;
        k6.l(e2.class, e2Var);
    }

    public static d2 u() {
        return (d2) zza.n();
    }

    public static /* synthetic */ void x(e2 e2Var, String str) {
        e2Var.zze |= 2;
        e2Var.zzg = str;
    }

    public final boolean A() {
        return this.zzk;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
    }

    public final boolean C() {
        return (this.zze & 32) != 0;
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i11 == 3) {
            return new e2();
        } else {
            if (i11 == 4) {
                return new d2((d) null);
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

    public final y1 t() {
        y1 y1Var = this.zzh;
        return y1Var == null ? y1.t() : y1Var;
    }

    public final String w() {
        return this.zzg;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        return this.zzj;
    }
}
