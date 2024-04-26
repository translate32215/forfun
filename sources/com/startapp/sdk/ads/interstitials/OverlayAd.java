package com.startapp.sdk.ads.interstitials;

import android.content.Context;
import com.startapp.n3;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class OverlayAd extends InterstitialAd {
    private static final long serialVersionUID = 1;

    public OverlayAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_OVERLAY);
    }

    public void a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new n3(this.f12085a, this, adPreferences, adEventListener).c();
    }
}
