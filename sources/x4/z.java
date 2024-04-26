package x4;

import android.os.Build;
import java.util.HashSet;

/* compiled from: ExoPlayerLibraryInfo */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<String> f27808a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public static String f27809b = "goog.exo.core";

    static {
        String str = Build.VERSION.RELEASE;
    }

    public static synchronized void a(String str) {
        synchronized (z.class) {
            if (f27808a.add(str)) {
                f27809b += ", " + str;
            }
        }
    }
}
