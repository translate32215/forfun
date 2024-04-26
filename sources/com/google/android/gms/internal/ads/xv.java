package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c80;
import e8.c90;
import e8.f90;
import e8.i90;
import e8.k90;
import e8.vh0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xv extends aq<xv, a> implements c90 {
    /* access modifiers changed from: private */
    public static final xv zzcaf;
    private static volatile f90<xv> zzei;
    private String zzcac = "";
    private c80<wv> zzcad = i90.f15001d;
    private int zzcae;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<xv, a> {
        public a(uw uwVar) {
            super(xv.zzcaf);
        }
    }

    static {
        xv xvVar = new xv();
        zzcaf = xvVar;
        aq.t(xv.class, xvVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new xv();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcaf, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zzdt", "zzcac", "zzcad", wv.class, "zzcae", vh0.f17147a});
            case 4:
                return zzcaf;
            case 5:
                f90<xv> f90 = zzei;
                if (f90 == null) {
                    synchronized (xv.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcaf);
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
