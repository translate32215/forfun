package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import g7.c;
import g7.d;
import l7.a;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public interface MediationRewardedVideoAdAdapter extends d {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    void initialize(Context context, c cVar, String str, a aVar, Bundle bundle, Bundle bundle2);

    boolean isInitialized();

    void loadAd(c cVar, Bundle bundle, Bundle bundle2);

    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void showVideo();
}
