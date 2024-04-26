package k8;

import androidx.appcompat.widget.p;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class a3 extends k6<a3, z2> implements n7 {
    /* access modifiers changed from: private */
    public static final a3 zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        a3 a3Var = new a3();
        zza = a3Var;
        k6.l(a3.class, a3Var);
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new a3();
        } else {
            if (i11 == 4) {
                return new z2((p) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
