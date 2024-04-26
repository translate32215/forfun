package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* compiled from: Sta */
public class yc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f12903a;

    public yc(VideoMode videoMode) {
        this.f12903a = videoMode;
    }

    public void run() {
        try {
            this.f12903a.u();
        } catch (Throwable th) {
            i4.a(th);
        }
    }
}
