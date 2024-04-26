package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class om extends aq<om, a> implements c90 {
    private static volatile f90<om> zzei;
    /* access modifiers changed from: private */
    public static final om zzidt;
    private mn zzids;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<om, a> {
        public a(pm pmVar) {
            super(om.zzidt);
        }
    }

    static {
        om omVar = new om();
        zzidt = omVar;
        aq.t(om.class, omVar);
    }

    public static om z() {
        return zzidt;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (pm.f7864a[i10 - 1]) {
            case 1:
                return new om();
            case 2:
                return new a((pm) null);
            case 3:
                return new k90(zzidt, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzids"});
            case 4:
                return zzidt;
            case 5:
                f90<om> f90 = zzei;
                if (f90 == null) {
                    synchronized (om.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzidt);
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

    public final mn y() {
        mn mnVar = this.zzids;
        return mnVar == null ? mn.A() : mnVar;
    }
}
