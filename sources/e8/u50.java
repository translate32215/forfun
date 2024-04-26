package e8;

import com.google.android.gms.internal.ads.g7;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class u50 extends TimeoutException {
    public u50(String str, g7 g7Var) {
        super(str);
    }

    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
