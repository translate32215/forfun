package k8;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class v3 extends k6<v3, u3> implements n7 {
    /* access modifiers changed from: private */
    public static final v3 zza;
    private int zze;
    private String zzf = "";
    private q6<b4> zzg = v7.f20508d;

    static {
        v3 v3Var = new v3();
        zza = v3Var;
        k6.l(v3.class, v3Var);
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", b4.class});
        } else if (i11 == 3) {
            return new v3();
        } else {
            if (i11 == 4) {
                return new u3();
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final String t() {
        return this.zzf;
    }

    public final List<b4> u() {
        return this.zzg;
    }
}
