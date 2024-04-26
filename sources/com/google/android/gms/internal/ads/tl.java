package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class tl extends aq<tl, a> implements c90 {
    private static volatile f90<tl> zzei;
    /* access modifiers changed from: private */
    public static final tl zzidb;
    private int zzida;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<tl, a> {
        public a(ul ulVar) {
            super(tl.zzidb);
        }
    }

    static {
        tl tlVar = new tl();
        zzidb = tlVar;
        aq.t(tl.class, tlVar);
    }

    public static tl z() {
        return zzidb;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (ul.f8249a[i10 - 1]) {
            case 1:
                return new tl();
            case 2:
                return new a((ul) null);
            case 3:
                return new k90(zzidb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzida"});
            case 4:
                return zzidb;
            case 5:
                f90<tl> f90 = zzei;
                if (f90 == null) {
                    synchronized (tl.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzidb);
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
        return this.zzida;
    }
}
