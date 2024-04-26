package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import q2.d;

public abstract class Worker extends ListenableWorker {

    /* renamed from: e  reason: collision with root package name */
    public d<ListenableWorker.a> f3222e;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                Worker.this.f3222e.j(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.f3222e.k(th);
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    public final ea.a<ListenableWorker.a> startWork() {
        this.f3222e = new d<>();
        getBackgroundExecutor().execute(new a());
        return this.f3222e;
    }
}
