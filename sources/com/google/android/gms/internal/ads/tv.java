package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.vh0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class tv extends aq<tv, a> implements c90 {
    /* access modifiers changed from: private */
    public static final tv zzcgl;
    private static volatile f90<tv> zzei;
    private int zzcci = 1000;
    private rw zzcft;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<tv, a> {
        public a(uw uwVar) {
            super(tv.zzcgl);
        }
    }

    static {
        tv tvVar = new tv();
        zzcgl = tvVar;
        aq.t(tv.class, tvVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new tv();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcgl, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdt", "zzcci", vh0.f17147a, "zzcft"});
            case 4:
                return zzcgl;
            case 5:
                f90<tv> f90 = zzei;
                if (f90 == null) {
                    synchronized (tv.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcgl);
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
