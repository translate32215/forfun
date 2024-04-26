package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.x70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bw extends aq<bw, a> implements c90 {
    /* access modifiers changed from: private */
    public static final bw zzcbg;
    private static volatile f90<bw> zzei;
    private int zzcbc;
    private ow zzcbd;
    private String zzcbe = "";
    private String zzcbf = "";
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a extends aq.b<bw, a> {
        public a(uw uwVar) {
            super(bw.zzcbg);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public enum b implements x70 {
        PLATFORM_UNSPECIFIED(0),
        IOS(1),
        ANDROID(2);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f6069a;

        /* access modifiers changed from: public */
        b(int i10) {
            this.f6069a = i10;
        }

        public final int g() {
            return this.f6069a;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f6069a + " name=" + name() + '>';
        }
    }

    static {
        bw bwVar = new bw();
        zzcbg = bwVar;
        aq.t(bw.class, bwVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new bw();
            case 2:
                return new a((uw) null);
            case 3:
                return new k90(zzcbg, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzdt", "zzcbc", zw.f8769a, "zzcbd", "zzcbe", "zzcbf"});
            case 4:
                return zzcbg;
            case 5:
                f90<bw> f90 = zzei;
                if (f90 == null) {
                    synchronized (bw.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzcbg);
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
