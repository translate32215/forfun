package com.startapp.sdk.ads.video;

import android.app.Activity;
import android.content.Context;
import com.startapp.m8;
import com.startapp.sdk.ads.video.VideoUtil;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.wb;
import java.util.Map;

/* compiled from: Sta */
public class a extends GetAdRequest {
    public GetAdRequest.VideoRequestType T0;
    public GetAdRequest.VideoRequestMode U0 = GetAdRequest.VideoRequestMode.INTERSTITIAL;

    public void a(Context context, AdPreferences adPreferences, AdPreferences.Placement placement, Pair<String, String> pair) {
        super.a(context, adPreferences, placement, pair);
        Ad.AdType adType = this.S0;
        if (adType != null) {
            if (adType == Ad.AdType.NON_VIDEO) {
                this.T0 = GetAdRequest.VideoRequestType.DISABLED;
            } else if (adType == Ad.AdType.VIDEO_NO_VAST) {
                this.T0 = GetAdRequest.VideoRequestType.FORCED_NONVAST;
            } else if (b()) {
                this.T0 = GetAdRequest.VideoRequestType.FORCED;
            }
        } else if (VideoUtil.a(context) == VideoUtil.VideoEligibility.ELIGIBLE) {
            Map<Activity, Integer> map = wb.f12765a;
            this.T0 = GetAdRequest.VideoRequestType.ENABLED;
        } else {
            this.T0 = GetAdRequest.VideoRequestType.DISABLED;
        }
        Ad.AdType adType2 = this.S0;
        if (adType2 == Ad.AdType.REWARDED_VIDEO) {
            this.U0 = GetAdRequest.VideoRequestMode.REWARDED;
        }
        if (adType2 == Ad.AdType.VIDEO) {
            this.U0 = GetAdRequest.VideoRequestMode.INTERSTITIAL;
        }
    }

    public void a(m8 m8Var) throws SDKException {
        super.a(m8Var);
        m8Var.a("video", (Object) this.T0, false, true);
        m8Var.a("videoMode", (Object) this.U0, false, true);
    }
}
