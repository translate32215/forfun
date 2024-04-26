package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class im extends aq<im, a> implements c90 {
    private static volatile f90<im> zzei;
    /* access modifiers changed from: private */
    public static final im zzidj;
    private int zzicj;
    private int zzicn;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<im, a> {
        public a(hm hmVar) {
            super(im.zzidj);
        }
    }

    static {
        im imVar = new im();
        zzidj = imVar;
        aq.t(im.class, imVar);
    }

    public static im A(mp mpVar, up upVar) throws f80 {
        return (im) aq.l(zzidj, mpVar, upVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (hm.f6886a[i10 - 1]) {
            case 1:
                return new im();
            case 2:
                return new a((hm) null);
            case 3:
                return new k90(zzidj, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzicj", "zzicn"});
            case 4:
                return zzidj;
            case 5:
                f90<im> f90 = zzei;
                if (f90 == null) {
                    synchronized (im.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzidj);
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
