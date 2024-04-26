package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import g7.d;
import g7.g;
import g7.k;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public interface MediationNativeAdapter extends d {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, g gVar, Bundle bundle, k kVar, Bundle bundle2);
}
