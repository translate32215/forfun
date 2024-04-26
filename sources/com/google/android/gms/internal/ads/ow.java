package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ow extends aq<ow, a> implements c90 {
    /* access modifiers changed from: private */
    public static final ow zzcfb;
    private static volatile f90<ow> zzei;
    private int zzcey;
    private int zzcez;
    private int zzcfa;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<ow, a> {
        public a() {
            super(ow.zzcfb);
        }

        public a(uw uwVar) {
            super(ow.zzcfb);
        }
    }

    static {
        ow owVar = new ow();
        zzcfb = owVar;
        aq.t(ow.class, owVar);
    }

    public static void A(ow owVar, int i10) {
        owVar.zzdt |= 4;
        owVar.zzcfa = i10;
    }

    public static a B() {
        return (a) zzcfb.v();
    }

    public static void y(ow owVar, int i10) {
        owVar.zzdt |= 1;
        owVar.zzcey = i10;
    }

    public static void z(ow owVar, int i10) {
        owVar.zzdt |= 2;
        owVar.zzcez = i10;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new ow();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcfb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzdt", "zzcey", "zzcez", "zzcfa"});
            case 4:
                return zzcfb;
            case 5:
                f90<ow> f90 = zzei;
                if (f90 == null) {
                    synchronized (ow.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcfb);
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
}
