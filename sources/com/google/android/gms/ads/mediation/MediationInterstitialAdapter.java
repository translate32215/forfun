package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import g7.c;
import g7.d;
import g7.f;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public interface MediationInterstitialAdapter extends d {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, f fVar, Bundle bundle, c cVar, Bundle bundle2);

    void showInterstitial();
}
