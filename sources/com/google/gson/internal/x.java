package com.google.gson.internal;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator */
public final class x extends b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Method f9987a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9988b;

    public x(Method method, Object obj) {
        this.f9987a = method;
        this.f9988b = obj;
    }

    public <T> T b(Class<T> cls) throws Exception {
        b0.a(cls);
        return this.f9987a.invoke(this.f9988b, new Object[]{cls});
    }
}
