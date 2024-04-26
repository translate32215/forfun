package com.startapp.sdk.ads.interstitials;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.activity.e;
import com.startapp.b1;
import com.startapp.e2;
import com.startapp.i4;
import com.startapp.sdk.ads.splash.SplashAd;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.a;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.d;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.wb;
import java.util.Map;

/* compiled from: Sta */
public abstract class InterstitialAd extends HtmlAd implements d {
    private static final long serialVersionUID = -8158520010577551438L;

    public InterstitialAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [java.lang.Boolean[], java.io.Serializable] */
    @Deprecated
    public boolean a(String str) {
        String a10 = a.a();
        if (!u() || !AdsCommonMetaData.f12098h.G().a().equals(VideoConfig.BackMode.DISABLED) || !a10.equals("back")) {
            if (!AdsConstants.f12104f.booleanValue()) {
                setState(Ad.AdState.UN_INITIALIZED);
            }
            if (j() == null) {
                a(NotDisplayedReason.INTERNAL_ERROR);
                return false;
            } else if (super.d()) {
                a(NotDisplayedReason.AD_EXPIRED);
                return false;
            } else {
                ActivityExtra activityExtra = this.activityExtra;
                boolean z10 = activityExtra != null && activityExtra.a();
                Intent intent = new Intent(this.f12085a, OverlayActivity.class);
                intent.putExtra("fileUrl", "exit.html");
                String[] strArr = this.trackingUrls;
                StringBuilder a11 = b1.a("&position=");
                a11.append(a.a());
                String sb2 = a11.toString();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    if (strArr[i10] != null && !"".equals(strArr[i10])) {
                        strArr[i10] = e.a(new StringBuilder(), strArr[i10], sb2);
                    }
                }
                intent.putExtra("tracking", strArr);
                intent.putExtra("trackingClickUrl", o());
                intent.putExtra("packageNames", m());
                intent.putExtra("htmlUuid", k());
                intent.putExtra("smartRedirect", this.smartRedirect);
                intent.putExtra("browserEnabled", this.inAppBrowserEnabled);
                intent.putExtra("placement", this.placement.a());
                intent.putExtra("adInfoOverride", getAdInfoOverride());
                intent.putExtra("ad", this);
                intent.putExtra("videoAd", u());
                intent.putExtra("fullscreen", z10);
                intent.putExtra("orientation", l() == 0 ? this.f12085a.getResources().getConfiguration().orientation : l());
                intent.putExtra("adTag", str);
                intent.putExtra("lastLoadTime", super.b());
                intent.putExtra("adCacheTtl", super.c());
                intent.putExtra("closingUrl", g());
                intent.putExtra("rewardDuration", n());
                intent.putExtra("rewardedHideTimer", s());
                if (h() != null) {
                    intent.putExtra("delayImpressionSeconds", h());
                }
                intent.putExtra("sendRedirectHops", t());
                intent.putExtra("mraidAd", r());
                if (r()) {
                    intent.putExtra("activityShouldLockOrientation", false);
                }
                Map<Activity, Integer> map = wb.f12765a;
                if (this instanceof SplashAd) {
                    intent.putExtra("isSplash", true);
                }
                intent.putExtra("position", a10);
                intent.addFlags(343932928);
                e2 f10 = ComponentLocator.a(this.f12085a).f();
                if (f10.f10320d) {
                    f10.f10319c = intent;
                } else {
                    try {
                        this.f12085a.startActivity(intent);
                    } catch (Throwable th) {
                        i4.a(th);
                        return false;
                    }
                }
                return true;
            }
        } else {
            a(NotDisplayedReason.VIDEO_BACK);
            return false;
        }
    }

    public Long b() {
        return super.b();
    }

    public Long c() {
        return super.c();
    }

    public boolean d() {
        return super.d();
    }

    public boolean u() {
        return false;
    }

    public boolean a() {
        return super.a();
    }

    public void a(boolean z10) {
        super.a(z10);
    }
}
