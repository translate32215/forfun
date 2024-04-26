package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.vh0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qw extends aq<qw, a> implements c90 {
    /* access modifiers changed from: private */
    public static final qw zzcfv;
    private static volatile f90<qw> zzei;
    private int zzcci = 1000;
    private rw zzcft;
    private nw zzcfu;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<qw, a> {
        public a(uw uwVar) {
            super(qw.zzcfv);
        }
    }

    static {
        qw qwVar = new qw();
        zzcfv = qwVar;
        aq.t(qw.class, qwVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new qw();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcfv, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdt", "zzcci", vh0.f17147a, "zzcft", "zzcfu"});
            case 4:
                return zzcfv;
            case 5:
                f90<qw> f90 = zzei;
                if (f90 == null) {
                    synchronized (qw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcfv);
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
