package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hn extends aq<hn, a> implements c90 {
    private static volatile f90<hn> zzei;
    /* access modifiers changed from: private */
    public static final hn zzifb;
    private int zzicp;
    private int zzifa;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<hn, a> {
        public a(in inVar) {
            super(hn.zzifb);
        }
    }

    static {
        hn hnVar = new hn();
        zzifb = hnVar;
        aq.t(hn.class, hnVar);
    }

    public static hn A() {
        return zzifb;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (in.f7098a[i10 - 1]) {
            case 1:
                return new hn();
            case 2:
                return new a((in) null);
            case 3:
                return new k90(zzifb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzifa", "zzicp"});
            case 4:
                return zzifb;
            case 5:
                f90<hn> f90 = zzei;
                if (f90 == null) {
                    synchronized (hn.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzifb);
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

    public final cn z() {
        cn a10 = cn.a(this.zzifa);
        return a10 == null ? cn.UNRECOGNIZED : a10;
    }
}
