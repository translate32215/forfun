package k8;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class e3 extends k6<e3, d3> implements n7 {
    /* access modifiers changed from: private */
    public static final e3 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private s2 zzh;

    static {
        e3 e3Var = new e3();
        zza = e3Var;
        k6.l(e3.class, e3Var);
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new e3();
        } else {
            if (i11 == 4) {
                return new d3();
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
