package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yn extends aq<yn, a> implements c90 {
    private static volatile f90<yn> zzei;
    /* access modifiers changed from: private */
    public static final yn zzign;
    private String zzigm = "";

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<yn, a> {
        public a(xn xnVar) {
            super(yn.zzign);
        }
    }

    static {
        yn ynVar = new yn();
        zzign = ynVar;
        aq.t(yn.class, ynVar);
    }

    public static yn B(mp mpVar, up upVar) throws f80 {
        return (yn) aq.l(zzign, mpVar, upVar);
    }

    public static yn z() {
        return zzign;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (xn.f8559a[i10 - 1]) {
            case 1:
                return new yn();
            case 2:
                return new a((xn) null);
            case 3:
                return new k90(zzign, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzigm"});
            case 4:
                return zzign;
            case 5:
                f90<yn> f90 = zzei;
                if (f90 == null) {
                    synchronized (yn.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzign);
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

    public final String y() {
        return this.zzigm;
    }
}
