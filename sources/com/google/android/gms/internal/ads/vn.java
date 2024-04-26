package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class vn extends aq<vn, a> implements c90 {
    private static volatile f90<vn> zzei;
    /* access modifiers changed from: private */
    public static final vn zzigl;
    private int zzicj;
    private yn zzigk;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<vn, a> {
        public a() {
            super(vn.zzigl);
        }

        public a(wn wnVar) {
            super(vn.zzigl);
        }
    }

    static {
        vn vnVar = new vn();
        zzigl = vnVar;
        aq.t(vn.class, vnVar);
    }

    public static void A(vn vnVar, yn ynVar) {
        vnVar.getClass();
        ynVar.getClass();
        vnVar.zzigk = ynVar;
    }

    public static a C() {
        return (a) zzigl.v();
    }

    public static vn E(mp mpVar, up upVar) throws f80 {
        return (vn) aq.l(zzigl, mpVar, upVar);
    }

    public static void z(vn vnVar) {
        vnVar.zzicj = 0;
    }

    public final yn B() {
        yn ynVar = this.zzigk;
        return ynVar == null ? yn.z() : ynVar;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (wn.f8474a[i10 - 1]) {
            case 1:
                return new vn();
            case 2:
                return new a((wn) null);
            case 3:
                return new k90(zzigl, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzicj", "zzigk"});
            case 4:
                return zzigl;
            case 5:
                f90<vn> f90 = zzei;
                if (f90 == null) {
                    synchronized (vn.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzigl);
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
