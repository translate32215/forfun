package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* compiled from: Sta */
public class wc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12768a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ VideoMode f12769b;

    public wc(VideoMode videoMode, int i10) {
        this.f12769b = videoMode;
        this.f12768a = i10;
    }

    public void run() {
        try {
            this.f12769b.f(this.f12768a);
        } catch (Throwable th) {
            i4.a(th);
        }
    }
}
