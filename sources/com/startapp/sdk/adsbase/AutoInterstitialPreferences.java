package com.startapp.sdk.adsbase;

import com.startapp.b1;
import java.io.Serializable;
import v.e;

/* compiled from: Sta */
public class AutoInterstitialPreferences implements Serializable {
    private static final long serialVersionUID = 1;
    private int activitiesBetweenAds;
    private int secondsBetweenAds;

    public AutoInterstitialPreferences() {
        setActivitiesBetweenAds(AdsCommonMetaData.k().f());
        setSecondsBetweenAds(AdsCommonMetaData.k().g());
    }

    public int getActivitiesBetweenAds() {
        return this.activitiesBetweenAds;
    }

    public int getSecondsBetweenAds() {
        return this.secondsBetweenAds;
    }

    public AutoInterstitialPreferences setActivitiesBetweenAds(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.activitiesBetweenAds = i10;
        return this;
    }

    public AutoInterstitialPreferences setSecondsBetweenAds(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.secondsBetweenAds = i10;
        return this;
    }

    public String toString() {
        StringBuilder a10 = b1.a("AutoInterstitialPreferences [activitiesBetweenAds=");
        a10.append(this.activitiesBetweenAds);
        a10.append(", secondsBetweenAds=");
        return e.a(a10, this.secondsBetweenAds, "]");
    }
}
