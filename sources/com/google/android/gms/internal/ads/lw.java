package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class lw extends aq<lw, a> implements c90 {
    /* access modifiers changed from: private */
    public static final lw zzcet;
    private static volatile f90<lw> zzei;
    private int zzcer;
    private int zzces;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<lw, a> {
        public a(uw uwVar) {
            super(lw.zzcet);
        }
    }

    static {
        lw lwVar = new lw();
        zzcet = lwVar;
        aq.t(lw.class, lwVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new lw();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcet, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdt", "zzcer", "zzces"});
            case 4:
                return zzcet;
            case 5:
                f90<lw> f90 = zzei;
                if (f90 == null) {
                    synchronized (lw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcet);
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
