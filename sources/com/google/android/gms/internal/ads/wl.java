package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wl extends aq<wl, a> implements c90 {
    private static volatile f90<wl> zzei;
    /* access modifiers changed from: private */
    public static final wl zzidd;
    private int zzicj;
    private mp zzick = mp.f7494b;
    private am zzidc;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<wl, a> {
        public a() {
            super(wl.zzidd);
        }

        public a(vl vlVar) {
            super(wl.zzidd);
        }
    }

    static {
        wl wlVar = new wl();
        zzidd = wlVar;
        aq.t(wl.class, wlVar);
    }

    public static void A(wl wlVar, am amVar) {
        wlVar.getClass();
        amVar.getClass();
        wlVar.zzidc = amVar;
    }

    public static void B(wl wlVar, mp mpVar) {
        wlVar.getClass();
        mpVar.getClass();
        wlVar.zzick = mpVar;
    }

    public static a E() {
        return (a) zzidd.v();
    }

    public static wl G(mp mpVar, up upVar) throws f80 {
        return (wl) aq.l(zzidd, mpVar, upVar);
    }

    public static void z(wl wlVar) {
        wlVar.zzicj = 0;
    }

    public final mp C() {
        return this.zzick;
    }

    public final am D() {
        am amVar = this.zzidc;
        return amVar == null ? am.z() : amVar;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (vl.f8368a[i10 - 1]) {
            case 1:
                return new wl();
            case 2:
                return new a((vl) null);
            case 3:
                return new k90(zzidd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzicj", "zzidc", "zzick"});
            case 4:
                return zzidd;
            case 5:
                f90<wl> f90 = zzei;
                if (f90 == null) {
                    synchronized (wl.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzidd);
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
