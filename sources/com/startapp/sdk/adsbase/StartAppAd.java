package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.startapp.a6;
import com.startapp.f;
import com.startapp.g;
import com.startapp.h;
import com.startapp.i;
import com.startapp.i4;
import com.startapp.j;
import com.startapp.j0;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashHideListener;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.c;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.d;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.tc;
import com.startapp.w2;
import com.startapp.wb;
import com.startapp.z2;
import java.io.Serializable;

/* compiled from: Sta */
public class StartAppAd extends Ad {
    private static final long serialVersionUID = 1;

    /* renamed from: ad  reason: collision with root package name */
    public d f12126ad = null;
    /* access modifiers changed from: private */
    public CacheKey adKey = null;
    private AdMode adMode = AdMode.AUTOMATIC;
    private AdPreferences adPreferences = null;
    public AdDisplayListener callback = null;
    private final BroadcastReceiver callbackBroadcastReceiver = new a();
    public VideoListener videoListener = null;

    /* compiled from: Sta */
    public enum AdMode {
        AUTOMATIC,
        FULLPAGE,
        OFFERWALL,
        REWARDED_VIDEO,
        VIDEO,
        OVERLAY
    }

    /* compiled from: Sta */
    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            f fVar;
            tc tcVar;
            h hVar;
            g gVar;
            String action = intent.getAction();
            if (action == null) {
                action = "";
            }
            String stringExtra = intent.getStringExtra("dParam");
            if (action.equals("com.startapp.android.ShowFailedDisplayBroadcastListener")) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                if (extras.containsKey("showFailedReason")) {
                    StartAppAd.this.a((NotDisplayedReason) extras.getSerializable("showFailedReason"));
                }
                StartAppAd startAppAd = StartAppAd.this;
                i.a(context, startAppAd.callback, startAppAd);
                a6.a(context).a((BroadcastReceiver) this);
            } else {
                boolean z10 = true;
                if (action.equals("com.startapp.android.ShowDisplayBroadcastListener")) {
                    StartAppAd startAppAd2 = StartAppAd.this;
                    AdDisplayListener adDisplayListener = startAppAd2.callback;
                    if (adDisplayListener == null) {
                        z10 = false;
                    }
                    w2.a("onShow", z10, stringExtra, (String) null);
                    if (adDisplayListener == null) {
                        gVar = null;
                    } else {
                        gVar = new g(adDisplayListener, startAppAd2, context);
                    }
                    a.a((Runnable) gVar);
                } else if (action.equals("com.startapp.android.OnClickCallback")) {
                    StartAppAd startAppAd3 = StartAppAd.this;
                    AdDisplayListener adDisplayListener2 = startAppAd3.callback;
                    if (adDisplayListener2 == null) {
                        z10 = false;
                    }
                    w2.a("onClicked", z10, stringExtra, (String) null);
                    if (adDisplayListener2 == null) {
                        hVar = null;
                    } else {
                        hVar = new h(adDisplayListener2, startAppAd3, context);
                    }
                    a.a((Runnable) hVar);
                } else if (action.equals("com.startapp.android.OnVideoCompleted")) {
                    VideoListener videoListener = StartAppAd.this.videoListener;
                    if (videoListener == null) {
                        z10 = false;
                    }
                    w2.a("onVideoCompleted", z10, stringExtra, (String) null);
                    if (videoListener == null) {
                        tcVar = null;
                    } else {
                        tcVar = new tc(videoListener, context);
                    }
                    a.a((Runnable) tcVar);
                } else {
                    StartAppAd startAppAd4 = StartAppAd.this;
                    AdDisplayListener adDisplayListener3 = startAppAd4.callback;
                    if (adDisplayListener3 == null) {
                        z10 = false;
                    }
                    w2.a("adHidden", z10, stringExtra, (String) null);
                    if (adDisplayListener3 == null) {
                        fVar = null;
                    } else {
                        fVar = new f(adDisplayListener3, startAppAd4, context);
                    }
                    a.a((Runnable) fVar);
                    a6.a(context).a((BroadcastReceiver) this);
                }
            }
            StartAppAd.this.f12126ad = null;
        }
    }

    /* compiled from: Sta */
    public class b implements d.C0123d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdEventListener f12128a;

        public b(AdEventListener adEventListener) {
            this.f12128a = adEventListener;
        }

        public void a(Ad ad2, CacheKey cacheKey, boolean z10) {
            CacheKey unused = StartAppAd.this.adKey = cacheKey;
            AdEventListener adEventListener = this.f12128a;
            if (adEventListener == null) {
                return;
            }
            if (!z10 || ad2 == null) {
                adEventListener.onFailedToReceiveAd(ad2);
            } else {
                adEventListener.onReceiveAd(ad2);
            }
        }
    }

    /* compiled from: Sta */
    public class c extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f12130a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ SplashHideListener f12131b;

        public c(Activity activity, SplashHideListener splashHideListener) {
            this.f12130a = activity;
            this.f12131b = splashHideListener;
        }

        public void onReceive(Context context, Intent intent) {
            wb.a(this.f12130a, false);
            SplashHideListener splashHideListener = this.f12131b;
            if (splashHideListener != null) {
                splashHideListener.splashHidden();
            }
            a6.a((Context) this.f12130a).a((BroadcastReceiver) this);
        }
    }

    /* compiled from: Sta */
    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12132a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.startapp.sdk.adsbase.StartAppAd$AdMode[] r0 = com.startapp.sdk.adsbase.StartAppAd.AdMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12132a = r0
                com.startapp.sdk.adsbase.StartAppAd$AdMode r1 = com.startapp.sdk.adsbase.StartAppAd.AdMode.FULLPAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12132a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r1 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12132a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r1 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OVERLAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12132a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r1 = com.startapp.sdk.adsbase.StartAppAd.AdMode.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppAd.d.<clinit>():void");
        }
    }

    public StartAppAd(Context context) {
        super(context, (AdPreferences.Placement) null);
        try {
            ComponentLocator.a(context).r().a(8192);
        } catch (Throwable unused) {
        }
    }

    public static void disableAutoInterstitial() {
        c.a.f12243a.f12238a = false;
    }

    public static void disableSplash() {
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f12173a.f12155w = true;
        com.startapp.sdk.adsbase.cache.d.f12250h.b(AdPreferences.Placement.INAPP_SPLASH);
    }

    public static void enableAutoInterstitial() {
        c.a.f12243a.f12238a = true;
    }

    public static void enableConsent(Context context, boolean z10) {
        ComponentLocator.a(context).f().f10321e = z10;
    }

    public static void init(Context context, String str, String str2) {
        StartAppSDK.init(context, str, str2);
    }

    public static void setAutoInterstitialPreferences(AutoInterstitialPreferences autoInterstitialPreferences) {
        c cVar = c.a.f12243a;
        cVar.f12239b = autoInterstitialPreferences;
        cVar.f12240c = -1;
        cVar.f12241d = -1;
    }

    public static void setCommonAdsPreferences(Context context, SDKAdPreferences sDKAdPreferences) {
        Context a10 = j0.a(context);
        if (a10 != null) {
            Object obj = StartAppSDKInternal.D;
            StartAppSDKInternal.d.f12173a.f12133a = sDKAdPreferences;
            z2.b(a10, "shared_prefs_sdk_ad_prefs", sDKAdPreferences);
        }
    }

    public static void setReturnAdsPreferences(AdPreferences adPreferences2) {
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f12173a;
        boolean z10 = !wb.a(startAppSDKInternal.f12151s, adPreferences2);
        startAppSDKInternal.f12151s = adPreferences2 != null ? new AdPreferences(adPreferences2) : null;
        if (z10) {
            com.startapp.sdk.adsbase.cache.d dVar = com.startapp.sdk.adsbase.cache.d.f12250h;
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_RETURN;
            if (!dVar.f12254d) {
                synchronized (dVar.f12251a) {
                    for (com.startapp.sdk.adsbase.cache.h next : dVar.f12251a.values()) {
                        if (next.f12273a == placement) {
                            next.b();
                        }
                    }
                }
            }
        }
    }

    public static void showSplash(Activity activity, Bundle bundle) {
        showSplash(activity, bundle, new SplashConfig());
    }

    public void a(AdPreferences adPreferences2, AdEventListener adEventListener) {
    }

    public void close() {
        a6.a(this.f12085a).a(this.callbackBroadcastReceiver);
        a6.a(this.f12085a).a(new Intent("com.startapp.android.CloseAdActivity"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r3.adKey;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.startapp.sdk.adsbase.model.AdPreferences.Placement f() {
        /*
            r3 = this;
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r0 = r3.placement
            if (r0 != 0) goto L_0x001e
            com.startapp.sdk.adsbase.cache.CacheKey r1 = r3.adKey
            if (r1 == 0) goto L_0x001e
            com.startapp.sdk.adsbase.cache.d r2 = com.startapp.sdk.adsbase.cache.d.f12250h
            com.startapp.sdk.adsbase.d r1 = r2.a((com.startapp.sdk.adsbase.cache.CacheKey) r1)
            if (r1 == 0) goto L_0x001e
            com.startapp.sdk.adsbase.cache.d r0 = com.startapp.sdk.adsbase.cache.d.f12250h
            com.startapp.sdk.adsbase.cache.CacheKey r1 = r3.adKey
            com.startapp.sdk.adsbase.d r0 = r0.a((com.startapp.sdk.adsbase.cache.CacheKey) r1)
            com.startapp.sdk.adsbase.Ad r0 = (com.startapp.sdk.adsbase.Ad) r0
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r0 = r0.f()
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppAd.f():com.startapp.sdk.adsbase.model.AdPreferences$Placement");
    }

    public String getAdId() {
        d a10 = com.startapp.sdk.adsbase.cache.d.f12250h.a(this.adKey);
        if (a10 instanceof HtmlAd) {
            return ((HtmlAd) a10).getAdId();
        }
        return null;
    }

    public String getBidToken() {
        d a10 = com.startapp.sdk.adsbase.cache.d.f12250h.a(this.adKey);
        if (a10 instanceof HtmlAd) {
            return ((HtmlAd) a10).getBidToken();
        }
        return null;
    }

    public Ad.AdState getState() {
        d a10 = com.startapp.sdk.adsbase.cache.d.f12250h.a(this.adKey);
        if (a10 != null) {
            return a10.getState();
        }
        return Ad.AdState.UN_INITIALIZED;
    }

    public boolean isBelowMinCPM() {
        d a10 = com.startapp.sdk.adsbase.cache.d.f12250h.a(this.adKey);
        if (a10 != null) {
            return a10.isBelowMinCPM();
        }
        return false;
    }

    public boolean isNetworkAvailable() {
        return wb.g(this.f12085a);
    }

    public boolean isReady() {
        d a10 = com.startapp.sdk.adsbase.cache.d.f12250h.a(this.adKey);
        if (a10 != null) {
            return a10.isReady();
        }
        return false;
    }

    @Deprecated
    public void load(AdPreferences adPreferences2, AdEventListener adEventListener) {
        if (MetaData.f12393k.b()) {
            com.startapp.sdk.adsbase.cache.d.f12250h.a(this.f12085a, this, this.adMode, adPreferences2, (d.C0123d) new b(adEventListener));
        } else if (adEventListener != null) {
            setErrorMessage("serving ads disabled");
            j.a(this.f12085a, adEventListener, this, false);
        }
    }

    public void loadAd() {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), (AdEventListener) null);
    }

    public void loadSplash(AdPreferences adPreferences2, d.C0123d dVar) {
        com.startapp.sdk.adsbase.cache.d dVar2 = com.startapp.sdk.adsbase.cache.d.f12250h;
        Context context = this.f12085a;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_SPLASH;
        if (dVar2.a(placement)) {
            dVar2.a(context, this, placement, adPreferences2, dVar, false, 0);
        } else if (dVar != null) {
            dVar.a((Ad) null, (CacheKey) null, false);
        }
    }

    public void onBackPressed() {
        showAd("exit_ad");
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f12173a;
        startAppSDKInternal.f12136d = false;
        startAppSDKInternal.f12138f = true;
    }

    public void onPause() {
    }

    public void onRestoreInstanceState(Bundle bundle) {
        int i10 = bundle.getInt("AdMode");
        this.adMode = AdMode.AUTOMATIC;
        if (i10 == 1) {
            this.adMode = AdMode.FULLPAGE;
        } else if (i10 == 2) {
            this.adMode = AdMode.OFFERWALL;
        } else if (i10 == 3) {
            this.adMode = AdMode.OVERLAY;
        } else if (i10 == 4) {
            this.adMode = AdMode.REWARDED_VIDEO;
        } else if (i10 == 5) {
            this.adMode = AdMode.VIDEO;
        }
        Serializable serializable = bundle.getSerializable("AdPrefs");
        if (serializable != null) {
            this.adPreferences = (AdPreferences) serializable;
        }
    }

    public void onResume() {
        if (!isReady()) {
            loadAd();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        int i10 = d.f12132a[this.adMode.ordinal()];
        int i11 = 4;
        if (i10 == 1) {
            i11 = 1;
        } else if (i10 == 2) {
            i11 = 2;
        } else if (i10 == 3) {
            i11 = 3;
        } else if (i10 != 4) {
            i11 = 0;
        }
        AdPreferences adPreferences2 = this.adPreferences;
        if (adPreferences2 != null) {
            bundle.putSerializable("AdPrefs", adPreferences2);
        }
        bundle.putInt("AdMode", i11);
    }

    public void setVideoListener(VideoListener videoListener2) {
        this.videoListener = videoListener2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0165, code lost:
        if (r14 == false) goto L_0x0168;
     */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e0  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean show(java.lang.String r13, com.startapp.sdk.adsbase.adlisteners.AdDisplayListener r14) {
        /*
            r12 = this;
            android.content.Context r0 = r12.f12085a
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r0)
            com.startapp.b9 r1 = r0.r()     // Catch:{ all -> 0x0011 }
            r2 = 32768(0x8000, float:4.5918E-41)
            r1.a((int) r2)     // Catch:{ all -> 0x0011 }
            goto L_0x0012
        L_0x0011:
        L_0x0012:
            r1 = 0
            r12.a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r1)
            r12.callback = r14
            com.startapp.sdk.adsbase.remoteconfig.MetaData r14 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f12393k
            boolean r14 = r14.b()
            r2 = 0
            if (r14 != 0) goto L_0x002e
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r13 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.SERVING_ADS_DISABLED
            r12.a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r13)
            android.content.Context r13 = r12.f12085a
            com.startapp.sdk.adsbase.adlisteners.AdDisplayListener r14 = r12.callback
            com.startapp.i.a(r13, r14, r12)
            return r2
        L_0x002e:
            com.startapp.sdk.adsbase.cache.CacheKey r14 = r12.adKey
            if (r14 != 0) goto L_0x0039
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            com.startapp.sdk.adsbase.model.AdPreferences r3 = r12.adPreferences
            r12.loadAd((com.startapp.sdk.adsbase.StartAppAd.AdMode) r14, (com.startapp.sdk.adsbase.model.AdPreferences) r3)
        L_0x0039:
            com.startapp.sdk.adsbase.AdsCommonMetaData r14 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h
            boolean r14 = r14.O()
            r3 = 1
            if (r14 == 0) goto L_0x004d
            android.content.Context r14 = r12.f12085a
            boolean r14 = com.startapp.wb.e((android.content.Context) r14)
            if (r14 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r14 = 0
            goto L_0x004e
        L_0x004d:
            r14 = 1
        L_0x004e:
            if (r14 == 0) goto L_0x0178
            boolean r14 = r12.isNetworkAvailable()
            if (r14 == 0) goto L_0x0172
            boolean r14 = r12.isReady()
            if (r14 == 0) goto L_0x010e
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r14 = r12.f()
            com.startapp.sdk.adsbase.adrules.AdRulesResult r4 = r12.a((java.lang.String) r13, (com.startapp.sdk.adsbase.model.AdPreferences.Placement) r14)
            boolean r5 = r4.b()
            if (r5 == 0) goto L_0x0105
            com.startapp.sdk.adsbase.cache.d r5 = com.startapp.sdk.adsbase.cache.d.f12250h
            com.startapp.sdk.adsbase.cache.CacheKey r6 = r12.adKey
            com.startapp.sdk.adsbase.d r5 = r5.c(r6)
            r12.f12126ad = r5
            if (r5 == 0) goto L_0x010a
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r6 = r12.placement
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r7 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.INAPP_SPLASH
            if (r6 != r7) goto L_0x0094
            java.lang.Object r6 = com.startapp.sdk.adsbase.StartAppSDKInternal.D
            com.startapp.sdk.adsbase.StartAppSDKInternal r6 = com.startapp.sdk.adsbase.StartAppSDKInternal.d.f12173a
            boolean r8 = r6.f12135c
            if (r8 == 0) goto L_0x008a
            boolean r6 = r6.f12136d
            if (r6 == 0) goto L_0x008a
            r6 = 1
            goto L_0x008b
        L_0x008a:
            r6 = 0
        L_0x008b:
            if (r6 == 0) goto L_0x0094
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.APP_IN_BACKGROUND
            r12.a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
            goto L_0x010a
        L_0x0094:
            boolean r5 = r5.a((java.lang.String) r13)
            if (r5 == 0) goto L_0x00ee
            com.startapp.e r6 = com.startapp.e.f10308d
            com.startapp.d r8 = new com.startapp.d
            r8.<init>(r14, r13)
            r6.a(r8)
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            if (r14 == 0) goto L_0x00bc
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r14 = r12.placement
            if (r14 == r7) goto L_0x00bc
            com.startapp.sdk.adsbase.model.AdPreferences r14 = r12.adPreferences
            if (r14 == 0) goto L_0x00bd
            com.startapp.sdk.adsbase.model.AdPreferences r6 = new com.startapp.sdk.adsbase.model.AdPreferences
            r6.<init>()
            boolean r14 = r14.equals(r6)
            if (r14 == 0) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            r3 = 0
        L_0x00bd:
            if (r3 == 0) goto L_0x00fd
            com.startapp.sdk.adsbase.cache.d r14 = com.startapp.sdk.adsbase.cache.d.f12250h
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            java.lang.String r14 = com.startapp.sdk.adsbase.cache.d.a((com.startapp.sdk.adsbase.StartAppAd.AdMode) r14)
            com.startapp.sdk.adsbase.e r0 = r0.d()
            com.startapp.sdk.adsbase.e$a r0 = r0.edit()
            r0.a((java.lang.String) r14, (int) r2)
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            com.startapp.sdk.adsbase.StartAppAd$AdMode r3 = com.startapp.sdk.adsbase.StartAppAd.AdMode.AUTOMATIC
            if (r14 != r3) goto L_0x00ea
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = com.startapp.sdk.adsbase.StartAppAd.AdMode.FULLPAGE
            java.lang.String r14 = com.startapp.sdk.adsbase.cache.d.a((com.startapp.sdk.adsbase.StartAppAd.AdMode) r14)
            r0.a((java.lang.String) r14, (int) r2)
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OFFERWALL
            java.lang.String r14 = com.startapp.sdk.adsbase.cache.d.a((com.startapp.sdk.adsbase.StartAppAd.AdMode) r14)
            r0.a((java.lang.String) r14, (int) r2)
        L_0x00ea:
            r0.apply()
            goto L_0x00fd
        L_0x00ee:
            com.startapp.sdk.adsbase.d r14 = r12.f12126ad
            boolean r0 = r14 instanceof com.startapp.sdk.adsbase.Ad
            if (r0 == 0) goto L_0x00fd
            com.startapp.sdk.adsbase.Ad r14 = (com.startapp.sdk.adsbase.Ad) r14
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = r14.getNotDisplayedReason()
            r12.a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
        L_0x00fd:
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            com.startapp.sdk.adsbase.model.AdPreferences r0 = r12.adPreferences
            r12.loadAd(r14, r0, r1)
            goto L_0x010b
        L_0x0105:
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.AD_RULES
            r12.a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
        L_0x010a:
            r5 = 0
        L_0x010b:
            r3 = 0
            goto L_0x0180
        L_0x010e:
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            com.startapp.sdk.adsbase.StartAppAd$AdMode r0 = com.startapp.sdk.adsbase.StartAppAd.AdMode.REWARDED_VIDEO
            if (r14 == r0) goto L_0x0168
            com.startapp.sdk.adsbase.StartAppAd$AdMode r0 = com.startapp.sdk.adsbase.StartAppAd.AdMode.VIDEO
            if (r14 == r0) goto L_0x0168
            com.startapp.sdk.adsbase.remoteconfig.MetaData r14 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f12393k
            boolean r14 = r14.b()
            if (r14 == 0) goto L_0x0164
            com.startapp.sdk.adsbase.AdsCommonMetaData r14 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h
            com.startapp.sdk.adsbase.VideoConfig r14 = r14.G()
            boolean r14 = r14.q()
            if (r14 != 0) goto L_0x012d
            goto L_0x0164
        L_0x012d:
            com.startapp.sdk.adsbase.model.AdPreferences r14 = r12.adPreferences
            if (r14 != 0) goto L_0x0136
            com.startapp.sdk.adsbase.model.AdPreferences r14 = new com.startapp.sdk.adsbase.model.AdPreferences
            r14.<init>()
        L_0x0136:
            com.startapp.sdk.adsbase.Ad$AdType r0 = com.startapp.sdk.adsbase.Ad.AdType.NON_VIDEO
            r14.setType(r0)
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r0 = r12.f()
            com.startapp.sdk.adsbase.cache.d r4 = com.startapp.sdk.adsbase.cache.d.f12250h
            com.startapp.sdk.adsbase.cache.CacheKey r5 = new com.startapp.sdk.adsbase.cache.CacheKey
            r5.<init>(r0, r14)
            com.startapp.sdk.adsbase.d r14 = r4.a((com.startapp.sdk.adsbase.cache.CacheKey) r5)
            if (r14 == 0) goto L_0x0164
            boolean r4 = r14.isReady()
            if (r4 == 0) goto L_0x0164
            com.startapp.sdk.adsbase.adrules.AdRulesResult r0 = r12.a((java.lang.String) r13, (com.startapp.sdk.adsbase.model.AdPreferences.Placement) r0)
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0164
            r14.a((boolean) r3)
            boolean r14 = r14.a((java.lang.String) r13)
            goto L_0x0165
        L_0x0164:
            r14 = 0
        L_0x0165:
            if (r14 == 0) goto L_0x0168
            goto L_0x0169
        L_0x0168:
            r3 = 0
        L_0x0169:
            if (r3 != 0) goto L_0x0170
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.AD_NOT_READY
            r12.a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
        L_0x0170:
            r4 = r1
            goto L_0x017f
        L_0x0172:
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.NETWORK_PROBLEM
            r12.a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
            goto L_0x017d
        L_0x0178:
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.APP_IN_BACKGROUND
            r12.a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
        L_0x017d:
            r4 = r1
            r3 = 0
        L_0x017f:
            r5 = 0
        L_0x0180:
            if (r5 != 0) goto L_0x0184
            if (r3 == 0) goto L_0x01de
        L_0x0184:
            android.content.Context r14 = r12.f12085a
            com.startapp.a6 r14 = com.startapp.a6.a((android.content.Context) r14)
            android.content.BroadcastReceiver r0 = r12.callbackBroadcastReceiver
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r7 = "com.startapp.android.HideDisplayBroadcastListener"
            r6.<init>(r7)
            r14.a(r0, r6)
            android.content.Context r14 = r12.f12085a
            com.startapp.a6 r14 = com.startapp.a6.a((android.content.Context) r14)
            android.content.BroadcastReceiver r0 = r12.callbackBroadcastReceiver
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r7 = "com.startapp.android.ShowDisplayBroadcastListener"
            r6.<init>(r7)
            r14.a(r0, r6)
            android.content.Context r14 = r12.f12085a
            com.startapp.a6 r14 = com.startapp.a6.a((android.content.Context) r14)
            android.content.BroadcastReceiver r0 = r12.callbackBroadcastReceiver
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r7 = "com.startapp.android.ShowFailedDisplayBroadcastListener"
            r6.<init>(r7)
            r14.a(r0, r6)
            android.content.Context r14 = r12.f12085a
            com.startapp.a6 r14 = com.startapp.a6.a((android.content.Context) r14)
            android.content.BroadcastReceiver r0 = r12.callbackBroadcastReceiver
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r7 = "com.startapp.android.OnClickCallback"
            r6.<init>(r7)
            r14.a(r0, r6)
            android.content.Context r14 = r12.f12085a
            com.startapp.a6 r14 = com.startapp.a6.a((android.content.Context) r14)
            android.content.BroadcastReceiver r0 = r12.callbackBroadcastReceiver
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r7 = "com.startapp.android.OnVideoCompleted"
            r6.<init>(r7)
            r14.a(r0, r6)
        L_0x01de:
            if (r5 != 0) goto L_0x0229
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = r12.getNotDisplayedReason()
            if (r14 != 0) goto L_0x01eb
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.INTERNAL_ERROR
            r12.a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
        L_0x01eb:
            com.startapp.sdk.adsbase.cache.d r0 = com.startapp.sdk.adsbase.cache.d.f12250h
            com.startapp.sdk.adsbase.cache.CacheKey r6 = r12.adKey
            com.startapp.sdk.adsbase.d r0 = r0.a((com.startapp.sdk.adsbase.cache.CacheKey) r6)
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r6 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.AD_RULES
            if (r14 == r6) goto L_0x0211
            if (r3 == 0) goto L_0x01fb
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.AD_NOT_READY_VIDEO_FALLBACK
        L_0x01fb:
            android.content.Context r6 = r12.f12085a
            com.startapp.sdk.adsbase.d r2 = r12.f12126ad
            if (r2 == 0) goto L_0x0202
            r0 = r2
        L_0x0202:
            java.lang.String[] r7 = com.startapp.sdk.adsbase.a.a((com.startapp.sdk.adsbase.d) r0)
            java.lang.String r10 = r14.toString()
            r9 = 0
            r11 = 0
            r8 = r13
            com.startapp.sdk.adsbase.a.a((android.content.Context) r6, (java.lang.String[]) r7, (java.lang.String) r8, (int) r9, (java.lang.String) r10, (org.json.JSONObject) r11)
            goto L_0x021e
        L_0x0211:
            if (r4 == 0) goto L_0x021e
            java.lang.String[] r14 = com.startapp.sdk.adsbase.a.a((com.startapp.sdk.adsbase.d) r0)
            java.lang.String r0 = r4.a()
            com.startapp.sdk.adsbase.a.a(r14, r13, r2, r0)
        L_0x021e:
            r12.f12126ad = r1
            if (r3 != 0) goto L_0x0229
            android.content.Context r13 = r12.f12085a
            com.startapp.sdk.adsbase.adlisteners.AdDisplayListener r14 = r12.callback
            com.startapp.i.a(r13, r14, r12)
        L_0x0229:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppAd.show(java.lang.String, com.startapp.sdk.adsbase.adlisteners.AdDisplayListener):boolean");
    }

    public boolean showAd() {
        return showAd((String) null, (AdDisplayListener) null);
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig) {
        showSplash(activity, bundle, splashConfig, new AdPreferences());
    }

    public AdRulesResult a(String str, AdPreferences.Placement placement) {
        return AdsCommonMetaData.f12098h.b().a(placement, str);
    }

    public void loadAd(AdPreferences adPreferences2) {
        loadAd(AdMode.AUTOMATIC, adPreferences2, (AdEventListener) null);
    }

    @Deprecated
    public boolean showAd(String str) {
        return showAd(str, (AdDisplayListener) null);
    }

    public static void showSplash(Activity activity, Bundle bundle, AdPreferences adPreferences2) {
        showSplash(activity, bundle, new SplashConfig(), adPreferences2);
    }

    public void loadAd(AdEventListener adEventListener) {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), adEventListener);
    }

    public boolean showAd(AdDisplayListener adDisplayListener) {
        return showAd((String) null, adDisplayListener);
    }

    public static void a(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences2, SplashHideListener splashHideListener, boolean z10) {
        if (activity != null && bundle == null && MetaData.f12393k.b() && wb.e((Context) activity) && ComponentLocator.a((Context) activity).c().a()) {
            try {
                Object obj = StartAppSDKInternal.D;
                StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f12173a;
                if (!(!startAppSDKInternal.f12155w) && z10) {
                    startAppSDKInternal.f12155w = false;
                }
                startAppSDKInternal.f12154v = z10;
                if (!z10) {
                    if (adPreferences2 == null) {
                        adPreferences2 = new AdPreferences();
                    }
                    adPreferences2.setAs(Boolean.TRUE);
                }
                splashConfig.setDefaults(activity);
                wb.a(activity, activity.getResources().getConfiguration().orientation, true);
                Intent intent = new Intent(activity, OverlayActivity.class);
                intent.putExtra("SplashConfig", splashConfig);
                intent.putExtra("AdPreference", adPreferences2);
                intent.putExtra("testMode", false);
                intent.putExtra("fullscreen", a.a(activity));
                intent.putExtra("placement", AdPreferences.Placement.INAPP_SPLASH.a());
                intent.addFlags(67108864 | 32768 | 1073741824);
                activity.startActivity(intent);
                a6.a((Context) activity).a(new c(activity, splashHideListener), new IntentFilter("com.startapp.android.splashHidden"));
            } catch (Throwable th) {
                i4.a(th);
                if (splashHideListener != null) {
                    splashHideListener.splashHidden();
                }
            }
        }
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences2) {
        showSplash(activity, bundle, splashConfig, adPreferences2, (SplashHideListener) null);
    }

    public void loadAd(AdPreferences adPreferences2, AdEventListener adEventListener) {
        loadAd(AdMode.AUTOMATIC, adPreferences2, adEventListener);
    }

    public boolean showAd(@Deprecated String str, AdDisplayListener adDisplayListener) {
        try {
            return show(str, adDisplayListener);
        } catch (Throwable th) {
            i4.a(th);
            a(NotDisplayedReason.INTERNAL_ERROR);
            i.a(this.f12085a, this.callback, (Ad) null);
            return false;
        }
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences2, SplashHideListener splashHideListener) {
        a(activity, bundle, splashConfig, adPreferences2, splashHideListener, true);
    }

    public void loadAd(AdMode adMode2) {
        loadAd(adMode2, new AdPreferences(), (AdEventListener) null);
    }

    public static void onBackPressed(Context context) {
        new StartAppAd(context).onBackPressed();
    }

    public void loadAd(AdMode adMode2, AdPreferences adPreferences2) {
        loadAd(adMode2, adPreferences2, (AdEventListener) null);
    }

    public void loadAd(AdMode adMode2, AdEventListener adEventListener) {
        loadAd(adMode2, new AdPreferences(), adEventListener);
    }

    public static boolean showAd(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return new StartAppAd(context).showAd();
        } catch (Throwable th) {
            i4.a(th);
            return false;
        }
    }

    public void loadAd(AdMode adMode2, AdPreferences adPreferences2, AdEventListener adEventListener) {
        try {
            ComponentLocator.a(this.f12085a).r().a(16384);
        } catch (Throwable unused) {
        }
        this.adMode = adMode2;
        this.adPreferences = adPreferences2;
        try {
            load(adPreferences2, adEventListener);
        } catch (Throwable th) {
            i4.a(th);
            if (adEventListener != null) {
                j.a(this.f12085a, adEventListener, this, false);
            }
        }
    }

    @Deprecated
    public boolean show() {
        return show((String) null, (AdDisplayListener) null);
    }
}
