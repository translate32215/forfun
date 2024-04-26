package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import com.startapp.b1;
import com.startapp.j;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.adsbase.remoteconfig.c;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.t9;
import com.startapp.wb;
import java.io.Serializable;
import java.util.Map;

/* compiled from: Sta */
public abstract class Ad implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f12084b = false;
    private static final long serialVersionUID = 1;

    /* renamed from: a  reason: collision with root package name */
    public transient Context f12085a;
    public ActivityExtra activityExtra;
    public Long adCacheTtl = null;
    private AdInformationOverrides adInfoOverride;
    public boolean belowMinCPM = false;
    public ConsentData consentData;
    public String errorMessage;
    public Serializable extraData = null;
    private Long lastLoadTime = null;
    private NotDisplayedReason notDisplayedReason;
    public AdPreferences.Placement placement;
    private AdState state = AdState.UN_INITIALIZED;
    private AdType type;
    private boolean videoCancelCallBack;

    /* compiled from: Sta */
    public enum AdState {
        UN_INITIALIZED,
        PROCESSING,
        READY
    }

    /* compiled from: Sta */
    public enum AdType {
        INTERSTITIAL,
        RICH_TEXT,
        VIDEO,
        REWARDED_VIDEO,
        NON_VIDEO,
        VIDEO_NO_VAST
    }

    /* compiled from: Sta */
    public class a implements AdEventListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdEventListener f12086a;

        public a(AdEventListener adEventListener) {
            this.f12086a = adEventListener;
        }

        public void onFailedToReceiveAd(Ad ad2) {
            j.a(Ad.this.f12085a, this.f12086a, ad2, false);
            String errorMessage = ad2 != null ? ad2.getErrorMessage() : null;
            String str = "";
            if (errorMessage == null) {
                errorMessage = str;
            } else if (errorMessage.contains("204")) {
                errorMessage = "NO FILL";
            }
            Context context = Ad.this.f12085a;
            StringBuilder a10 = b1.a("Failed to load ");
            if (ad2 != null) {
                str = wb.a(ad2);
            }
            wb.a(context, 6, androidx.fragment.app.a.a(a10, str, " ad: ", errorMessage), true);
        }

        public void onReceiveAd(Ad ad2) {
            Ad.a(Ad.this, Long.valueOf(System.currentTimeMillis()));
            j.b(Ad.this.f12085a, this.f12086a, ad2, false);
            ConsentData consentData = ad2.getConsentData();
            if (consentData != null) {
                ComponentLocator.a(Ad.this.f12085a).f().a(consentData.f(), consentData.e(), consentData.a(), false, true);
            }
            Context context = Ad.this.f12085a;
            StringBuilder a10 = b1.a("Loaded ");
            a10.append(wb.a(ad2));
            a10.append(" ad with creative ID - ");
            a10.append(ad2.getAdId());
            wb.a(context, 4, a10.toString(), true);
        }
    }

    /* compiled from: Sta */
    public class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdPreferences f12088a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AdEventListener f12089b;

        public b(AdPreferences adPreferences, AdEventListener adEventListener) {
            this.f12088a = adPreferences;
            this.f12089b = adEventListener;
        }

        public void a(MetaDataRequest.RequestReason requestReason, boolean z10) {
            Ad.this.a(this.f12088a, this.f12089b);
        }

        public void a(MetaDataRequest.RequestReason requestReason) {
            Ad.this.a(this.f12088a, this.f12089b);
        }
    }

    public Ad(Context context, AdPreferences.Placement placement2) {
        this.f12085a = context;
        this.placement = placement2;
        Map<Activity, Integer> map = wb.f12765a;
        this.adInfoOverride = AdInformationOverrides.a();
    }

    public void a(NotDisplayedReason notDisplayedReason2) {
        this.notDisplayedReason = notDisplayedReason2;
    }

    public abstract void a(AdPreferences adPreferences, AdEventListener adEventListener);

    public Long b() {
        return this.lastLoadTime;
    }

    public Long c() {
        long e10 = e();
        Long l10 = this.adCacheTtl;
        if (l10 != null) {
            e10 = Math.min(l10.longValue(), e10);
        }
        return Long.valueOf(e10);
    }

    public boolean d() {
        if (this.lastLoadTime != null && System.currentTimeMillis() - this.lastLoadTime.longValue() > c().longValue()) {
            return true;
        }
        return false;
    }

    public long e() {
        return CacheMetaData.f12244a.a().a();
    }

    public AdPreferences.Placement f() {
        return this.placement;
    }

    public abstract String getAdId();

    public AdInformationOverrides getAdInfoOverride() {
        return this.adInfoOverride;
    }

    public abstract String getBidToken();

    public final ConsentData getConsentData() {
        return this.consentData;
    }

    public Context getContext() {
        return this.f12085a;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Serializable getExtraData() {
        return this.extraData;
    }

    public NotDisplayedReason getNotDisplayedReason() {
        return this.notDisplayedReason;
    }

    public AdState getState() {
        return this.state;
    }

    public AdType getType() {
        return this.type;
    }

    public boolean isBelowMinCPM() {
        return this.belowMinCPM;
    }

    public boolean isReady() {
        return this.state == AdState.READY && !d();
    }

    @Deprecated
    public void load() {
        load(new AdPreferences(), (AdEventListener) null);
    }

    public void setActivityExtra(ActivityExtra activityExtra2) {
        this.activityExtra = activityExtra2;
    }

    public void setAdInfoOverride(AdInformationOverrides adInformationOverrides) {
        this.adInfoOverride = adInformationOverrides;
    }

    public void setContext(Context context) {
        this.f12085a = context;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setExtraData(Serializable serializable) {
        this.extraData = serializable;
    }

    public void setState(AdState adState) {
        this.state = adState;
    }

    @Deprecated
    public boolean show() {
        return false;
    }

    public static void a(Ad ad2, Long l10) {
        ad2.lastLoadTime = l10;
    }

    @Deprecated
    public void load(AdEventListener adEventListener) {
        load(new AdPreferences(), adEventListener);
    }

    public boolean a() {
        return this.videoCancelCallBack;
    }

    @Deprecated
    public void load(AdPreferences adPreferences) {
        load(adPreferences, (AdEventListener) null);
    }

    public void a(boolean z10) {
        this.videoCancelCallBack = z10;
    }

    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener) {
        load(adPreferences, adEventListener, true);
    }

    public boolean load(AdPreferences adPreferences, AdEventListener adEventListener, boolean z10) {
        String str;
        boolean z11;
        a aVar = new a(adEventListener);
        if (!f12084b) {
            SimpleTokenUtils.f(this.f12085a);
            f12084b = true;
        }
        if (this.state != AdState.UN_INITIALIZED) {
            str = "load() was already called.";
            z11 = true;
        } else {
            str = "";
            z11 = false;
        }
        if (!wb.g(this.f12085a)) {
            str = "network not available.";
            z11 = true;
        }
        if (!MetaData.f12393k.b()) {
            str = "serving ads disabled";
            z11 = true;
        }
        if (z11) {
            setErrorMessage("Ad wasn't loaded: " + str);
            j.a(this.f12085a, aVar, this, false);
            return false;
        }
        setState(AdState.PROCESSING);
        b bVar = new b(adPreferences, aVar);
        if (adPreferences.getType() != null) {
            this.type = adPreferences.getType();
        }
        MetaData.f12393k.a(this.f12085a, adPreferences, t9.f12617d.f12620c, z10, bVar, false);
        return true;
    }
}
