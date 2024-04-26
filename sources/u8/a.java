package u8;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import d1.b;
import d1.c;
import h.e;

/* compiled from: AnimationUtils */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f26148a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f26149b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f26150c = new d1.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f26151d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f26152e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return e.a(f11, f10, f12, f10);
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        if (f14 < f12) {
            return f10;
        }
        return f14 > f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(int i10, int i11, float f10) {
        return Math.round(f10 * ((float) (i11 - i10))) + i10;
    }
}
