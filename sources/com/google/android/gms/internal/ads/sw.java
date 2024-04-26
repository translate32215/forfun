package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.vh0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class sw extends aq<sw, a> implements c90 {
    /* access modifiers changed from: private */
    public static final sw zzcge;
    private static volatile f90<sw> zzei;
    private int zzcci = 1000;
    private rw zzcft;
    private nw zzcfu;
    private ow zzcgd;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<sw, a> {
        public a(uw uwVar) {
            super(sw.zzcge);
        }
    }

    static {
        sw swVar = new sw();
        zzcge = swVar;
        aq.t(sw.class, swVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new sw();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcge, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzdt", "zzcgd", "zzcci", vh0.f17147a, "zzcft", "zzcfu"});
            case 4:
                return zzcge;
            case 5:
                f90<sw> f90 = zzei;
                if (f90 == null) {
                    synchronized (sw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcge);
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
}
