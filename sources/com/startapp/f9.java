package com.startapp;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: Sta */
public class f9 implements ExecutorService {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f10385a;

    public f9(ExecutorService executorService) {
        this.f10385a = executorService;
    }

    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f10385a.awaitTermination(j10, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f10385a.execute(new g9(runnable));
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f10385a.invokeAll(e9.a(collection));
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return this.f10385a.invokeAny(e9.a(collection));
    }

    public boolean isShutdown() {
        return this.f10385a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f10385a.isTerminated();
    }

    public void shutdown() {
        this.f10385a.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f10385a.shutdownNow();
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f10385a.submit(new e9(callable));
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f10385a.invokeAll(e9.a(collection), j10, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f10385a.invokeAny(e9.a(collection), j10, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f10385a.submit(new g9(runnable), t10);
    }

    public Future<?> submit(Runnable runnable) {
        return this.f10385a.submit(new g9(runnable));
    }
}
