package ba;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* compiled from: CollectPreconditions */
public final class h {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    @CanIgnoreReturnValue
    public static int b(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static void c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }
}
