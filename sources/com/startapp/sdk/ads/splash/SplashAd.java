package com.startapp.sdk.ads.splash;

import android.content.Context;
import com.startapp.q3;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class SplashAd extends InterstitialAd {
    private static final long serialVersionUID = 1;

    public SplashAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_OVERLAY);
    }

    public void a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new q3(this.f12085a, this, adPreferences, adEventListener).c();
    }

    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener) {
        super.load(adPreferences, adEventListener, false);
    }
}
