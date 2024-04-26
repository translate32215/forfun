package u2;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: LottieTask */
public class m<T> {

    /* renamed from: e  reason: collision with root package name */
    public static Executor f26014e = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    public final Set<g<T>> f26015a = new LinkedHashSet(1);

    /* renamed from: b  reason: collision with root package name */
    public final Set<g<Throwable>> f26016b = new LinkedHashSet(1);

    /* renamed from: c  reason: collision with root package name */
    public final Handler f26017c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public volatile k<T> f26018d = null;

    /* compiled from: LottieTask */
    public class a extends FutureTask<k<T>> {
        public a(Callable<k<T>> callable) {
            super(callable);
        }

        public void done() {
            if (!isCancelled()) {
                try {
                    m.this.c((k) get());
                } catch (InterruptedException | ExecutionException e10) {
                    m.this.c(new k(e10));
                }
            }
        }
    }

    public m(Callable<k<T>> callable) {
        f26014e.execute(new a(callable));
    }

    public synchronized m<T> a(g<Throwable> gVar) {
        if (!(this.f26018d == null || this.f26018d.f26012b == null)) {
            gVar.a(this.f26018d.f26012b);
        }
        this.f26016b.add(gVar);
        return this;
    }

    public synchronized m<T> b(g<T> gVar) {
        if (!(this.f26018d == null || this.f26018d.f26011a == null)) {
            gVar.a(this.f26018d.f26011a);
        }
        this.f26015a.add(gVar);
        return this;
    }

    public final void c(k<T> kVar) {
        if (this.f26018d == null) {
            this.f26018d = kVar;
            this.f26017c.post(new l(this));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
