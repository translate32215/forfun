package com.startapp.sdk.ads.splash;

import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.ads.splash.SplashScreen;

/* compiled from: Sta */
public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen f11935a;

    public f(SplashScreen splashScreen) {
        this.f11935a = splashScreen;
    }

    public void run() {
        SplashScreen splashScreen = this.f11935a;
        SplashEventHandler splashEventHandler = splashScreen.f11910b;
        SplashScreen.SplashStartAppAd splashStartAppAd = splashScreen.f11916h;
        if (splashEventHandler.f11895i == SplashEventHandler.SplashState.DISPLAYED && !splashEventHandler.f11892f) {
            splashStartAppAd.close();
            splashEventHandler.f11895i = SplashEventHandler.SplashState.HIDDEN;
            splashEventHandler.b();
        }
    }
}
