package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import l7.a;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public interface InitializableMediationRewardedVideoAdAdapter extends MediationRewardedVideoAdAdapter {
    void initialize(Context context, a aVar, List<Bundle> list);

    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();
}
