package com.startapp.sdk.adsbase;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.startapp.a0;
import com.startapp.c0;
import com.startapp.d8;
import com.startapp.f6;
import com.startapp.g0;
import com.startapp.g2;
import com.startapp.h0;
import com.startapp.i4;
import com.startapp.j0;
import com.startapp.j4;
import com.startapp.jb;
import com.startapp.n4;
import com.startapp.s;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.splash.SplashMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.cache.d;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.t9;
import com.startapp.tb;
import com.startapp.ub;
import com.startapp.v7;
import com.startapp.wb;
import com.startapp.z2;
import java.lang.Thread;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
public class StartAppSDKInternal implements h0 {
    public static final Object D = new Object();
    public static volatile InitState E = InitState.UNSET;
    public g0 A;
    public jb B;
    public boolean C;

    /* renamed from: a  reason: collision with root package name */
    public SDKAdPreferences f12133a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12134b = true;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12135c = a0.a();

    /* renamed from: d  reason: collision with root package name */
    public boolean f12136d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12137e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12138f = false;

    /* renamed from: g  reason: collision with root package name */
    public long f12139g;

    /* renamed from: h  reason: collision with root package name */
    public Application f12140h;

    /* renamed from: i  reason: collision with root package name */
    public HashMap<Integer, Integer> f12141i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    public Object f12142j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicBoolean f12143k = new AtomicBoolean();

    /* renamed from: l  reason: collision with root package name */
    public Activity f12144l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12145m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12146n = true;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12147o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12148p = false;

    /* renamed from: q  reason: collision with root package name */
    public Map<String, String> f12149q;

    /* renamed from: r  reason: collision with root package name */
    public Bundle f12150r = null;

    /* renamed from: s  reason: collision with root package name */
    public AdPreferences f12151s;

    /* renamed from: t  reason: collision with root package name */
    public CacheKey f12152t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f12153u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f12154v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f12155w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f12156x = false;

    /* renamed from: y  reason: collision with root package name */
    public boolean f12157y = false;

    /* renamed from: z  reason: collision with root package name */
    public d f12158z = null;

    /* compiled from: Sta */
    public enum InitState {
        UNSET,
        IMPLICIT,
        EXPLICIT
    }

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f12163a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f12164b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f12165c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ SDKAdPreferences f12166d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f12167e;

        public a(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z10) {
            this.f12163a = context;
            this.f12164b = str;
            this.f12165c = str2;
            this.f12166d = sDKAdPreferences;
            this.f12167e = z10;
        }

        public void run() {
            synchronized (StartAppSDKInternal.D) {
                StartAppSDKInternal.a(StartAppSDKInternal.this, this.f12163a, this.f12164b, this.f12165c, this.f12166d, this.f12167e);
            }
        }
    }

    /* compiled from: Sta */
    public class c implements d.C0123d {
        public c() {
        }

        public void a(Ad ad2, CacheKey cacheKey, boolean z10) {
            StartAppSDKInternal.this.f12152t = cacheKey;
        }
    }

    /* compiled from: Sta */
    public static class d {
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: a  reason: collision with root package name */
        public static final StartAppSDKInternal f12173a = new StartAppSDKInternal();
    }

    public StartAppSDKInternal() {
        Map<Activity, Integer> map = wb.f12765a;
    }

    public static void a(StartAppSDKInternal startAppSDKInternal, Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z10) {
        startAppSDKInternal.getClass();
        com.startapp.sdk.adsbase.crashreport.b b10 = ComponentLocator.a(context).H.b();
        InitState initState = E;
        InitState initState2 = InitState.EXPLICIT;
        if (initState != initState2) {
            boolean a10 = ComponentLocator.a(context).c().a();
            if (TextUtils.isEmpty(str2)) {
                if (wb.f(context) || a0.c(context)) {
                    throw new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n");
                }
                Log.w("StartAppSDK", new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n"));
            }
            c0 c10 = ComponentLocator.a(context).c();
            if (str != null) {
                str = str.trim();
            }
            if (str2 != null) {
                str2 = str2.trim();
            }
            synchronized (c10.f10221a) {
                c10.f10223c = str;
                c10.f10224d = str2;
                c10.f10222b.edit().putString("c88d4eab540fab77", str).putString("2696a7f502faed4b", str2).commit();
            }
            startAppSDKInternal.f12133a = sDKAdPreferences;
            z2.b(context, "shared_prefs_sdk_ad_prefs", sDKAdPreferences);
            startAppSDKInternal.a(z10);
            if (E == InitState.IMPLICIT && !a10) {
                startAppSDKInternal.b(context, MetaDataRequest.RequestReason.LAUNCH);
            } else if (E == InitState.UNSET) {
                startAppSDKInternal.a(context, MetaDataRequest.RequestReason.LAUNCH);
            }
            E = initState2;
        }
    }

    public static boolean c() {
        boolean z10;
        synchronized (D) {
            z10 = E == InitState.EXPLICIT;
        }
        return z10;
    }

    public static void g(Context context) {
        if (context != null) {
            a(false, (v7) null);
        }
    }

    public boolean b() {
        return this.f12148p;
    }

    public final void d(Context context) {
        Application application;
        Context a10 = j0.a(context);
        if (a10 instanceof Application) {
            application = (Application) a10;
        } else if (context instanceof Application) {
            application = (Application) context;
        } else if (context instanceof Activity) {
            application = ((Activity) context).getApplication();
        } else {
            application = context instanceof Service ? ((Service) context).getApplication() : null;
        }
        if (application != null && this.A == null) {
            g0 g0Var = new g0(this);
            this.A = g0Var;
            application.registerActivityLifecycleCallbacks(g0Var);
            try {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = ComponentLocator.a(context).r().f10178e;
                if (activityLifecycleCallbacks != null) {
                    application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                    return;
                }
                throw new RuntimeException();
            } catch (Throwable unused) {
            }
        }
    }

    public final void e(Context context) {
        if (this.f12153u && !AdsCommonMetaData.f12098h.K()) {
            com.startapp.sdk.adsbase.cache.d dVar = com.startapp.sdk.adsbase.cache.d.f12250h;
            AdPreferences adPreferences = this.f12151s;
            AdPreferences adPreferences2 = adPreferences != null ? new AdPreferences(adPreferences) : new AdPreferences();
            c cVar = new c();
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_RETURN;
            if (dVar.a(placement)) {
                dVar.a(context, (StartAppAd) null, placement, adPreferences2, cVar, false, 0);
            } else {
                cVar.a((Ad) null, (CacheKey) null, false);
            }
        }
    }

    public final void f(Context context) {
        if (a0.a() && (context instanceof Application)) {
            Application application = (Application) context;
            this.f12140h = application;
            if (this.f12143k.compareAndSet(false, true) && this.f12142j == null) {
                g gVar = new g();
                application.registerActivityLifecycleCallbacks(gVar);
                this.f12142j = gVar;
            }
        }
    }

    public final void h(Context context) {
        e d10 = ComponentLocator.a(context).d();
        int i10 = d10.getInt("shared_prefs_app_version_id", -1);
        int i11 = a0.f10005a;
        int i12 = 0;
        try {
            i12 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
        }
        if (i10 > 0 && i12 > i10) {
            this.f12148p = true;
        }
        e.a a10 = d10.edit();
        a10.a("shared_prefs_app_version_id", Integer.valueOf(i12));
        a10.f12335a.putInt("shared_prefs_app_version_id", i12);
        a10.apply();
    }

    public final void i(Context context) {
        ComponentLocator a10 = ComponentLocator.a(context);
        e.a a11 = a10.d().edit();
        Boolean bool = Boolean.FALSE;
        a11.a("periodicInfoEventPaused", bool);
        a11.f12335a.putBoolean("periodicInfoEventPaused", false);
        a11.a("periodicMetadataPaused", bool);
        a11.f12335a.putBoolean("periodicMetadataPaused", false);
        a11.apply();
        b bVar = new b(context, a10);
        if (MetaData.f12393k.f12396b) {
            bVar.a((MetaDataRequest.RequestReason) null, false);
        } else {
            MetaData.f12393k.a((com.startapp.sdk.adsbase.remoteconfig.c) bVar);
        }
    }

    public void b(Context context, MetaDataRequest.RequestReason requestReason) {
        t9.f12617d.a(context, requestReason);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ec, code lost:
        if (r0.isEmpty() == false) goto L_0x00f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Context r13) {
        /*
            r12 = this;
            java.lang.String r0 = "android.support.customtabs.action.CustomTabsService"
            r1 = 1
            r2 = 0
            r3 = 0
            android.content.pm.PackageManager r4 = r13.getPackageManager()     // Catch:{ all -> 0x00c9 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x00c9 }
            java.lang.String r6 = "android.intent.action.VIEW"
            java.lang.String r7 = "http://www.example.com"
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x00c9 }
            r5.<init>(r6, r7)     // Catch:{ all -> 0x00c9 }
            android.content.pm.ResolveInfo r6 = r4.resolveActivity(r5, r3)     // Catch:{ all -> 0x00c9 }
            if (r6 == 0) goto L_0x0021
            android.content.pm.ActivityInfo r6 = r6.activityInfo     // Catch:{ all -> 0x00c9 }
            java.lang.String r6 = r6.packageName     // Catch:{ all -> 0x00c9 }
            goto L_0x0022
        L_0x0021:
            r6 = r2
        L_0x0022:
            java.util.List r7 = r4.queryIntentActivities(r5, r3)     // Catch:{ all -> 0x00c9 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00c9 }
            r8.<init>()     // Catch:{ all -> 0x00c9 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00c9 }
        L_0x002f:
            boolean r9 = r7.hasNext()     // Catch:{ all -> 0x00c9 }
            if (r9 == 0) goto L_0x0058
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x00c9 }
            android.content.pm.ResolveInfo r9 = (android.content.pm.ResolveInfo) r9     // Catch:{ all -> 0x00c9 }
            android.content.Intent r10 = new android.content.Intent     // Catch:{ all -> 0x00c9 }
            r10.<init>()     // Catch:{ all -> 0x00c9 }
            r10.setAction(r0)     // Catch:{ all -> 0x00c9 }
            android.content.pm.ActivityInfo r11 = r9.activityInfo     // Catch:{ all -> 0x00c9 }
            java.lang.String r11 = r11.packageName     // Catch:{ all -> 0x00c9 }
            r10.setPackage(r11)     // Catch:{ all -> 0x00c9 }
            android.content.pm.ResolveInfo r10 = r4.resolveService(r10, r3)     // Catch:{ all -> 0x00c9 }
            if (r10 == 0) goto L_0x002f
            android.content.pm.ActivityInfo r9 = r9.activityInfo     // Catch:{ all -> 0x00c9 }
            java.lang.String r9 = r9.packageName     // Catch:{ all -> 0x00c9 }
            r8.add(r9)     // Catch:{ all -> 0x00c9 }
            goto L_0x002f
        L_0x0058:
            boolean r4 = r8.isEmpty()     // Catch:{ all -> 0x00c9 }
            if (r4 == 0) goto L_0x0060
            goto L_0x00cd
        L_0x0060:
            int r4 = r8.size()     // Catch:{ all -> 0x00c9 }
            java.lang.String r7 = "com.android.chrome"
            if (r4 != r1) goto L_0x0070
            java.lang.Object r4 = r8.get(r3)     // Catch:{ all -> 0x00c9 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00c9 }
            r2 = r4
            goto L_0x00cd
        L_0x0070:
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00c9 }
            if (r4 != 0) goto L_0x00c1
            android.content.pm.PackageManager r4 = r13.getPackageManager()     // Catch:{ all -> 0x00b2 }
            r9 = 64
            java.util.List r4 = r4.queryIntentActivities(r5, r9)     // Catch:{ all -> 0x00b2 }
            if (r4 == 0) goto L_0x00b6
            int r5 = r4.size()     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x0089
            goto L_0x00b6
        L_0x0089:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00b2 }
        L_0x008d:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00b2 }
            if (r5 == 0) goto L_0x00b6
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00b2 }
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5     // Catch:{ all -> 0x00b2 }
            android.content.IntentFilter r9 = r5.filter     // Catch:{ all -> 0x00b2 }
            if (r9 != 0) goto L_0x009e
            goto L_0x008d
        L_0x009e:
            int r10 = r9.countDataAuthorities()     // Catch:{ all -> 0x00b2 }
            if (r10 == 0) goto L_0x008d
            int r9 = r9.countDataPaths()     // Catch:{ all -> 0x00b2 }
            if (r9 != 0) goto L_0x00ab
            goto L_0x008d
        L_0x00ab:
            android.content.pm.ActivityInfo r5 = r5.activityInfo     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x00b0
            goto L_0x008d
        L_0x00b0:
            r4 = 1
            goto L_0x00b7
        L_0x00b2:
            r4 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r4)     // Catch:{ all -> 0x00c9 }
        L_0x00b6:
            r4 = 0
        L_0x00b7:
            if (r4 != 0) goto L_0x00c1
            boolean r4 = r8.contains(r6)     // Catch:{ all -> 0x00c9 }
            if (r4 == 0) goto L_0x00c1
            r2 = r6
            goto L_0x00cd
        L_0x00c1:
            boolean r4 = r8.contains(r7)     // Catch:{ all -> 0x00c9 }
            if (r4 == 0) goto L_0x00cd
            r2 = r7
            goto L_0x00cd
        L_0x00c9:
            r4 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r4)
        L_0x00cd:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 18
            if (r4 < r5) goto L_0x00ef
            if (r2 != 0) goto L_0x00d6
            goto L_0x00ef
        L_0x00d6:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0)
            r4.setPackage(r2)
            android.content.pm.PackageManager r0 = r13.getPackageManager()
            java.util.List r0 = r0.queryIntentServices(r4, r3)
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r1 = 0
        L_0x00f0:
            com.startapp.sdk.components.ComponentLocator r13 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r13)
            com.startapp.sdk.adsbase.e r13 = r13.d()
            com.startapp.sdk.adsbase.e$a r13 = r13.edit()
            java.lang.String r0 = "chromeTabs"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r13.a((java.lang.String) r0, r2)
            android.content.SharedPreferences$Editor r2 = r13.f12335a
            r2.putBoolean(r0, r1)
            r13.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppSDKInternal.b(android.content.Context):void");
    }

    public SDKAdPreferences c(Context context) {
        if (this.f12133a == null) {
            SDKAdPreferences sDKAdPreferences = (SDKAdPreferences) z2.a(context, "shared_prefs_sdk_ad_prefs", SDKAdPreferences.class);
            if (sDKAdPreferences == null) {
                this.f12133a = new SDKAdPreferences();
            } else {
                this.f12133a = sDKAdPreferences;
            }
        }
        return this.f12133a;
    }

    public boolean d() {
        return this.f12146n;
    }

    public void a(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z10) {
        Context a10 = j0.a(context);
        Context context2 = a10 != null ? a10 : context;
        f(context2);
        try {
            ComponentLocator.a(context2).r().a(256);
        } catch (Throwable unused) {
        }
        ComponentLocator.a(context2).g().execute(new a(context2, str, str2, sDKAdPreferences, z10));
    }

    public static StartAppSDKInternal a() {
        return d.f12173a;
    }

    public static void a(Context context) {
        MetaDataRequest.RequestReason requestReason;
        ComponentLocator a10 = ComponentLocator.a(context);
        com.startapp.sdk.adsbase.crashreport.b b10 = a10.H.b();
        f6 f6Var = new f6(context);
        String str = f6Var.f10375a;
        if (!TextUtils.isEmpty(str)) {
            d.f12173a.a(context, (String) null, str, (SDKAdPreferences) null, f6Var.f10376b);
            if (!f6Var.f10377c) {
                StartAppAd.disableSplash();
            }
            if (a10.d().getBoolean("shared_prefs_first_init", true)) {
                i4 i4Var = new i4(j4.f10587d);
                i4Var.f10537d = "ManifestInit";
                i4Var.a();
            }
        } else if (E == InitState.UNSET) {
            E = InitState.IMPLICIT;
            c0 c10 = a10.c();
            StartAppSDKInternal startAppSDKInternal = d.f12173a;
            if (c10.a()) {
                requestReason = MetaDataRequest.RequestReason.LAUNCH;
            } else {
                requestReason = MetaDataRequest.RequestReason.IMPLICIT_LAUNCH;
            }
            startAppSDKInternal.a(context, requestReason);
        }
    }

    public final void a(Context context, MetaDataRequest.RequestReason requestReason) {
        ComponentLocator a10;
        if (Math.random() < 0.0d) {
            Log.i("StartAppSDK", "!SDK-VERSION-STRING!:com.startapp.startappsdk:inapp-sdk:4.10.5");
        }
        try {
            a10 = ComponentLocator.a(context);
            s b10 = a10.F.b();
            b10.getClass();
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (!(defaultUncaughtExceptionHandler instanceof s)) {
                Thread.setDefaultUncaughtExceptionHandler(b10);
                b10.f11685a = defaultUncaughtExceptionHandler;
            }
        } catch (Throwable th) {
            i4.a(th);
            return;
        }
        a10.l().a();
        if (!a0.a(context, "android.permission.INTERNET") || !a0.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            wb.a(context, 6, "Please grant the mandatory permissions : INTERNET & ACCESS_NETWORK_STATE, SDK could not be initialized.", true);
        }
        this.f12146n = !wb.d(context);
        a10.a().b();
        ub v10 = a10.v();
        v10.getClass();
        try {
            new Thread(new tb(v10, context)).start();
        } catch (Throwable th2) {
            i4.a(th2);
        }
        d(context);
        MetaData.c(context);
        Map<Activity, Integer> map = wb.f12765a;
        AdsCommonMetaData.a(context);
        BannerMetaData.a(context);
        SplashMetaData.a(context);
        if (this.f12134b) {
            CacheMetaData.a(context);
        }
        AdInformationMetaData.a(context);
        SimpleTokenUtils.c(context);
        MetaData.f12393k.a((com.startapp.sdk.adsbase.remoteconfig.c) a10.f());
        g2.f10416a = new CookieManager(new d8(context), CookiePolicy.ACCEPT_ALL);
        h(context);
        b(context, requestReason);
        b(context);
        i(context);
        wb.a(context, 4, "StartApp SDK initialized", true);
    }

    public static void a(boolean z10, v7 v7Var) {
        i4 i4Var = new i4(j4.f10594k);
        i4Var.f10543j = z10;
        try {
            ComponentLocator componentLocator = (ComponentLocator) ComponentLocator.L.f12907a;
            if (componentLocator != null) {
                componentLocator.l().a(i4Var, (n4) null);
            } else if (v7Var != null) {
                v7Var.a(Boolean.FALSE);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean a(Activity activity) {
        return this.f12157y || activity.getClass().getName().equals(wb.c((Context) activity));
    }

    public boolean a(String str) {
        String str2;
        Map<String, String> map = this.f12149q;
        if (map == null) {
            str2 = null;
        } else {
            str2 = map.get(str);
        }
        return str2 != null;
    }

    public void a(boolean z10) {
        if (!z10 || !a0.a()) {
            this.f12153u = false;
            com.startapp.sdk.adsbase.cache.d.f12250h.b(AdPreferences.Placement.INAPP_RETURN);
            return;
        }
        this.f12153u = true;
    }

    /* compiled from: Sta */
    public class b implements com.startapp.sdk.adsbase.remoteconfig.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f12169a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ComponentLocator f12170b;

        public b(Context context, ComponentLocator componentLocator) {
            this.f12169a = context;
            this.f12170b = componentLocator;
        }

        /* JADX WARNING: Removed duplicated region for block: B:138:0x0466  */
        /* JADX WARNING: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest.RequestReason r19, boolean r20) {
            /*
                r18 = this;
                r1 = r18
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r8 = r1.f12169a
                boolean r2 = r0.f12134b
                r9 = 0
                r10 = 1
                if (r2 != 0) goto L_0x000e
                goto L_0x0117
            L_0x000e:
                boolean r2 = r0.f12148p
                if (r2 != 0) goto L_0x005f
                com.startapp.sdk.adsbase.cache.CacheMetaData r2 = com.startapp.sdk.adsbase.cache.CacheMetaData.f12244a
                com.startapp.sdk.adsbase.cache.ACMConfig r2 = r2.a()
                boolean r2 = r2.f()
                if (r2 != 0) goto L_0x001f
                goto L_0x005f
            L_0x001f:
                boolean r2 = r0.f12135c
                if (r2 == 0) goto L_0x0078
                com.startapp.sdk.adsbase.cache.d r2 = com.startapp.sdk.adsbase.cache.d.f12250h
                r2.getClass()
                android.content.Context r3 = com.startapp.j0.a(r8)
                if (r3 == 0) goto L_0x002f
                goto L_0x0030
            L_0x002f:
                r3 = r8
            L_0x0030:
                r2.f12257g = r3
                boolean r4 = r2.f12253c
                if (r4 != 0) goto L_0x0044
                com.startapp.sdk.adsbase.cache.CacheMetaData r4 = com.startapp.sdk.adsbase.cache.CacheMetaData.f12244a
                com.startapp.sdk.adsbase.cache.ACMConfig r4 = r4.a()
                boolean r4 = r4.f()
                if (r4 == 0) goto L_0x0044
                r4 = 1
                goto L_0x0045
            L_0x0044:
                r4 = 0
            L_0x0045:
                if (r4 == 0) goto L_0x0078
                r2.f12254d = r10
                com.startapp.sdk.adsbase.cache.a r4 = new com.startapp.sdk.adsbase.cache.a
                r4.<init>(r2, r3)
                com.startapp.sdk.components.ComponentLocator r2 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r3)
                java.util.concurrent.Executor r2 = r2.i()
                com.startapp.sdk.adsbase.cache.j r5 = new com.startapp.sdk.adsbase.cache.j
                r5.<init>(r3, r4)
                r2.execute(r5)
                goto L_0x0078
            L_0x005f:
                com.startapp.sdk.adsbase.cache.d r2 = com.startapp.sdk.adsbase.cache.d.f12250h
                r2.f12253c = r10
                com.startapp.sdk.adsbase.cache.b r3 = new com.startapp.sdk.adsbase.cache.b
                r3.<init>(r2)
                com.startapp.sdk.components.ComponentLocator r2 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r8)
                java.util.concurrent.Executor r2 = r2.i()
                com.startapp.sdk.adsbase.cache.i r4 = new com.startapp.sdk.adsbase.cache.i
                r4.<init>(r8, r3)
                r2.execute(r4)
            L_0x0078:
                r0.e(r8)
                if (r20 == 0) goto L_0x0117
                com.startapp.sdk.adsbase.cache.d r0 = com.startapp.sdk.adsbase.cache.d.f12250h
                r0.getClass()
                com.startapp.sdk.adsbase.cache.CacheMetaData r2 = com.startapp.sdk.adsbase.cache.CacheMetaData.f12244a
                com.startapp.sdk.adsbase.cache.ACMConfig r2 = r2.a()
                if (r2 == 0) goto L_0x0117
                java.util.Set r2 = r2.b()
                if (r2 == 0) goto L_0x0117
                com.startapp.sdk.components.ComponentLocator r3 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r8)
                com.startapp.sdk.adsbase.e r11 = r3.d()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r3 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f12393k
                int r12 = r3.L()
                com.startapp.sdk.adsbase.AdsCommonMetaData r3 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h
                int r13 = r3.i()
                java.util.Iterator r14 = r2.iterator()
            L_0x00a8:
                boolean r2 = r14.hasNext()
                if (r2 == 0) goto L_0x0117
                java.lang.Object r2 = r14.next()
                r5 = r2
                com.startapp.sdk.adsbase.StartAppAd$AdMode r5 = (com.startapp.sdk.adsbase.StartAppAd.AdMode) r5
                if (r5 != 0) goto L_0x00b8
                goto L_0x00a8
            L_0x00b8:
                java.lang.String r15 = com.startapp.sdk.adsbase.cache.d.a((com.startapp.sdk.adsbase.StartAppAd.AdMode) r5)
                int r7 = r11.getInt(r15, r9)
                if (r7 < r12) goto L_0x00c3
                goto L_0x00a8
            L_0x00c3:
                com.startapp.sdk.adsbase.StartAppAd$AdMode r6 = com.startapp.sdk.adsbase.StartAppAd.AdMode.FULLPAGE
                if (r5 != r6) goto L_0x00e1
                if (r13 <= 0) goto L_0x00de
                com.startapp.sdk.adsbase.model.AdPreferences r16 = new com.startapp.sdk.adsbase.model.AdPreferences
                r16.<init>()
                r4 = 0
                r17 = 0
                r2 = r0
                r3 = r8
                r5 = r6
                r6 = r16
                r16 = r7
                r7 = r17
                r2.a((android.content.Context) r3, (com.startapp.sdk.adsbase.StartAppAd) r4, (com.startapp.sdk.adsbase.StartAppAd.AdMode) r5, (com.startapp.sdk.adsbase.model.AdPreferences) r6, (com.startapp.sdk.adsbase.cache.d.C0123d) r7)
                goto L_0x0109
            L_0x00de:
                r16 = r7
                goto L_0x0109
            L_0x00e1:
                r16 = r7
                com.startapp.sdk.adsbase.StartAppAd$AdMode r6 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OFFERWALL
                if (r5 != r6) goto L_0x00fd
                r2 = 100
                if (r13 >= r2) goto L_0x0109
                com.startapp.sdk.adsbase.model.AdPreferences r7 = new com.startapp.sdk.adsbase.model.AdPreferences
                r7.<init>()
                r4 = 0
                r17 = 0
                r2 = r0
                r3 = r8
                r5 = r6
                r6 = r7
                r7 = r17
                r2.a((android.content.Context) r3, (com.startapp.sdk.adsbase.StartAppAd) r4, (com.startapp.sdk.adsbase.StartAppAd.AdMode) r5, (com.startapp.sdk.adsbase.model.AdPreferences) r6, (com.startapp.sdk.adsbase.cache.d.C0123d) r7)
                goto L_0x0109
            L_0x00fd:
                com.startapp.sdk.adsbase.model.AdPreferences r6 = new com.startapp.sdk.adsbase.model.AdPreferences
                r6.<init>()
                r4 = 0
                r7 = 0
                r2 = r0
                r3 = r8
                r2.a((android.content.Context) r3, (com.startapp.sdk.adsbase.StartAppAd) r4, (com.startapp.sdk.adsbase.StartAppAd.AdMode) r5, (com.startapp.sdk.adsbase.model.AdPreferences) r6, (com.startapp.sdk.adsbase.cache.d.C0123d) r7)
            L_0x0109:
                com.startapp.sdk.adsbase.e$a r2 = r11.edit()
                int r7 = r16 + 1
                com.startapp.sdk.adsbase.e$a r2 = r2.a((java.lang.String) r15, (int) r7)
                r2.apply()
                goto L_0x00a8
            L_0x0117:
                com.startapp.sdk.components.ComponentLocator r0 = r1.f12170b
                com.startapp.y1<com.startapp.j1> r0 = r0.f12476r
                java.lang.Object r0 = r0.b()
                com.startapp.j1 r0 = (com.startapp.j1) r0
                r0.e()
                com.startapp.sdk.components.ComponentLocator r0 = r1.f12170b
                com.startapp.y1<com.startapp.p9> r0 = r0.f12477s
                java.lang.Object r0 = r0.b()
                com.startapp.p9 r0 = (com.startapp.p9) r0
                r0.e()
                com.startapp.sdk.components.ComponentLocator r0 = r1.f12170b
                com.startapp.pa r0 = r0.t()
                r0.e()
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f12169a
                r0.getClass()
                com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r2)
                com.startapp.m5 r0 = r0.m()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f12393k
                boolean r2 = r2.V()
                r3 = 60000(0xea60, double:2.9644E-319)
                if (r2 == 0) goto L_0x017b
                com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f12393k
                int r2 = r2.B()
                long r5 = (long) r2
                long r5 = r5 * r3
                com.startapp.sdk.jobs.e$a r2 = new com.startapp.sdk.jobs.e$a
                java.lang.Class<com.startapp.sdk.adsbase.remoteconfig.d> r7 = com.startapp.sdk.adsbase.remoteconfig.d.class
                r2.<init>(r7)
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r2.f12570d = r5
                com.startapp.sdk.jobs.JobRequest$Network r5 = com.startapp.sdk.jobs.JobRequest.Network.ANY
                r2.f12557b = r5
                com.startapp.sdk.jobs.e r5 = new com.startapp.sdk.jobs.e
                r5.<init>(r2)
                com.startapp.sdk.jobs.JobRequest[] r2 = new com.startapp.sdk.jobs.JobRequest[r10]
                r2[r9] = r5
                r0.a((com.startapp.sdk.jobs.JobRequest[]) r2)
                goto L_0x0188
            L_0x017b:
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<com.startapp.sdk.adsbase.remoteconfig.d> r5 = com.startapp.sdk.adsbase.remoteconfig.d.class
                r2[r9] = r5
                int r2 = com.startapp.sdk.jobs.JobRequest.a((java.lang.Class<? extends com.startapp.sdk.jobs.b>[]) r2)
                r0.a((int) r2)
            L_0x0188:
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f12169a
                r0.getClass()
                com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r2)
                com.startapp.m5 r0 = r0.m()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r5 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f12393k
                boolean r5 = r5.U()
                if (r5 == 0) goto L_0x01c6
                com.startapp.sdk.adsbase.remoteconfig.MetaData r5 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f12393k
                int r2 = r5.b(r2)
                long r5 = (long) r2
                long r5 = r5 * r3
                com.startapp.sdk.jobs.e$a r2 = new com.startapp.sdk.jobs.e$a
                java.lang.Class<com.startapp.b8> r3 = com.startapp.b8.class
                r2.<init>(r3)
                java.lang.Long r3 = java.lang.Long.valueOf(r5)
                r2.f12570d = r3
                com.startapp.sdk.jobs.JobRequest$Network r3 = com.startapp.sdk.jobs.JobRequest.Network.ANY
                r2.f12557b = r3
                com.startapp.sdk.jobs.e r3 = new com.startapp.sdk.jobs.e
                r3.<init>(r2)
                com.startapp.sdk.jobs.JobRequest[] r2 = new com.startapp.sdk.jobs.JobRequest[r10]
                r2[r9] = r3
                r0.a((com.startapp.sdk.jobs.JobRequest[]) r2)
                goto L_0x01d3
            L_0x01c6:
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<com.startapp.b8> r3 = com.startapp.b8.class
                r2[r9] = r3
                int r2 = com.startapp.sdk.jobs.JobRequest.a((java.lang.Class<? extends com.startapp.sdk.jobs.b>[]) r2)
                r0.a((int) r2)
            L_0x01d3:
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f12169a
                r0.getClass()
                com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r2)
                com.startapp.m5 r0 = r0.m()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r3 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f12393k
                boolean r4 = r3.U()
                if (r4 == 0) goto L_0x021b
                boolean r4 = r3.T()
                if (r4 == 0) goto L_0x021b
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                int r2 = r3.a((android.content.Context) r2)
                long r2 = (long) r2
                long r2 = r4.toMillis(r2)
                com.startapp.sdk.jobs.e$a r4 = new com.startapp.sdk.jobs.e$a
                java.lang.Class<com.startapp.a8> r5 = com.startapp.a8.class
                r4.<init>(r5)
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r4.f12570d = r2
                com.startapp.sdk.jobs.JobRequest$Network r2 = com.startapp.sdk.jobs.JobRequest.Network.ANY
                r4.f12557b = r2
                r4.f12558c = r10
                com.startapp.sdk.jobs.e r2 = new com.startapp.sdk.jobs.e
                r2.<init>(r4)
                com.startapp.sdk.jobs.JobRequest[] r3 = new com.startapp.sdk.jobs.JobRequest[r10]
                r3[r9] = r2
                r0.a((com.startapp.sdk.jobs.JobRequest[]) r3)
                goto L_0x0228
            L_0x021b:
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<com.startapp.a8> r3 = com.startapp.a8.class
                r2[r9] = r3
                int r2 = com.startapp.sdk.jobs.JobRequest.a((java.lang.Class<? extends com.startapp.sdk.jobs.b>[]) r2)
                r0.a((int) r2)
            L_0x0228:
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f12169a
                r0.getClass()
                com.startapp.sdk.components.ComponentLocator r3 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r2)
                com.startapp.sdk.adsbase.e r4 = r3.d()
                java.lang.String r5 = "shared_prefs_first_init"
                boolean r5 = r4.getBoolean(r5, r10)
                if (r5 != 0) goto L_0x0240
                goto L_0x0273
            L_0x0240:
                com.startapp.sdk.adsbase.e$a r5 = r4.edit()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
                java.lang.String r7 = "totalSessions"
                r5.a((java.lang.String) r7, r6)
                android.content.SharedPreferences$Editor r6 = r5.f12335a
                r6.putInt(r7, r9)
                long r6 = java.lang.System.currentTimeMillis()
                java.lang.Long r8 = java.lang.Long.valueOf(r6)
                java.lang.String r11 = "firstSessionTime"
                r5.a((java.lang.String) r11, r8)
                android.content.SharedPreferences$Editor r8 = r5.f12335a
                r8.putLong(r11, r6)
                r5.apply()
                java.util.concurrent.Executor r5 = r3.p()
                com.startapp.sdk.adsbase.f r6 = new com.startapp.sdk.adsbase.f
                r6.<init>(r0, r2, r3, r4)
                r5.execute(r6)
            L_0x0273:
                android.content.Context r0 = r1.f12169a
                com.startapp.sdk.adsbase.StartAppSDKInternal.g(r0)
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                r0.getClass()
                android.content.Context r0 = r1.f12169a
                com.startapp.sdk.components.ComponentLocator r2 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r0)
                com.startapp.e2 r2 = r2.f()
                boolean r2 = r2.c()
                if (r2 == 0) goto L_0x0366
                com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f12393k
                com.startapp.sdk.insight.NetworkTestsMetaData r2 = r2.z()
                com.startapp.sdk.components.ComponentLocator r3 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r0)
                com.startapp.m5 r3 = r3.m()
                java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
                boolean r4 = com.startapp.a0.a((android.content.Context) r0, (java.lang.String) r4)
                if (r4 != 0) goto L_0x02ae
                java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
                boolean r4 = com.startapp.a0.a((android.content.Context) r0, (java.lang.String) r4)
                if (r4 == 0) goto L_0x02ac
                goto L_0x02ae
            L_0x02ac:
                r4 = 0
                goto L_0x02af
            L_0x02ae:
                r4 = 1
            L_0x02af:
                if (r2 == 0) goto L_0x0353
                boolean r5 = r2.n()
                if (r5 == 0) goto L_0x0353
                if (r4 != 0) goto L_0x02bb
                goto L_0x0353
            L_0x02bb:
                double r4 = java.lang.Math.random()
                double r6 = r2.j()
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 >= 0) goto L_0x02cf
                com.startapp.l7 r4 = new com.startapp.l7
                r4.<init>()
                com.startapp.x2.a((com.startapp.x2.a) r4)
            L_0x02cf:
                boolean r4 = r2.o()     // Catch:{ all -> 0x034e }
                com.startapp.sdk.cachedservice.BackgroundService.a(r0, r4)     // Catch:{ all -> 0x034e }
                com.startapp.networkTest.startapp.NetworkTester$Config r4 = new com.startapp.networkTest.startapp.NetworkTester$Config     // Catch:{ all -> 0x034e }
                r4.<init>()     // Catch:{ all -> 0x034e }
                java.lang.String r5 = r2.k()     // Catch:{ all -> 0x034e }
                r4.PROJECT_ID = r5     // Catch:{ all -> 0x034e }
                java.lang.String r5 = r2.c()     // Catch:{ all -> 0x034e }
                r4.CONNECTIVITY_TEST_HOSTNAME = r5     // Catch:{ all -> 0x034e }
                java.lang.String r5 = r2.b()     // Catch:{ all -> 0x034e }
                r4.CONNECTIVITY_TEST_FILENAME = r5     // Catch:{ all -> 0x034e }
                boolean r5 = r2.l()     // Catch:{ all -> 0x034e }
                r4.CONNECTIVITY_TEST_ENABLED = r5     // Catch:{ all -> 0x034e }
                boolean r5 = r2.p()     // Catch:{ all -> 0x034e }
                r4.NIR_COLLECT_CELLINFO = r5     // Catch:{ all -> 0x034e }
                boolean r5 = r2.m()     // Catch:{ all -> 0x034e }
                r4.CT_COLLECT_CELLINFO = r5     // Catch:{ all -> 0x034e }
                java.lang.String r5 = r2.a()     // Catch:{ all -> 0x034e }
                r4.CONNECTIVITY_TEST_CDNCONFIG_URL = r5     // Catch:{ all -> 0x034e }
                java.lang.String r5 = r2.e()     // Catch:{ all -> 0x034e }
                r4.GEOIP_URL = r5     // Catch:{ all -> 0x034e }
                android.content.Context r5 = com.startapp.j0.a(r0)     // Catch:{ all -> 0x034e }
                if (r5 == 0) goto L_0x0312
                goto L_0x0313
            L_0x0312:
                r5 = r0
            L_0x0313:
                com.startapp.k7 r6 = new com.startapp.k7     // Catch:{ all -> 0x034e }
                r6.<init>(r5)     // Catch:{ all -> 0x034e }
                com.startapp.networkTest.startapp.NetworkTester.init(r0, r4)     // Catch:{ all -> 0x034e }
                com.startapp.networkTest.startapp.NetworkTester.setOnConnectivityLatencyListener(r6)     // Catch:{ all -> 0x034e }
                com.startapp.networkTest.startapp.NetworkTester.setOnNetworkInfoListener(r6)     // Catch:{ all -> 0x034e }
                long r4 = r2.d()     // Catch:{ all -> 0x034e }
                long r6 = r2.f()     // Catch:{ all -> 0x034e }
                com.startapp.networkTest.startapp.NetworkTester.startListening(r4, r6)     // Catch:{ all -> 0x034e }
                com.startapp.sdk.jobs.e$a r0 = new com.startapp.sdk.jobs.e$a     // Catch:{ all -> 0x034e }
                java.lang.Class<com.startapp.m7> r4 = com.startapp.m7.class
                r0.<init>(r4)     // Catch:{ all -> 0x034e }
                long r4 = r2.d()     // Catch:{ all -> 0x034e }
                java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x034e }
                r0.f12570d = r2     // Catch:{ all -> 0x034e }
                com.startapp.sdk.jobs.JobRequest$Network r2 = com.startapp.sdk.jobs.JobRequest.Network.ANY     // Catch:{ all -> 0x034e }
                r0.f12557b = r2     // Catch:{ all -> 0x034e }
                com.startapp.sdk.jobs.e r2 = new com.startapp.sdk.jobs.e     // Catch:{ all -> 0x034e }
                r2.<init>(r0)     // Catch:{ all -> 0x034e }
                com.startapp.sdk.jobs.JobRequest[] r0 = new com.startapp.sdk.jobs.JobRequest[r10]     // Catch:{ all -> 0x034e }
                r0[r9] = r2     // Catch:{ all -> 0x034e }
                r3.a((com.startapp.sdk.jobs.JobRequest[]) r0)     // Catch:{ all -> 0x034e }
                goto L_0x0366
            L_0x034e:
                r0 = move-exception
                com.startapp.i4.a((java.lang.Throwable) r0)
                goto L_0x0366
            L_0x0353:
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<com.startapp.m7> r4 = com.startapp.m7.class
                r2[r9] = r4
                int r2 = com.startapp.sdk.jobs.JobRequest.a((java.lang.Class<? extends com.startapp.sdk.jobs.b>[]) r2)
                r3.a((int) r2)
                com.startapp.networkTest.startapp.NetworkTester.stopListening()
                com.startapp.sdk.cachedservice.BackgroundService.a(r0, r9)
            L_0x0366:
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f12169a
                com.startapp.jb r3 = r0.B
                if (r3 == 0) goto L_0x036f
                goto L_0x0380
            L_0x036f:
                com.startapp.sdk.components.ComponentLocator r2 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r2)
                com.startapp.y1<com.startapp.jb> r2 = r2.f12470l
                java.lang.Object r2 = r2.b()
                com.startapp.jb r2 = (com.startapp.jb) r2
                r0.B = r2
                r2.b()
            L_0x0380:
                com.startapp.sdk.components.ComponentLocator r0 = r1.f12170b
                com.startapp.b9 r0 = r0.r()
                r0.getClass()
                boolean r2 = r0.b()     // Catch:{ all -> 0x039b }
                if (r2 == 0) goto L_0x0390
                goto L_0x039f
            L_0x0390:
                java.util.concurrent.Executor r2 = r0.f10175b     // Catch:{ all -> 0x039b }
                com.startapp.c9 r3 = new com.startapp.c9     // Catch:{ all -> 0x039b }
                r3.<init>(r0)     // Catch:{ all -> 0x039b }
                r2.execute(r3)     // Catch:{ all -> 0x039b }
                goto L_0x039f
            L_0x039b:
                r0 = move-exception
                com.startapp.i4.a((java.lang.Throwable) r0)
            L_0x039f:
                com.startapp.sdk.components.ComponentLocator r0 = r1.f12170b
                com.startapp.x8 r0 = r0.q()
                java.util.List r2 = r0.a()
                r3 = 1024(0x400, float:1.435E-42)
                boolean r0 = r0.a((int) r3)
                if (r0 == 0) goto L_0x03da
                com.startapp.i4 r0 = new com.startapp.i4
                com.startapp.j4 r3 = com.startapp.j4.f10587d
                r0.<init>((com.startapp.j4) r3)
                java.lang.String r3 = "RSC init"
                r0.f10537d = r3
                java.lang.String r3 = "targets: "
                java.lang.StringBuilder r3 = com.startapp.b1.a(r3)
                if (r2 == 0) goto L_0x03cd
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x03ce
            L_0x03cd:
                r2 = 0
            L_0x03ce:
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r0.f10538e = r2
                r0.a()
            L_0x03da:
                com.startapp.sdk.components.ComponentLocator r0 = r1.f12170b
                com.startapp.i6 r0 = r0.o()
                com.startapp.sdk.adsbase.remoteconfig.MotionMetadata r2 = r0.a()
                if (r2 == 0) goto L_0x03f7
                double r3 = java.lang.Math.random()
                double r5 = r2.k()
                int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r2 >= 0) goto L_0x03f4
                r2 = 1
                goto L_0x03f5
            L_0x03f4:
                r2 = 0
            L_0x03f5:
                r0.f10552f = r2
            L_0x03f7:
                android.os.Handler r2 = r0.f10550d
                com.startapp.j6 r3 = new com.startapp.j6
                r3.<init>(r0)
                r2.post(r3)
                com.startapp.sdk.components.ComponentLocator r0 = r1.f12170b
                com.startapp.x r0 = r0.b()
                if (r20 == 0) goto L_0x040b
                r2 = 1
                goto L_0x040c
            L_0x040b:
                r2 = 2
            L_0x040c:
                r0.a(r2)
                com.startapp.sdk.adsbase.remoteconfig.MetaData r0 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f12393k
                java.lang.String r0 = r0.v()
                if (r0 == 0) goto L_0x048a
                java.lang.String r2 = com.startapp.sdk.adsbase.StartAppSDK.getVersion()
                java.lang.String r3 = "\\."
                java.lang.String[] r4 = r0.split(r3)
                java.lang.String[] r2 = r2.split(r3)
                int r3 = r4.length
                int r5 = r2.length
                int r3 = java.lang.Math.min(r3, r5)
                r5 = 0
            L_0x042c:
                if (r5 >= r3) goto L_0x0455
                r6 = r4[r5]     // Catch:{ NumberFormatException -> 0x0440 }
                int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0440 }
                r7 = r2[r5]     // Catch:{ NumberFormatException -> 0x0440 }
                int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0440 }
                if (r6 <= r7) goto L_0x043d
                goto L_0x044b
            L_0x043d:
                if (r6 >= r7) goto L_0x0452
                goto L_0x044f
            L_0x0440:
                r6 = r4[r5]
                r7 = r2[r5]
                int r6 = r6.compareTo(r7)
                if (r6 <= 0) goto L_0x044d
            L_0x044b:
                int r5 = r5 + r10
                goto L_0x0464
            L_0x044d:
                if (r6 >= 0) goto L_0x0452
            L_0x044f:
                int r5 = r5 + r10
                int r5 = -r5
                goto L_0x0464
            L_0x0452:
                int r5 = r5 + 1
                goto L_0x042c
            L_0x0455:
                int r5 = r4.length
                int r6 = r2.length
                if (r5 <= r6) goto L_0x045c
                int r5 = r3 + 1
                goto L_0x0464
            L_0x045c:
                int r4 = r4.length
                int r2 = r2.length
                if (r4 >= r2) goto L_0x0463
                int r3 = r3 + r10
                int r5 = -r3
                goto L_0x0464
            L_0x0463:
                r5 = 0
            L_0x0464:
                if (r5 <= 0) goto L_0x048a
                android.content.Context r2 = r1.f12169a
                java.lang.String r3 = "Current SDK version ("
                java.lang.StringBuilder r3 = com.startapp.b1.a(r3)
                java.lang.String r4 = com.startapp.sdk.adsbase.StartAppSDK.getVersion()
                r3.append(r4)
                java.lang.String r4 = ") is outdated. Integrate the most recent version ("
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = ") in order to improve your ads performance."
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r3 = 5
                com.startapp.wb.a((android.content.Context) r2, (int) r3, (java.lang.String) r0, (boolean) r9)
            L_0x048a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppSDKInternal.b.a(com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason, boolean):void");
        }

        public void a(MetaDataRequest.RequestReason requestReason) {
            this.f12170b.b().a(0);
        }
    }
}
