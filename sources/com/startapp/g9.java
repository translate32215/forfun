package com.startapp;

/* compiled from: Sta */
public class g9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f10466a;

    public g9(Runnable runnable) {
        this.f10466a = runnable;
    }

    public void run() {
        try {
            this.f10466a.run();
        } catch (Throwable th) {
            x2.c(th);
        }
    }
}
