package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c80;
import e8.c90;
import e8.f90;
import e8.i90;
import e8.k90;
import e8.vh0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fw extends aq<fw, a> implements c90 {
    /* access modifiers changed from: private */
    public static final fw zzccm;
    private static volatile f90<fw> zzei;
    private nw zzccg;
    private int zzcci;
    private dw zzcck;
    private c80<mw> zzccl = i90.f15001d;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<fw, a> {
        public a(uw uwVar) {
            super(fw.zzccm);
        }
    }

    static {
        fw fwVar = new fw();
        zzccm = fwVar;
        aq.t(fw.class, fwVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new fw();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzccm, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zzdt", "zzcck", "zzccl", mw.class, "zzcci", vh0.f17147a, "zzccg"});
            case 4:
                return zzccm;
            case 5:
                f90<fw> f90 = zzei;
                if (f90 == null) {
                    synchronized (fw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzccm);
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
