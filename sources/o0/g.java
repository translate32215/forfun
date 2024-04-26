package o0;

import android.os.Build;
import android.support.v4.media.a;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* compiled from: LayoutInflaterCompat */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static Field f22581a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f22582b;

    public static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f22582b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f22581a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                StringBuilder a10 = a.a("forceSetFactory2 Could not find field 'mFactory2' on class ");
                a10.append(LayoutInflater.class.getName());
                a10.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", a10.toString(), e10);
            }
            f22582b = true;
        }
        Field field = f22581a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e11) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e11);
            }
        }
    }

    public static void b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                a(layoutInflater, factory2);
            }
        }
    }
}
