package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.sn;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class o9 extends aq<o9, a> implements c90 {
    private static volatile f90<o9> zzei;
    /* access modifiers changed from: private */
    public static final o9 zzew;
    private int zzdt;
    private int zzev = 2;

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class a extends aq.b<o9, a> {
        public a(z9 z9Var) {
            super(o9.zzew);
        }
    }

    static {
        o9 o9Var = new o9();
        zzew = o9Var;
        aq.t(o9.class, o9Var);
    }

    public static o9 z() {
        return zzew;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (z9.f8681a[i10 - 1]) {
            case 1:
                return new o9();
            case 2:
                return new a((z9) null);
            case 3:
                return new k90(zzew, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zzdt", "zzev", sn.f16503a});
            case 4:
                return zzew;
            case 5:
                f90<o9> f90 = zzei;
                if (f90 == null) {
                    synchronized (o9.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzew);
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

    public final ea y() {
        ea a10 = ea.a(this.zzev);
        return a10 == null ? ea.ENUM_SIGNAL_SOURCE_ADSHIELD : a10;
    }
}
