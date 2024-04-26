package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import h0.d;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: DrawableCompat */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Method f1420a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f1421b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f1422c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f1423d;

    /* renamed from: androidx.core.graphics.drawable.a$a  reason: collision with other inner class name */
    /* compiled from: DrawableCompat */
    public static class C0018a {
        public static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        public static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i10) {
            return drawableContainerState.getChild(i10);
        }

        public static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        public static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        public static void e(Drawable drawable, boolean z10) {
            drawable.setAutoMirrored(z10);
        }
    }

    /* compiled from: DrawableCompat */
    public static class b {
        public static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        public static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        public static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        public static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        public static void e(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        public static void f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        public static void g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        public static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        public static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* compiled from: DrawableCompat */
    public static class c {
        public static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        public static boolean b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.a(drawable, theme);
        }
    }

    public static boolean b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return b.b(drawable);
        }
        return false;
    }

    public static void c(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            drawable.clearColorFilter();
        } else if (i10 >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                c(C0018a.c((InsetDrawable) drawable));
            } else if (drawable instanceof h0.b) {
                c(((h0.b) drawable).b());
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    Drawable b10 = C0018a.b(drawableContainerState, i11);
                    if (b10 != null) {
                        c(b10);
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    public static int d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0018a.a(drawable);
        }
        return 0;
    }

    public static int e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.a(drawable);
        }
        if (!f1423d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f1422c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e10);
            }
            f1423d = true;
        }
        Method method = f1422c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e11);
                f1422c = null;
            }
        }
        return 0;
    }

    public static boolean f(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0018a.d(drawable);
        }
        return false;
    }

    public static void g(Drawable drawable, boolean z10) {
        if (Build.VERSION.SDK_INT >= 19) {
            C0018a.e(drawable, z10);
        }
    }

    public static void h(Drawable drawable, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.e(drawable, f10, f11);
        }
    }

    public static void i(Drawable drawable, int i10, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.f(drawable, i10, i11, i12, i13);
        }
    }

    public static boolean j(Drawable drawable, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.b(drawable, i10);
        }
        if (!f1421b) {
            Class<Drawable> cls = Drawable.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f1420a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e10);
            }
            f1421b = true;
        }
        Method method = f1420a;
        if (method != null) {
            try {
                method.invoke(drawable, new Object[]{Integer.valueOf(i10)});
                return true;
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e11);
                f1420a = null;
            }
        }
        return false;
    }

    public static void k(Drawable drawable, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.g(drawable, i10);
        } else if (drawable instanceof h0.a) {
            ((h0.a) drawable).setTint(i10);
        }
    }

    public static void l(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.h(drawable, colorStateList);
        } else if (drawable instanceof h0.a) {
            ((h0.a) drawable).setTintList(colorStateList);
        }
    }

    public static void m(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.i(drawable, mode);
        } else if (drawable instanceof h0.a) {
            ((h0.a) drawable).setTintMode(mode);
        }
    }

    public static Drawable n(Drawable drawable) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return drawable;
        }
        return i10 >= 21 ? !(drawable instanceof h0.a) ? new d(drawable) : drawable : !(drawable instanceof h0.a) ? new h0.c(drawable) : drawable;
    }
}
