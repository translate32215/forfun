package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* compiled from: Sta */
public class zc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f12933a;

    public zc(VideoMode videoMode) {
        this.f12933a = videoMode;
    }

    public void run() {
        VideoMode videoMode = this.f12933a;
        if (videoMode.K != null) {
            videoMode.P = !videoMode.P;
            videoMode.K();
            VideoMode videoMode2 = this.f12933a;
            videoMode2.a(videoMode2.P);
        }
    }
}
