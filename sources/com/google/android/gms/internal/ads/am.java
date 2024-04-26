package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class am extends aq<am, a> implements c90 {
    private static volatile f90<am> zzei;
    /* access modifiers changed from: private */
    public static final am zzidf;
    private int zzida;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<am, a> {
        public a(zl zlVar) {
            super(am.zzidf);
        }
    }

    static {
        am amVar = new am();
        zzidf = amVar;
        aq.t(am.class, amVar);
    }

    public static am z() {
        return zzidf;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (zl.f8715a[i10 - 1]) {
            case 1:
                return new am();
            case 2:
                return new a((zl) null);
            case 3:
                return new k90(zzidf, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzida"});
            case 4:
                return zzidf;
            case 5:
                f90<am> f90 = zzei;
                if (f90 == null) {
                    synchronized (am.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzidf);
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
        return this.zzida;
    }
}
