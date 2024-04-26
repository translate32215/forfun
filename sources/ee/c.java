package ee;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kd.h;
import l0.e;

/* compiled from: HandlerDispatcher.kt */
public final class c {
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        Object obj2 = null;
        try {
            obj = new a(a(Looper.getMainLooper(), true), (String) null, false);
        } catch (Throwable th) {
            obj = e.a(th);
        }
        if (!(obj instanceof h.a)) {
            obj2 = obj;
        }
        b bVar = (b) obj2;
    }

    public static final Handler a(Looper looper, boolean z10) {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
