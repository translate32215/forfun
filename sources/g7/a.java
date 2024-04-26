package g7;

import android.content.Context;
import androidx.appcompat.widget.m;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.f;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class a {
    public abstract o getSDKVersionInfo();

    public abstract o getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<m> list);

    public void loadBannerAd(c cVar, b<Object, Object> bVar) {
        bVar.b(getClass().getSimpleName().concat(" does not support banner ads."));
    }

    public void loadInterstitialAd(d dVar, b<Object, Object> bVar) {
        bVar.b(getClass().getSimpleName().concat(" does not support interstitial ads."));
    }

    public void loadNativeAd(e eVar, b<n, Object> bVar) {
        bVar.b(getClass().getSimpleName().concat(" does not support native ads."));
    }

    public void loadRewardedAd(f fVar, b<Object, Object> bVar) {
        bVar.b(getClass().getSimpleName().concat(" does not support rewarded ads."));
    }

    public void loadRewardedInterstitialAd(f fVar, b<Object, Object> bVar) {
        bVar.b(getClass().getSimpleName().concat(" does not support rewarded interstitial ads."));
    }
}
