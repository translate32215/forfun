package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pl extends aq<pl, a> implements c90 {
    private static volatile f90<pl> zzei;
    /* access modifiers changed from: private */
    public static final pl zzicy;
    private int zzicj;
    private mp zzick = mp.f7494b;
    private tl zzicx;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<pl, a> {
        public a() {
            super(pl.zzicy);
        }

        public a(ql qlVar) {
            super(pl.zzicy);
        }
    }

    static {
        pl plVar = new pl();
        zzicy = plVar;
        aq.t(pl.class, plVar);
    }

    public static void A(pl plVar, tl tlVar) {
        plVar.getClass();
        tlVar.getClass();
        plVar.zzicx = tlVar;
    }

    public static void B(pl plVar, mp mpVar) {
        plVar.getClass();
        mpVar.getClass();
        plVar.zzick = mpVar;
    }

    public static a E() {
        return (a) zzicy.v();
    }

    public static pl F() {
        return zzicy;
    }

    public static pl H(mp mpVar, up upVar) throws f80 {
        return (pl) aq.l(zzicy, mpVar, upVar);
    }

    public static void z(pl plVar) {
        plVar.zzicj = 0;
    }

    public final mp C() {
        return this.zzick;
    }

    public final tl D() {
        tl tlVar = this.zzicx;
        return tlVar == null ? tl.z() : tlVar;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (ql.f7980a[i10 - 1]) {
            case 1:
                return new pl();
            case 2:
                return new a((ql) null);
            case 3:
                return new k90(zzicy, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzicj", "zzicx", "zzick"});
            case 4:
                return zzicy;
            case 5:
                f90<pl> f90 = zzei;
                if (f90 == null) {
                    synchronized (pl.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzicy);
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
