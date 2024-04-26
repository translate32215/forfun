package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ho extends aq<ho, a> implements c90 {
    private static volatile f90<ho> zzei;
    /* access modifiers changed from: private */
    public static final ho zzihd;
    private int zzicj;
    private mp zzick = mp.f7494b;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<ho, a> {
        public a() {
            super(ho.zzihd);
        }

        public a(go goVar) {
            super(ho.zzihd);
        }
    }

    static {
        ho hoVar = new ho();
        zzihd = hoVar;
        aq.t(ho.class, hoVar);
    }

    public static void A(ho hoVar, mp mpVar) {
        hoVar.getClass();
        mpVar.getClass();
        hoVar.zzick = mpVar;
    }

    public static a C() {
        return (a) zzihd.v();
    }

    public static ho E(mp mpVar, up upVar) throws f80 {
        return (ho) aq.l(zzihd, mpVar, upVar);
    }

    public static void z(ho hoVar) {
        hoVar.zzicj = 0;
    }

    public final mp B() {
        return this.zzick;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (go.f6679a[i10 - 1]) {
            case 1:
                return new ho();
            case 2:
                return new a((go) null);
            case 3:
                return new k90(zzihd, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzicj", "zzick"});
            case 4:
                return zzihd;
            case 5:
                f90<ho> f90 = zzei;
                if (f90 == null) {
                    synchronized (ho.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzihd);
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
