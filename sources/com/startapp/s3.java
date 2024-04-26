package com.startapp;

import android.os.Handler;

/* compiled from: Sta */
public class s3 implements r3 {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f11694a;

    public s3(Handler handler) {
        this.f11694a = handler;
    }

    public void a(Runnable runnable, long j10) {
        this.f11694a.postDelayed(runnable, j10);
    }

    public void execute(Runnable runnable) {
        this.f11694a.post(runnable);
    }

    public void a(Runnable runnable) {
        this.f11694a.removeCallbacks(runnable);
    }
}
