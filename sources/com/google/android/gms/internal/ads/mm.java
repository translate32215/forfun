package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mm extends aq<mm, a> implements c90 {
    private static volatile f90<mm> zzei;
    /* access modifiers changed from: private */
    public static final mm zzidl;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<mm, a> {
        public a(lm lmVar) {
            super(mm.zzidl);
        }
    }

    static {
        mm mmVar = new mm();
        zzidl = mmVar;
        aq.t(mm.class, mmVar);
    }

    public static mm z(mp mpVar, up upVar) throws f80 {
        return (mm) aq.l(zzidl, mpVar, upVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (lm.f7395a[i10 - 1]) {
            case 1:
                return new mm();
            case 2:
                return new a((lm) null);
            case 3:
                return new k90(zzidl, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzidl;
            case 5:
                f90<mm> f90 = zzei;
                if (f90 == null) {
                    synchronized (mm.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzidl);
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
