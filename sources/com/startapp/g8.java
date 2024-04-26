package com.startapp;

import com.startapp.sdk.ads.video.d;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;

/* compiled from: Sta */
public class g8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10464a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f10465b;

    public g8(d dVar, int i10) {
        this.f10465b = dVar;
        this.f10464a = i10;
    }

    public void run() {
        VideoPlayerInterface.a aVar = this.f10465b.f11991b;
        if (aVar != null) {
            ((dd) aVar).a(this.f10464a);
        }
    }
}
