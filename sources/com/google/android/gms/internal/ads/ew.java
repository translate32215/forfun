package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.vh0;
import e8.w70;
import e8.y70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ew extends aq<ew, a> implements c90 {
    /* access modifiers changed from: private */
    public static final ew zzccj;
    private static volatile f90<ew> zzei;
    private y70 zzccf = w70.f17224d;
    private int zzcci;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<ew, a> {
        public a(uw uwVar) {
            super(ew.zzccj);
        }
    }

    static {
        ew ewVar = new ew();
        zzccj = ewVar;
        aq.t(ew.class, ewVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new ew();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzccj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zzdt", "zzcci", vh0.f17147a, "zzccf"});
            case 4:
                return zzccj;
            case 5:
                f90<ew> f90 = zzei;
                if (f90 == null) {
                    synchronized (ew.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzccj);
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
