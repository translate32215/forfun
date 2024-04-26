package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kw extends aq<kw, a> implements c90 {
    /* access modifiers changed from: private */
    public static final kw zzceq;
    private static volatile f90<kw> zzei;
    private int zzceo;
    private int zzcep;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<kw, a> {
        public a(uw uwVar) {
            super(kw.zzceq);
        }
    }

    static {
        kw kwVar = new kw();
        zzceq = kwVar;
        aq.t(kw.class, kwVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new kw();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzceq, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdt", "zzceo", "zzcep"});
            case 4:
                return zzceq;
            case 5:
                f90<kw> f90 = zzei;
                if (f90 == null) {
                    synchronized (kw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzceq);
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
