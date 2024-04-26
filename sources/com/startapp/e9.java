package com.startapp;

import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.Callable;

/* compiled from: Sta */
public class e9<V> implements Callable<V> {

    /* renamed from: a  reason: collision with root package name */
    private final Callable<V> f10324a;

    public e9(Callable<V> callable) {
        this.f10324a = callable;
    }

    public static <T> Collection<? extends Callable<T>> a(Collection<? extends Callable<T>> collection) {
        LinkedList linkedList = new LinkedList();
        for (Callable e9Var : collection) {
            linkedList.add(new e9(e9Var));
        }
        return linkedList;
    }

    public V call() {
        try {
            return this.f10324a.call();
        } catch (Throwable th) {
            x2.c(th);
            return null;
        }
    }
}
