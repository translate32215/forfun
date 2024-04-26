package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xl extends aq<xl, a> implements c90 {
    private static volatile f90<xl> zzei;
    /* access modifiers changed from: private */
    public static final xl zzide;
    private int zzicn;
    private am zzidc;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<xl, a> {
        public a(yl ylVar) {
            super(xl.zzide);
        }
    }

    static {
        xl xlVar = new xl();
        zzide = xlVar;
        aq.t(xl.class, xlVar);
    }

    public static xl B(mp mpVar, up upVar) throws f80 {
        return (xl) aq.l(zzide, mpVar, upVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (yl.f8612a[i10 - 1]) {
            case 1:
                return new xl();
            case 2:
                return new a((yl) null);
            case 3:
                return new k90(zzide, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzidc", "zzicn"});
            case 4:
                return zzide;
            case 5:
                f90<xl> f90 = zzei;
                if (f90 == null) {
                    synchronized (xl.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzide);
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

    public final int y() {
        return this.zzicn;
    }

    public final am z() {
        am amVar = this.zzidc;
        return amVar == null ? am.z() : amVar;
    }
}
