package com.google.android.gms.internal.ads;

import e8.m50;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class wh<V> implements Future<V> {
    public boolean cancel(boolean z10) {
        return ((m50) this).f15465a.cancel(z10);
    }

    public V get() throws InterruptedException, ExecutionException {
        return ((m50) this).f15465a.get();
    }

    public boolean isCancelled() {
        return ((m50) this).f15465a.isCancelled();
    }

    public boolean isDone() {
        return ((m50) this).f15465a.isDone();
    }

    public String toString() {
        return ((m50) this).f15465a.toString();
    }

    public V get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return ((m50) this).f15465a.get(j10, timeUnit);
    }
}
