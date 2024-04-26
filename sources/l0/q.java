package l0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: RequestExecutor */
public class q implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public String f21001a;

    /* renamed from: b  reason: collision with root package name */
    public int f21002b;

    /* compiled from: RequestExecutor */
    public static class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final int f21003a;

        public a(Runnable runnable, String str, int i10) {
            super(runnable, str);
            this.f21003a = i10;
        }

        public void run() {
            Process.setThreadPriority(this.f21003a);
            super.run();
        }
    }

    public q(String str, int i10) {
        this.f21001a = str;
        this.f21002b = i10;
    }

    public Thread newThread(Runnable runnable) {
        return new a(runnable, this.f21001a, this.f21002b);
    }
}
