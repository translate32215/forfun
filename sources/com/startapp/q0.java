package com.startapp;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;

/* compiled from: Sta */
public class q0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BannerListener f11615a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f11616b;

    public q0(BannerListener bannerListener, View view, Context context) {
        this.f11615a = bannerListener;
        this.f11616b = view;
    }

    public void run() {
        try {
            this.f11615a.onImpression(this.f11616b);
        } catch (Throwable th) {
            wb.a((Object) this.f11615a, th);
        }
    }
}
