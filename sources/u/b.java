package u;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.startapp.startappsdk.R;
import ud.k;
import w1.c;

/* compiled from: KeyCache */
public class b {
    public static <T> T a(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("null reference");
    }

    public static <T> T b(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static String c(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static int d(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static final void e(View view, c cVar) {
        k.f(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, cVar);
    }

    public static int f(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        int i11 = 0;
        while (i11 < 6) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            } else if (i13 == i10) {
                return i12;
            } else {
                i11++;
            }
        }
        return 1;
    }

    public static <T> T g(Bundle bundle, String str, Class<T> cls, T t10) {
        T t11 = bundle.get(str);
        if (t11 == null) {
            return t10;
        }
        if (cls.isAssignableFrom(t11.getClass())) {
            return t11;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), t11.getClass().getCanonicalName()}));
    }

    public static void h(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
