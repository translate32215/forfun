package n0;

import android.os.Build;
import java.util.Arrays;

/* compiled from: ObjectsCompat */
public class b {

    /* compiled from: ObjectsCompat */
    public static class a {
        public static boolean a(Object obj, Object obj2) {
            return obj == obj2 || (obj != null && obj.equals(obj2));
        }

        public static int b(Object... objArr) {
            return Arrays.hashCode(objArr);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return a.a(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return a.b(objArr);
        }
        return Arrays.hashCode(objArr);
    }
}
