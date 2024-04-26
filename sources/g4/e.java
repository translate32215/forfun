package g4;

import java.util.concurrent.Executor;

/* compiled from: Executors */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f18454a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f18455b = new b();

    /* compiled from: Executors */
    public class a implements Executor {
        public void execute(Runnable runnable) {
            j.f().post(runnable);
        }
    }

    /* compiled from: Executors */
    public class b implements Executor {
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
