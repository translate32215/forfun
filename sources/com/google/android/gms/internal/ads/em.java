package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class em extends aq<em, a> implements c90 {
    private static volatile f90<em> zzei;
    /* access modifiers changed from: private */
    public static final em zzidh;
    private int zzicj;
    private int zzicn;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<em, a> {
        public a(dm dmVar) {
            super(em.zzidh);
        }
    }

    static {
        em emVar = new em();
        zzidh = emVar;
        aq.t(em.class, emVar);
    }

    public static em A(mp mpVar, up upVar) throws f80 {
        return (em) aq.l(zzidh, mpVar, upVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (dm.f6223a[i10 - 1]) {
            case 1:
                return new em();
            case 2:
                return new a((dm) null);
            case 3:
                return new k90(zzidh, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzicn", "zzicj"});
            case 4:
                return zzidh;
            case 5:
                f90<em> f90 = zzei;
                if (f90 == null) {
                    synchronized (em.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzidh);
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
}
