package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.vh0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class sv extends aq<sv, a> implements c90 {
    /* access modifiers changed from: private */
    public static final sv zzcgk;
    private static volatile f90<sv> zzei;
    private int zzcci = 1000;
    private rw zzcft;
    private nw zzcfu;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<sv, a> {
        public a(uw uwVar) {
            super(sv.zzcgk);
        }
    }

    static {
        sv svVar = new sv();
        zzcgk = svVar;
        aq.t(sv.class, svVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new sv();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcgk, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdt", "zzcci", vh0.f17147a, "zzcft", "zzcfu"});
            case 4:
                return zzcgk;
            case 5:
                f90<sv> f90 = zzei;
                if (f90 == null) {
                    synchronized (sv.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcgk);
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
