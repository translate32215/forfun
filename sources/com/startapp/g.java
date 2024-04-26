package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* compiled from: Sta */
public class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f10410a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Ad f10411b;

    public g(AdDisplayListener adDisplayListener, Ad ad2, Context context) {
        this.f10410a = adDisplayListener;
        this.f10411b = ad2;
    }

    public void run() {
        try {
            this.f10410a.adDisplayed(this.f10411b);
        } catch (Throwable th) {
            wb.a((Object) this.f10410a, th);
        }
    }
}
