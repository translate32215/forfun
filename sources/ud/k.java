package ud;

import j.f;
import java.util.Arrays;
import kd.b;
import kd.n;

/* compiled from: Intrinsics */
public class k {
    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(f.a(str, " must not be null"));
            i(illegalStateException, k.class.getName());
            throw illegalStateException;
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            i(nullPointerException, k.class.getName());
            throw nullPointerException;
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str);
            i(nullPointerException, k.class.getName());
            throw nullPointerException;
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(f.a(str, " must not be null"));
            i(nullPointerException, k.class.getName());
            throw nullPointerException;
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(h(str));
            i(nullPointerException, k.class.getName());
            throw nullPointerException;
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(h(str));
            i(illegalArgumentException, k.class.getName());
            throw illegalArgumentException;
        }
    }

    public static String h(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static <T extends Throwable> T i(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }

    public static String j(String str, Object obj) {
        return str + obj;
    }

    public static void k() {
        b bVar = new b();
        i(bVar, k.class.getName());
        throw bVar;
    }

    public static void l(String str) {
        n nVar = new n(q.b.a("lateinit property ", str, " has not been initialized"));
        i(nVar, k.class.getName());
        throw nVar;
    }
}
