package com.google.gson.internal;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator */
public final class z extends b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Method f9991a;

    public z(Method method) {
        this.f9991a = method;
    }

    public <T> T b(Class<T> cls) throws Exception {
        b0.a(cls);
        return this.f9991a.invoke((Object) null, new Object[]{cls, Object.class});
    }
}
