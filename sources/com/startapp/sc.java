package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;

/* compiled from: Sta */
public class sc extends n5 {

    /* renamed from: h  reason: collision with root package name */
    public Runnable f11725h = null;

    /* renamed from: i  reason: collision with root package name */
    public Runnable f11726i = null;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f11727j = null;

    public sc(Context context, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4, Runnable runnable5, TrackingParams trackingParams, boolean z10) {
        super(context, runnable, runnable2, trackingParams);
        this.f11725h = runnable3;
        this.f11726i = runnable4;
        this.f11727j = runnable5;
        this.f10900b = z10;
    }

    @JavascriptInterface
    public void replayVideo() {
        if (this.f11725h != null) {
            new Handler(Looper.getMainLooper()).post(this.f11725h);
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        if (this.f11726i != null) {
            new Handler(Looper.getMainLooper()).post(this.f11726i);
        }
    }

    @JavascriptInterface
    public void toggleSound() {
        if (this.f11727j != null) {
            new Handler(Looper.getMainLooper()).post(this.f11727j);
        }
    }
}
