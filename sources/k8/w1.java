package k8;

import e.d;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class w1 extends k6<w1, v1> implements n7 {
    /* access modifiers changed from: private */
    public static final w1 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private q6<y1> zzh = v7.f20508d;
    private boolean zzi;
    private c2 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        w1 w1Var = new w1();
        zza = w1Var;
        k6.l(w1.class, w1Var);
    }

    public static /* synthetic */ void A(w1 w1Var, String str) {
        w1Var.zze |= 2;
        w1Var.zzg = str;
    }

    public static /* synthetic */ void B(w1 w1Var, int i10, y1 y1Var) {
        y1Var.getClass();
        q6<y1> q6Var = w1Var.zzh;
        if (!q6Var.e()) {
            w1Var.zzh = k6.j(q6Var);
        }
        w1Var.zzh.set(i10, y1Var);
    }

    public static v1 u() {
        return (v1) zza.n();
    }

    public final boolean C() {
        return this.zzk;
    }

    public final boolean D() {
        return this.zzl;
    }

    public final boolean E() {
        return this.zzm;
    }

    public final boolean F() {
        return (this.zze & 8) != 0;
    }

    public final boolean G() {
        return (this.zze & 1) != 0;
    }

    public final boolean H() {
        return (this.zze & 64) != 0;
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", y1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i11 == 3) {
            return new w1();
        } else {
            if (i11 == 4) {
                return new v1((d) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return this.zzh.size();
    }

    public final int t() {
        return this.zzf;
    }

    public final y1 w(int i10) {
        return this.zzh.get(i10);
    }

    public final c2 x() {
        c2 c2Var = this.zzj;
        return c2Var == null ? c2.t() : c2Var;
    }

    public final String y() {
        return this.zzg;
    }

    public final List<y1> z() {
        return this.zzh;
    }
}
