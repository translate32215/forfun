package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class sl extends aq<sl, a> implements c90 {
    private static volatile f90<sl> zzei;
    /* access modifiers changed from: private */
    public static final sl zzicz;
    private int zzicn;
    private tl zzicx;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<sl, a> {
        public a(rl rlVar) {
            super(sl.zzicz);
        }
    }

    static {
        sl slVar = new sl();
        zzicz = slVar;
        aq.t(sl.class, slVar);
    }

    public static sl A() {
        return zzicz;
    }

    public static sl C(mp mpVar, up upVar) throws f80 {
        return (sl) aq.l(zzicz, mpVar, upVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (rl.f8043a[i10 - 1]) {
            case 1:
                return new sl();
            case 2:
                return new a((rl) null);
            case 3:
                return new k90(zzicz, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzicx", "zzicn"});
            case 4:
                return zzicz;
            case 5:
                f90<sl> f90 = zzei;
                if (f90 == null) {
                    synchronized (sl.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzicz);
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

    public final tl z() {
        tl tlVar = this.zzicx;
        return tlVar == null ? tl.z() : tlVar;
    }
}
