package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import g7.k;
import h7.a;
import h7.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public interface CustomEventNative extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, e eVar, String str, k kVar, Bundle bundle);
}
