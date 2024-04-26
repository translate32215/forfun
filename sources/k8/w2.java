package k8;

import androidx.appcompat.widget.p;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class w2 extends k6<w2, v2> implements n7 {
    /* access modifiers changed from: private */
    public static final w2 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        w2 w2Var = new w2();
        zza = w2Var;
        k6.l(w2.class, w2Var);
    }

    public static v2 u() {
        return (v2) zza.n();
    }

    public static /* synthetic */ void w(w2 w2Var, int i10) {
        w2Var.zze |= 1;
        w2Var.zzf = i10;
    }

    public static /* synthetic */ void x(w2 w2Var, long j10) {
        w2Var.zze |= 2;
        w2Var.zzg = j10;
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new w2();
        } else {
            if (i11 == 4) {
                return new v2((p) null);
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

    public final long t() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zze & 2) != 0;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
