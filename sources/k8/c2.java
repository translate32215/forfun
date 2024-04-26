package k8;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class c2 extends k6<c2, z1> implements n7 {
    /* access modifiers changed from: private */
    public static final c2 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        c2 c2Var = new c2();
        zza = c2Var;
        k6.l(c2.class, c2Var);
    }

    public static c2 t() {
        return zza;
    }

    public final boolean A() {
        return (this.zze & 2) != 0;
    }

    public final boolean B() {
        return (this.zze & 16) != 0;
    }

    public final boolean C() {
        return (this.zze & 8) != 0;
    }

    public final int D() {
        int a10 = b2.a(this.zzf);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", a2.f20061a, "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new c2();
        } else {
            if (i11 == 4) {
                return new z1();
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final String u() {
        return this.zzh;
    }

    public final String v() {
        return this.zzj;
    }

    public final String w() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zze & 1) != 0;
    }

    public final boolean z() {
        return (this.zze & 4) != 0;
    }
}
