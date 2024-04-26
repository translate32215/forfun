package com.startapp.sdk.ads.splash;

import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.d;

/* compiled from: Sta */
public class c implements d.C0123d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen f11932a;

    public c(SplashScreen splashScreen) {
        this.f11932a = splashScreen;
    }

    public void a(Ad ad2, CacheKey cacheKey, boolean z10) {
        this.f11932a.f11912d.set(cacheKey);
        if (z10) {
            SplashScreen splashScreen = this.f11932a;
            SplashEventHandler splashEventHandler = splashScreen.f11910b;
            Runnable runnable = splashScreen.f11919k;
            if (splashEventHandler.f11895i == SplashEventHandler.SplashState.LOADING) {
                splashEventHandler.f11895i = SplashEventHandler.SplashState.RECEIVED;
            }
            splashEventHandler.a(runnable);
            return;
        }
        SplashScreen splashScreen2 = this.f11932a;
        if (splashScreen2.f11916h != null) {
            SplashEventHandler splashEventHandler2 = splashScreen2.f11910b;
            splashEventHandler2.f11895i = SplashEventHandler.SplashState.DO_NOT_DISPLAY;
            splashEventHandler2.a((Runnable) null);
        }
    }
}
