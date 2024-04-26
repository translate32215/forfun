package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class an extends aq<an, a> implements c90 {
    private static volatile f90<an> zzei;
    /* access modifiers changed from: private */
    public static final an zziei;
    private int zzief;
    private int zzieg;
    private mp zzieh = mp.f7494b;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<an, a> {
        public a(zm zmVar) {
            super(an.zziei);
        }
    }

    static {
        an anVar = new an();
        zziei = anVar;
        aq.t(an.class, anVar);
    }

    public static an B() {
        return zziei;
    }

    public final mp A() {
        return this.zzieh;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (zm.f8716a[i10 - 1]) {
            case 1:
                return new an();
            case 2:
                return new a((zm) null);
            case 3:
                return new k90(zziei, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzief", "zzieg", "zzieh"});
            case 4:
                return zziei;
            case 5:
                f90<an> f90 = zzei;
                if (f90 == null) {
                    synchronized (an.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zziei);
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

    public final bn y() {
        bn bnVar;
        int i10 = this.zzief;
        if (i10 == 0) {
            bnVar = bn.UNKNOWN_CURVE;
        } else if (i10 == 2) {
            bnVar = bn.NIST_P256;
        } else if (i10 == 3) {
            bnVar = bn.NIST_P384;
        } else if (i10 == 4) {
            bnVar = bn.NIST_P521;
        } else if (i10 != 5) {
            bnVar = null;
        } else {
            bnVar = bn.CURVE25519;
        }
        return bnVar == null ? bn.UNRECOGNIZED : bnVar;
    }

    public final cn z() {
        cn a10 = cn.a(this.zzieg);
        return a10 == null ? cn.UNRECOGNIZED : a10;
    }
}
