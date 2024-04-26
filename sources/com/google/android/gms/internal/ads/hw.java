package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.vh0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hw extends aq<hw, a> implements c90 {
    /* access modifiers changed from: private */
    public static final hw zzcda;
    private static volatile f90<hw> zzei;
    private int zzccy;
    private nw zzccz;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<hw, a> {
        public a(uw uwVar) {
            super(hw.zzcda);
        }
    }

    static {
        hw hwVar = new hw();
        zzcda = hwVar;
        aq.t(hw.class, hwVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new hw();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcda, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdt", "zzccy", vh0.f17147a, "zzccz"});
            case 4:
                return zzcda;
            case 5:
                f90<hw> f90 = zzei;
                if (f90 == null) {
                    synchronized (hw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcda);
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
