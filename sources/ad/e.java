package ad;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.k;
import com.startapp.sdk.ads.banner.BannerListener;

/* compiled from: AdUtil.kt */
public final class e implements BannerListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f268a;

    public e(ViewGroup viewGroup) {
        this.f268a = viewGroup;
    }

    public void onClick(View view) {
    }

    public void onFailedToReceiveAd(View view) {
    }

    public void onImpression(View view) {
    }

    public void onReceiveAd(View view) {
        k.c(this.f268a);
    }
}
