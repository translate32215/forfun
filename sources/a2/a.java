package a2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Trace */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f47a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f48b;

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean c() {
        try {
            if (f48b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        if (Build.VERSION.SDK_INT < 18) {
            return false;
        }
        try {
            if (f48b == null) {
                f47a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                f48b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f48b.invoke((Object) null, new Object[]{Long.valueOf(f47a)})).booleanValue();
        } catch (Exception e10) {
            if (e10 instanceof InvocationTargetException) {
                Throwable cause = e10.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e10);
            return false;
        }
    }
}
