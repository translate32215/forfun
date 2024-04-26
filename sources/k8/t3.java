package k8;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class t3 extends k6<t3, s3> implements n7 {
    /* access modifiers changed from: private */
    public static final t3 zza;
    private q6<v3> zze = v7.f20508d;

    static {
        t3 t3Var = new t3();
        zza = t3Var;
        k6.l(t3.class, t3Var);
    }

    public static t3 u() {
        return zza;
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", v3.class});
        } else if (i11 == 3) {
            return new t3();
        } else {
            if (i11 == 4) {
                return new s3();
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return this.zze.size();
    }

    public final List<v3> v() {
        return this.zze;
    }
}
