package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import g7.c;
import h7.a;
import h7.b;
import y6.d;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public interface CustomEventBanner extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, b bVar, String str, d dVar, c cVar, Bundle bundle);
}
