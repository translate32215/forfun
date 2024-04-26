package aa;

import androidx.appcompat.widget.d0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: Preconditions */
public final class g {
    public static String a(int i10, int i11, @NullableDecl String str) {
        if (i10 < 0) {
            return l.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        } else if (i11 >= 0) {
            return l.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            throw new IllegalArgumentException(d0.a("negative size: ", i11));
        }
    }

    public static void b(boolean z10, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @CanIgnoreReturnValue
    public static int c(int i10, int i11) {
        String str;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            str = l.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else if (i11 >= 0) {
            str = l.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            throw new IllegalArgumentException(d0.a("negative size: ", i11));
        }
        throw new IndexOutOfBoundsException(str);
    }

    @CanIgnoreReturnValue
    public static int d(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11) {
            return i10;
        }
        throw new IndexOutOfBoundsException(a(i10, i11, "index"));
    }

    public static void e(int i10, int i11, int i12) {
        String str;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                str = a(i10, i12, "start index");
            } else if (i11 < 0 || i11 > i12) {
                str = a(i11, i12, "end index");
            } else {
                str = l.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }
}
