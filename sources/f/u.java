package f;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* compiled from: ResourcesFlusher */
public class u {

    /* renamed from: a  reason: collision with root package name */
    public static Field f17953a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f17954b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f17955c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f17956d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f17957e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f17958f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f17959g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f17960h;

    /* compiled from: ResourcesFlusher */
    public static class a {
        public static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    public static void a(Object obj) {
        if (!f17956d) {
            try {
                f17955c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f17956d = true;
        }
        Class<?> cls = f17955c;
        if (cls != null) {
            if (!f17958f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f17957e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e11) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
                }
                f17958f = true;
            }
            Field field = f17957e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e12) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
                }
                if (longSparseArray != null) {
                    a.a(longSparseArray);
                }
            }
        }
    }
}
