package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;

/* compiled from: Sta */
public class i3 extends t0 {

    /* renamed from: m  reason: collision with root package name */
    public int f10533m = 0;

    public i3(Context context, HtmlAd htmlAd, int i10, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, htmlAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER, false);
        this.f10533m = i10;
    }

    public void a(boolean z10) {
        super.a(z10);
        c(z10);
    }

    public GetAdRequest d() {
        BannerStandardAd bannerStandardAd = (BannerStandardAd) this.f12232b;
        n0 n0Var = new n0();
        a((GetAdRequest) n0Var);
        n0Var.L = bannerStandardAd.p();
        n0Var.M = bannerStandardAd.i();
        n0Var.f12369z0 = this.f10533m;
        n0Var.f12359p0 = BannerMetaData.f11748b.a().f();
        n0Var.T0 = bannerStandardAd.w();
        n0Var.U0 = bannerStandardAd.u();
        n0Var.f(this.f12231a);
        return n0Var;
    }
}
