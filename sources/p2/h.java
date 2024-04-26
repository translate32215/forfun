package p2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SerialExecutor */
public class h implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque<a> f23791a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f23792b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f23793c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public volatile Runnable f23794d;

    /* compiled from: SerialExecutor */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final h f23795a;

        /* renamed from: b  reason: collision with root package name */
        public final Runnable f23796b;

        public a(h hVar, Runnable runnable) {
            this.f23795a = hVar;
            this.f23796b = runnable;
        }

        public void run() {
            try {
                this.f23796b.run();
            } finally {
                this.f23795a.a();
            }
        }
    }

    public h(Executor executor) {
        this.f23792b = executor;
    }

    public void a() {
        synchronized (this.f23793c) {
            Runnable poll = this.f23791a.poll();
            this.f23794d = poll;
            if (poll != null) {
                this.f23792b.execute(this.f23794d);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f23793c) {
            this.f23791a.add(new a(this, runnable));
            if (this.f23794d == null) {
                a();
            }
        }
    }
}
