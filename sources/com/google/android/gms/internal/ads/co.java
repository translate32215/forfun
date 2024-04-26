package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class co extends aq<co, a> implements c90 {
    private static volatile f90<co> zzei;
    /* access modifiers changed from: private */
    public static final co zzigs;
    private String zzigq = "";
    private mn zzigr;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<co, a> {
        public a(bo boVar) {
            super(co.zzigs);
        }
    }

    static {
        co coVar = new co();
        zzigs = coVar;
        aq.t(co.class, coVar);
    }

    public static co A() {
        return zzigs;
    }

    public static co C(mp mpVar, up upVar) throws f80 {
        return (co) aq.l(zzigs, mpVar, upVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (bo.f6039a[i10 - 1]) {
            case 1:
                return new co();
            case 2:
                return new a((bo) null);
            case 3:
                return new k90(zzigs, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzigq", "zzigr"});
            case 4:
                return zzigs;
            case 5:
                f90<co> f90 = zzei;
                if (f90 == null) {
                    synchronized (co.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzigs);
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

    public final String y() {
        return this.zzigq;
    }

    public final mn z() {
        mn mnVar = this.zzigr;
        return mnVar == null ? mn.A() : mnVar;
    }
}
