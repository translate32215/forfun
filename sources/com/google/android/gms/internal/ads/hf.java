package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.o;
import e8.p50;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hf<E, V> implements p50<V> {

    /* renamed from: a  reason: collision with root package name */
    public final E f6855a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6856b;

    /* renamed from: c  reason: collision with root package name */
    public final p50<V> f6857c;

    public hf(E e10, String str, p50<V> p50) {
        this.f6855a = e10;
        this.f6856b = str;
        this.f6857c = p50;
    }

    public final void a(Runnable runnable, Executor executor) {
        this.f6857c.a(runnable, executor);
    }

    public final boolean cancel(boolean z10) {
        return this.f6857c.cancel(z10);
    }

    public final V get() throws InterruptedException, ExecutionException {
        return this.f6857c.get();
    }

    public final boolean isCancelled() {
        return this.f6857c.isCancelled();
    }

    public final boolean isDone() {
        return this.f6857c.isDone();
    }

    public final String toString() {
        String str = this.f6856b;
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb2 = new StringBuilder(o.a(str, 12));
        sb2.append(str);
        sb2.append("@");
        sb2.append(identityHashCode);
        return sb2.toString();
    }

    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f6857c.get(j10, timeUnit);
    }
}
