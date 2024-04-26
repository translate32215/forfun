package k8;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class x3 extends k6<x3, w3> implements n7 {
    /* access modifiers changed from: private */
    public static final x3 zza;
    private int zze;
    private q6<b4> zzf = v7.f20508d;
    private t3 zzg;

    static {
        x3 x3Var = new x3();
        zza = x3Var;
        k6.l(x3.class, x3Var);
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", b4.class, "zzg"});
        } else if (i11 == 3) {
            return new x3();
        } else {
            if (i11 == 4) {
                return new w3();
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final t3 s() {
        t3 t3Var = this.zzg;
        return t3Var == null ? t3.u() : t3Var;
    }

    public final List<b4> u() {
        return this.zzf;
    }
}
