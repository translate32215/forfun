package m3;

import android.os.Process;
import e.e;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import k3.c;
import m3.q;

/* compiled from: ActiveResources */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21495a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f21496b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<c, b> f21497c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final ReferenceQueue<q<?>> f21498d = new ReferenceQueue<>();

    /* renamed from: e  reason: collision with root package name */
    public q.a f21499e;

    /* renamed from: m3.a$a  reason: collision with other inner class name */
    /* compiled from: ActiveResources */
    public class C0191a implements ThreadFactory {

        /* renamed from: m3.a$a$a  reason: collision with other inner class name */
        /* compiled from: ActiveResources */
        public class C0192a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f21500a;

            public C0192a(C0191a aVar, Runnable runnable) {
                this.f21500a = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f21500a.run();
            }
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C0192a(this, runnable), "glide-active-resources");
        }
    }

    /* compiled from: ActiveResources */
    public static final class b extends WeakReference<q<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final c f21501a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f21502b;

        /* renamed from: c  reason: collision with root package name */
        public w<?> f21503c;

        public b(c cVar, q<?> qVar, ReferenceQueue<? super q<?>> referenceQueue, boolean z10) {
            super(qVar, referenceQueue);
            w<?> wVar;
            if (cVar != null) {
                this.f21501a = cVar;
                if (!qVar.f21650a || !z10) {
                    wVar = null;
                } else {
                    w<Z> wVar2 = qVar.f21652c;
                    e.b(wVar2);
                    wVar = wVar2;
                }
                this.f21503c = wVar;
                this.f21502b = qVar.f21650a;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
    }

    public a(boolean z10) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new C0191a());
        this.f21495a = z10;
        this.f21496b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new b(this));
    }

    public synchronized void a(c cVar, q<?> qVar) {
        b put = this.f21497c.put(cVar, new b(cVar, qVar, this.f21498d, this.f21495a));
        if (put != null) {
            put.f21503c = null;
            put.clear();
        }
    }

    public void b(b bVar) {
        synchronized (this) {
            this.f21497c.remove(bVar.f21501a);
            if (bVar.f21502b) {
                w<?> wVar = bVar.f21503c;
                if (wVar != null) {
                    this.f21499e.a(bVar.f21501a, new q(wVar, true, false, bVar.f21501a, this.f21499e));
                }
            }
        }
    }
}
