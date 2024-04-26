package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class i {
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name2 + " thread, but got " + name + ".");
        }
    }

    public static void d(String str) {
        if (!(Looper.getMainLooper() == Looper.myLooper())) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    public static String e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @EnsuresNonNull({"#1"})
    public static String f(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void g(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    public static <T> T h(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("null reference");
    }

    @EnsuresNonNull({"#1"})
    public static <T> T i(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void j(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void k(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
