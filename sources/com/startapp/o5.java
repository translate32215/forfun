package com.startapp;

import android.content.Context;
import android.webkit.JavascriptInterface;

/* compiled from: Sta */
public class o5 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11518a = false;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f11519b = null;

    public o5(Context context, Runnable runnable) {
        this.f11519b = runnable;
    }

    @JavascriptInterface
    public void closeSplash() {
        if (!this.f11518a) {
            this.f11518a = true;
            this.f11519b.run();
        }
    }
}
