package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class rm extends aq<rm, a> implements c90 {
    private static volatile f90<rm> zzei;
    /* access modifiers changed from: private */
    public static final rm zzidv;
    private sm zzidu;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<rm, a> {
        public a(qm qmVar) {
            super(rm.zzidv);
        }
    }

    static {
        rm rmVar = new rm();
        zzidv = rmVar;
        aq.t(rm.class, rmVar);
    }

    public static rm A(mp mpVar, up upVar) throws f80 {
        return (rm) aq.l(zzidv, mpVar, upVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (qm.f7981a[i10 - 1]) {
            case 1:
                return new rm();
            case 2:
                return new a((qm) null);
            case 3:
                return new k90(zzidv, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzidu"});
            case 4:
                return zzidv;
            case 5:
                f90<rm> f90 = zzei;
                if (f90 == null) {
                    synchronized (rm.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzidv);
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

    public final sm y() {
        sm smVar = this.zzidu;
        return smVar == null ? sm.B() : smVar;
    }
}
