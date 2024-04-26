package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class n3 extends t0 {
    public n3(Context context, HtmlAd htmlAd, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, htmlAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OVERLAY, true);
    }

    public void a(boolean z10) {
        super.a(z10);
        c(z10);
    }
}
