package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import androidx.appcompat.widget.o;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ads.y2;
import g7.e;
import g7.f;
import g7.g;
import g7.k;
import h7.d;

@KeepName
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: d  reason: collision with root package name */
    public static final com.google.android.gms.ads.a f5714d = new com.google.android.gms.ads.a(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");

    /* renamed from: a  reason: collision with root package name */
    public CustomEventBanner f5715a;

    /* renamed from: b  reason: collision with root package name */
    public CustomEventInterstitial f5716b;

    /* renamed from: c  reason: collision with root package name */
    public CustomEventNative f5717c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    public class a implements d {
        public a(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, f fVar) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    public static final class b implements h7.b {
        public b(CustomEventAdapter customEventAdapter, e eVar) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    public static class c implements h7.e {
        public c(CustomEventAdapter customEventAdapter, g gVar) {
        }
    }

    public static <T> T a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb2 = new StringBuilder(o.a(message, o.a(str, 46)));
            sb2.append("Could not instantiate custom event adapter: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            l0.e.K(sb2.toString());
            return null;
        }
    }

    public final View getBannerView() {
        return null;
    }

    public final void onDestroy() {
        CustomEventBanner customEventBanner = this.f5715a;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f5716b;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f5717c;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    public final void onPause() {
        CustomEventBanner customEventBanner = this.f5715a;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f5716b;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f5717c;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    public final void onResume() {
        CustomEventBanner customEventBanner = this.f5715a;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f5716b;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f5717c;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    public final void requestBannerAd(Context context, e eVar, Bundle bundle, y6.d dVar, g7.c cVar, Bundle bundle2) {
        Bundle bundle3;
        CustomEventBanner customEventBanner = (CustomEventBanner) a(bundle.getString("class_name"));
        this.f5715a = customEventBanner;
        if (customEventBanner == null) {
            com.google.android.gms.ads.a aVar = f5714d;
            n2.g gVar = (n2.g) eVar;
            gVar.getClass();
            i.d("#008 Must be called on the main UI thread.");
            l0.e.E("Adapter called onAdFailedToLoad with error. ErrorCode: 0. ErrorMessage: Could not instantiate custom event adapter. ErrorDomain: com.google.android.gms.ads");
            try {
                ((y2) gVar.f21850a).U(aVar.a());
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        } else {
            if (bundle2 == null) {
                bundle3 = null;
            } else {
                bundle3 = bundle2.getBundle(bundle.getString("class_name"));
            }
            Context context2 = context;
            this.f5715a.requestBannerAd(context2, new b(this, eVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), dVar, cVar, bundle3);
        }
    }

    public final void requestInterstitialAd(Context context, f fVar, Bundle bundle, g7.c cVar, Bundle bundle2) {
        Bundle bundle3;
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(bundle.getString("class_name"));
        this.f5716b = customEventInterstitial;
        if (customEventInterstitial == null) {
            com.google.android.gms.ads.a aVar = f5714d;
            n2.g gVar = (n2.g) fVar;
            gVar.getClass();
            i.d("#008 Must be called on the main UI thread.");
            l0.e.E("Adapter called onAdFailedToLoad with error. ErrorCode: 0. ErrorMessage: Could not instantiate custom event adapter. ErrorDomain: com.google.android.gms.ads");
            try {
                ((y2) gVar.f21850a).U(aVar.a());
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        } else {
            if (bundle2 == null) {
                bundle3 = null;
            } else {
                bundle3 = bundle2.getBundle(bundle.getString("class_name"));
            }
            Context context2 = context;
            this.f5716b.requestInterstitialAd(context2, new a(this, this, fVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), cVar, bundle3);
        }
    }

    public final void requestNativeAd(Context context, g gVar, Bundle bundle, k kVar, Bundle bundle2) {
        Bundle bundle3;
        CustomEventNative customEventNative = (CustomEventNative) a(bundle.getString("class_name"));
        this.f5717c = customEventNative;
        if (customEventNative == null) {
            com.google.android.gms.ads.a aVar = f5714d;
            n2.g gVar2 = (n2.g) gVar;
            gVar2.getClass();
            i.d("#008 Must be called on the main UI thread.");
            l0.e.E("Adapter called onAdFailedToLoad with error. ErrorCode: 0. ErrorMessage: Could not instantiate custom event adapter. ErrorDomain: com.google.android.gms.ads");
            try {
                ((y2) gVar2.f21850a).U(aVar.a());
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        } else {
            if (bundle2 == null) {
                bundle3 = null;
            } else {
                bundle3 = bundle2.getBundle(bundle.getString("class_name"));
            }
            Context context2 = context;
            this.f5717c.requestNativeAd(context2, new c(this, gVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), kVar, bundle3);
        }
    }

    public final void showInterstitial() {
        this.f5716b.showInterstitial();
    }
}
