package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import g7.c;
import h7.a;
import h7.d;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public interface CustomEventInterstitial extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, d dVar, String str, c cVar, Bundle bundle);

    void showInterstitial();
}
