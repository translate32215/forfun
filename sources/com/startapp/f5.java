package com.startapp;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.c;

/* compiled from: Sta */
public class f5 implements AdEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f10374a;

    public f5(c cVar) {
        this.f10374a = cVar;
    }

    public void onFailedToReceiveAd(Ad ad2) {
    }

    public void onReceiveAd(Ad ad2) {
        if (this.f10374a.f12242e.showAd()) {
            c cVar = this.f10374a;
            cVar.getClass();
            cVar.f12240c = System.currentTimeMillis();
            cVar.f12241d = 0;
        }
    }
}
