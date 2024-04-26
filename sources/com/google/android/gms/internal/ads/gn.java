package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gn extends aq<gn, a> implements c90 {
    private static volatile f90<gn> zzei;
    /* access modifiers changed from: private */
    public static final gn zziez;
    private int zzicj;
    private int zzicn;
    private hn zziex;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<gn, a> {
        public a(fn fnVar) {
            super(gn.zziez);
        }
    }

    static {
        gn gnVar = new gn();
        zziez = gnVar;
        aq.t(gn.class, gnVar);
    }

    public static gn A() {
        return zziez;
    }

    public static gn C(mp mpVar, up upVar) throws f80 {
        return (gn) aq.l(zziez, mpVar, upVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (fn.f6468a[i10 - 1]) {
            case 1:
                return new gn();
            case 2:
                return new a((fn) null);
            case 3:
                return new k90(zziez, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zziex", "zzicn", "zzicj"});
            case 4:
                return zziez;
            case 5:
                f90<gn> f90 = zzei;
                if (f90 == null) {
                    synchronized (gn.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zziez);
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
        return this.zzicn;
    }

    public final hn z() {
        hn hnVar = this.zziex;
        return hnVar == null ? hn.A() : hnVar;
    }
}
