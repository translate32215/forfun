package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ll extends aq<ll, a> implements c90 {
    private static volatile f90<ll> zzei;
    /* access modifiers changed from: private */
    public static final ll zzict;
    private int zzicj;
    private pl zzicr;
    private dn zzics;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<ll, a> {
        public a() {
            super(ll.zzict);
        }

        public a(ml mlVar) {
            super(ll.zzict);
        }
    }

    static {
        ll llVar = new ll();
        zzict = llVar;
        aq.t(ll.class, llVar);
    }

    public static void A(ll llVar, pl plVar) {
        llVar.getClass();
        plVar.getClass();
        llVar.zzicr = plVar;
    }

    public static void B(ll llVar, dn dnVar) {
        llVar.getClass();
        dnVar.getClass();
        llVar.zzics = dnVar;
    }

    public static a E() {
        return (a) zzict.v();
    }

    public static ll G(mp mpVar, up upVar) throws f80 {
        return (ll) aq.l(zzict, mpVar, upVar);
    }

    public static void z(ll llVar, int i10) {
        llVar.zzicj = i10;
    }

    public final pl C() {
        pl plVar = this.zzicr;
        return plVar == null ? pl.F() : plVar;
    }

    public final dn D() {
        dn dnVar = this.zzics;
        return dnVar == null ? dn.F() : dnVar;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (ml.f7491a[i10 - 1]) {
            case 1:
                return new ll();
            case 2:
                return new a((ml) null);
            case 3:
                return new k90(zzict, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzicj", "zzicr", "zzics"});
            case 4:
                return zzict;
            case 5:
                f90<ll> f90 = zzei;
                if (f90 == null) {
                    synchronized (ll.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzict);
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
