package com.startapp.sdk.ads.video;

import android.content.Context;
import com.startapp.k5;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.wb;
import com.startapp.yb;

/* compiled from: Sta */
public class VideoEnabledAd extends InterstitialAd {
    private static final long serialVersionUID = 1;
    private VideoAdDetails videoAdDetails = null;

    public VideoEnabledAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
    }

    public void a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new b(this.f12085a, this, adPreferences, adEventListener, this.placement).c();
    }

    public void c(String str) {
        super.c(str);
        String a10 = wb.a(str, "@videoJson@", "@videoJson@");
        if (a10 != null) {
            VideoAdDetails videoAdDetails2 = (VideoAdDetails) k5.a(a10, VideoAdDetails.class);
            this.videoAdDetails = videoAdDetails2;
            if (videoAdDetails2 != null) {
                videoAdDetails2.o();
            }
        }
    }

    public boolean u() {
        return this.videoAdDetails != null;
    }

    public void v() {
        this.videoAdDetails = null;
    }

    public VideoAdDetails w() {
        return this.videoAdDetails;
    }

    public void a(yb ybVar, VideoConfig videoConfig, boolean z10) {
        this.videoAdDetails = new VideoAdDetails(ybVar, videoConfig, z10);
        Integer num = ybVar.f12899q;
        if (num != null && ybVar.f12900r != null) {
            if (num.intValue() > ybVar.f12900r.intValue()) {
                a(SplashConfig.Orientation.LANDSCAPE);
            } else {
                a(SplashConfig.Orientation.PORTRAIT);
            }
        }
    }
}
