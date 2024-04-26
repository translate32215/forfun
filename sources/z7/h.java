package z7;

import android.os.Build;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class h {
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 18;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 19;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 30;
    }
}
