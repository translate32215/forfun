package dev.pankaj.ytvclib.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.adcolony.sdk.o;
import com.adcolony.sdk.r0;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.google.android.gms.internal.ads.dy;
import com.google.android.gms.internal.ads.oz;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.t2;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import dev.pankaj.ytvclib.ui.main.PkAdActivity;
import e8.cj0;
import e8.dj0;
import e8.gz;
import e8.t;
import e8.ti0;
import e8.zi0;
import f7.j0;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import pc.l;
import sc.g;
import t2.q0;
import ud.k;
import y6.i;

/* compiled from: AdUtil.kt */
public final class b {

    /* renamed from: i  reason: collision with root package name */
    public static final c f13468i = new c((ud.f) null);

    /* renamed from: j  reason: collision with root package name */
    public static volatile b f13469j;

    /* renamed from: a  reason: collision with root package name */
    public final sc.f f13470a;

    /* renamed from: b  reason: collision with root package name */
    public int f13471b;

    /* renamed from: c  reason: collision with root package name */
    public int f13472c;

    /* renamed from: d  reason: collision with root package name */
    public StartAppAd f13473d;

    /* renamed from: e  reason: collision with root package name */
    public i f13474e;

    /* renamed from: f  reason: collision with root package name */
    public InterstitialAd f13475f;

    /* renamed from: g  reason: collision with root package name */
    public com.yandex.mobile.ads.interstitial.InterstitialAd f13476g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f13477h;

    /* compiled from: AdUtil.kt */
    public static final class a extends y6.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13478a;

        public a(b bVar) {
            this.f13478a = bVar;
        }

        public void g() {
            this.f13478a.a();
        }
    }

    /* renamed from: dev.pankaj.ytvclib.utils.b$b  reason: collision with other inner class name */
    /* compiled from: AdUtil.kt */
    public static final class C0131b implements InterstitialAdEventListener {
        public C0131b(b bVar) {
        }
    }

    /* compiled from: AdUtil.kt */
    public static final class c {
        public c(ud.f fVar) {
        }

        public final b a(Context context, sc.f fVar) {
            b bVar = b.f13469j;
            if (bVar == null) {
                synchronized (this) {
                    bVar = b.f13469j;
                    if (bVar == null) {
                        bVar = new b(context, fVar);
                        b.f13469j = bVar;
                    }
                }
            }
            return bVar;
        }
    }

    /* compiled from: AdUtil.kt */
    public static final class d implements InterstitialAdListener {
        public d(b bVar) {
        }
    }

    /* compiled from: AdUtil.kt */
    public static final class e implements AdListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f13479a;

        public e(ViewGroup viewGroup) {
            this.f13479a = viewGroup;
        }
    }

    /* compiled from: AdUtil.kt */
    public static final class f implements AdDisplayListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13480a;

        public f(b bVar) {
            this.f13480a = bVar;
        }

        public void adClicked(Ad ad2) {
        }

        public void adDisplayed(Ad ad2) {
        }

        public void adHidden(Ad ad2) {
            StartAppAd startAppAd = this.f13480a.f13473d;
            if (startAppAd != null) {
                startAppAd.loadAd();
            } else {
                k.l("startAppFull");
                throw null;
            }
        }

        public void adNotDisplayed(Ad ad2) {
        }
    }

    public b(Context context, sc.f fVar) {
        sc.a a10;
        boolean z10;
        boolean z11;
        g e10;
        this.f13470a = fVar;
        if (!(fVar == null || (e10 = fVar.e()) == null)) {
            this.f13477h = e10.b() > System.currentTimeMillis() / 1000;
        }
        if (fVar != null && (a10 = fVar.a()) != null) {
            if (!this.f13477h) {
                this.f13471b = a10.d();
                this.f13472c = a10.e();
            }
            if (this.f13471b == 2 || this.f13472c == 2) {
                oz c10 = oz.c();
                synchronized (c10.f7782b) {
                    if (!c10.f7784d) {
                        if (!c10.f7785e) {
                            c10.f7784d = true;
                            if (context != null) {
                                try {
                                    if (ri.f8040c == null) {
                                        ri.f8040c = new ri();
                                    }
                                    ri.f8040c.S(context, (String) null);
                                    c10.b(context);
                                    c10.f7783c.s3(new t2());
                                    c10.f7783c.P();
                                    c10.f7783c.P0((String) null, new c8.b(new j0(c10, context)));
                                    c10.f7787g.getClass();
                                    c10.f7787g.getClass();
                                    t.a(context);
                                    if (!((Boolean) ti0.f16763j.f16769f.a(t.M2)).booleanValue() && !c10.a().endsWith("0")) {
                                        l0.e.I("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                                        c10.f7788h = new gz(c10);
                                    }
                                } catch (RemoteException e11) {
                                    l0.e.D("MobileAdsSettingManager initialization failed", e11);
                                }
                            } else {
                                throw new IllegalArgumentException("Context cannot be null.");
                            }
                        }
                    }
                }
            }
            if (this.f13471b == 3 || this.f13472c == 3) {
                StartAppSDK.init(context, a10.h().a(), false);
                StartAppAd.disableSplash();
            }
            if (this.f13471b == 5 || this.f13472c == 5) {
                l g10 = l.g();
                p.g gVar = new p.g(3);
                r0.k((JSONObject) gVar.f23743d, "keep_screen_on", true);
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append("GDPR".toLowerCase(locale));
                sb2.append("_required");
                r0.k((JSONObject) gVar.f23743d, sb2.toString(), true);
                r0.e((JSONObject) gVar.f23743d, "GDPR".toLowerCase(locale) + "_consent_string", "1");
                String a11 = a10.a().a();
                String[] strArr = {a10.a().b(), a10.a().c()};
                ExecutorService executorService = com.adcolony.sdk.a.f4411a;
                if (q0.a(0, (Bundle) null)) {
                    p.f.a(0, 1, "Cannot configure AdColony; configuration mechanism requires 5 seconds between attempts.", false);
                } else {
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    if (com.adcolony.sdk.f.f() && !((JSONObject) com.adcolony.sdk.f.d().o().f23743d).optBoolean("reconfigurable")) {
                        o d10 = com.adcolony.sdk.f.d();
                        if (!((String) d10.o().f23740a).equals(a11)) {
                            p.f.a(0, 1, "Ignoring call to AdColony.configure() as the app id does not match what was used during the initial configuration.", false);
                        } else {
                            String[] strArr2 = (String[]) d10.o().f23741b;
                            ExecutorService executorService2 = com.adcolony.sdk.j0.f4565a;
                            if (strArr2 == null || 2 != strArr2.length) {
                                z11 = false;
                            } else {
                                Arrays.sort(strArr);
                                Arrays.sort(strArr2);
                                z11 = Arrays.equals(strArr, strArr2);
                            }
                            if (z11) {
                                p.f.a(0, 1, "Ignoring call to AdColony.configure() as the same zone ids were used during the previous configuration.", false);
                            }
                        }
                    }
                    new SimpleDateFormat("HH:mm:ss:SSS", Locale.US).format(new Date(System.currentTimeMillis()));
                    boolean z12 = true;
                    for (int i10 = 0; i10 < 2; i10++) {
                        if (strArr[i10] != null && !strArr[i10].equals("")) {
                            z12 = false;
                        }
                    }
                    if (a11.equals("") || z12) {
                        p.f.a(0, 0, "AdColony.configure() called with an empty app or zone id String.", false);
                    } else {
                        com.adcolony.sdk.f.f4480c = true;
                        gVar.a(a11);
                        gVar.b(strArr);
                        com.adcolony.sdk.f.b(g10, gVar, false);
                        String str = com.adcolony.sdk.f.d().q().b() + "/adc3/AppInfo";
                        JSONObject m10 = new File(str).exists() ? r0.m(str) : new JSONObject();
                        JSONObject jSONObject = new JSONObject();
                        if (m10.optString("appId").equals(a11)) {
                            JSONArray optJSONArray = m10.optJSONArray("zoneIds");
                            optJSONArray = optJSONArray == null ? new JSONArray() : optJSONArray;
                            for (int i11 = 0; i11 < 2; i11++) {
                                String str2 = strArr[i11];
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= optJSONArray.length()) {
                                        z10 = false;
                                        break;
                                    } else if (optJSONArray.optString(i12).equals(str2)) {
                                        z10 = true;
                                        break;
                                    } else {
                                        i12++;
                                    }
                                }
                                if (!z10) {
                                    optJSONArray.put(str2);
                                }
                            }
                            r0.f(jSONObject, "zoneIds", optJSONArray);
                            r0.e(jSONObject, "appId", a11);
                        } else {
                            JSONArray jSONArray = new JSONArray();
                            for (int i13 = 0; i13 < 2; i13++) {
                                jSONArray.put(strArr[i13]);
                            }
                            r0.f(jSONObject, "zoneIds", jSONArray);
                            r0.e(jSONObject, "appId", a11);
                        }
                        r0.o(jSONObject, str);
                    }
                }
            }
            if ((this.f13471b == 6 || this.f13472c == 6) && !AudienceNetworkAds.isInitialized(context)) {
                AudienceNetworkAds.initialize(context);
                AdSettings.addTestDevice("ffd699de-6f10-406f-9a38-5f36221be999");
            }
            if (this.f13471b == 7 || this.f13472c == 7) {
                MobileAds.initialize(context, a.f13467a);
            }
            int i14 = this.f13472c;
            if (i14 == 2) {
                i iVar = new i(context);
                iVar.c(a10.c().b());
                iVar.b(new a(this));
                this.f13474e = iVar;
                a();
            } else if (i14 == 3) {
                StartAppAd startAppAd = new StartAppAd(context);
                this.f13473d = startAppAd;
                startAppAd.loadAd();
            } else if (i14 == 6) {
                this.f13475f = new InterstitialAd(context, a10.g().b());
                b();
            } else if (i14 == 7) {
                com.yandex.mobile.ads.interstitial.InterstitialAd interstitialAd = new com.yandex.mobile.ads.interstitial.InterstitialAd(context);
                interstitialAd.setAdUnitId(a10.i().b());
                interstitialAd.setInterstitialAdEventListener(new C0131b(this));
                this.f13476g = interstitialAd;
                c();
            }
        }
    }

    public final void a() {
        sc.f fVar = this.f13470a;
        if (fVar != null) {
            if (fVar.a().c().d() < 1) {
                i iVar = this.f13474e;
                if (iVar != null) {
                    cj0 cj0 = new cj0();
                    cj0.f14151d.add("B3EEABB8EE11C2BE770B684D95219ECB");
                    iVar.f28126a.b(new zi0(cj0));
                    return;
                }
                k.l("adMobFull");
                throw null;
            }
            if ((System.currentTimeMillis() / ((long) 1000)) - TimeUnit.MINUTES.toSeconds(fVar.a().c().c()) > l.g().b()) {
                l.g().i(0);
            }
            long a10 = l.g().a();
            if (fVar.a().c().d() > a10) {
                l.g().i(a10 + 1);
                i iVar2 = this.f13474e;
                if (iVar2 != null) {
                    cj0 cj02 = new cj0();
                    cj02.f14151d.add("B3EEABB8EE11C2BE770B684D95219ECB");
                    iVar2.f28126a.b(new zi0(cj02));
                    return;
                }
                k.l("adMobFull");
                throw null;
            }
        }
    }

    public final void b() {
        sc.f fVar = this.f13470a;
        if (fVar != null) {
            InterstitialAdListener dVar = new d(this);
            if (fVar.a().g().d() < 1) {
                InterstitialAd interstitialAd = this.f13475f;
                if (interstitialAd == null) {
                    k.l("fbFull");
                    throw null;
                } else if (interstitialAd != null) {
                    interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(dVar).build());
                } else {
                    k.l("fbFull");
                    throw null;
                }
            } else {
                if ((System.currentTimeMillis() / ((long) 1000)) - TimeUnit.MINUTES.toSeconds(fVar.a().g().c()) > l.g().b()) {
                    l.g().i(0);
                }
                long a10 = l.g().a();
                if (fVar.a().g().d() > a10) {
                    l.g().i(a10 + 1);
                    InterstitialAd interstitialAd2 = this.f13475f;
                    if (interstitialAd2 == null) {
                        k.l("fbFull");
                        throw null;
                    } else if (interstitialAd2 != null) {
                        interstitialAd2.loadAd(interstitialAd2.buildLoadAdConfig().withAdListener(dVar).build());
                    } else {
                        k.l("fbFull");
                        throw null;
                    }
                }
            }
        }
    }

    public final void c() {
        sc.f fVar = this.f13470a;
        if (fVar != null) {
            if (fVar.a().i().d() < 1) {
                com.yandex.mobile.ads.interstitial.InterstitialAd interstitialAd = this.f13476g;
                if (interstitialAd != null) {
                    interstitialAd.loadAd(new AdRequest.Builder().build());
                } else {
                    k.l("yandexFull");
                    throw null;
                }
            } else {
                if ((System.currentTimeMillis() / ((long) 1000)) - TimeUnit.MINUTES.toSeconds(fVar.a().i().c()) > l.g().b()) {
                    l.g().i(0);
                }
                long a10 = l.g().a();
                if (fVar.a().i().d() > a10) {
                    l.g().i(a10 + 1);
                    com.yandex.mobile.ads.interstitial.InterstitialAd interstitialAd2 = this.f13476g;
                    if (interstitialAd2 != null) {
                        interstitialAd2.loadAd(new AdRequest.Builder().build());
                    } else {
                        k.l("yandexFull");
                        throw null;
                    }
                }
            }
        }
    }

    public final void d() {
        l g10 = l.g();
        Intent intent = new Intent(l.g(), PkAdActivity.class);
        intent.setFlags(268435456);
        g10.startActivity(intent);
    }

    public final void e(Activity activity, ViewGroup viewGroup) {
        sc.f fVar = this.f13470a;
        if (fVar != null) {
            AdListener eVar = new e(viewGroup);
            View adView = new AdView(activity, fVar.a().g().a(), AdSize.BANNER_HEIGHT_50);
            viewGroup.removeAllViews();
            viewGroup.addView(adView);
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(eVar).build());
        }
    }

    public final void f() {
        InterstitialAd interstitialAd = this.f13475f;
        if (interstitialAd == null) {
            k.l("fbFull");
            throw null;
        } else if (interstitialAd.isAdLoaded()) {
            l.g().k();
            InterstitialAd interstitialAd2 = this.f13475f;
            if (interstitialAd2 != null) {
                interstitialAd2.show();
            } else {
                k.l("fbFull");
                throw null;
            }
        } else {
            b();
        }
    }

    public final void g() {
        int i10 = this.f13472c;
        if (i10 != 1) {
            boolean z10 = false;
            if (i10 == 2) {
                i iVar = this.f13474e;
                if (iVar != null) {
                    dj0 dj0 = iVar.f28126a;
                    dj0.getClass();
                    try {
                        dy dyVar = dj0.f14291e;
                        if (dyVar != null) {
                            z10 = dyVar.isReady();
                        }
                    } catch (RemoteException e10) {
                        l0.e.F("#007 Could not call remote method.", e10);
                    }
                    if (z10) {
                        l.g().k();
                        i iVar2 = this.f13474e;
                        if (iVar2 != null) {
                            iVar2.e();
                        } else {
                            k.l("adMobFull");
                            throw null;
                        }
                    } else {
                        a();
                    }
                } else {
                    k.l("adMobFull");
                    throw null;
                }
            } else if (i10 == 3) {
                sc.f fVar = this.f13470a;
                if (fVar != null) {
                    if (fVar.a().h().c() < 1) {
                        h();
                        return;
                    }
                    if ((System.currentTimeMillis() / ((long) 1000)) - TimeUnit.MINUTES.toSeconds(fVar.a().h().b()) > l.g().b()) {
                        l.g().i(0);
                    }
                    long a10 = l.g().a();
                    if (fVar.a().h().c() > a10) {
                        l.g().i(a10 + 1);
                        h();
                    }
                }
            } else if (i10 == 5) {
                sc.f fVar2 = this.f13470a;
                if (fVar2 != null) {
                    ad.b bVar = new ad.b();
                    String c10 = fVar2.a().a().c();
                    ExecutorService executorService = com.adcolony.sdk.a.f4411a;
                    if (!com.adcolony.sdk.f.f4480c) {
                        p.f.a(0, 1, "Ignoring call to AdColony.requestInterstitial as AdColony has not yet been configured.", false);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("zone_id", c10);
                    if (q0.a(1, bundle)) {
                        com.adcolony.sdk.e eVar = com.adcolony.sdk.f.d().f4675s.get(c10);
                        return;
                    }
                    try {
                        com.adcolony.sdk.a.f4411a.execute(new t2.d(bVar, c10));
                    } catch (RejectedExecutionException unused) {
                        com.adcolony.sdk.a.c(bVar, c10);
                    }
                }
            } else if (i10 == 6) {
                f();
            } else if (i10 == 7) {
                j();
            }
        } else {
            sc.f fVar3 = this.f13470a;
            if (fVar3 != null) {
                if (fVar3.a().f().d() < 1) {
                    d();
                    return;
                }
                if ((System.currentTimeMillis() / ((long) 1000)) - TimeUnit.MINUTES.toSeconds(fVar3.a().f().c()) > l.g().b()) {
                    l.g().i(0);
                }
                long a11 = l.g().a();
                if (fVar3.a().f().d() > a11) {
                    l.g().i(a11 + 1);
                    d();
                }
            }
        }
    }

    public final void h() {
        StartAppAd startAppAd = this.f13473d;
        if (startAppAd == null) {
            k.l("startAppFull");
            throw null;
        } else if (startAppAd.isReady()) {
            l.g().k();
            StartAppAd startAppAd2 = this.f13473d;
            if (startAppAd2 != null) {
                startAppAd2.showAd((AdDisplayListener) new f(this));
            } else {
                k.l("startAppFull");
                throw null;
            }
        }
    }

    public final void i(Activity activity, ViewGroup viewGroup) {
        sc.f fVar = this.f13470a;
        if (fVar != null) {
            View bannerAdView = new BannerAdView(activity);
            bannerAdView.setAdUnitId(fVar.a().i().a());
            Context context = bannerAdView.getContext();
            k.e(context, "context");
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float f10 = ((float) displayMetrics.widthPixels) / displayMetrics.density;
            if (!Float.isNaN(f10)) {
                bannerAdView.setAdSize(com.yandex.mobile.ads.banner.AdSize.stickySize(Math.round(f10)));
                viewGroup.removeAllViews();
                viewGroup.addView(bannerAdView);
                androidx.activity.k.c(viewGroup);
                bannerAdView.loadAd(new AdRequest.Builder().build());
                return;
            }
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
    }

    public final void j() {
        com.yandex.mobile.ads.interstitial.InterstitialAd interstitialAd = this.f13476g;
        if (interstitialAd == null) {
            k.l("yandexFull");
            throw null;
        } else if (interstitialAd.isLoaded()) {
            l.g().k();
            com.yandex.mobile.ads.interstitial.InterstitialAd interstitialAd2 = this.f13476g;
            if (interstitialAd2 != null) {
                interstitialAd2.show();
            } else {
                k.l("yandexFull");
                throw null;
            }
        } else {
            c();
        }
    }
}
