package b2;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import o0.c0;

/* compiled from: ViewUtils */
public class z {

    /* renamed from: a  reason: collision with root package name */
    public static final f0 f3458a;

    /* renamed from: b  reason: collision with root package name */
    public static final Property<View, Float> f3459b = new a(Float.class, "translationAlpha");

    /* compiled from: ViewUtils */
    public class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(z.a((View) obj));
        }

        public void set(Object obj, Object obj2) {
            float floatValue = ((Float) obj2).floatValue();
            z.f3458a.e((View) obj, floatValue);
        }
    }

    /* compiled from: ViewUtils */
    public class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            View view = (View) obj;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            if (Build.VERSION.SDK_INT >= 18) {
                return c0.f.a(view);
            }
            return null;
        }

        public void set(Object obj, Object obj2) {
            c0.G((View) obj, (Rect) obj2);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f3458a = new e0();
        } else if (i10 >= 23) {
            f3458a = new d0();
        } else if (i10 >= 22) {
            f3458a = new c0();
        } else if (i10 >= 21) {
            f3458a = new b0();
        } else if (i10 >= 19) {
            f3458a = new a0();
        } else {
            f3458a = new f0();
        }
        new b(Rect.class, "clipBounds");
    }

    public static float a(View view) {
        return f3458a.b(view);
    }

    public static k0 b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new j0(view);
        }
        return new i0(view.getWindowToken());
    }

    public static void c(View view, int i10, int i11, int i12, int i13) {
        f3458a.d(view, i10, i11, i12, i13);
    }
}
