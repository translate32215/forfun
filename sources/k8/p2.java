package k8;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class p2 extends k6<p2, o2> implements n7 {
    /* access modifiers changed from: private */
    public static final p2 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        p2 p2Var = new p2();
        zza = p2Var;
        k6.l(p2.class, p2Var);
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new p2();
        } else {
            if (i11 == 4) {
                return new o2();
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

    public final String u() {
        return this.zzg;
    }
}
