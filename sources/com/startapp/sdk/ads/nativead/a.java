package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.u0;

/* compiled from: Sta */
public class a extends u0 {

    /* renamed from: i  reason: collision with root package name */
    public NativeAdPreferences f11878i;

    public a(Context context, Ad ad2, AdPreferences adPreferences, AdEventListener adEventListener, NativeAdPreferences nativeAdPreferences) {
        super(context, ad2, adPreferences, adEventListener, AdPreferences.Placement.INAPP_NATIVE);
        this.f11878i = nativeAdPreferences;
    }

    public void a(Ad ad2) {
    }

    public GetAdRequest d() {
        GetAdRequest d10 = super.d();
        if (d10 == null) {
            return null;
        }
        d10.f12359p0 = this.f11878i.getAdsNumber();
        if (this.f11878i.getImageSize() != null) {
            d10.L = this.f11878i.getImageSize().getWidth();
            d10.M = this.f11878i.getImageSize().getHeight();
        } else {
            int primaryImageSize = this.f11878i.getPrimaryImageSize();
            int i10 = 2;
            if (primaryImageSize == -1) {
                primaryImageSize = 2;
            }
            d10.K0 = Integer.toString(primaryImageSize);
            int secondaryImageSize = this.f11878i.getSecondaryImageSize();
            if (secondaryImageSize != -1) {
                i10 = secondaryImageSize;
            }
            d10.L0 = Integer.toString(i10);
        }
        if (this.f11878i.isContentAd()) {
            d10.M0 = this.f11878i.isContentAd();
        }
        return d10;
    }
}
