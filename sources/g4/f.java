package g4;

import android.os.SystemClock;

/* compiled from: LogTime */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final double f18456a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f18457b = 0;

    public static double a(long j10) {
        double elapsedRealtimeNanos = (double) (SystemClock.elapsedRealtimeNanos() - j10);
        double d10 = f18456a;
        Double.isNaN(elapsedRealtimeNanos);
        return elapsedRealtimeNanos * d10;
    }
}
