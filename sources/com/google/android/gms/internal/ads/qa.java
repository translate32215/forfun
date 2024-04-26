package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class qa extends aq<qa, a> implements c90 {
    private static volatile f90<qa> zzei;
    /* access modifiers changed from: private */
    public static final qa zzmc;
    private int zzdt;
    private String zzfi = "";

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class a extends aq.b<qa, a> {
        public a(la laVar) {
            super(qa.zzmc);
        }
    }

    static {
        qa qaVar = new qa();
        zzmc = qaVar;
        aq.t(qa.class, qaVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (la.f7356a[i10 - 1]) {
            case 1:
                return new qa();
            case 2:
                return new a((la) null);
            case 3:
                return new k90(zzmc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzdt", "zzfi"});
            case 4:
                return zzmc;
            case 5:
                f90<qa> f90 = zzei;
                if (f90 == null) {
                    synchronized (qa.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzmc);
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
