package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.a;
import j4.b;
import j4.c;
import j4.f;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends f, SERVER_PARAMETERS extends a> extends b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    /* synthetic */ void destroy();

    /* synthetic */ Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    View getBannerView();

    /* synthetic */ Class<SERVER_PARAMETERS> getServerParametersType();

    void requestBannerAd(c cVar, Activity activity, SERVER_PARAMETERS server_parameters, i4.c cVar2, j4.a aVar, ADDITIONAL_PARAMETERS additional_parameters);
}
