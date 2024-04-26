package b2;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.startapp.startappsdk.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtilsBase */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static Method f3375a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f3376b;

    /* renamed from: c  reason: collision with root package name */
    public static Field f3377c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f3378d;

    public void a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(R.id.save_non_transition_alpha, (Object) null);
        }
    }

    public float b(View view) {
        Float f10 = (Float) view.getTag(R.id.save_non_transition_alpha);
        if (f10 != null) {
            return view.getAlpha() / f10.floatValue();
        }
        return view.getAlpha();
    }

    public void c(View view) {
        if (view.getTag(R.id.save_non_transition_alpha) == null) {
            view.setTag(R.id.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    public void d(View view, int i10, int i11, int i12, int i13) {
        if (!f3376b) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{cls2, cls2, cls2, cls2});
                f3375a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e10);
            }
            f3376b = true;
        }
        Method method = f3375a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    public void e(View view, float f10) {
        Float f11 = (Float) view.getTag(R.id.save_non_transition_alpha);
        if (f11 != null) {
            view.setAlpha(f11.floatValue() * f10);
        } else {
            view.setAlpha(f10);
        }
    }

    public void f(View view, int i10) {
        if (!f3378d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f3377c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f3378d = true;
        }
        Field field = f3377c;
        if (field != null) {
            try {
                f3377c.setInt(view, i10 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void g(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            g(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public void h(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            h(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }
}
