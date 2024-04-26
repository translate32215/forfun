package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o0.c0;

/* compiled from: ViewUtils */
public class n1 {

    /* renamed from: a  reason: collision with root package name */
    public static Method f1037a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                f1037a = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f1037a.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f1037a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception e10) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
            }
        }
    }

    public static boolean b(View view) {
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        return c0.e.d(view) == 1;
    }
}
