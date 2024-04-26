package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kl extends aq<kl, a> implements c90 {
    private static volatile f90<kl> zzei;
    /* access modifiers changed from: private */
    public static final kl zzicq;
    private int zzicp;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<kl, a> {
        public a(jl jlVar) {
            super(kl.zzicq);
        }
    }

    static {
        kl klVar = new kl();
        zzicq = klVar;
        aq.t(kl.class, klVar);
    }

    public static kl z() {
        return zzicq;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (jl.f7154a[i10 - 1]) {
            case 1:
                return new kl();
            case 2:
                return new a((jl) null);
            case 3:
                return new k90(zzicq, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzicp"});
            case 4:
                return zzicq;
            case 5:
                f90<kl> f90 = zzei;
                if (f90 == null) {
                    synchronized (kl.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzicq);
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
        return this.zzicp;
    }
}
