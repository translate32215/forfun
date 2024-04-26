package n7;

import android.os.Process;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class u extends Thread {
    public u(Runnable runnable, String str) {
        super(runnable, str);
    }

    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
