package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.vh0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class rv extends aq<rv, a> implements c90 {
    /* access modifiers changed from: private */
    public static final rv zzcgj;
    private static volatile f90<rv> zzei;
    private int zzcci = 1000;
    private int zzcfj;
    private int zzcfk;
    private rw zzcft;
    private int zzcgf;
    private long zzcgi;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<rv, a> {
        public a(uw uwVar) {
            super(rv.zzcgj);
        }
    }

    static {
        rv rvVar = new rv();
        zzcgj = rvVar;
        aq.t(rv.class, rvVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new rv();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcgj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzdt", "zzcci", vh0.f17147a, "zzcft", "zzcfj", "zzcfk", "zzcgf", "zzcgi"});
            case 4:
                return zzcgj;
            case 5:
                f90<rv> f90 = zzei;
                if (f90 == null) {
                    synchronized (rv.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcgj);
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
