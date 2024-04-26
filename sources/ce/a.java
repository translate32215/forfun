package ce;

import androidx.appcompat.widget.y0;
import zd.c;

/* compiled from: Char.kt */
public class a {
    public static final int a(int i10) {
        if (new c(2, 36).o(i10)) {
            return i10;
        }
        StringBuilder a10 = y0.a("radix ", i10, " was not in valid range ");
        a10.append(new c(2, 36));
        throw new IllegalArgumentException(a10.toString());
    }

    public static final boolean b(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static final boolean c(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }
}
