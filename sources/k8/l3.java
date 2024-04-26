package k8;

import androidx.appcompat.widget.p;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class l3 extends k6<l3, j3> implements n7 {
    /* access modifiers changed from: private */
    public static final l3 zza;
    private int zze;
    private int zzf = 1;
    private q6<a3> zzg = v7.f20508d;

    static {
        l3 l3Var = new l3();
        zza = l3Var;
        k6.l(l3.class, l3Var);
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", k3.f20291a, "zzg", a3.class});
        } else if (i11 == 3) {
            return new l3();
        } else {
            if (i11 == 4) {
                return new j3((p) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
