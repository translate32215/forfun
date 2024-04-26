package e8;

import android.util.DisplayMetrics;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class lb0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f15378a = 0;

    static {
        "0123456789abcdef".toCharArray();
    }

    public static long a(double d10, DisplayMetrics displayMetrics) {
        double d11 = (double) displayMetrics.density;
        Double.isNaN(d11);
        return Math.round(d10 / d11);
    }

    public static boolean b(String str) {
        return str == null || str.isEmpty();
    }
}
