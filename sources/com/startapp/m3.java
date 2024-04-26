package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.offerWall.offerWallJson.OfferWall3DAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class m3 extends u0 {
    public m3(Context context, OfferWall3DAd offerWall3DAd, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, offerWall3DAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OFFER_WALL);
    }

    public void a(Ad ad2) {
        OfferWall3DAd offerWall3DAd = (OfferWall3DAd) ad2;
        List<AdDetails> g10 = offerWall3DAd.g();
        y5 a10 = z5.f12916b.a(offerWall3DAd.h());
        a10.getClass();
        a10.f12876b = new ArrayList();
        a10.f12877c = "";
        if (g10 != null) {
            for (AdDetails a11 : g10) {
                a10.a(a11);
            }
        }
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
