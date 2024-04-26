package v6;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b2.t;

/* compiled from: SystemClock */
public class z implements b {
    public long a() {
        return SystemClock.elapsedRealtime();
    }

    public long b() {
        return SystemClock.uptimeMillis();
    }

    public t c(Looper looper, Handler.Callback callback) {
        return new t(new Handler(looper, callback));
    }
}
