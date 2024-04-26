package com.startapp;

import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.cache.FailuresHandler;
import com.startapp.sdk.adsbase.cache.h;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class o1 extends p1 {

    /* renamed from: e  reason: collision with root package name */
    public final FailuresHandler f11488e = CacheMetaData.b().a().c();

    /* renamed from: f  reason: collision with root package name */
    public int f11489f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11490g = false;

    public o1(h hVar) {
        super(hVar);
    }

    public boolean a() {
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f12173a;
        if (!(startAppSDKInternal.f12135c && !startAppSDKInternal.f12136d && !startAppSDKInternal.f12138f)) {
            return false;
        }
        FailuresHandler failuresHandler = this.f11488e;
        if (!((failuresHandler == null || failuresHandler.a() == null) ? false : true)) {
            return false;
        }
        if (this.f11490g) {
            return this.f11488e.b();
        }
        return true;
    }

    public long b() {
        Long l10;
        if (this.f11489f >= this.f11488e.a().size() || (l10 = this.f11560c) == null) {
            return -1;
        }
        long millis = TimeUnit.SECONDS.toMillis((long) this.f11488e.a().get(this.f11489f).intValue()) - (System.currentTimeMillis() - l10.longValue());
        if (millis >= 0) {
            return millis;
        }
        return 0;
    }

    public void c() {
        if (this.f11489f == this.f11488e.a().size() - 1) {
            this.f11490g = true;
        } else {
            this.f11489f++;
        }
        super.c();
    }

    public void f() {
        e();
        this.f11489f = 0;
        this.f11490g = false;
    }
}
