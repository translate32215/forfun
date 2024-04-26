package v6;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: Assertions */
public final class a {
    @Pure
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    public static void b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @Pure
    public static int c(int i10, int i11, int i12) {
        if (i10 >= i11 && i10 < i12) {
            return i10;
        }
        throw new IndexOutOfBoundsException();
    }

    @Pure
    public static void d(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    @Pure
    public static void e(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T f(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T g(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
