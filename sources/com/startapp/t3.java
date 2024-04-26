package com.startapp;

import android.os.HandlerThread;

/* compiled from: Sta */
public class t3 extends HandlerThread {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12608a = new Object();

    public t3(String str) {
        super(str);
    }

    public void onLooperPrepared() {
        synchronized (this.f12608a) {
            this.f12608a.notifyAll();
        }
    }

    public void start() {
        synchronized (this.f12608a) {
            super.start();
            try {
                this.f12608a.wait();
            } catch (InterruptedException e10) {
                throw new RuntimeException(e10);
            }
        }
    }
}
