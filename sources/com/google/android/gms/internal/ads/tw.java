package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.vh0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class tw extends aq<tw, a> implements c90 {
    /* access modifiers changed from: private */
    public static final tw zzcgg;
    private static volatile f90<tw> zzei;
    private int zzcci = 1000;
    private int zzcfj;
    private int zzcfk;
    private rw zzcft;
    private int zzcgf;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<tw, a> {
        public a(uw uwVar) {
            super(tw.zzcgg);
        }
    }

    static {
        tw twVar = new tw();
        zzcgg = twVar;
        aq.t(tw.class, twVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new tw();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcgg, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzdt", "zzcci", vh0.f17147a, "zzcft", "zzcfj", "zzcfk", "zzcgf"});
            case 4:
                return zzcgg;
            case 5:
                f90<tw> f90 = zzei;
                if (f90 == null) {
                    synchronized (tw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcgg);
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
