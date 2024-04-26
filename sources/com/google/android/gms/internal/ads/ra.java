package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c80;
import e8.c90;
import e8.f90;
import e8.gu;
import e8.hs;
import e8.i90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class ra extends aq<ra, a> implements c90 {
    private static volatile f90<ra> zzei;
    /* access modifiers changed from: private */
    public static final ra zzme;
    private int zzdt;
    private int zzhs = 1;
    private int zzht = 1;
    private mp zzle = mp.f7494b;
    private c80<mp> zzmd = i90.f15001d;

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class a extends aq.b<ra, a> {
        public a() {
            super(ra.zzme);
        }

        public final a o(mp mpVar) {
            if (this.f5971c) {
                n();
                this.f5971c = false;
            }
            ra.z((ra) this.f5970b, mpVar);
            return this;
        }

        public a(la laVar) {
            super(ra.zzme);
        }
    }

    static {
        ra raVar = new ra();
        zzme = raVar;
        aq.t(ra.class, raVar);
    }

    public static void A(ra raVar, mp mpVar) {
        raVar.getClass();
        mpVar.getClass();
        raVar.zzdt |= 1;
        raVar.zzle = mpVar;
    }

    public static a B() {
        return (a) zzme.v();
    }

    public static void y(ra raVar, mb mbVar) {
        raVar.getClass();
        raVar.zzhs = mbVar.f7473a;
        raVar.zzdt |= 4;
    }

    public static void z(ra raVar, mp mpVar) {
        raVar.getClass();
        mpVar.getClass();
        c80<mp> c80 = raVar.zzmd;
        if (!c80.k()) {
            raVar.zzmd = aq.p(c80);
        }
        raVar.zzmd.add(mpVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (la.f7356a[i10 - 1]) {
            case 1:
                return new ra();
            case 2:
                return new a((la) null);
            case 3:
                return new k90(zzme, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzdt", "zzmd", "zzle", "zzht", gu.f14825a, "zzhs", hs.f14933a});
            case 4:
                return zzme;
            case 5:
                f90<ra> f90 = zzei;
                if (f90 == null) {
                    synchronized (ra.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzme);
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
}
