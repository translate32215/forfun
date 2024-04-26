package s8;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public final class y implements Executor {
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
