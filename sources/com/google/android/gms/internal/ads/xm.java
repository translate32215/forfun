package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xm extends aq<xm, a> implements c90 {
    private static volatile f90<xm> zzei;
    /* access modifiers changed from: private */
    public static final xm zziee;
    private int zzicj;
    private sm zzidu;
    private mp zziec;
    private mp zzied;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<xm, a> {
        public a() {
            super(xm.zziee);
        }

        public a(ym ymVar) {
            super(xm.zziee);
        }
    }

    static {
        xm xmVar = new xm();
        zziee = xmVar;
        aq.t(xm.class, xmVar);
    }

    public xm() {
        mp mpVar = mp.f7494b;
        this.zziec = mpVar;
        this.zzied = mpVar;
    }

    public static void A(xm xmVar, sm smVar) {
        xmVar.getClass();
        smVar.getClass();
        xmVar.zzidu = smVar;
    }

    public static void B(xm xmVar, mp mpVar) {
        xmVar.getClass();
        mpVar.getClass();
        xmVar.zziec = mpVar;
    }

    public static void C(xm xmVar, mp mpVar) {
        xmVar.getClass();
        mpVar.getClass();
        xmVar.zzied = mpVar;
    }

    public static a G() {
        return (a) zziee.v();
    }

    public static xm H() {
        return zziee;
    }

    public static xm J(mp mpVar, up upVar) throws f80 {
        return (xm) aq.l(zziee, mpVar, upVar);
    }

    public static void z(xm xmVar) {
        xmVar.zzicj = 0;
    }

    public final sm D() {
        sm smVar = this.zzidu;
        return smVar == null ? sm.B() : smVar;
    }

    public final mp E() {
        return this.zziec;
    }

    public final mp F() {
        return this.zzied;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (ym.f8613a[i10 - 1]) {
            case 1:
                return new xm();
            case 2:
                return new a((ym) null);
            case 3:
                return new k90(zziee, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzicj", "zzidu", "zziec", "zzied"});
            case 4:
                return zziee;
            case 5:
                f90<xm> f90 = zzei;
                if (f90 == null) {
                    synchronized (xm.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zziee);
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
