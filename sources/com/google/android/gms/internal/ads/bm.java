package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bm extends aq<bm, a> implements c90 {
    private static volatile f90<bm> zzei;
    /* access modifiers changed from: private */
    public static final bm zzidg;
    private int zzicj;
    private mp zzick = mp.f7494b;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<bm, a> {
        public a() {
            super(bm.zzidg);
        }

        public a(cm cmVar) {
            super(bm.zzidg);
        }
    }

    static {
        bm bmVar = new bm();
        zzidg = bmVar;
        aq.t(bm.class, bmVar);
    }

    public static void A(bm bmVar, mp mpVar) {
        bmVar.getClass();
        mpVar.getClass();
        bmVar.zzick = mpVar;
    }

    public static a C() {
        return (a) zzidg.v();
    }

    public static bm E(mp mpVar, up upVar) throws f80 {
        return (bm) aq.l(zzidg, mpVar, upVar);
    }

    public static void z(bm bmVar) {
        bmVar.zzicj = 0;
    }

    public final mp B() {
        return this.zzick;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (cm.f6125a[i10 - 1]) {
            case 1:
                return new bm();
            case 2:
                return new a((cm) null);
            case 3:
                return new k90(zzidg, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzicj", "zzick"});
            case 4:
                return zzidg;
            case 5:
                f90<bm> f90 = zzei;
                if (f90 == null) {
                    synchronized (bm.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzidg);
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
        return this.zzicj;
    }
}
