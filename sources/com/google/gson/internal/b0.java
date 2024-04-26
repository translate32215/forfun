package com.google.gson.internal;

import android.support.v4.media.a;
import java.lang.reflect.Modifier;

/* compiled from: UnsafeAllocator */
public abstract class b0 {
    public static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder a10 = a.a("Interface can't be instantiated! Interface name: ");
            a10.append(cls.getName());
            throw new UnsupportedOperationException(a10.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder a11 = a.a("Abstract class can't be instantiated! Class name: ");
            a11.append(cls.getName());
            throw new UnsupportedOperationException(a11.toString());
        }
    }

    public abstract <T> T b(Class<T> cls) throws Exception;
}
