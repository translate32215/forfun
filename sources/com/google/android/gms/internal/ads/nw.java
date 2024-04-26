package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class nw extends aq<nw, a> implements c90 {
    /* access modifiers changed from: private */
    public static final nw zzcex;
    private static volatile f90<nw> zzei;
    private int zzcev;
    private int zzcew;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<nw, a> {
        public a(uw uwVar) {
            super(nw.zzcex);
        }
    }

    static {
        nw nwVar = new nw();
        zzcex = nwVar;
        aq.t(nw.class, nwVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new nw();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcex, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdt", "zzcev", "zzcew"});
            case 4:
                return zzcex;
            case 5:
                f90<nw> f90 = zzei;
                if (f90 == null) {
                    synchronized (nw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcex);
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
