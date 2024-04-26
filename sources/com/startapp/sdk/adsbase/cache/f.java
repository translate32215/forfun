package com.startapp.sdk.adsbase.cache;

import com.startapp.j;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.h;

/* compiled from: Sta */
public class f implements AdEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h.a f12269a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f12270b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f12271c;

    public f(h hVar, h.a aVar, boolean z10) {
        this.f12271c = hVar;
        this.f12269a = aVar;
        this.f12270b = z10;
    }

    public void onFailedToReceiveAd(Ad ad2) {
        h hVar = this.f12271c;
        hVar.f12277e = null;
        hVar.a(this.f12270b);
    }

    public void onReceiveAd(Ad ad2) {
        j.b(this.f12271c.f12274b, this.f12269a, ad2, true);
    }
}
