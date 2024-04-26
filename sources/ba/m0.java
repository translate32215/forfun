package ba;

import androidx.appcompat.widget.d0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* compiled from: ObjectArrays */
public final class m0 {
    @CanIgnoreReturnValue
    public static Object a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(d0.a("at index ", i10));
    }
}
