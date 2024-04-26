package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class pa extends aq<pa, a> implements c90 {
    private static volatile f90<pa> zzei;
    /* access modifiers changed from: private */
    public static final pa zzmb;
    private int zzdt;
    private long zzkx;
    private String zzlz = "";
    private mp zzma = mp.f7494b;

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class a extends aq.b<pa, a> {
        public a(la laVar) {
            super(pa.zzmb);
        }
    }

    static {
        pa paVar = new pa();
        zzmb = paVar;
        aq.t(pa.class, paVar);
    }

    public static pa A() {
        return zzmb;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (la.f7356a[i10 - 1]) {
            case 1:
                return new pa();
            case 2:
                return new a((la) null);
            case 3:
                return new k90(zzmb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzdt", "zzkx", "zzlz", "zzma"});
            case 4:
                return zzmb;
            case 5:
                f90<pa> f90 = zzei;
                if (f90 == null) {
                    synchronized (pa.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzmb);
                            zzei = f90;
                        }
                    }
                }
                return f90;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean y() {
        return (this.zzdt & 1) != 0;
    }

    public final long z() {
        return this.zzkx;
    }
}
