package z7;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final e f28726a = new e();

    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    public final long b() {
        return System.currentTimeMillis();
    }

    public final long c() {
        return System.nanoTime();
    }
}
