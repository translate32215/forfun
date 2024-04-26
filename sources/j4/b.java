package j4;

import com.google.ads.mediation.a;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public interface b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends a> {
    void destroy();

    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    Class<SERVER_PARAMETERS> getServerParametersType();
}
