package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.startapp.b1;
import com.startapp.d;
import com.startapp.e;
import com.startapp.j;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Sta */
public class StartAppNativeAd extends Ad {
    private static final long serialVersionUID = 1;
    private b adEventDelegate;
    public boolean isLoading = false;
    private List<NativeAdDetails> listNativeAds = new ArrayList();
    private NativeAd nativeAd;
    private NativeAdPreferences preferences;

    /* compiled from: Sta */
    public enum CampaignAction {
        LAUNCH_APP,
        OPEN_MARKET
    }

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public int f11873a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f11874b;

        public a(int i10) {
            this.f11874b = i10;
        }

        public void run() {
            int i10 = this.f11873a + 1;
            this.f11873a = i10;
            if (i10 == this.f11874b) {
                StartAppNativeAd.this.i();
            }
        }
    }

    /* compiled from: Sta */
    public class b implements AdEventListener {

        /* renamed from: a  reason: collision with root package name */
        public AdEventListener f11876a;

        public b(AdEventListener adEventListener) {
            this.f11876a = adEventListener;
        }

        public void onFailedToReceiveAd(Ad ad2) {
            if (ad2 != null) {
                StartAppNativeAd.this.setErrorMessage(ad2.getErrorMessage());
            }
            AdEventListener adEventListener = this.f11876a;
            if (adEventListener != null) {
                StartAppNativeAd startAppNativeAd = StartAppNativeAd.this;
                j.a(startAppNativeAd.f12085a, adEventListener, startAppNativeAd, false);
                this.f11876a = null;
            }
            StartAppNativeAd.this.isLoading = false;
        }

        public void onReceiveAd(Ad ad2) {
            StartAppNativeAd.this.h();
        }
    }

    public StartAppNativeAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_NATIVE);
    }

    public static String getPrivacyImageUrl() {
        return AdInformationMetaData.f12183a.c();
    }

    public static String getPrivacyURL() {
        if (AdInformationMetaData.f12183a.b() == null) {
            return "";
        }
        String b10 = AdInformationMetaData.f12183a.b();
        if (b10.contains("http://") || b10.contains("https://")) {
            return AdInformationMetaData.f12183a.b();
        }
        StringBuilder a10 = b1.a("https://");
        a10.append(AdInformationMetaData.f12183a.b());
        return a10.toString();
    }

    public void a(AdPreferences adPreferences, AdEventListener adEventListener) {
    }

    public final AdDetails g() {
        NativeAdDetails nativeAdDetails;
        if (this.listNativeAds.size() <= 0 || (nativeAdDetails = this.listNativeAds.get(0)) == null) {
            return null;
        }
        return nativeAdDetails.f11853a;
    }

    public String getAdId() {
        AdDetails g10 = g();
        if (g10 != null) {
            return g10.a();
        }
        return null;
    }

    public String getBidToken() {
        AdDetails g10 = g();
        if (g10 != null) {
            return g10.d();
        }
        return null;
    }

    public ArrayList<NativeAdDetails> getNativeAds() {
        return getNativeAds((String) null);
    }

    public int getNumberOfAds() {
        return this.listNativeAds.size();
    }

    public void h() {
        List<AdDetails> g10;
        int size;
        NativeAd nativeAd2 = this.nativeAd;
        if (nativeAd2 == null || (g10 = nativeAd2.g()) == null || (size = g10.size()) <= 0) {
            i();
            return;
        }
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new NativeAdDetails(g10.get(i10)));
        }
        this.listNativeAds = arrayList;
        NativeAdPreferences nativeAdPreferences = this.preferences;
        if (nativeAdPreferences == null || !nativeAdPreferences.isAutoBitmapDownload()) {
            i();
            return;
        }
        a aVar = new a(size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((NativeAdDetails) it.next()).loadImages(this.f12085a, aVar);
        }
    }

    public final void i() {
        this.isLoading = false;
        setErrorMessage((String) null);
        b bVar = this.adEventDelegate;
        if (bVar != null) {
            j.b(this.f12085a, bVar.f11876a, this, false);
        }
    }

    public boolean isBelowMinCPM() {
        return this.nativeAd.isBelowMinCPM();
    }

    public boolean loadAd() {
        return loadAd(new NativeAdPreferences(), (AdEventListener) null);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("\n===== StartAppNativeAd =====\n");
        for (int i10 = 0; i10 < getNumberOfAds(); i10++) {
            a10.append(this.listNativeAds.get(i10));
        }
        a10.append("===== End StartAppNativeAd =====");
        return a10.toString();
    }

    public ArrayList<NativeAdDetails> getNativeAds(String str) {
        ArrayList<NativeAdDetails> arrayList = new ArrayList<>();
        AdRulesResult a10 = AdaptMetaData.f12230a.a().a(AdPreferences.Placement.INAPP_NATIVE, str);
        if (a10.b()) {
            for (NativeAdDetails next : this.listNativeAds) {
                next.f11858f = str;
                arrayList.add(next);
            }
            e.f10308d.a(new d(AdPreferences.Placement.INAPP_NATIVE, str));
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (NativeAdDetails nativeAdDetails : this.listNativeAds) {
                arrayList2.add(nativeAdDetails.f11853a);
            }
            com.startapp.sdk.adsbase.a.a(com.startapp.sdk.adsbase.a.a((List<AdDetails>) arrayList2), str, 0, a10.a());
        }
        return arrayList;
    }

    public boolean loadAd(AdEventListener adEventListener) {
        return loadAd(new NativeAdPreferences(), adEventListener);
    }

    public boolean loadAd(NativeAdPreferences nativeAdPreferences) {
        return loadAd(nativeAdPreferences, (AdEventListener) null);
    }

    public boolean loadAd(NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        this.adEventDelegate = new b(adEventListener);
        this.preferences = nativeAdPreferences;
        if (this.isLoading) {
            setErrorMessage("Ad is currently being loaded");
            return false;
        }
        this.isLoading = true;
        NativeAd nativeAd2 = new NativeAd(this.f12085a, nativeAdPreferences);
        this.nativeAd = nativeAd2;
        return nativeAd2.load(nativeAdPreferences, this.adEventDelegate, true);
    }
}
