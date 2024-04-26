package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import com.startapp.i4;
import com.startapp.j4;
import com.startapp.ob;
import com.startapp.sdk.adsbase.adrules.AdRules;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import com.startapp.wb;
import com.startapp.z2;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class AdsCommonMetaData implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static transient Object f12091a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Integer f12092b = 18;

    /* renamed from: c  reason: collision with root package name */
    public static final Integer f12093c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static final Set<String> f12094d = new HashSet(Arrays.asList(new String[]{"BOLD"}));

    /* renamed from: e  reason: collision with root package name */
    public static final Integer f12095e = -16777216;

    /* renamed from: f  reason: collision with root package name */
    public static final Integer f12096f = -14803426;

    /* renamed from: g  reason: collision with root package name */
    public static final Integer f12097g = -1;

    /* renamed from: h  reason: collision with root package name */
    public static AdsCommonMetaData f12098h = new AdsCommonMetaData();
    private static final long serialVersionUID = -4342481322424952690L;
    private String acMetadataUpdateVersion = "4.10.5";
    @ob(complex = true)
    private AdRules adRules = new AdRules();
    private boolean appPresence = true;
    private boolean autoInterstitialEnabled = true;
    private Integer backgroundGradientBottom = -14606047;
    private Integer backgroundGradientTop = -14606047;
    private int defaultActivitiesBetweenAds = 1;
    private int defaultSecondsBetweenAds = 0;
    private boolean disableInAppStore = false;
    private boolean disableReturnAd = false;
    private boolean disableSplashAd = false;
    private boolean disableTwoClicks = false;
    private boolean enableForceExternalBrowser = false;
    private boolean enableSmartRedirect = true;
    private boolean enforceForeground = false;
    private Long explicitLoadIntervalMillis;
    private int forceExternalBrowserDaysInterval = 7;
    private Integer fullpageOfferWallProbability = 100;
    private Integer fullpageOverlayProbability = 0;
    private Integer homeProbability3D = 80;
    private Integer itemDescriptionTextColor = MetaDataStyle.f12427e;
    @ob(type = HashSet.class)
    private Set<String> itemDescriptionTextDecoration = MetaDataStyle.f12428f;
    private Integer itemDescriptionTextSize = MetaDataStyle.f12426d;
    private Integer itemGradientBottom = -8750199;
    private Integer itemGradientTop = -14014151;
    private Integer itemTitleTextColor = MetaDataStyle.f12424b;
    @ob(type = HashSet.class)
    private Set<String> itemTitleTextDecoration = MetaDataStyle.f12425c;
    private Integer itemTitleTextSize = MetaDataStyle.f12423a;
    private Integer maxAds = 10;
    private Integer poweredByBackgroundColor = f12096f;
    private Integer poweredByTextColor = f12097g;
    private Integer probability3D = 0;
    private long returnAdMinBackgroundTime = 300;
    private long smartRedirectLoadedTimeout = 1000;
    private int smartRedirectTimeout = 5;
    @ob(type = HashMap.class, value = MetaDataStyle.class)
    private HashMap<String, MetaDataStyle> templates = new HashMap<>();
    private Integer titleBackgroundColor = -14803426;
    private String titleContent = "Recommended for you";
    private Integer titleLineColor = f12095e;
    private Integer titleTextColor = f12093c;
    @ob(type = HashSet.class)
    private Set<String> titleTextDecoration = f12094d;
    private Integer titleTextSize = f12092b;
    @ob(complex = true)
    private VideoConfig video = new VideoConfig();

    public static void a(Context context) {
        AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) z2.a(context, "StartappAdsMetadata", AdsCommonMetaData.class);
        AdsCommonMetaData adsCommonMetaData2 = new AdsCommonMetaData();
        if (adsCommonMetaData != null) {
            boolean b10 = wb.b(adsCommonMetaData, adsCommonMetaData2);
            if (!(!"4.10.5".equals(adsCommonMetaData.acMetadataUpdateVersion)) && b10) {
                i4 i4Var = new i4(j4.f10588e);
                i4Var.f10537d = "metadata_null";
                i4Var.a();
            }
            AdRules adRules2 = adsCommonMetaData.adRules;
            adRules2.getClass();
            adRules2.f12229a = new HashSet();
            f12098h = adsCommonMetaData;
            return;
        }
        f12098h = adsCommonMetaData2;
    }

    public static AdsCommonMetaData k() {
        return f12098h;
    }

    public Integer A() {
        return this.titleBackgroundColor;
    }

    public String B() {
        return this.titleContent;
    }

    public Integer C() {
        return this.titleLineColor;
    }

    public Integer D() {
        return this.titleTextColor;
    }

    public Set<String> E() {
        return this.titleTextDecoration;
    }

    public Integer F() {
        return this.titleTextSize;
    }

    public VideoConfig G() {
        return this.video;
    }

    public boolean H() {
        return this.appPresence;
    }

    public boolean I() {
        return this.autoInterstitialEnabled;
    }

    public boolean J() {
        return this.disableInAppStore;
    }

    public boolean K() {
        return this.disableReturnAd;
    }

    public boolean L() {
        return this.disableSplashAd;
    }

    public boolean M() {
        return this.disableTwoClicks;
    }

    public boolean N() {
        return this.enableSmartRedirect;
    }

    public boolean O() {
        return this.enforceForeground;
    }

    public AdRules b() {
        return this.adRules;
    }

    public int c() {
        return this.backgroundGradientBottom.intValue();
    }

    public int d() {
        return this.backgroundGradientTop.intValue();
    }

    public int e() {
        return this.forceExternalBrowserDaysInterval;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) obj;
        if (this.returnAdMinBackgroundTime != adsCommonMetaData.returnAdMinBackgroundTime || this.disableReturnAd != adsCommonMetaData.disableReturnAd || this.disableSplashAd != adsCommonMetaData.disableSplashAd || this.smartRedirectTimeout != adsCommonMetaData.smartRedirectTimeout || this.smartRedirectLoadedTimeout != adsCommonMetaData.smartRedirectLoadedTimeout || this.enableSmartRedirect != adsCommonMetaData.enableSmartRedirect || this.autoInterstitialEnabled != adsCommonMetaData.autoInterstitialEnabled || this.defaultActivitiesBetweenAds != adsCommonMetaData.defaultActivitiesBetweenAds || this.defaultSecondsBetweenAds != adsCommonMetaData.defaultSecondsBetweenAds || this.disableTwoClicks != adsCommonMetaData.disableTwoClicks || this.appPresence != adsCommonMetaData.appPresence || this.disableInAppStore != adsCommonMetaData.disableInAppStore || this.forceExternalBrowserDaysInterval != adsCommonMetaData.forceExternalBrowserDaysInterval || this.enableForceExternalBrowser != adsCommonMetaData.enableForceExternalBrowser || this.enforceForeground != adsCommonMetaData.enforceForeground || !wb.a(this.acMetadataUpdateVersion, adsCommonMetaData.acMetadataUpdateVersion) || !wb.a(this.probability3D, adsCommonMetaData.probability3D) || !wb.a(this.homeProbability3D, adsCommonMetaData.homeProbability3D) || !wb.a(this.fullpageOfferWallProbability, adsCommonMetaData.fullpageOfferWallProbability) || !wb.a(this.fullpageOverlayProbability, adsCommonMetaData.fullpageOverlayProbability) || !wb.a(this.backgroundGradientTop, adsCommonMetaData.backgroundGradientTop) || !wb.a(this.backgroundGradientBottom, adsCommonMetaData.backgroundGradientBottom) || !wb.a(this.maxAds, adsCommonMetaData.maxAds) || !wb.a(this.explicitLoadIntervalMillis, adsCommonMetaData.explicitLoadIntervalMillis) || !wb.a(this.titleBackgroundColor, adsCommonMetaData.titleBackgroundColor) || !wb.a(this.titleContent, adsCommonMetaData.titleContent) || !wb.a(this.titleTextSize, adsCommonMetaData.titleTextSize) || !wb.a(this.titleTextColor, adsCommonMetaData.titleTextColor) || !wb.a(this.titleTextDecoration, adsCommonMetaData.titleTextDecoration) || !wb.a(this.titleLineColor, adsCommonMetaData.titleLineColor) || !wb.a(this.itemGradientTop, adsCommonMetaData.itemGradientTop) || !wb.a(this.itemGradientBottom, adsCommonMetaData.itemGradientBottom) || !wb.a(this.itemTitleTextSize, adsCommonMetaData.itemTitleTextSize) || !wb.a(this.itemTitleTextColor, adsCommonMetaData.itemTitleTextColor) || !wb.a(this.itemTitleTextDecoration, adsCommonMetaData.itemTitleTextDecoration) || !wb.a(this.itemDescriptionTextSize, adsCommonMetaData.itemDescriptionTextSize) || !wb.a(this.itemDescriptionTextColor, adsCommonMetaData.itemDescriptionTextColor) || !wb.a(this.itemDescriptionTextDecoration, adsCommonMetaData.itemDescriptionTextDecoration) || !wb.a(this.templates, adsCommonMetaData.templates) || !wb.a(this.adRules, adsCommonMetaData.adRules) || !wb.a(this.poweredByBackgroundColor, adsCommonMetaData.poweredByBackgroundColor) || !wb.a(this.poweredByTextColor, adsCommonMetaData.poweredByTextColor) || !wb.a(this.video, adsCommonMetaData.video)) {
            return false;
        }
        return true;
    }

    public int f() {
        return this.defaultActivitiesBetweenAds;
    }

    public int g() {
        return this.defaultSecondsBetweenAds;
    }

    public Long h() {
        return this.explicitLoadIntervalMillis;
    }

    public int hashCode() {
        Object[] objArr = {this.acMetadataUpdateVersion, this.probability3D, this.homeProbability3D, this.fullpageOfferWallProbability, this.fullpageOverlayProbability, this.backgroundGradientTop, this.backgroundGradientBottom, this.maxAds, this.explicitLoadIntervalMillis, this.titleBackgroundColor, this.titleContent, this.titleTextSize, this.titleTextColor, this.titleTextDecoration, this.titleLineColor, this.itemGradientTop, this.itemGradientBottom, this.itemTitleTextSize, this.itemTitleTextColor, this.itemTitleTextDecoration, this.itemDescriptionTextSize, this.itemDescriptionTextColor, this.itemDescriptionTextDecoration, this.templates, this.adRules, this.poweredByBackgroundColor, this.poweredByTextColor, Long.valueOf(this.returnAdMinBackgroundTime), Boolean.valueOf(this.disableReturnAd), Boolean.valueOf(this.disableSplashAd), Integer.valueOf(this.smartRedirectTimeout), Long.valueOf(this.smartRedirectLoadedTimeout), Boolean.valueOf(this.enableSmartRedirect), Boolean.valueOf(this.autoInterstitialEnabled), Integer.valueOf(this.defaultActivitiesBetweenAds), Integer.valueOf(this.defaultSecondsBetweenAds), Boolean.valueOf(this.disableTwoClicks), Boolean.valueOf(this.appPresence), Boolean.valueOf(this.disableInAppStore), this.video, Integer.valueOf(this.forceExternalBrowserDaysInterval), Boolean.valueOf(this.enableForceExternalBrowser), Boolean.valueOf(this.enforceForeground)};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }

    public int i() {
        return this.fullpageOfferWallProbability.intValue();
    }

    public int j() {
        return this.fullpageOverlayProbability.intValue();
    }

    public Integer l() {
        return this.itemDescriptionTextColor;
    }

    public Set<String> m() {
        return this.itemDescriptionTextDecoration;
    }

    public Integer n() {
        return this.itemDescriptionTextSize;
    }

    public int o() {
        return this.itemGradientBottom.intValue();
    }

    public int p() {
        return this.itemGradientTop.intValue();
    }

    public Integer q() {
        return this.itemTitleTextColor;
    }

    public Set<String> r() {
        return this.itemTitleTextDecoration;
    }

    public Integer s() {
        return this.itemTitleTextSize;
    }

    public int t() {
        return this.maxAds.intValue();
    }

    public Integer u() {
        return this.poweredByBackgroundColor;
    }

    public Integer v() {
        return this.poweredByTextColor;
    }

    public int w() {
        return this.probability3D.intValue();
    }

    public long x() {
        return TimeUnit.SECONDS.toMillis(this.returnAdMinBackgroundTime);
    }

    public long y() {
        return this.smartRedirectLoadedTimeout;
    }

    public long z() {
        return TimeUnit.SECONDS.toMillis((long) this.smartRedirectTimeout);
    }

    public MetaDataStyle a(String str) {
        return this.templates.get(str);
    }

    public boolean a() {
        return this.enableForceExternalBrowser;
    }

    public static void a(Context context, AdsCommonMetaData adsCommonMetaData) {
        synchronized (f12091a) {
            adsCommonMetaData.acMetadataUpdateVersion = "4.10.5";
            f12098h = adsCommonMetaData;
            z2.a(context, "StartappAdsMetadata", (Serializable) adsCommonMetaData);
        }
    }
}
