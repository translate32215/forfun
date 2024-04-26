package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* compiled from: Sta */
public class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f10094a;

    public ad(VideoMode videoMode) {
        this.f10094a = videoMode;
    }

    public void run() {
        VideoMode videoMode = this.f10094a;
        if (videoMode.K != null) {
            videoMode.R();
        }
    }
}
