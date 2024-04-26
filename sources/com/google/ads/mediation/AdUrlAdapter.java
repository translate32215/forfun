package com.google.ads.mediation;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

@Keep
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class AdUrlAdapter extends AbstractAdViewAdapter implements MediationInterstitialAdapter {
    public final String getAdUnitId(Bundle bundle) {
        return "adurl";
    }

    public final Bundle zza(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBundle("sdk_less_server_data", bundle2);
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}
