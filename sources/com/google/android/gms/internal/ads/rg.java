package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class rg {
    @NullableDecl

    /* renamed from: a  reason: collision with root package name */
    public static final Object f8038a;

    static {
        Object b10 = b();
        f8038a = b10;
        if (b10 != null) {
            a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (b10 != null) {
            try {
                Method a10 = a("getStackTraceDepth", Throwable.class);
                if (a10 != null) {
                    a10.invoke(b(), new Object[]{new Throwable()});
                }
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            }
        }
    }

    @NullableDecl
    public static Method a(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    public static Object b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }
}
