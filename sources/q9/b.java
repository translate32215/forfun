package q9;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import g0.a;

/* compiled from: RippleUtils */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f24232a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f24233b = {16842919};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f24234c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f24235d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f24236e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f24237f = {16842913, 16842919};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f24238g = {16842913, 16843623, 16842908};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f24239h = {16842913, 16842908};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f24240i = {16842913, 16843623};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f24241j = {16842913};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f24242k = {16842910, 16842919};

    /* renamed from: l  reason: collision with root package name */
    public static final String f24243l = b.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f24232a) {
            return new ColorStateList(new int[][]{f24241j, StateSet.NOTHING}, new int[]{b(colorStateList, f24237f), b(colorStateList, f24233b)});
        }
        int[] iArr = f24237f;
        int[] iArr2 = f24238g;
        int[] iArr3 = f24239h;
        int[] iArr4 = f24240i;
        int[] iArr5 = f24233b;
        int[] iArr6 = f24234c;
        int[] iArr7 = f24235d;
        int[] iArr8 = f24236e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f24241j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{b(colorStateList, iArr), b(colorStateList, iArr2), b(colorStateList, iArr3), b(colorStateList, iArr4), 0, b(colorStateList, iArr5), b(colorStateList, iArr6), b(colorStateList, iArr7), b(colorStateList, iArr8), 0});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f24232a ? a.e(colorForState, Math.min(Color.alpha(colorForState) * 2, 255)) : colorForState;
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 22 && i10 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f24242k, 0)) != 0) {
            Log.w(f24243l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean d(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
