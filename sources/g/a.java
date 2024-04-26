package g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.t0;
import f0.c;
import f0.g;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* compiled from: AppCompatResources */
public final class a {
    public static ColorStateList a(Context context, int i10) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        g.d dVar;
        Object obj = d0.a.f12940a;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        g.e eVar = new g.e(resources, theme);
        synchronized (g.f18048c) {
            SparseArray sparseArray = g.f18047b.get(eVar);
            colorStateList = null;
            if (!(sparseArray == null || sparseArray.size() <= 0 || (dVar = (g.d) sparseArray.get(i10)) == null)) {
                if (!dVar.f18050b.equals(resources.getConfiguration()) || (!(theme == null && dVar.f18051c == 0) && (theme == null || dVar.f18051c != theme.hashCode()))) {
                    sparseArray.remove(i10);
                } else {
                    colorStateList2 = dVar.f18049a;
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal = g.f18046a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z10 = true;
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            z10 = false;
        }
        if (!z10) {
            try {
                colorStateList = c.a(resources, resources.getXml(i10), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateList != null) {
            synchronized (g.f18048c) {
                WeakHashMap<g.e, SparseArray<g.d>> weakHashMap = g.f18047b;
                SparseArray sparseArray2 = weakHashMap.get(eVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(eVar, sparseArray2);
                }
                sparseArray2.append(i10, new g.d(colorStateList, eVar.f18052a.getConfiguration(), theme));
            }
            return colorStateList;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return g.c.b(resources, i10, theme);
        } else {
            return resources.getColorStateList(i10);
        }
    }

    public static Drawable b(Context context, int i10) {
        return t0.d().f(context, i10);
    }
}
