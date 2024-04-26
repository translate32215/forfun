package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.vh0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mw extends aq<mw, a> implements c90 {
    /* access modifiers changed from: private */
    public static final mw zzceu;
    private static volatile f90<mw> zzei;
    private String zzccd = "";
    private int zzcce;
    private nw zzccg;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<mw, a> {
        public a(uw uwVar) {
            super(mw.zzceu);
        }
    }

    static {
        mw mwVar = new mw();
        zzceu = mwVar;
        aq.t(mw.class, mwVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new mw();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzceu, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zzdt", "zzccd", "zzcce", vh0.f17147a, "zzccg"});
            case 4:
                return zzceu;
            case 5:
                f90<mw> f90 = zzei;
                if (f90 == null) {
                    synchronized (mw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzceu);
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
