package com.startapp;

/* compiled from: Sta */
public abstract class y1<T> {

    /* renamed from: a  reason: collision with root package name */
    public volatile T f12869a;

    public abstract T a();

    public T b() {
        T t10 = this.f12869a;
        if (t10 == null) {
            synchronized (this) {
                t10 = this.f12869a;
                if (t10 == null) {
                    t10 = a();
                    this.f12869a = t10;
                }
            }
        }
        return t10;
    }
}
