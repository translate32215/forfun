package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* compiled from: Sta */
public class xc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12804a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ VideoMode f12805b;

    public xc(VideoMode videoMode, int i10) {
        this.f12805b = videoMode;
        this.f12804a = i10;
    }

    public void run() {
        try {
            this.f12805b.e(this.f12804a);
        } catch (Throwable th) {
            i4.a(th);
        }
    }
}
