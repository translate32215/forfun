package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class sh extends bi {

    /* renamed from: d  reason: collision with root package name */
    public final Executor f8125d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ rh f8126e;

    /* renamed from: f  reason: collision with root package name */
    public final Callable<V> f8127f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ rh f8128g;

    public sh(rh rhVar, Callable<V> callable, Executor executor) {
        this.f8128g = rhVar;
        this.f8126e = rhVar;
        executor.getClass();
        this.f8125d = executor;
        callable.getClass();
        this.f8127f = callable;
    }

    public final boolean b() {
        return this.f8126e.isDone();
    }

    public final void c(Object obj, Throwable th) {
        rh rhVar = this.f8126e;
        rhVar.f8039x = null;
        if (th == null) {
            this.f8128g.i(obj);
        } else if (th instanceof ExecutionException) {
            rhVar.j(th.getCause());
        } else if (th instanceof CancellationException) {
            rhVar.cancel(false);
        } else {
            rhVar.j(th);
        }
    }

    public final V d() throws Exception {
        return this.f8127f.call();
    }

    public final String e() {
        return this.f8127f.toString();
    }
}
