package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ol extends aq<ol, a> implements c90 {
    private static volatile f90<ol> zzei;
    /* access modifiers changed from: private */
    public static final ol zzicw;
    private sl zzicu;
    private gn zzicv;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<ol, a> {
        public a(nl nlVar) {
            super(ol.zzicw);
        }
    }

    static {
        ol olVar = new ol();
        zzicw = olVar;
        aq.t(ol.class, olVar);
    }

    public static ol B(mp mpVar, up upVar) throws f80 {
        return (ol) aq.l(zzicw, mpVar, upVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (nl.f7590a[i10 - 1]) {
            case 1:
                return new ol();
            case 2:
                return new a((nl) null);
            case 3:
                return new k90(zzicw, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzicu", "zzicv"});
            case 4:
                return zzicw;
            case 5:
                f90<ol> f90 = zzei;
                if (f90 == null) {
                    synchronized (ol.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzicw);
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

    public final sl y() {
        sl slVar = this.zzicu;
        return slVar == null ? sl.A() : slVar;
    }

    public final gn z() {
        gn gnVar = this.zzicv;
        return gnVar == null ? gn.A() : gnVar;
    }
}
