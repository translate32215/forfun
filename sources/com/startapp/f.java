package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* compiled from: Sta */
public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f10339a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Ad f10340b;

    public f(AdDisplayListener adDisplayListener, Ad ad2, Context context) {
        this.f10339a = adDisplayListener;
        this.f10340b = ad2;
    }

    public void run() {
        try {
            this.f10339a.adHidden(this.f10340b);
        } catch (Throwable th) {
            wb.a((Object) this.f10339a, th);
        }
    }
}
