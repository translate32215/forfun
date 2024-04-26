package f0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TypedArrayUtils */
public class m {
    public static d a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10, int i11) {
        d dVar;
        if (c(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return new d((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                dVar = d.a(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                dVar = null;
            }
            if (dVar != null) {
                return dVar;
            }
        }
        return new d((Shader) null, (ColorStateList) null, i11);
    }

    public static String b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (!c(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i10);
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray d(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
