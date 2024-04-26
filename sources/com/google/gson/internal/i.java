package com.google.gson.internal;

import android.support.v4.media.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ConstructorConstructor */
public class i implements t<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Constructor f9956a;

    public i(h hVar, Constructor constructor) {
        this.f9956a = constructor;
    }

    public Object a() {
        try {
            return this.f9956a.newInstance((Object[]) null);
        } catch (InstantiationException e10) {
            StringBuilder a10 = a.a("Failed to invoke ");
            a10.append(this.f9956a);
            a10.append(" with no args");
            throw new RuntimeException(a10.toString(), e10);
        } catch (InvocationTargetException e11) {
            StringBuilder a11 = a.a("Failed to invoke ");
            a11.append(this.f9956a);
            a11.append(" with no args");
            throw new RuntimeException(a11.toString(), e11.getTargetException());
        } catch (IllegalAccessException e12) {
            throw new AssertionError(e12);
        }
    }
}
