package com.startapp.sdk.adsbase.model;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.provider.Settings;
import com.startapp.a;
import com.startapp.a0;
import com.startapp.e;
import com.startapp.e2;
import com.startapp.i4;
import com.startapp.m8;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.t9;
import com.startapp.w9;
import com.startapp.wb;
import com.startapp.y0;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class GetAdRequest extends y0 {
    public Set<String> A0 = null;
    public Set<String> B0 = null;
    public Set<String> C0 = null;
    public Set<String> D0 = null;
    public Set<String> E0 = null;
    public Pair<String, String> F0;
    public boolean G0 = true;
    public long H0 = (System.currentTimeMillis() - t9.f12617d.b());
    public int I0;
    public String J0;
    public String K0;
    public String L0;
    public boolean M0;
    public Boolean N0;
    public Boolean O0;
    public String P0;
    public String Q0 = null;
    public String R0 = null;
    public Ad.AdType S0 = null;

    /* renamed from: h0  reason: collision with root package name */
    public AdPreferences.Placement f12351h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f12352i0;

    /* renamed from: j0  reason: collision with root package name */
    public Integer f12353j0;

    /* renamed from: k0  reason: collision with root package name */
    public Long f12354k0;

    /* renamed from: l0  reason: collision with root package name */
    public Boolean f12355l0;

    /* renamed from: m0  reason: collision with root package name */
    public SDKAdPreferences.Gender f12356m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f12357n0;

    /* renamed from: o0  reason: collision with root package name */
    public String f12358o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f12359p0 = 1;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f12360q0 = true;

    /* renamed from: r0  reason: collision with root package name */
    public Boolean f12361r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f12362s0 = AdsCommonMetaData.k().M();

    /* renamed from: t0  reason: collision with root package name */
    public Double f12363t0;

    /* renamed from: u0  reason: collision with root package name */
    public String f12364u0;

    /* renamed from: v0  reason: collision with root package name */
    public String f12365v0;

    /* renamed from: w0  reason: collision with root package name */
    public Integer f12366w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f12367x0 = true;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f12368y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f12369z0 = 0;

    /* compiled from: Sta */
    public enum VideoRequestMode {
        INTERSTITIAL,
        REWARDED
    }

    /* compiled from: Sta */
    public enum VideoRequestType {
        ENABLED,
        DISABLED,
        FORCED,
        FORCED_NONVAST
    }

    public GetAdRequest() {
        super(4);
        Map<Activity, Integer> map = wb.f12765a;
        this.I0 = e.a().b();
        this.J0 = MetaData.t().D();
    }

    public void a(Context context, AdPreferences adPreferences, AdPreferences.Placement placement, Pair<String, String> pair) {
        this.f12351h0 = placement;
        this.F0 = pair;
        this.N0 = adPreferences.getAi();
        this.O0 = adPreferences.getAs();
        this.f12356m0 = adPreferences.getGender(context);
        this.f12357n0 = adPreferences.getKeywords();
        this.f12352i0 = adPreferences.isTestMode();
        this.A0 = adPreferences.getCategories();
        this.B0 = adPreferences.getCategoriesExclude();
        this.f12360q0 = adPreferences.b();
        this.f12366w0 = adPreferences.a();
        int i10 = a0.f10005a;
        boolean z10 = false;
        this.f12361r0 = Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "auto_time", 0) > 0);
        this.f12363t0 = adPreferences.getMinCpm();
        this.f12364u0 = adPreferences.getAdTag();
        Object obj = MetaData.f12386d;
        this.f12367x0 = !context.getFileStreamPath("StartappMetadata").exists();
        this.Q0 = adPreferences.country;
        this.R0 = adPreferences.advertiserId;
        this.f12358o0 = adPreferences.template;
        this.S0 = adPreferences.type;
        this.f12839b = adPreferences.getCustomProductId();
        VideoConfig G = AdsCommonMetaData.f12098h.G();
        if (!((G == null || G.l() == null) ? false : G.l().equals("muted"))) {
            try {
                Object systemService = context.getSystemService("audio");
                if (systemService instanceof AudioManager) {
                    if (((AudioManager) systemService).getStreamVolume(3) > 0) {
                        z10 = true;
                    }
                    this.f12368y0 = z10;
                }
            } catch (Throwable th) {
                i4.a(th);
            }
        } else {
            this.f12368y0 = false;
        }
        this.D0 = adPreferences.packageInclude;
    }

    public boolean a() {
        return true;
    }

    public boolean b() {
        Ad.AdType adType = this.S0;
        return adType == Ad.AdType.VIDEO || adType == Ad.AdType.REWARDED_VIDEO;
    }

    public void f(Context context) {
        String str;
        w9 s10 = ComponentLocator.a(context).s();
        AdPreferences.Placement placement = this.f12351h0;
        s10.getClass();
        if (placement == null) {
            str = null;
        } else {
            str = s10.f12760a.get(new w9.a(placement, -1));
        }
        this.f12365v0 = str;
    }

    public void g(Context context) {
        e2 f10 = ComponentLocator.a(context).f();
        this.f12353j0 = f10.b();
        this.f12354k0 = (!f10.d() || !f10.f10318b.contains("consentTimestamp")) ? null : Long.valueOf(f10.f10318b.getLong("consentTimestamp", 0));
        this.f12355l0 = f10.a();
    }

    public void a(m8 m8Var) throws SDKException {
        String str;
        super.a(m8Var);
        m8Var.a("placement", (Object) this.f12351h0.name(), true, true);
        m8Var.a("testMode", (Object) Boolean.toString(this.f12352i0), false, true);
        m8Var.a("gender", (Object) this.f12356m0, false, true);
        m8Var.a("keywords", (Object) this.f12357n0, false, true);
        m8Var.a("template", (Object) this.f12358o0, false, true);
        m8Var.a("adsNumber", (Object) Integer.toString(this.f12359p0), false, true);
        m8Var.a("category", this.A0, false, true);
        m8Var.a("categoryExclude", this.B0, false, true);
        m8Var.a("packageExclude", this.C0, false, true);
        m8Var.a("campaignExclude", this.E0, false, true);
        m8Var.a("offset", (Object) Integer.toString(this.f12369z0), false, true);
        m8Var.a("ai", (Object) this.N0, false, true);
        m8Var.a("as", (Object) this.O0, false, true);
        Double d10 = this.f12363t0;
        Map<Activity, Integer> map = wb.f12765a;
        Boolean bool = null;
        if (d10 != null) {
            str = String.format(Locale.US, "%.2f", new Object[]{d10});
        } else {
            str = null;
        }
        m8Var.a("minCPM", (Object) str, false, true);
        m8Var.a("adTag", (Object) this.f12364u0, false, true);
        m8Var.a("previousAdId", (Object) this.f12365v0, false, true);
        m8Var.a("twoClicks", (Object) Boolean.valueOf(!this.f12362s0), false, true);
        m8Var.a("engInclude", (Object) Boolean.toString(this.G0), false, true);
        Ad.AdType adType = this.S0;
        if (adType == Ad.AdType.INTERSTITIAL || adType == Ad.AdType.RICH_TEXT) {
            m8Var.a("type", (Object) adType, false, true);
        }
        m8Var.a("timeSinceSessionStart", (Object) Long.valueOf(this.H0), true, true);
        m8Var.a("adsDisplayed", (Object) Integer.valueOf(this.I0), true, true);
        m8Var.a("profileId", (Object) this.J0, false, true);
        m8Var.a("hardwareAccelerated", (Object) Boolean.valueOf(this.f12360q0), false, true);
        m8Var.a("autoLoadAmount", (Object) this.f12366w0, false, true);
        m8Var.a("dts", (Object) this.f12361r0, false, true);
        m8Var.a("downloadingMode", (Object) "CACHE", false, true);
        m8Var.a("primaryImg", (Object) this.K0, false, true);
        m8Var.a("moreImg", (Object) this.L0, false, true);
        m8Var.a("contentAd", (Object) Boolean.toString(this.M0), false, true);
        m8Var.a("ct", (Object) this.f12353j0, false, true);
        m8Var.a("tsc", (Object) this.f12354k0, false, true);
        m8Var.a("apc", (Object) this.f12355l0, false, true);
        Object obj = StartAppSDKInternal.D;
        if (StartAppSDKInternal.d.f12173a.C) {
            bool = Boolean.TRUE;
        }
        m8Var.a("testAdsEnabled", (Object) bool, false, true);
        String a10 = a.a();
        m8Var.a(a.f9999b, (Object) a10, true, true);
        String str2 = a.f10001d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f12839b);
        sb2.append(this.f12351h0.name());
        String str3 = this.Q;
        if (str3 == null) {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(this.f12841c);
        sb2.append(a10);
        m8Var.a(str2, (Object) a.a(sb2.toString()), true, false);
        m8Var.a("sound", (Object) Boolean.valueOf(this.f12368y0), false, true);
        String str4 = this.Q0;
        if (str4 != null) {
            m8Var.a("country", (Object) str4, false, true);
        }
        String str5 = this.R0;
        if (str5 != null) {
            m8Var.a("advertiserId", (Object) str5, false, true);
        }
        Set<String> set = this.D0;
        if (set != null) {
            m8Var.a("packageInclude", set, false, true);
        }
        m8Var.a("defaultMetaData", (Object) Boolean.valueOf(this.f12367x0), true, true);
        Pair<String, String> pair = this.F0;
        m8Var.a((String) pair.first, (Object) pair.second, false, true);
        String str6 = this.P0;
        if (str6 != null) {
            m8Var.a("trv", (Object) str6, false, false);
        }
    }
}
