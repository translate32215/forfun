package e8;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class rb0 extends Exception {
    public rb0(int i10, Throwable th, int i11) {
        super((String) null, th);
    }

    public static rb0 a(IOException iOException) {
        return new rb0(0, iOException, -1);
    }

    public static rb0 b(Exception exc, int i10) {
        return new rb0(1, exc, i10);
    }

    public static rb0 c(RuntimeException runtimeException) {
        return new rb0(2, runtimeException, -1);
    }
}
