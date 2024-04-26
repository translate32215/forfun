package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mn extends aq<mn, a> implements c90 {
    private static volatile f90<mn> zzei;
    /* access modifiers changed from: private */
    public static final mn zzifu;
    private String zzifc = "";
    private mp zzifd = mp.f7494b;
    private int zzift;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<mn, a> {
        public a(nn nnVar) {
            super(mn.zzifu);
        }
    }

    static {
        mn mnVar = new mn();
        zzifu = mnVar;
        aq.t(mn.class, mnVar);
    }

    public static mn A() {
        return zzifu;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (nn.f7598a[i10 - 1]) {
            case 1:
                return new mn();
            case 2:
                return new a((nn) null);
            case 3:
                return new k90(zzifu, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzifc", "zzifd", "zzift"});
            case 4:
                return zzifu;
            case 5:
                f90<mn> f90 = zzei;
                if (f90 == null) {
                    synchronized (mn.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzifu);
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
        return this.zzifc;
    }

    public final mp z() {
        return this.zzifd;
    }
}
