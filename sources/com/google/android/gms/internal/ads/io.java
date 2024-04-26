package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class io extends aq<io, a> implements c90 {
    private static volatile f90<io> zzei;
    /* access modifiers changed from: private */
    public static final io zzihe;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<io, a> {
        public a(jo joVar) {
            super(io.zzihe);
        }
    }

    static {
        io ioVar = new io();
        zzihe = ioVar;
        aq.t(io.class, ioVar);
    }

    public static io y(mp mpVar, up upVar) throws f80 {
        return (io) aq.l(zzihe, mpVar, upVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (jo.f7156a[i10 - 1]) {
            case 1:
                return new io();
            case 2:
                return new a((jo) null);
            case 3:
                return new k90(zzihe, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzihe;
            case 5:
                f90<io> f90 = zzei;
                if (f90 == null) {
                    synchronized (io.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzihe);
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
