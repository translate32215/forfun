package com.google.android.gms.internal.ads;

import e8.p50;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jh<I, O> extends kh<I, O, oh<? super I, ? extends O>, p50<? extends O>> {
    public jh(p50<? extends I> p50, oh<? super I, ? extends O> ohVar) {
        super(p50, ohVar);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.gh, com.google.android.gms.internal.ads.jh] */
    public final /* synthetic */ void w(Object obj) {
        k((p50) obj);
    }

    public final /* synthetic */ Object x(Object obj, @NullableDecl Object obj2) throws Exception {
        oh ohVar = (oh) obj;
        p50 a10 = ohVar.a(obj2);
        pg.c(a10, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ohVar);
        return a10;
    }
}
