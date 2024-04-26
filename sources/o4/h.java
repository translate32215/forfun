package o4;

import java.util.concurrent.Executor;
import l0.e;

/* compiled from: SafeLoggingExecutor */
public class h implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f22950a;

    /* compiled from: SafeLoggingExecutor */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f22951a;

        public a(Runnable runnable) {
            this.f22951a = runnable;
        }

        public void run() {
            try {
                this.f22951a.run();
            } catch (Exception e10) {
                e.e("Executor", "Background execution failure.", e10);
            }
        }
    }

    public h(Executor executor) {
        this.f22950a = executor;
    }

    public void execute(Runnable runnable) {
        this.f22950a.execute(new a(runnable));
    }
}
