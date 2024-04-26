package com.startapp.sdk.ads.splash;

import com.startapp.da;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.adsbase.remoteconfig.c;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen f11934a;

    public e(SplashScreen splashScreen) {
        this.f11934a = splashScreen;
    }

    public void run() {
        SplashScreen splashScreen = this.f11934a;
        SplashEventHandler splashEventHandler = splashScreen.f11910b;
        Runnable runnable = splashScreen.f11919k;
        AtomicReference<CacheKey> atomicReference = splashScreen.f11912d;
        splashEventHandler.f11889c = true;
        if (splashEventHandler.f11895i != SplashEventHandler.SplashState.DO_NOT_DISPLAY) {
            da daVar = new da(splashEventHandler, runnable, atomicReference);
            synchronized (MetaData.f12386d) {
                if (MetaData.f12393k.f12396b) {
                    daVar.a((MetaDataRequest.RequestReason) null, false);
                } else {
                    MetaData.f12393k.a((c) daVar);
                }
            }
            return;
        }
        splashEventHandler.c();
    }
}
