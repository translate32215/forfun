package com.google.gson.internal;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator */
public final class y extends b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Method f9989a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9990b;

    public y(Method method, int i10) {
        this.f9989a = method;
        this.f9990b = i10;
    }

    public <T> T b(Class<T> cls) throws Exception {
        b0.a(cls);
        return this.f9989a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f9990b)});
    }
}
