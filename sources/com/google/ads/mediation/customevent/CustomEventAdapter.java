package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.os.RemoteException;
import android.view.View;
import androidx.appcompat.widget.o;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.y2;
import e7.i;
import e8.ti0;
import e8.y8;
import f7.j0;
import h7.c;
import j4.d;
import l0.e;

@KeepName
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class CustomEventAdapter implements MediationBannerAdapter<c, k4.c>, MediationInterstitialAdapter<c, k4.c> {

    /* renamed from: a  reason: collision with root package name */
    public CustomEventBanner f5004a;

    /* renamed from: b  reason: collision with root package name */
    public CustomEventInterstitial f5005b;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    public static final class a implements k4.a {
        public a(CustomEventAdapter customEventAdapter, j4.c cVar) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    public class b implements k4.b {
        public b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, d dVar) {
        }
    }

    public static <T> T a(String str) {
        try {
            return Class.forName((String) null).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb2 = new StringBuilder(o.a(message, "null".length() + 46));
            sb2.append("Could not instantiate custom event adapter: ");
            sb2.append((String) null);
            sb2.append(". ");
            sb2.append(message);
            e.K(sb2.toString());
            return null;
        }
    }

    public final void destroy() {
        CustomEventBanner customEventBanner = this.f5004a;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f5005b;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    public final Class<c> getAdditionalParametersType() {
        return c.class;
    }

    public final View getBannerView() {
        return null;
    }

    public final Class<k4.c> getServerParametersType() {
        return k4.c.class;
    }

    public final void requestBannerAd(j4.c cVar, Activity activity, k4.c cVar2, i4.c cVar3, j4.a aVar, c cVar4) {
        cVar2.getClass();
        Object obj = null;
        CustomEventBanner customEventBanner = (CustomEventBanner) a((String) null);
        this.f5004a = customEventBanner;
        if (customEventBanner == null) {
            i4.a aVar2 = i4.a.INTERNAL_ERROR;
            ri riVar = (ri) cVar;
            riVar.getClass();
            String valueOf = String.valueOf(aVar2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
            sb2.append("Adapter called onFailedToReceiveAd with error. ");
            sb2.append(valueOf);
            e.E(sb2.toString());
            y8 y8Var = ti0.f16763j.f16764a;
            if (!y8.l()) {
                e.F("#008 Must be called on the main UI thread.", (Throwable) null);
                y8.f17578b.post(new j0(riVar, aVar2));
                return;
            }
            try {
                ((y2) riVar.f8042b).h0(e.e.e(aVar2));
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        } else {
            if (cVar4 != null) {
                obj = cVar4.f18966a.get((Object) null);
            }
            this.f5004a.requestBannerAd(new a(this, cVar), activity, (String) null, (String) null, cVar3, aVar, obj);
        }
    }

    public final void requestInterstitialAd(d dVar, Activity activity, k4.c cVar, j4.a aVar, c cVar2) {
        cVar.getClass();
        Object obj = null;
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a((String) null);
        this.f5005b = customEventInterstitial;
        if (customEventInterstitial == null) {
            i4.a aVar2 = i4.a.INTERNAL_ERROR;
            ri riVar = (ri) dVar;
            riVar.getClass();
            String valueOf = String.valueOf(aVar2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
            sb2.append("Adapter called onFailedToReceiveAd with error ");
            sb2.append(valueOf);
            sb2.append(".");
            e.E(sb2.toString());
            y8 y8Var = ti0.f16763j.f16764a;
            if (!y8.l()) {
                e.F("#008 Must be called on the main UI thread.", (Throwable) null);
                y8.f17578b.post(new i(riVar, aVar2));
                return;
            }
            try {
                ((y2) riVar.f8042b).h0(e.e.e(aVar2));
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        } else {
            if (cVar2 != null) {
                obj = cVar2.f18966a.get((Object) null);
            }
            this.f5005b.requestInterstitialAd(new b(this, this, dVar), activity, (String) null, (String) null, aVar, obj);
        }
    }

    public final void showInterstitial() {
        this.f5005b.showInterstitial();
    }
}
