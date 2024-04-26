package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fm extends aq<fm, a> implements c90 {
    private static volatile f90<fm> zzei;
    /* access modifiers changed from: private */
    public static final fm zzidi;
    private int zzicj;
    private mp zzick = mp.f7494b;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<fm, a> {
        public a() {
            super(fm.zzidi);
        }

        public a(gm gmVar) {
            super(fm.zzidi);
        }
    }

    static {
        fm fmVar = new fm();
        zzidi = fmVar;
        aq.t(fm.class, fmVar);
    }

    public static void A(fm fmVar, mp mpVar) {
        fmVar.getClass();
        mpVar.getClass();
        fmVar.zzick = mpVar;
    }

    public static a C() {
        return (a) zzidi.v();
    }

    public static fm E(mp mpVar, up upVar) throws f80 {
        return (fm) aq.l(zzidi, mpVar, upVar);
    }

    public static void z(fm fmVar) {
        fmVar.zzicj = 0;
    }

    public final mp B() {
        return this.zzick;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (gm.f6678a[i10 - 1]) {
            case 1:
                return new fm();
            case 2:
                return new a((gm) null);
            case 3:
                return new k90(zzidi, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzicj", "zzick"});
            case 4:
                return zzidi;
            case 5:
                f90<fm> f90 = zzei;
                if (f90 == null) {
                    synchronized (fm.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzidi);
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
