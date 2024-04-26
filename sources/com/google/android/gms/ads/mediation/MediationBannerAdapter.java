package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import g7.c;
import g7.d;
import g7.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public interface MediationBannerAdapter extends d {
    View getBannerView();

    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, e eVar, Bundle bundle, y6.d dVar, c cVar, Bundle bundle2);
}
