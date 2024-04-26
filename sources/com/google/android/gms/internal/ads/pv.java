package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.c80;
import e8.c90;
import e8.f90;
import e8.i90;
import e8.k90;
import e8.vh0;
import e8.x70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pv extends aq<pv, b> implements c90 {
    /* access modifiers changed from: private */
    public static final pv zzbyl;
    private static volatile f90<pv> zzei;
    private int zzbya;
    private int zzbyb = 1000;
    private xv zzbyc;
    private yv zzbyd;
    private c80<wv> zzbye;
    private zv zzbyf;
    private jw zzbyg;
    private hw zzbyh;
    private ew zzbyi;
    private fw zzbyj;
    private c80<pw> zzbyk;
    private int zzdt;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public enum a implements x70 {
        AD_INITIATER_UNSPECIFIED(0),
        BANNER(1),
        DFP_BANNER(2),
        INTERSTITIAL(3),
        DFP_INTERSTITIAL(4),
        NATIVE_EXPRESS(5),
        AD_LOADER(6),
        REWARD_BASED_VIDEO_AD(7),
        BANNER_SEARCH_ADS(8),
        GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
        APP_OPEN(10);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f7906a;

        /* access modifiers changed from: public */
        a(int i10) {
            this.f7906a = i10;
        }

        public final int g() {
            return this.f7906a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7906a + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class b extends aq.b<pv, b> {
        public b() {
            super(pv.zzbyl);
        }

        public b(uw uwVar) {
            super(pv.zzbyl);
        }
    }

    static {
        pv pvVar = new pv();
        zzbyl = pvVar;
        aq.t(pv.class, pvVar);
    }

    public pv() {
        i90<Object> i90 = i90.f15001d;
        this.zzbye = i90;
        this.zzbyk = i90;
    }

    public static pv B() {
        return zzbyl;
    }

    public static void y(pv pvVar, a aVar) {
        pvVar.getClass();
        pvVar.zzbya = aVar.f7906a;
        pvVar.zzdt |= 1;
    }

    public static void z(pv pvVar, yv yvVar) {
        pvVar.getClass();
        pvVar.zzbyd = yvVar;
        pvVar.zzdt |= 8;
    }

    public final yv A() {
        yv yvVar = this.zzbyd;
        return yvVar == null ? yv.z() : yvVar;
    }

    public final Object q(int i10, Object obj, Object obj2) {
        switch (uw.f8300a[i10 - 1]) {
            case 1:
                return new pv();
            case 2:
                return new b((uw) null);
            case 3:
                return new k90(zzbyl, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzdt", "zzbya", vw.f8417a, "zzbyb", vh0.f17147a, "zzbyc", "zzbyd", "zzbye", wv.class, "zzbyf", "zzbyg", "zzbyh", "zzbyi", "zzbyj", "zzbyk", pw.class});
            case 4:
                return zzbyl;
            case 5:
                f90<pv> f90 = zzei;
                if (f90 == null) {
                    synchronized (pv.class) {
                        f90 = zzei;
                        if (f90 == null) {
                            f90 = new aq.a<>(zzbyl);
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
