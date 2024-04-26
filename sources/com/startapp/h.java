package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* compiled from: Sta */
public class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f10485a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Ad f10486b;

    public h(AdDisplayListener adDisplayListener, Ad ad2, Context context) {
        this.f10485a = adDisplayListener;
        this.f10486b = ad2;
    }

    public void run() {
        try {
            this.f10485a.adClicked(this.f10486b);
        } catch (Throwable th) {
            wb.a((Object) this.f10485a, th);
        }
    }
}
