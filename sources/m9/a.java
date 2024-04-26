package m9;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Path;
import android.os.Build;
import android.util.TypedValue;
import g0.d;
import j.f;
import p9.b;
import q0.b;

/* compiled from: MotionUtils */
public class a {
    public static float a(String[] strArr, int i10) {
        float parseFloat = Float.parseFloat(strArr[i10]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static boolean b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("(");
        return str.startsWith(sb2.toString()) && str.endsWith(")");
    }

    public static int c(Context context, int i10, int i11) {
        TypedValue a10 = b.a(context, i10);
        return (a10 == null || a10.type != 16) ? i11 : a10.data;
    }

    public static TimeInterpolator d(Context context, int i10, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (b(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return q0.b.a(a(split, 0), a(split, 1), a(split, 2), a(split, 3));
                }
                StringBuilder a10 = android.support.v4.media.a.a("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                a10.append(split.length);
                throw new IllegalArgumentException(a10.toString());
            } else if (b(valueOf, "path")) {
                Path d10 = d.d(valueOf.substring(5, valueOf.length() - 1));
                if (Build.VERSION.SDK_INT >= 21) {
                    return b.a.c(d10);
                }
                return new q0.a(d10);
            } else {
                throw new IllegalArgumentException(f.a("Invalid motion easing type: ", valueOf));
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
    }
}
