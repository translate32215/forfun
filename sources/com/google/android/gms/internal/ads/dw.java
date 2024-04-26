package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.vh0;
import e8.w70;
import e8.y70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class dw extends aq<dw, a> implements c90 {
    /* access modifiers changed from: private */
    public static final dw zzcch;
    private static volatile f90<dw> zzei;
    private String zzccd = "";
    private int zzcce;
    private y70 zzccf = w70.f17224d;
    private nw zzccg;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<dw, a> {
        public a(uw uwVar) {
            super(dw.zzcch);
        }
    }

    static {
        dw dwVar = new dw();
        zzcch = dwVar;
        aq.t(dw.class, dwVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new dw();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcch, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzdt", "zzccd", "zzcce", vh0.f17147a, "zzccf", "zzccg"});
            case 4:
                return zzcch;
            case 5:
                f90<dw> f90 = zzei;
                if (f90 == null) {
                    synchronized (dw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcch);
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
