package p9;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import b8.a;

/* compiled from: TypefaceUtils */
public class f {
    public static Typeface a(Configuration configuration, Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT < 31 || (i10 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i10 == 0) {
            return null;
        }
        return Typeface.create(typeface, a.c(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
