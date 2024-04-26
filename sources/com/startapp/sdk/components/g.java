package com.startapp.sdk.components;

import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.crashreport.b;
import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class g implements b.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ANRRemoteConfig f12530a;

    public g(ComponentLocator.v vVar, ANRRemoteConfig aNRRemoteConfig) {
        this.f12530a = aNRRemoteConfig;
    }

    public long a(long j10) {
        return this.f12530a.b() - j10;
    }
}
