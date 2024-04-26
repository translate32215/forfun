package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.pv;
import com.startapp.sdk.adsbase.model.AdPreferences;
import e8.ta0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class nd implements ta0<pv.a> {

    /* renamed from: a  reason: collision with root package name */
    public final md f7572a;

    public nd(md mdVar) {
        this.f7572a = mdVar;
    }

    public final Object get() {
        String str = this.f7572a.f7477a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c10 = 1;
                    break;
                }
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1951953708:
                if (str.equals(AdPreferences.TYPE_BANNER)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return pv.a.AD_LOADER;
            case 1:
                return pv.a.INTERSTITIAL;
            case 2:
                return pv.a.REWARD_BASED_VIDEO_AD;
            case 3:
                return pv.a.BANNER;
            default:
                return pv.a.AD_INITIATER_UNSPECIFIED;
        }
    }
}
