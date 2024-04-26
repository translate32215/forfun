package com.startapp.sdk.ads.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.startapp.b1;
import com.startapp.e7;
import com.startapp.f1;
import com.startapp.hd;
import com.startapp.j9;
import com.startapp.q7;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.nativead.StartAppNativeAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.w2;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class NativeAdDetails implements NativeAdInterface {

    /* renamed from: a  reason: collision with root package name */
    public final AdDetails f11853a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f11854b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f11855c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11856d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11857e = false;

    /* renamed from: f  reason: collision with root package name */
    public String f11858f;

    /* renamed from: g  reason: collision with root package name */
    public hd f11859g;

    /* renamed from: h  reason: collision with root package name */
    public WeakReference<View> f11860h = new WeakReference<>((Object) null);

    /* renamed from: i  reason: collision with root package name */
    public View.OnAttachStateChangeListener f11861i;

    /* renamed from: j  reason: collision with root package name */
    public NativeAdDisplayListener f11862j;

    /* renamed from: k  reason: collision with root package name */
    public q7 f11863k;

    /* renamed from: l  reason: collision with root package name */
    public final j9.a f11864l = new a();

    /* compiled from: Sta */
    public class a implements j9.a {
        public a() {
        }

        public void onSent(String str) {
            NativeAdDetails nativeAdDetails = NativeAdDetails.this;
            boolean z10 = true;
            nativeAdDetails.f11856d = true;
            if (nativeAdDetails.f11862j == null) {
                z10 = false;
            }
            w2.a("onShow", z10, str, (String) null);
            NativeAdDisplayListener nativeAdDisplayListener = nativeAdDetails.f11862j;
            if (nativeAdDisplayListener != null) {
                nativeAdDisplayListener.adDisplayed(nativeAdDetails);
            }
        }
    }

    /* compiled from: Sta */
    public class b implements f1.b {

        /* renamed from: a  reason: collision with root package name */
        public int f11866a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Runnable f11867b;

        public b(Runnable runnable) {
            this.f11867b = runnable;
        }

        public void a(Bitmap bitmap, int i10) {
            if (i10 == 0) {
                NativeAdDetails.this.f11854b = bitmap;
            } else {
                NativeAdDetails.this.f11855c = bitmap;
            }
            int i11 = this.f11866a + 1;
            this.f11866a = i11;
            if (i11 == 2) {
                this.f11867b.run();
            }
        }
    }

    /* compiled from: Sta */
    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            NativeAdDetails.a(NativeAdDetails.this, view);
        }
    }

    /* compiled from: Sta */
    public class d implements View.OnClickListener {
        public d() {
        }

        public void onClick(View view) {
            NativeAdDetails.a(NativeAdDetails.this, view);
        }
    }

    /* compiled from: Sta */
    public class e implements hd.a {
        public e() {
        }
    }

    /* compiled from: Sta */
    public static /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11872a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.startapp.sdk.ads.nativead.StartAppNativeAd$CampaignAction[] r0 = com.startapp.sdk.ads.nativead.StartAppNativeAd.CampaignAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11872a = r0
                com.startapp.sdk.ads.nativead.StartAppNativeAd$CampaignAction r1 = com.startapp.sdk.ads.nativead.StartAppNativeAd.CampaignAction.OPEN_MARKET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11872a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.ads.nativead.StartAppNativeAd$CampaignAction r1 = com.startapp.sdk.ads.nativead.StartAppNativeAd.CampaignAction.LAUNCH_APP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.nativead.NativeAdDetails.f.<clinit>():void");
        }
    }

    public NativeAdDetails(AdDetails adDetails) {
        this.f11853a = adDetails;
    }

    public static void a(NativeAdDetails nativeAdDetails, View view) {
        nativeAdDetails.getClass();
        Context context = view.getContext();
        int i10 = f.f11872a[nativeAdDetails.getCampaignAction().ordinal()];
        if (i10 == 1) {
            boolean a10 = com.startapp.sdk.adsbase.a.a(context, AdPreferences.Placement.INAPP_NATIVE);
            if (!nativeAdDetails.f11853a.A() || a10) {
                com.startapp.sdk.adsbase.a.a(context, nativeAdDetails.f11853a.g(), nativeAdDetails.f11853a.u(), new TrackingParams(nativeAdDetails.f11858f), nativeAdDetails.f11853a.B() && !a10, false);
            } else {
                com.startapp.sdk.adsbase.a.a(context, nativeAdDetails.f11853a.g(), nativeAdDetails.f11853a.u(), nativeAdDetails.f11853a.p(), new TrackingParams(nativeAdDetails.f11858f), AdsCommonMetaData.f12098h.z(), AdsCommonMetaData.f12098h.y(), nativeAdDetails.f11853a.B(), nativeAdDetails.f11853a.C(), false, (Runnable) null);
            }
        } else if (i10 == 2) {
            com.startapp.sdk.adsbase.a.a(nativeAdDetails.getPackageName(), nativeAdDetails.f11853a.l(), nativeAdDetails.f11853a.g(), context, new TrackingParams(nativeAdDetails.f11858f));
        }
        NativeAdDisplayListener nativeAdDisplayListener = nativeAdDetails.f11862j;
        if (nativeAdDisplayListener != null) {
            nativeAdDisplayListener.adClicked(nativeAdDetails);
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        unregisterView();
    }

    public String getCallToAction() {
        String e10;
        AdDetails adDetails = this.f11853a;
        if (adDetails == null || (e10 = adDetails.e()) == null) {
            return "";
        }
        return e10;
    }

    public StartAppNativeAd.CampaignAction getCampaignAction() {
        StartAppNativeAd.CampaignAction campaignAction = StartAppNativeAd.CampaignAction.OPEN_MARKET;
        AdDetails adDetails = this.f11853a;
        return (adDetails == null || !adDetails.z()) ? campaignAction : StartAppNativeAd.CampaignAction.LAUNCH_APP;
    }

    public String getCategory() {
        String f10;
        AdDetails adDetails = this.f11853a;
        if (adDetails == null || (f10 = adDetails.f()) == null) {
            return "";
        }
        return f10;
    }

    public String getDescription() {
        String i10;
        AdDetails adDetails = this.f11853a;
        if (adDetails == null || (i10 = adDetails.i()) == null) {
            return "";
        }
        return i10;
    }

    public Bitmap getImageBitmap() {
        return this.f11854b;
    }

    public String getImageUrl() {
        AdDetails adDetails = this.f11853a;
        if (adDetails != null) {
            return adDetails.j();
        }
        return null;
    }

    public String getInstalls() {
        String k10;
        AdDetails adDetails = this.f11853a;
        if (adDetails == null || (k10 = adDetails.k()) == null) {
            return "";
        }
        return k10;
    }

    public String getPackageName() {
        String p10;
        AdDetails adDetails = this.f11853a;
        if (adDetails == null || (p10 = adDetails.p()) == null) {
            return "";
        }
        return p10;
    }

    public float getRating() {
        AdDetails adDetails = this.f11853a;
        if (adDetails != null) {
            return adDetails.q();
        }
        return 5.0f;
    }

    public Bitmap getSecondaryImageBitmap() {
        return this.f11855c;
    }

    public String getSecondaryImageUrl() {
        AdDetails adDetails = this.f11853a;
        if (adDetails != null) {
            return adDetails.r();
        }
        return null;
    }

    public String getTitle() {
        String t10;
        AdDetails adDetails = this.f11853a;
        if (adDetails == null || (t10 = adDetails.t()) == null) {
            return "";
        }
        return t10;
    }

    public boolean isApp() {
        AdDetails adDetails = this.f11853a;
        if (adDetails != null) {
            return adDetails.y();
        }
        return true;
    }

    public boolean isBelowMinCPM() {
        AdDetails adDetails = this.f11853a;
        return adDetails != null && adDetails.n();
    }

    public void loadImages(Context context, Runnable runnable) {
        b bVar = new b(runnable);
        new f1(context, getImageUrl(), bVar, 0).a();
        new f1(context, getSecondaryImageUrl(), bVar, 1).a();
    }

    public void registerViewForInteraction(View view) {
        a(view);
        ((View) this.f11860h.get()).setOnClickListener(new c());
    }

    public String toString() {
        String description = getDescription();
        if (description != null) {
            description = description.substring(0, Math.min(30, description.length()));
        }
        StringBuilder a10 = b1.a("         Title: [");
        a10.append(getTitle());
        a10.append("]\n         Description: [");
        a10.append(description);
        a10.append("]...\n         Rating: [");
        a10.append(getRating());
        a10.append("]\n         Installs: [");
        a10.append(getInstalls());
        a10.append("]\n         Category: [");
        a10.append(getCategory());
        a10.append("]\n         PackageName: [");
        a10.append(getPackageName());
        a10.append("]\n         CampaginAction: [");
        a10.append(getCampaignAction());
        a10.append("]\n");
        return a10.toString();
    }

    public void unregisterView() {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        hd hdVar = this.f11859g;
        if (hdVar != null) {
            hdVar.a();
            this.f11859g = null;
        }
        View view = (View) this.f11860h.get();
        this.f11860h.clear();
        if (view != null && (onAttachStateChangeListener = this.f11861i) != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    public void registerViewForInteraction(View view, List<View> list) {
        registerViewForInteraction(view, list, (NativeAdDisplayListener) null);
    }

    public void registerViewForInteraction(View view, List<View> list, NativeAdDisplayListener nativeAdDisplayListener) {
        if (list == null || list.isEmpty() || this.f11860h.get() != null) {
            registerViewForInteraction(view);
        } else {
            d dVar = new d();
            for (View onClickListener : list) {
                onClickListener.setOnClickListener(dVar);
            }
            a(view);
        }
        this.f11862j = nativeAdDisplayListener;
    }

    public final void a(View view) {
        this.f11860h = new WeakReference<>(view);
        if (!view.hasWindowFocus()) {
            if (this.f11861i == null) {
                this.f11861i = new e7(this);
            }
            view.addOnAttachStateChangeListener(this.f11861i);
            return;
        }
        a();
    }

    public final void a() {
        long j10;
        if (this.f11859g == null && !this.f11856d) {
            View view = (View) this.f11860h.get();
            if (view == null) {
                NativeAdDisplayListener nativeAdDisplayListener = this.f11862j;
                if (nativeAdDisplayListener != null) {
                    nativeAdDisplayListener.adNotDisplayed(this);
                    return;
                }
                return;
            }
            Context context = view.getContext();
            String[] w10 = this.f11853a.w();
            TrackingParams trackingParams = new TrackingParams(this.f11858f);
            if (this.f11853a.h() != null) {
                j10 = TimeUnit.SECONDS.toMillis(this.f11853a.h().longValue());
            } else {
                j10 = TimeUnit.SECONDS.toMillis(MetaData.f12393k.p());
            }
            j9 j9Var = new j9(context, w10, trackingParams, j10);
            j9Var.f10720j = new WeakReference<>(this.f11864l);
            hd hdVar = new hd(this.f11860h, j9Var, BannerMetaData.f11748b.a());
            this.f11859g = hdVar;
            hdVar.f10512c = new e();
            if (hdVar.b()) {
                hdVar.run();
            }
        }
    }
}
