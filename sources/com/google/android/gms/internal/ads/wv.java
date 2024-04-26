package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import com.startapp.b4;
import e8.c90;
import e8.f90;
import e8.k90;
import e8.x70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wv extends aq<wv, b> implements c90 {
    /* access modifiers changed from: private */
    public static final wv zzbzp;
    private static volatile f90<wv> zzei;
    private int zzbzn;
    private lw zzbzo;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public enum a implements x70 {
        AD_FORMAT_TYPE_UNSPECIFIED(0),
        BANNER(1),
        INTERSTITIAL(2),
        NATIVE_EXPRESS(3),
        NATIVE_CONTENT(4),
        NATIVE_APP_INSTALL(5),
        NATIVE_CUSTOM_TEMPLATE(6),
        DFP_BANNER(7),
        DFP_INTERSTITIAL(8),
        REWARD_BASED_VIDEO_AD(9),
        BANNER_SEARCH_ADS(10);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f8491a;

        /* access modifiers changed from: public */
        a(int i10) {
            this.f8491a = i10;
        }

        public static a a(int i10) {
            switch (i10) {
                case 0:
                    return AD_FORMAT_TYPE_UNSPECIFIED;
                case 1:
                    return BANNER;
                case 2:
                    return INTERSTITIAL;
                case 3:
                    return NATIVE_EXPRESS;
                case 4:
                    return NATIVE_CONTENT;
                case 5:
                    return NATIVE_APP_INSTALL;
                case 6:
                    return NATIVE_CUSTOM_TEMPLATE;
                case 7:
                    return DFP_BANNER;
                case b4.f10106f /*8*/:
                    return DFP_INTERSTITIAL;
                case 9:
                    return REWARD_BASED_VIDEO_AD;
                case 10:
                    return BANNER_SEARCH_ADS;
                default:
                    return null;
            }
        }

        public final int g() {
            return this.f8491a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8491a + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class b extends aq.b<wv, b> {
        public b(uw uwVar) {
            super(wv.zzbzp);
        }
    }

    static {
        wv wvVar = new wv();
        zzbzp = wvVar;
        aq.t(wv.class, wvVar);
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new wv();
            case 2:
                return new b((uw) null);
            case 3:
                return new k90(zzbzp, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdt", "zzbzn", xw.f8579a, "zzbzo"});
            case 4:
                return zzbzp;
            case 5:
                f90<wv> f90 = zzei;
                if (f90 == null) {
                    synchronized (wv.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzbzp);
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
