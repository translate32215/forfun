package com.google.android.gms.internal.ads;

import e8.p50;
import e8.t50;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ii extends bi<p50<V>> {

    /* renamed from: d  reason: collision with root package name */
    public final ph<V> f7094d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t50 f7095e;

    public ii(t50 t50, ph<V> phVar) {
        this.f7095e = t50;
        phVar.getClass();
        this.f7094d = phVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [e8.t50, com.google.android.gms.internal.ads.gh] */
    public final boolean b() {
        return this.f7095e.isDone();
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [e8.t50, com.google.android.gms.internal.ads.gh] */
    /* JADX WARNING: type inference failed for: r2v1, types: [e8.t50, com.google.android.gms.internal.ads.gh] */
    public final /* synthetic */ void c(Object obj, Throwable th) {
        p50 p50 = (p50) obj;
        if (th == null) {
            this.f7095e.k(p50);
        } else {
            this.f7095e.j(th);
        }
    }

    public final /* synthetic */ Object d() throws Exception {
        p50<V> a10 = this.f7094d.a();
        pg.c(a10, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f7094d);
        return a10;
    }

    public final String e() {
        return this.f7094d.toString();
    }
}
