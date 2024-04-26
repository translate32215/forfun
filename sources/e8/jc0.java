package e8;

import android.annotation.TargetApi;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

@TargetApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jc0 {
    public static Bundle a(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static <T> T b(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static void c(Bundle bundle, String str, Boolean bool, boolean z10) {
        if (z10) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    public static void d(Bundle bundle, String str, Integer num, boolean z10) {
        if (z10) {
            bundle.putInt(str, num.intValue());
        }
    }

    public static void e(Bundle bundle, String str, List<String> list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList(list));
        }
    }

    public static <T> void f(T t10, Class<T> cls) {
        if (t10 == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
