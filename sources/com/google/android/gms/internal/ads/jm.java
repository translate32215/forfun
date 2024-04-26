package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jm extends aq<jm, a> implements c90 {
    private static volatile f90<jm> zzei;
    /* access modifiers changed from: private */
    public static final jm zzidk;
    private int zzicj;
    private mp zzick = mp.f7494b;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<jm, a> {
        public a() {
            super(jm.zzidk);
        }

        public a(km kmVar) {
            super(jm.zzidk);
        }
    }

    static {
        jm jmVar = new jm();
        zzidk = jmVar;
        aq.t(jm.class, jmVar);
    }

    public static void A(jm jmVar, mp mpVar) {
        jmVar.getClass();
        mpVar.getClass();
        jmVar.zzick = mpVar;
    }

    public static a C() {
        return (a) zzidk.v();
    }

    public static jm E(mp mpVar, up upVar) throws f80 {
        return (jm) aq.l(zzidk, mpVar, upVar);
    }

    public static void z(jm jmVar) {
        jmVar.zzicj = 0;
    }

    public final mp B() {
        return this.zzick;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (km.f7252a[i10 - 1]) {
            case 1:
                return new jm();
            case 2:
                return new a((km) null);
            case 3:
                return new k90(zzidk, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzicj", "zzick"});
            case 4:
                return zzidk;
            case 5:
                f90<jm> f90 = zzei;
                if (f90 == null) {
                    synchronized (jm.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzidk);
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
