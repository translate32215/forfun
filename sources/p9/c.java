package p9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.g1;
import g.a;

/* compiled from: MaterialResources */
public class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList a10;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (a10 = a.a(context, resourceId)) == null) {
            return typedArray.getColorStateList(i10);
        }
        return a10;
    }

    public static ColorStateList b(Context context, g1 g1Var, int i10) {
        int resourceId;
        ColorStateList a10;
        if (!g1Var.f924b.hasValue(i10) || (resourceId = g1Var.f924b.getResourceId(i10, 0)) == 0 || (a10 = a.a(context, resourceId)) == null) {
            return g1Var.c(i10);
        }
        return a10;
    }

    public static Drawable c(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable b10;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (b10 = a.b(context, resourceId)) == null) {
            return typedArray.getDrawable(i10);
        }
        return b10;
    }

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean e(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
