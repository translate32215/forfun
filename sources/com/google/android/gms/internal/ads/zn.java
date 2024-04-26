package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zn extends aq<zn, a> implements c90 {
    private static volatile f90<zn> zzei;
    /* access modifiers changed from: private */
    public static final zn zzigp;
    private int zzicj;
    private co zzigo;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<zn, a> {
        public a() {
            super(zn.zzigp);
        }

        public a(ao aoVar) {
            super(zn.zzigp);
        }
    }

    static {
        zn znVar = new zn();
        zzigp = znVar;
        aq.t(zn.class, znVar);
    }

    public static void A(zn znVar, co coVar) {
        znVar.getClass();
        coVar.getClass();
        znVar.zzigo = coVar;
    }

    public static a C() {
        return (a) zzigp.v();
    }

    public static zn E(mp mpVar, up upVar) throws f80 {
        return (zn) aq.l(zzigp, mpVar, upVar);
    }

    public static void z(zn znVar) {
        znVar.zzicj = 0;
    }

    public final co B() {
        co coVar = this.zzigo;
        return coVar == null ? co.A() : coVar;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (ao.f5968a[i10 - 1]) {
            case 1:
                return new zn();
            case 2:
                return new a((ao) null);
            case 3:
                return new k90(zzigp, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzicj", "zzigo"});
            case 4:
                return zzigp;
            case 5:
                f90<zn> f90 = zzei;
                if (f90 == null) {
                    synchronized (zn.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzigp);
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
