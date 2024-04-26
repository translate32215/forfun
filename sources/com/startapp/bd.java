package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* compiled from: Sta */
public class bd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f10211a;

    public bd(VideoMode videoMode) {
        this.f10211a = videoMode;
    }

    public void run() {
        VideoMode videoMode = this.f10211a;
        if (videoMode.K != null) {
            videoMode.E++;
            videoMode.L.setVisibility(0);
            VideoMode videoMode2 = this.f10211a;
            videoMode2.T = false;
            videoMode2.Q = 0;
            wb.a(videoMode2.f10440v, true, "videoApi.setVideoCurrentPosition", 0);
            wb.a(videoMode2.f10440v, true, "videoApi.setSkipTimer", 0);
            this.f10211a.L();
        }
    }
}
