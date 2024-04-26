package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f80;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hl extends aq<hl, a> implements c90 {
    private static volatile f90<hl> zzei;
    /* access modifiers changed from: private */
    public static final hl zzico;
    private kl zzicl;
    private int zzicn;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<hl, a> {
        public a(il ilVar) {
            super(hl.zzico);
        }
    }

    static {
        hl hlVar = new hl();
        zzico = hlVar;
        aq.t(hl.class, hlVar);
    }

    public static hl B(mp mpVar, up upVar) throws f80 {
        return (hl) aq.l(zzico, mpVar, upVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (il.f7097a[i10 - 1]) {
            case 1:
                return new hl();
            case 2:
                return new a((il) null);
            case 3:
                return new k90(zzico, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzicn", "zzicl"});
            case 4:
                return zzico;
            case 5:
                f90<hl> f90 = zzei;
                if (f90 == null) {
                    synchronized (hl.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzico);
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
        return this.zzicn;
    }

    public final kl z() {
        kl klVar = this.zzicl;
        return klVar == null ? kl.z() : klVar;
    }
}
