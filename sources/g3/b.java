package g3;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import u2.h;

/* compiled from: LogcatLogger */
public class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f18422a = new HashSet();

    public void a(String str, Throwable th) {
        Set<String> set = f18422a;
        if (!((HashSet) set).contains(str)) {
            Log.w("LOTTIE", str, th);
            ((HashSet) set).add(str);
        }
    }
}
