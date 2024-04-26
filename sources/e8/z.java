package e8;

import android.text.TextUtils;
import androidx.appcompat.widget.o;
import e.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class z extends y {
    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i10 = 0;
        int length = str.length();
        while (i10 < str.length() && str.charAt(i10) == ',') {
            i10++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        if (length < i10) {
            return null;
        }
        if (i10 == 0 && length == str.length()) {
            return str;
        }
        return str.substring(i10, length);
    }

    public final String a(String str, String str2) {
        String b10 = b(str);
        String b11 = b(str2);
        if (TextUtils.isEmpty(b10)) {
            return b11;
        }
        if (TextUtils.isEmpty(b11)) {
            return b10;
        }
        return g.a(o.a(b11, o.a(b10, 1)), b10, ",", b11);
    }
}
