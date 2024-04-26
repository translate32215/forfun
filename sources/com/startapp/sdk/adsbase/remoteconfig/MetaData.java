package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.startapp.a0;
import com.startapp.b1;
import com.startapp.d1;
import com.startapp.e1;
import com.startapp.f1;
import com.startapp.i4;
import com.startapp.j4;
import com.startapp.ob;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.consent.ConsentConfig;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.common.Constants;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.insight.NetworkTestsMetaData;
import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;
import com.startapp.wb;
import com.startapp.z2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import q.b;

/* compiled from: Sta */
public class MetaData implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f12386d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicBoolean f12387e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    public static final Set<String> f12388f = new HashSet(Arrays.asList(new String[]{Constants.f12448a}));

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f12389g = Arrays.asList(new String[]{"https://adsmetadata.startappservice.com/adsmetadata/api/v1.0/", "https://adsmetadata.mobileadexchange.net/adsmetadata/api/v1.0/", "https://d26xw8rp6mlgfg.cloudfront.net/adsmetadata/api/v1.0/"});

    /* renamed from: h  reason: collision with root package name */
    public static final String f12390h = "https://req.startappservice.com/1.5/";

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f12391i = {60, 60, 240};

    /* renamed from: j  reason: collision with root package name */
    public static final Set<String> f12392j = new HashSet(Arrays.asList(new String[]{"com.facebook.katana", "com.yandex.browser"}));

    /* renamed from: k  reason: collision with root package name */
    public static volatile MetaData f12393k = new MetaData();

    /* renamed from: l  reason: collision with root package name */
    public static a f12394l = null;
    private static final long serialVersionUID = 1334388150114613056L;
    private long IABDisplayImpressionDelayInSeconds;
    private long IABVideoImpressionDelayInSeconds;
    @ob(complex = true)
    private SimpleTokenConfig SimpleToken = new SimpleTokenConfig();
    private boolean SupportIABViewability;

    /* renamed from: a  reason: collision with root package name */
    public transient boolean f12395a;
    private String adPlatformBannerHostSecured;
    public String adPlatformHostSecured;
    private String adPlatformNativeHostSecured;
    private String adPlatformOverlayHostSecured;
    private String adPlatformReturnHostSecured;
    private String adPlatformSplashHostSecured;
    @ob(complex = true)
    private AdvertisingIdResolverMetadata air;
    private boolean alwaysSendToken;
    @ob(complex = true)
    public AnalyticsConfig analytics;
    @ob(complex = true)
    private ANRRemoteConfig anrConfig;
    private String assetsBaseUrlSecured;

    /* renamed from: b  reason: collision with root package name */
    public transient boolean f12396b;
    @ob(complex = true)
    private BluetoothConfig btConfig;

    /* renamed from: c  reason: collision with root package name */
    public transient List<c> f12397c;
    private String calcProd;
    private boolean chromeCustomeTabsExternal;
    private boolean chromeCustomeTabsInternal;
    private boolean closeAdAfterClick;
    private boolean compressionEnabled;
    @ob(complex = true)
    private ConnectivityHelperMetadata connectivity;
    @ob(complex = true)
    private ConsentConfig consentDetails;
    private boolean disableSendAdvertisingId;
    private boolean dns;
    private double flh;
    @ob(complex = true)
    private ImpressionsTrackingMetadata impressionsTracking;
    private boolean inAppBrowser;
    @ob(type = HashSet.class)
    private Set<String> installersList;
    @ob(type = HashSet.class)
    private Set<Integer> invalidForRetry;
    private boolean isToken1Mandatory;
    private String lastVersion;
    @ob(complex = true)
    private LocationMetadata location;
    @ob(type = ArrayList.class)
    public List<String> metaDataHosts = f12389g;
    private String metadataUpdateVersion;
    @ob(complex = true)
    private MotionMetadata motion;
    @ob(complex = true)
    private NetworkDiagnosticConfig netDiag;
    @ob(complex = true)
    private NetworkTestsMetaData networkTests;
    private int notVisibleBannerReloadInterval;
    private boolean omSdkEnabled;
    private int[] periodicEventIntMin;
    private int[] periodicForegroundEventSec;
    private boolean periodicInfoEventEnabled;
    private boolean periodicMetaDataEnabled;
    private int periodicMetaDataIntervalInMinutes;
    @ob(type = HashSet.class)
    private Set<String> preInstalledPackages;
    private String profileId;
    @ob(complex = true)
    private RcdMetadata rcd;
    @ob(complex = true)
    private RscMetadata rsc;
    @ob(complex = true)
    private SensorsConfig sensorsConfig;
    private int sessionMaxBackgroundTime;
    private boolean simpleToken2;
    @ob(complex = true)
    private StaleDcConfig staleDc;
    private int stopAutoLoadAmount;
    private int stopAutoLoadPreCacheAmount;
    @ob(complex = true)
    private TelephonyMetadata telephony;
    public String trackDownloadHost;
    @ob(complex = true)
    private TriggeredLinksMetadata triggeredLinks;
    private boolean trueNetEnabled;
    private String vastRecorderHost;
    private boolean webViewSecured;

    /* compiled from: Sta */
    public static class a implements f1.b {

        /* renamed from: a  reason: collision with root package name */
        public Context f12398a;

        /* renamed from: b  reason: collision with root package name */
        public String f12399b;

        public a(Context context, String str) {
            this.f12398a = context;
            this.f12399b = str;
        }

        public void a(Bitmap bitmap, int i10) {
            if (bitmap != null) {
                Context context = this.f12398a;
                String str = this.f12399b;
                Map<String, Bitmap> map = e1.f10316a;
                ComponentLocator.a(context).i().execute(new d1(str, ".png", bitmap, context));
            }
        }
    }

    public MetaData() {
        String str = f12390h;
        this.adPlatformHostSecured = str;
        this.trackDownloadHost = str;
        this.sessionMaxBackgroundTime = 1800;
        this.profileId = null;
        this.installersList = f12388f;
        this.preInstalledPackages = f12392j;
        this.simpleToken2 = true;
        this.alwaysSendToken = true;
        this.isToken1Mandatory = true;
        this.compressionEnabled = false;
        this.periodicMetaDataEnabled = false;
        this.periodicMetaDataIntervalInMinutes = 360;
        this.periodicInfoEventEnabled = false;
        this.periodicEventIntMin = f12391i;
        this.inAppBrowser = true;
        this.SupportIABViewability = true;
        this.IABDisplayImpressionDelayInSeconds = 1;
        this.IABVideoImpressionDelayInSeconds = 2;
        this.sensorsConfig = new SensorsConfig();
        this.btConfig = new BluetoothConfig();
        this.assetsBaseUrlSecured = "";
        this.invalidForRetry = null;
        this.notVisibleBannerReloadInterval = 3600;
        this.analytics = new AnalyticsConfig();
        this.f12395a = false;
        this.f12396b = false;
        this.f12397c = new ArrayList();
        this.metadataUpdateVersion = "4.10.5";
        this.dns = false;
        this.stopAutoLoadAmount = 3;
        this.stopAutoLoadPreCacheAmount = 3;
        this.trueNetEnabled = false;
        this.webViewSecured = true;
        this.omSdkEnabled = false;
        this.chromeCustomeTabsInternal = true;
        this.chromeCustomeTabsExternal = true;
        this.disableSendAdvertisingId = false;
        this.networkTests = new NetworkTestsMetaData();
        this.staleDc = new StaleDcConfig();
        this.telephony = new TelephonyMetadata();
        this.anrConfig = new ANRRemoteConfig();
        this.impressionsTracking = null;
        this.connectivity = new ConnectivityHelperMetadata();
    }

    public static void a(MetaData metaData) {
        synchronized (f12386d) {
            metaData.f12397c.addAll(f12393k.f12397c);
            f12393k = metaData;
        }
    }

    public static void c(Context context) {
        if (!f12387e.getAndSet(true)) {
            MetaData metaData = (MetaData) z2.a(context, "StartappMetadata", MetaData.class);
            MetaData metaData2 = new MetaData();
            if (metaData != null) {
                boolean b10 = wb.b(metaData, metaData2);
                if (!(true ^ "4.10.5".equals(metaData.metadataUpdateVersion)) && b10) {
                    i4 i4Var = new i4(j4.f10588e);
                    i4Var.f10537d = "metadata_null";
                    i4Var.a();
                }
                metaData.f12395a = false;
                metaData.f12396b = false;
                metaData.f12397c = new ArrayList();
                a(metaData);
            } else {
                a(metaData2);
            }
            f12393k.a();
        }
    }

    public static MetaData t() {
        return f12393k;
    }

    public int A() {
        return this.notVisibleBannerReloadInterval;
    }

    public int B() {
        return this.periodicMetaDataIntervalInMinutes;
    }

    public Set<String> C() {
        Set<String> set = this.preInstalledPackages;
        if (set == null) {
            set = f12392j;
        }
        return Collections.unmodifiableSet(set);
    }

    public String D() {
        return this.profileId;
    }

    public RcdMetadata E() {
        return this.rcd;
    }

    public RscMetadata F() {
        return this.rsc;
    }

    public SensorsConfig G() {
        return this.sensorsConfig;
    }

    public long H() {
        return TimeUnit.SECONDS.toMillis((long) this.sessionMaxBackgroundTime);
    }

    public SimpleTokenConfig I() {
        return this.SimpleToken;
    }

    public StaleDcConfig J() {
        return this.staleDc;
    }

    public int K() {
        return this.stopAutoLoadAmount;
    }

    public int L() {
        return this.stopAutoLoadPreCacheAmount;
    }

    public TelephonyMetadata M() {
        return this.telephony;
    }

    public TriggeredLinksMetadata N() {
        return this.triggeredLinks;
    }

    public String O() {
        return this.vastRecorderHost;
    }

    public boolean P() {
        return this.alwaysSendToken;
    }

    public boolean Q() {
        return this.compressionEnabled;
    }

    public boolean R() {
        Map<Activity, Integer> map = wb.f12765a;
        return this.inAppBrowser;
    }

    public boolean S() {
        return this.omSdkEnabled;
    }

    public boolean T() {
        return this.periodicForegroundEventSec != null;
    }

    public boolean U() {
        return this.periodicInfoEventEnabled;
    }

    public boolean V() {
        return this.periodicMetaDataEnabled;
    }

    public boolean W() {
        return this.SupportIABViewability;
    }

    public boolean X() {
        return this.isToken1Mandatory;
    }

    public int b(Context context) {
        return a(context, this.periodicEventIntMin);
    }

    public AdvertisingIdResolverMetadata d() {
        return this.air;
    }

    public ANRRemoteConfig e() {
        return this.anrConfig;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaData metaData = (MetaData) obj;
        if (this.sessionMaxBackgroundTime != metaData.sessionMaxBackgroundTime || this.simpleToken2 != metaData.simpleToken2 || this.alwaysSendToken != metaData.alwaysSendToken || this.isToken1Mandatory != metaData.isToken1Mandatory || this.compressionEnabled != metaData.compressionEnabled || this.periodicMetaDataEnabled != metaData.periodicMetaDataEnabled || this.periodicMetaDataIntervalInMinutes != metaData.periodicMetaDataIntervalInMinutes || this.periodicInfoEventEnabled != metaData.periodicInfoEventEnabled || this.inAppBrowser != metaData.inAppBrowser || this.SupportIABViewability != metaData.SupportIABViewability || this.IABDisplayImpressionDelayInSeconds != metaData.IABDisplayImpressionDelayInSeconds || this.IABVideoImpressionDelayInSeconds != metaData.IABVideoImpressionDelayInSeconds || this.notVisibleBannerReloadInterval != metaData.notVisibleBannerReloadInterval || this.dns != metaData.dns || this.stopAutoLoadAmount != metaData.stopAutoLoadAmount || this.stopAutoLoadPreCacheAmount != metaData.stopAutoLoadPreCacheAmount || this.trueNetEnabled != metaData.trueNetEnabled || this.webViewSecured != metaData.webViewSecured || this.omSdkEnabled != metaData.omSdkEnabled || this.chromeCustomeTabsInternal != metaData.chromeCustomeTabsInternal || this.chromeCustomeTabsExternal != metaData.chromeCustomeTabsExternal || this.closeAdAfterClick != metaData.closeAdAfterClick || this.disableSendAdvertisingId != metaData.disableSendAdvertisingId || Double.compare(this.flh, metaData.flh) != 0 || !wb.a(this.SimpleToken, metaData.SimpleToken) || !wb.a(this.consentDetails, metaData.consentDetails) || !wb.a(this.calcProd, metaData.calcProd) || !wb.a(this.metaDataHosts, metaData.metaDataHosts) || !wb.a(this.adPlatformHostSecured, metaData.adPlatformHostSecured) || !wb.a(this.trackDownloadHost, metaData.trackDownloadHost) || !wb.a(this.vastRecorderHost, metaData.vastRecorderHost) || !wb.a(this.adPlatformBannerHostSecured, metaData.adPlatformBannerHostSecured) || !wb.a(this.adPlatformSplashHostSecured, metaData.adPlatformSplashHostSecured) || !wb.a(this.adPlatformReturnHostSecured, metaData.adPlatformReturnHostSecured) || !wb.a(this.adPlatformOverlayHostSecured, metaData.adPlatformOverlayHostSecured) || !wb.a(this.adPlatformNativeHostSecured, metaData.adPlatformNativeHostSecured) || !wb.a(this.profileId, metaData.profileId) || !wb.a(this.installersList, metaData.installersList) || !wb.a(this.preInstalledPackages, metaData.preInstalledPackages) || !Arrays.equals(this.periodicEventIntMin, metaData.periodicEventIntMin) || !Arrays.equals(this.periodicForegroundEventSec, metaData.periodicForegroundEventSec) || !wb.a(this.sensorsConfig, metaData.sensorsConfig) || !wb.a(this.btConfig, metaData.btConfig) || !wb.a(this.assetsBaseUrlSecured, metaData.assetsBaseUrlSecured) || !wb.a(this.invalidForRetry, metaData.invalidForRetry) || !wb.a(this.analytics, metaData.analytics) || !wb.a(this.metadataUpdateVersion, metaData.metadataUpdateVersion) || !wb.a(this.networkTests, metaData.networkTests) || !wb.a(this.triggeredLinks, metaData.triggeredLinks) || !wb.a(this.rsc, metaData.rsc) || !wb.a(this.rcd, metaData.rcd) || !wb.a(this.netDiag, metaData.netDiag) || !wb.a(this.staleDc, metaData.staleDc) || !wb.a(this.motion, metaData.motion) || !wb.a(this.air, metaData.air) || !wb.a(this.telephony, metaData.telephony) || !wb.a(this.anrConfig, metaData.anrConfig) || !wb.a(this.location, metaData.location) || !wb.a(this.impressionsTracking, metaData.impressionsTracking) || !wb.a(this.connectivity, metaData.connectivity) || !wb.a(this.lastVersion, metaData.lastVersion)) {
            return false;
        }
        return true;
    }

    public String f() {
        String str = this.assetsBaseUrlSecured;
        return str != null ? str : "";
    }

    public BluetoothConfig g() {
        return this.btConfig;
    }

    public String h() {
        return this.calcProd;
    }

    public int hashCode() {
        Object[] objArr = {this.SimpleToken, this.consentDetails, this.calcProd, this.metaDataHosts, this.adPlatformHostSecured, this.trackDownloadHost, this.vastRecorderHost, this.adPlatformBannerHostSecured, this.adPlatformSplashHostSecured, this.adPlatformReturnHostSecured, this.adPlatformOverlayHostSecured, this.adPlatformNativeHostSecured, Integer.valueOf(this.sessionMaxBackgroundTime), this.profileId, this.installersList, this.preInstalledPackages, Boolean.valueOf(this.simpleToken2), Boolean.valueOf(this.alwaysSendToken), Boolean.valueOf(this.isToken1Mandatory), Boolean.valueOf(this.compressionEnabled), Boolean.valueOf(this.periodicMetaDataEnabled), Integer.valueOf(this.periodicMetaDataIntervalInMinutes), Boolean.valueOf(this.periodicInfoEventEnabled), this.periodicEventIntMin, this.periodicForegroundEventSec, Boolean.valueOf(this.inAppBrowser), Boolean.valueOf(this.SupportIABViewability), Long.valueOf(this.IABDisplayImpressionDelayInSeconds), Long.valueOf(this.IABVideoImpressionDelayInSeconds), this.sensorsConfig, this.btConfig, this.assetsBaseUrlSecured, this.invalidForRetry, Integer.valueOf(this.notVisibleBannerReloadInterval), this.analytics, this.metadataUpdateVersion, Boolean.valueOf(this.dns), Integer.valueOf(this.stopAutoLoadAmount), Integer.valueOf(this.stopAutoLoadPreCacheAmount), Boolean.valueOf(this.trueNetEnabled), Boolean.valueOf(this.webViewSecured), Boolean.valueOf(this.omSdkEnabled), Boolean.valueOf(this.chromeCustomeTabsInternal), Boolean.valueOf(this.chromeCustomeTabsExternal), Boolean.valueOf(this.closeAdAfterClick), Boolean.valueOf(this.disableSendAdvertisingId), Double.valueOf(this.flh), this.networkTests, this.triggeredLinks, this.rsc, this.rcd, this.netDiag, this.staleDc, this.motion, this.air, this.telephony, this.anrConfig, this.location, this.impressionsTracking, this.connectivity, this.lastVersion};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }

    public boolean i() {
        return this.chromeCustomeTabsExternal;
    }

    public boolean j() {
        return this.chromeCustomeTabsInternal;
    }

    public boolean k() {
        return this.closeAdAfterClick;
    }

    public ConnectivityHelperMetadata l() {
        return this.connectivity;
    }

    public ConsentConfig m() {
        return this.consentDetails;
    }

    public boolean n() {
        return this.disableSendAdvertisingId;
    }

    public String o() {
        int indexOf;
        String c10 = f12393k.c();
        String str = (Build.VERSION.SDK_INT > 26 || this.webViewSecured) ? "https" : "http";
        if (c10.startsWith(str + "://") || (indexOf = c10.indexOf(58)) == -1) {
            return c10;
        }
        StringBuilder a10 = b1.a(str);
        a10.append(c10.substring(indexOf));
        return a10.toString();
    }

    public long p() {
        return this.IABDisplayImpressionDelayInSeconds;
    }

    public long q() {
        return this.IABVideoImpressionDelayInSeconds;
    }

    public ImpressionsTrackingMetadata r() {
        return this.impressionsTracking;
    }

    public Set<String> s() {
        return this.installersList;
    }

    public Set<Integer> u() {
        return this.invalidForRetry;
    }

    public String v() {
        return this.lastVersion;
    }

    public LocationMetadata w() {
        return this.location;
    }

    public MotionMetadata x() {
        return this.motion;
    }

    public NetworkDiagnosticConfig y() {
        return this.netDiag;
    }

    public NetworkTestsMetaData z() {
        return this.networkTests;
    }

    public boolean b() {
        return !this.dns;
    }

    public static void a(Context context, MetaData metaData, MetaDataRequest.RequestReason requestReason, boolean z10) {
        ArrayList arrayList;
        boolean z11;
        Handler handler;
        synchronized (f12386d) {
            arrayList = new ArrayList(f12393k.f12397c);
            f12393k.f12397c.clear();
            metaData.f12397c = f12393k.f12397c;
            metaData.a();
            metaData.metadataUpdateVersion = "4.10.5";
            z2.b(context, "StartappMetadata", metaData);
            z11 = false;
            metaData.f12395a = false;
            metaData.f12396b = true;
            if (!wb.a(f12393k, metaData)) {
                z10 = true;
            }
            f12393k = metaData;
            if (wb.e(context)) {
                try {
                    e d10 = ComponentLocator.a(context).d();
                    int i10 = d10.getInt("totalSessions", 0);
                    e.a a10 = d10.edit();
                    int i11 = i10 + 1;
                    a10.a("totalSessions", Integer.valueOf(i11));
                    a10.f12335a.putInt("totalSessions", i11);
                    a10.apply();
                } catch (Throwable th) {
                    i4.a(th);
                }
            }
            handler = null;
            f12394l = null;
        }
        if (Math.random() < f12393k.flh) {
            z11 = true;
        }
        if (z11) {
            handler = new Handler(Looper.getMainLooper());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (z11) {
                handler.post(new b(cVar, requestReason, z10));
            } else {
                cVar.a(requestReason, z10);
            }
        }
    }

    public String c() {
        String str = this.adPlatformHostSecured;
        return str != null ? str : f12390h;
    }

    public static void a(MetaDataRequest.RequestReason requestReason) {
        ArrayList arrayList;
        synchronized (f12386d) {
            arrayList = new ArrayList(f12393k.f12397c);
            f12393k.f12397c.clear();
            f12393k.f12395a = false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(requestReason);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        if (r7 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        r8.a(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r4, com.startapp.sdk.adsbase.model.AdPreferences r5, com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest.RequestReason r6, boolean r7, com.startapp.sdk.adsbase.remoteconfig.c r8, boolean r9) {
        /*
            r3 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0008
            if (r8 == 0) goto L_0x0008
            r8.a(r6, r0)
        L_0x0008:
            java.lang.Object r1 = f12386d
            monitor-enter(r1)
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = f12393k     // Catch:{ all -> 0x0052 }
            boolean r2 = r2.f12396b     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x001d
            if (r9 == 0) goto L_0x0014
            goto L_0x001d
        L_0x0014:
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            if (r7 == 0) goto L_0x001c
            if (r8 == 0) goto L_0x001c
            r8.a(r6, r0)
        L_0x001c:
            return
        L_0x001d:
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = f12393k     // Catch:{ all -> 0x0052 }
            boolean r2 = r2.f12395a     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0025
            if (r9 == 0) goto L_0x0047
        L_0x0025:
            r9 = 1
            r3.f12395a = r9     // Catch:{ all -> 0x0052 }
            r3.f12396b = r0     // Catch:{ all -> 0x0052 }
            com.startapp.sdk.adsbase.remoteconfig.a r0 = f12394l     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0030
            r0.f12439j = r9     // Catch:{ all -> 0x0052 }
        L_0x0030:
            com.startapp.sdk.adsbase.remoteconfig.a r9 = new com.startapp.sdk.adsbase.remoteconfig.a     // Catch:{ all -> 0x0052 }
            r9.<init>(r4, r5, r6)     // Catch:{ all -> 0x0052 }
            f12394l = r9     // Catch:{ all -> 0x0052 }
            com.startapp.sdk.components.ComponentLocator r4 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r4)     // Catch:{ all -> 0x0052 }
            java.util.concurrent.Executor r5 = r4.p()     // Catch:{ all -> 0x0052 }
            com.startapp.k3 r6 = new com.startapp.k3     // Catch:{ all -> 0x0052 }
            r6.<init>(r9, r4)     // Catch:{ all -> 0x0052 }
            r5.execute(r6)     // Catch:{ all -> 0x0052 }
        L_0x0047:
            if (r7 == 0) goto L_0x0050
            if (r8 == 0) goto L_0x0050
            com.startapp.sdk.adsbase.remoteconfig.MetaData r4 = f12393k     // Catch:{ all -> 0x0052 }
            r4.a((com.startapp.sdk.adsbase.remoteconfig.c) r8)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            return
        L_0x0052:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.remoteconfig.MetaData.a(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences, com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason, boolean, com.startapp.sdk.adsbase.remoteconfig.c, boolean):void");
    }

    public void a(c cVar) {
        synchronized (f12386d) {
            this.f12397c.add(cVar);
        }
    }

    public int a(Context context) {
        return a(context, this.periodicForegroundEventSec);
    }

    public static int a(Context context, int[] iArr) {
        if (iArr == null || iArr.length < 3) {
            iArr = f12391i;
        }
        if (a0.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            int i10 = iArr[0];
            if (i10 <= 0) {
                return f12391i[0];
            }
            return i10;
        } else if (!a0.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            return iArr[2];
        } else {
            int i11 = iArr[1];
            if (i11 <= 0) {
                return f12391i[1];
            }
            return i11;
        }
    }

    public String a(AdPreferences.Placement placement) {
        int ordinal = placement.ordinal();
        if (ordinal == 1) {
            String str = this.adPlatformBannerHostSecured;
            return str != null ? str : c();
        } else if (ordinal == 7) {
            String str2 = this.adPlatformReturnHostSecured;
            return str2 != null ? str2 : c();
        } else if (ordinal == 3) {
            String str3 = this.adPlatformSplashHostSecured;
            return str3 != null ? str3 : c();
        } else if (ordinal == 4) {
            String str4 = this.adPlatformOverlayHostSecured;
            return str4 != null ? str4 : c();
        } else if (ordinal != 5) {
            return c();
        } else {
            String str5 = this.adPlatformNativeHostSecured;
            return str5 != null ? str5 : c();
        }
    }

    public void a() {
        ArrayList arrayList;
        this.adPlatformHostSecured = a(this.adPlatformHostSecured, f12390h);
        List<String> list = this.metaDataHosts;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (String a10 : list) {
                String a11 = a(a10, (String) null);
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
        } else {
            arrayList = null;
        }
        this.metaDataHosts = arrayList;
        this.adPlatformBannerHostSecured = a(this.adPlatformBannerHostSecured, (String) null);
        this.adPlatformSplashHostSecured = a(this.adPlatformSplashHostSecured, (String) null);
        this.adPlatformReturnHostSecured = a(this.adPlatformReturnHostSecured, (String) null);
        this.adPlatformOverlayHostSecured = a(this.adPlatformOverlayHostSecured, (String) null);
        this.adPlatformNativeHostSecured = a(this.adPlatformNativeHostSecured, (String) null);
    }

    public final String a(String str, String str2) {
        return str != null ? str.replace("%AdPlatformProtocol%", "1.5") : str2;
    }

    public static void a(Context context, String str) {
        if (str != null && !str.equals("")) {
            if (!e1.a(context, "close_button", ".png")) {
                Map<Activity, Integer> map = wb.f12765a;
                new f1(context, b.a(str, "close_button", ".png"), new a(context, "close_button"), 0).a();
            }
            Map<Activity, Integer> map2 = wb.f12765a;
            for (String str2 : AdsConstants.f12106h) {
                if (!e1.a(context, str2, ".png")) {
                    new f1(context, b.a(str, str2, ".png"), new a(context, str2), 0).a();
                }
            }
            Map<Activity, Integer> map3 = wb.f12765a;
            for (String str3 : AdsConstants.f12107i) {
                if (!e1.a(context, str3, ".png")) {
                    new f1(context, b.a(str, str3, ".png"), new a(context, str3), 0).a();
                }
            }
            if (!e1.a(context, "logo", ".png")) {
                new f1(context, b.a(str, "logo", ".png"), new a(context, "logo"), 0).a();
            }
        }
    }
}
