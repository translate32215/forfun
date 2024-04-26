package com.google.android.gms.internal.ads;

import e8.p50;
import java.lang.Throwable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fh<V, X extends Throwable> extends dh<V, X, oh<? super X, ? extends V>, p50<? extends V>> {
    public fh(p50<? extends V> p50, Class<X> cls, oh<? super X, ? extends V> ohVar) {
        super(p50, cls, ohVar);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.gh, com.google.android.gms.internal.ads.fh] */
    public final /* synthetic */ void w(Object obj) {
        k((p50) obj);
    }

    public final /* synthetic */ Object x(Object obj, Throwable th) throws Exception {
        oh ohVar = (oh) obj;
        p50 a10 = ohVar.a(th);
        pg.c(a10, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ohVar);
        return a10;
    }
}
