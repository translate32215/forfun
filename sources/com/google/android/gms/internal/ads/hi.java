package com.google.android.gms.internal.ads;

import e8.t50;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hi extends bi<V> {

    /* renamed from: d  reason: collision with root package name */
    public final Callable<V> f6883d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t50 f6884e;

    public hi(t50 t50, Callable<V> callable) {
        this.f6884e = t50;
        callable.getClass();
        this.f6883d = callable;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [e8.t50, com.google.android.gms.internal.ads.gh] */
    public final boolean b() {
        return this.f6884e.isDone();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [e8.t50, com.google.android.gms.internal.ads.gh] */
    /* JADX WARNING: type inference failed for: r2v1, types: [e8.t50, com.google.android.gms.internal.ads.gh] */
    public final void c(V v10, Throwable th) {
        if (th == null) {
            this.f6884e.i(v10);
        } else {
            this.f6884e.j(th);
        }
    }

    public final V d() throws Exception {
        return this.f6883d.call();
    }

    public final String e() {
        return this.f6883d.toString();
    }
}
