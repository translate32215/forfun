package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;

/* compiled from: Sta */
public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f12441a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MetaDataRequest.RequestReason f12442b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f12443c;

    public b(c cVar, MetaDataRequest.RequestReason requestReason, boolean z10) {
        this.f12441a = cVar;
        this.f12442b = requestReason;
        this.f12443c = z10;
    }

    public void run() {
        this.f12441a.a(this.f12442b, this.f12443c);
    }
}
