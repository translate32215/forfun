package com.startapp;

import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.ads.splash.a;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.adsbase.remoteconfig.c;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
public class da implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f10301a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f10302b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SplashEventHandler f10303c;

    public da(SplashEventHandler splashEventHandler, Runnable runnable, AtomicReference atomicReference) {
        this.f10303c = splashEventHandler;
        this.f10301a = runnable;
        this.f10302b = atomicReference;
    }

    public void a(MetaDataRequest.RequestReason requestReason, boolean z10) {
        SplashEventHandler splashEventHandler = this.f10303c;
        splashEventHandler.getClass();
        new Handler(Looper.getMainLooper()).post(new a(splashEventHandler, this.f10301a, (CacheKey) this.f10302b.get()));
    }

    public void a(MetaDataRequest.RequestReason requestReason) {
        SplashEventHandler splashEventHandler = this.f10303c;
        splashEventHandler.getClass();
        new Handler(Looper.getMainLooper()).post(new a(splashEventHandler, this.f10301a, (CacheKey) this.f10302b.get()));
    }
}
