package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.banner3d.Banner3DAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;

/* compiled from: Sta */
public class h3 extends u0 {

    /* renamed from: i  reason: collision with root package name */
    public int f10489i = 0;

    public h3(Context context, Banner3DAd banner3DAd, int i10, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, banner3DAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER);
        this.f10489i = i10;
    }

    public void a(Ad ad2) {
    }

    public GetAdRequest d() {
        n0 n0Var = new n0();
        a((GetAdRequest) n0Var);
        n0Var.f12359p0 = BannerMetaData.f11748b.a().a();
        n0Var.f12369z0 = this.f10489i;
        n0Var.T0 = ((Banner3DAd) this.f12232b).i();
        n0Var.f(this.f12231a);
        return n0Var;
    }
}
