package e8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public interface o50 extends ExecutorService {
    <T> p50<T> i(Callable<T> callable);
}
