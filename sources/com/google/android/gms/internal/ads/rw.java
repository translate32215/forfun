package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.x70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class rw extends aq<rw, a> implements c90 {
    /* access modifiers changed from: private */
    public static final rw zzcfx;
    private static volatile f90<rw> zzei;
    private int zzcfw;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<rw, a> {
        public a(uw uwVar) {
            super(rw.zzcfx);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public enum b implements x70 {
        VIDEO_ERROR_CODE_UNSPECIFIED(0),
        OPENGL_RENDERING_FAILED(1),
        CACHE_LOAD_FAILED(2),
        ANDROID_TARGET_API_TOO_LOW(3);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f8085a;

        /* access modifiers changed from: public */
        b(int i10) {
            this.f8085a = i10;
        }

        public final int g() {
            return this.f8085a;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8085a + " name=" + name() + '>';
        }
    }

    static {
        rw rwVar = new rw();
        zzcfx = rwVar;
        aq.t(rw.class, rwVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new rw();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcfx, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzdt", "zzcfw", ex.f6336a});
            case 4:
                return zzcfx;
            case 5:
                f90<rw> f90 = zzei;
                if (f90 == null) {
                    synchronized (rw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcfx);
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
