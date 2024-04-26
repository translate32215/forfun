package com.startapp.sdk.ads.splash;

import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.cache.CacheKey;

/* compiled from: Sta */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f11925a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CacheKey f11926b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SplashEventHandler f11927c;

    public a(SplashEventHandler splashEventHandler, Runnable runnable, CacheKey cacheKey) {
        this.f11927c = splashEventHandler;
        this.f11925a = runnable;
        this.f11926b = cacheKey;
    }

    public void run() {
        SplashEventHandler splashEventHandler = this.f11927c;
        splashEventHandler.f11894h = true;
        if (splashEventHandler.f11895i != SplashEventHandler.SplashState.DO_NOT_DISPLAY) {
            splashEventHandler.a(this.f11925a, this.f11926b);
        }
    }
}
