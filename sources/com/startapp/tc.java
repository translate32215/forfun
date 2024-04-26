package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;

/* compiled from: Sta */
public class tc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoListener f12627a;

    public tc(VideoListener videoListener, Context context) {
        this.f12627a = videoListener;
    }

    public void run() {
        try {
            this.f12627a.onVideoCompleted();
        } catch (Throwable th) {
            wb.a((Object) this.f12627a, th);
        }
    }
}
