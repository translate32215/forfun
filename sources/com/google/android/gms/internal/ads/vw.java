package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.pv;
import com.startapp.b4;
import e8.z70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class vw implements z70 {

    /* renamed from: a  reason: collision with root package name */
    public static final z70 f8417a = new vw();

    public final boolean a(int i10) {
        pv.a aVar;
        switch (i10) {
            case 0:
                aVar = pv.a.AD_INITIATER_UNSPECIFIED;
                break;
            case 1:
                aVar = pv.a.BANNER;
                break;
            case 2:
                aVar = pv.a.DFP_BANNER;
                break;
            case 3:
                aVar = pv.a.INTERSTITIAL;
                break;
            case 4:
                aVar = pv.a.DFP_INTERSTITIAL;
                break;
            case 5:
                aVar = pv.a.NATIVE_EXPRESS;
                break;
            case 6:
                aVar = pv.a.AD_LOADER;
                break;
            case 7:
                aVar = pv.a.REWARD_BASED_VIDEO_AD;
                break;
            case b4.f10106f /*8*/:
                aVar = pv.a.BANNER_SEARCH_ADS;
                break;
            case 9:
                aVar = pv.a.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                break;
            case 10:
                aVar = pv.a.APP_OPEN;
                break;
            default:
                aVar = null;
                break;
        }
        return aVar != null;
    }
}
