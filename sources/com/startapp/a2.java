package com.startapp;

import java.util.Comparator;

/* compiled from: Sta */
public class a2<T> implements Comparator<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Comparator<T> f10009a;

    /* renamed from: b  reason: collision with root package name */
    public final Comparator<T> f10010b;

    public a2(Comparator<T> comparator, Comparator<T> comparator2) {
        this.f10009a = comparator;
        this.f10010b = comparator2;
    }

    public int compare(T t10, T t11) {
        int compare = this.f10009a.compare(t10, t11);
        return compare == 0 ? this.f10010b.compare(t10, t11) : compare;
    }
}
