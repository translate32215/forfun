package y6;

import android.content.Context;
import com.google.android.gms.ads.e;
import com.google.android.gms.common.internal.i;
import e8.bj0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class f extends g {
    public f(Context context) {
        super(context, 0);
        i.i(context, "Context cannot be null");
    }

    public final /* bridge */ /* synthetic */ a getAdListener() {
        return super.getAdListener();
    }

    public final /* bridge */ /* synthetic */ d getAdSize() {
        return super.getAdSize();
    }

    public final /* bridge */ /* synthetic */ String getAdUnitId() {
        return super.getAdUnitId();
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ String getMediationAdapterClassName() {
        return super.getMediationAdapterClassName();
    }

    public final /* bridge */ /* synthetic */ e getResponseInfo() {
        return super.getResponseInfo();
    }

    public final com.google.android.gms.ads.f getVideoController() {
        bj0 bj0 = this.f28125a;
        if (bj0 != null) {
            return bj0.f14022b;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void setAdListener(a aVar) {
        super.setAdListener(aVar);
    }

    public final /* bridge */ /* synthetic */ void setAdSize(d dVar) {
        super.setAdSize(dVar);
    }

    public final /* bridge */ /* synthetic */ void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }

    public final /* bridge */ /* synthetic */ void setOnPaidEventListener(k kVar) {
        super.setOnPaidEventListener(kVar);
    }
}
