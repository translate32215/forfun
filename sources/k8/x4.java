package k8;

import android.content.Context;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import s.a;
import s.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class x4 implements k4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, x4> f20540a = new a();

    public static x4 b(Context context, String str) {
        x4 x4Var;
        if (!e4.a()) {
            synchronized (x4.class) {
                x4Var = (x4) ((i) f20540a).get((Object) null);
                if (x4Var == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return x4Var;
        }
        throw null;
    }

    public static synchronized void c() {
        synchronized (x4.class) {
            Map<String, x4> map = f20540a;
            Iterator it = ((a) map).values().iterator();
            if (!it.hasNext()) {
                ((i) map).clear();
            } else {
                ((x4) it.next()).getClass();
                throw null;
            }
        }
    }

    public final Object a(String str) {
        throw null;
    }
}
