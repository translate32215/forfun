package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class dn extends aq<dn, a> implements c90 {
    private static volatile f90<dn> zzei;
    /* access modifiers changed from: private */
    public static final dn zziey;
    private int zzicj;
    private mp zzick = mp.f7494b;
    private hn zziex;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<dn, a> {
        public a() {
            super(dn.zziey);
        }

        public a(en enVar) {
            super(dn.zziey);
        }
    }

    static {
        dn dnVar = new dn();
        zziey = dnVar;
        aq.t(dn.class, dnVar);
    }

    public static void A(dn dnVar, hn hnVar) {
        dnVar.getClass();
        hnVar.getClass();
        dnVar.zziex = hnVar;
    }

    public static void B(dn dnVar, mp mpVar) {
        dnVar.getClass();
        mpVar.getClass();
        dnVar.zzick = mpVar;
    }

    public static a E() {
        return (a) zziey.v();
    }

    public static dn F() {
        return zziey;
    }

    public static dn H(mp mpVar, up upVar) throws f80 {
        return (dn) aq.l(zziey, mpVar, upVar);
    }

    public static void z(dn dnVar) {
        dnVar.zzicj = 0;
    }

    public final mp C() {
        return this.zzick;
    }

    public final hn D() {
        hn hnVar = this.zziex;
        return hnVar == null ? hn.A() : hnVar;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (en.f6294a[i10 - 1]) {
            case 1:
                return new dn();
            case 2:
                return new a((en) null);
            case 3:
                return new k90(zziey, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzicj", "zziex", "zzick"});
            case 4:
                return zziey;
            case 5:
                f90<dn> f90 = zzei;
                if (f90 == null) {
                    synchronized (dn.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zziey);
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
