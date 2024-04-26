package com.startapp;

import android.os.Handler;
import com.startapp.sdk.ads.video.VideoMode;

/* compiled from: Sta */
public class uc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f12679a;

    public uc(VideoMode videoMode) {
        this.f12679a = videoMode;
    }

    public void run() {
        int M = this.f12679a.M();
        if (M >= 1000) {
            Handler handler = this.f12679a.f11949m0;
            long j10 = 1000;
            long j11 = ((long) M) % 1000;
            if (j11 != 0) {
                j10 = j11;
            }
            handler.postDelayed(this, j10 + 50);
        }
    }
}
