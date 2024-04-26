package com.startapp;

/* compiled from: Sta */
public class x2 {

    /* renamed from: a  reason: collision with root package name */
    private static a f12789a;

    /* compiled from: Sta */
    public interface a {
        void a(Throwable th);
    }

    /* compiled from: Sta */
    public static class b {
        public static StackTraceElement[] a() {
            return Thread.currentThread().getStackTrace();
        }
    }

    public static void a(a aVar) {
        f12789a = aVar;
    }

    private static void a(Throwable th, boolean z10, boolean z11) {
    }

    public static void b(Throwable th) {
        a(th, true, true);
    }

    public static void c(Throwable th) {
        a aVar = f12789a;
        if (aVar != null) {
            try {
                aVar.a(th);
            } catch (Throwable unused) {
            }
        } else {
            a(th, false, false);
        }
    }

    public static void a(Throwable th) {
        a(th, true, false);
    }

    private static StackTraceElement a(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        StackTraceElement[] a10 = b.a();
        if (a10 == null) {
            return null;
        }
        String name = b.class.getName();
        int length = a10.length;
        for (int i11 = 0; i11 < length; i11++) {
            StackTraceElement stackTraceElement = a10[i11];
            if (stackTraceElement != null && name.equals(stackTraceElement.getClassName())) {
                int i12 = i11 + 3 + i10;
                if (i12 < length) {
                    return a10[i12];
                }
                return null;
            }
        }
        return null;
    }
}
