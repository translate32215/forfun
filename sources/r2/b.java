package r2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p2.h;

/* compiled from: WorkManagerTaskExecutor */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f24500a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f24501b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final Executor f24502c = new a();

    /* compiled from: WorkManagerTaskExecutor */
    public class a implements Executor {
        public a() {
        }

        public void execute(Runnable runnable) {
            b.this.f24501b.post(runnable);
        }
    }

    public b(Executor executor) {
        this.f24500a = new h(executor);
    }
}
