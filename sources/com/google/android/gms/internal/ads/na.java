package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.w70;
import e8.y70;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class na extends aq<na, a> implements c90 {
    private static volatile f90<na> zzei;
    /* access modifiers changed from: private */
    public static final na zzlc;
    private int zzdt;
    private long zzkx;
    private int zzky;
    private boolean zzkz;
    private y70 zzla = w70.f17224d;
    private long zzlb;

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class a extends aq.b<na, a> {
        public a(la laVar) {
            super(na.zzlc);
        }
    }

    static {
        na naVar = new na();
        zzlc = naVar;
        aq.t(na.class, naVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (la.f7356a[i10 - 1]) {
            case 1:
                return new na();
            case 2:
                return new a((la) null);
            case 3:
                return new k90(zzlc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzdt", "zzkx", "zzky", "zzkz", "zzla", "zzlb"});
            case 4:
                return zzlc;
            case 5:
                f90<na> f90 = zzei;
                if (f90 == null) {
                    synchronized (na.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzlc);
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
