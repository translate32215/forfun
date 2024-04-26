package com.startapp;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: Sta */
public class h9 implements ScheduledExecutorService {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f10504a;

    public h9(ScheduledExecutorService scheduledExecutorService) {
        this.f10504a = scheduledExecutorService;
    }

    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f10504a.awaitTermination(j10, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f10504a.execute(new g9(runnable));
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f10504a.invokeAll(e9.a(collection));
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return this.f10504a.invokeAny(e9.a(collection));
    }

    public boolean isShutdown() {
        return this.f10504a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f10504a.isTerminated();
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f10504a.schedule(new g9(runnable), j10, timeUnit);
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f10504a.scheduleAtFixedRate(new g9(runnable), j10, j11, timeUnit);
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f10504a.scheduleWithFixedDelay(new g9(runnable), j10, j11, timeUnit);
    }

    public void shutdown() {
        this.f10504a.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f10504a.shutdownNow();
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f10504a.submit(new e9(callable));
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f10504a.invokeAll(e9.a(collection), j10, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f10504a.invokeAny(e9.a(collection), j10, timeUnit);
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        return this.f10504a.schedule(new e9(callable), j10, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f10504a.submit(new g9(runnable), t10);
    }

    public Future<?> submit(Runnable runnable) {
        return this.f10504a.submit(new g9(runnable));
    }
}
