package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class uv extends aq<uv, a> implements c90 {
    /* access modifiers changed from: private */
    public static final uv zzcgo;
    private static volatile f90<uv> zzei;
    private boolean zzcgm;
    private int zzcgn;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<uv, a> {
        public a() {
            super(uv.zzcgo);
        }

        public a(uw uwVar) {
            super(uv.zzcgo);
        }
    }

    static {
        uv uvVar = new uv();
        zzcgo = uvVar;
        aq.t(uv.class, uvVar);
    }

    public static a B() {
        return (a) zzcgo.v();
    }

    public static void y(uv uvVar, int i10) {
        uvVar.zzdt |= 2;
        uvVar.zzcgn = i10;
    }

    public static void z(uv uvVar, boolean z10) {
        uvVar.zzdt |= 1;
        uvVar.zzcgm = z10;
    }

    public final boolean A() {
        return this.zzcgm;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new uv();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcgo, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzdt", "zzcgm", "zzcgn"});
            case 4:
                return zzcgo;
            case 5:
                f90<uv> f90 = zzei;
                if (f90 == null) {
                    synchronized (uv.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcgo);
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
