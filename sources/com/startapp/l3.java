package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.offerWall.offerWallHtml.OfferWallAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;

/* compiled from: Sta */
public class l3 extends t0 {
    public l3(Context context, OfferWallAd offerWallAd, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, offerWallAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OFFER_WALL, true);
    }

    public void a(boolean z10) {
        super.a(z10);
        c(z10);
    }

    public GetAdRequest d() {
        GetAdRequest d10 = super.d();
        if (d10 == null) {
            return null;
        }
        d10.f12359p0 = AdsCommonMetaData.f12098h.t();
        return d10;
    }
}
