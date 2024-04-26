package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wm extends aq<wm, a> implements c90 {
    private static volatile f90<wm> zzei;
    /* access modifiers changed from: private */
    public static final wm zzieb;
    private int zzicj;
    private mp zzick = mp.f7494b;
    private xm zziea;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<wm, a> {
        public a() {
            super(wm.zzieb);
        }

        public a(vm vmVar) {
            super(wm.zzieb);
        }
    }

    static {
        wm wmVar = new wm();
        zzieb = wmVar;
        aq.t(wm.class, wmVar);
    }

    public static void A(wm wmVar, xm xmVar) {
        wmVar.getClass();
        xmVar.getClass();
        wmVar.zziea = xmVar;
    }

    public static void B(wm wmVar, mp mpVar) {
        wmVar.getClass();
        mpVar.getClass();
        wmVar.zzick = mpVar;
    }

    public static a E() {
        return (a) zzieb.v();
    }

    public static wm G(mp mpVar, up upVar) throws f80 {
        return (wm) aq.l(zzieb, mpVar, upVar);
    }

    public static void z(wm wmVar) {
        wmVar.zzicj = 0;
    }

    public final mp C() {
        return this.zzick;
    }

    public final xm D() {
        xm xmVar = this.zziea;
        return xmVar == null ? xm.H() : xmVar;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (vm.f8369a[i10 - 1]) {
            case 1:
                return new wm();
            case 2:
                return new a((vm) null);
            case 3:
                return new k90(zzieb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzicj", "zziea", "zzick"});
            case 4:
                return zzieb;
            case 5:
                f90<wm> f90 = zzei;
                if (f90 == null) {
                    synchronized (wm.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzieb);
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
