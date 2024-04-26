package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.wb;

/* compiled from: Sta */
public class r2 implements wb.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f11650a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AdEventListener f11651b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ InterstitialAd f11652c;

    public r2(Context context, AdEventListener adEventListener, InterstitialAd interstitialAd) {
        this.f11650a = context;
        this.f11651b = adEventListener;
        this.f11652c = interstitialAd;
    }

    public void a(boolean z10, long j10, long j11, boolean z11) {
        j.b(this.f11650a, this.f11651b, this.f11652c, true);
    }

    public void a(int i10, String str) {
        j.b(this.f11650a, this.f11651b, this.f11652c, true);
    }
}
