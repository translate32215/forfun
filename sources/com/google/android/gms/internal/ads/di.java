package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.gh;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class di extends gh.i<Void> implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f6214h;

    public di(Runnable runnable) {
        runnable.getClass();
        this.f6214h = runnable;
    }

    public final void run() {
        try {
            this.f6214h.run();
        } catch (Throwable th) {
            j(th);
            Object obj = rg.f8038a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            } else if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            } else {
                throw th;
            }
        }
    }
}
