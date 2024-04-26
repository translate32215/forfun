package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class BannerRequest {
    private BannerFormat adFormat = BannerFormat.BANNER;
    private AdPreferences adPreferences;
    private Point adSizeDp;
    private final Context context;

    /* compiled from: Sta */
    public interface Callback {
        void onFinished(BannerCreator bannerCreator, String str);
    }

    /* compiled from: Sta */
    public class a implements AdEventListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Callback f11749a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ BannerFormat f11750b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ AdPreferences f11751c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ BannerStandardAd f11752d;

        /* renamed from: com.startapp.sdk.ads.banner.BannerRequest$a$a  reason: collision with other inner class name */
        /* compiled from: Sta */
        public class C0120a implements BannerCreator {

            /* renamed from: a  reason: collision with root package name */
            public boolean f11753a;

            public C0120a() {
            }

            public View create(Context context, BannerListener bannerListener) {
                BannerStandard bannerStandard;
                if (!this.f11753a) {
                    int i10 = b.f11755a[a.this.f11750b.ordinal()];
                    if (i10 == 1) {
                        a aVar = a.this;
                        bannerStandard = new Mrec(context, false, aVar.f11751c, aVar.f11752d);
                    } else if (i10 != 2) {
                        a aVar2 = a.this;
                        bannerStandard = new Banner(context, false, aVar2.f11751c, aVar2.f11752d);
                    } else {
                        a aVar3 = a.this;
                        bannerStandard = new Cover(context, false, aVar3.f11751c, aVar3.f11752d);
                    }
                    bannerStandard.setBannerListener(bannerListener);
                    bannerStandard.onReceiveAd(a.this.f11752d);
                    this.f11753a = true;
                    return bannerStandard;
                }
                throw new IllegalStateException();
            }
        }

        public a(BannerRequest bannerRequest, Callback callback, BannerFormat bannerFormat, AdPreferences adPreferences, BannerStandardAd bannerStandardAd) {
            this.f11749a = callback;
            this.f11750b = bannerFormat;
            this.f11751c = adPreferences;
            this.f11752d = bannerStandardAd;
        }

        public void onFailedToReceiveAd(Ad ad2) {
            this.f11749a.onFinished((BannerCreator) null, String.valueOf(this.f11752d.getErrorMessage()));
        }

        public void onReceiveAd(Ad ad2) {
            this.f11749a.onFinished(new C0120a(), (String) null);
        }
    }

    /* compiled from: Sta */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11755a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.startapp.sdk.ads.banner.BannerFormat[] r0 = com.startapp.sdk.ads.banner.BannerFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11755a = r0
                com.startapp.sdk.ads.banner.BannerFormat r1 = com.startapp.sdk.ads.banner.BannerFormat.MREC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11755a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.ads.banner.BannerFormat r1 = com.startapp.sdk.ads.banner.BannerFormat.COVER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.BannerRequest.b.<clinit>():void");
        }
    }

    public BannerRequest(Context context2) {
        this.context = context2.getApplicationContext();
    }

    public void load(Callback callback) {
        int i10;
        int i11;
        AdPreferences adPreferences2 = this.adPreferences;
        if (adPreferences2 == null) {
            adPreferences2 = new AdPreferences();
        }
        BannerStandardAd bannerStandardAd = new BannerStandardAd(this.context, 0);
        BannerFormat bannerFormat = this.adFormat;
        Point point = this.adSizeDp;
        if (point != null) {
            i10 = point.x;
            i11 = point.y;
        } else {
            i10 = bannerFormat.widthDp;
            i11 = bannerFormat.heightDp;
        }
        bannerStandardAd.c(bannerFormat.type);
        bannerStandardAd.a(i10, i11);
        bannerStandardAd.load(adPreferences2, new a(this, callback, bannerFormat, adPreferences2, bannerStandardAd), true);
    }

    public BannerRequest setAdFormat(BannerFormat bannerFormat) {
        this.adFormat = bannerFormat;
        return this;
    }

    public BannerRequest setAdPreferences(AdPreferences adPreferences2) {
        this.adPreferences = adPreferences2;
        return this;
    }

    public BannerRequest setAdSize(int i10, int i11) {
        this.adSizeDp = new Point(i10, i11);
        return this;
    }
}
