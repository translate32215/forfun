package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pn extends aq<pn, a> implements c90 {
    private static volatile f90<pn> zzei;
    /* access modifiers changed from: private */
    public static final pn zzifz;
    private String zzifc = "";
    private String zzifv = "";
    private int zzifw;
    private boolean zzifx;
    private String zzify = "";

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<pn, a> {
        public a(on onVar) {
            super(pn.zzifz);
        }
    }

    static {
        pn pnVar = new pn();
        zzifz = pnVar;
        aq.t(pn.class, pnVar);
    }

    public final int A() {
        return this.zzifw;
    }

    public final boolean B() {
        return this.zzifx;
    }

    public final String C() {
        return this.zzify;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (on.f7696a[i10 - 1]) {
            case 1:
                return new pn();
            case 2:
                return new a((on) null);
            case 3:
                return new k90(zzifz, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzifv", "zzifc", "zzifw", "zzifx", "zzify"});
            case 4:
                return zzifz;
            case 5:
                f90<pn> f90 = zzei;
                if (f90 == null) {
                    synchronized (pn.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzifz);
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

    public final String y() {
        return this.zzifc;
    }

    public final String z() {
        return this.zzifv;
    }
}
