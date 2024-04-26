package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import g2.e;
import h2.h;
import java.util.Collections;
import java.util.List;
import l2.c;
import o2.j;
import o2.l;
import q2.b;
import q2.d;

public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: r  reason: collision with root package name */
    public static final String f3328r = e.e("ConstraintTrkngWrkr");

    /* renamed from: e  reason: collision with root package name */
    public WorkerParameters f3329e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f3330f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f3331g = false;

    /* renamed from: h  reason: collision with root package name */
    public d<ListenableWorker.a> f3332h = new d<>();

    /* renamed from: i  reason: collision with root package name */
    public ListenableWorker f3333i;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            String b10 = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (TextUtils.isEmpty(b10)) {
                e.c().b(ConstraintTrackingWorker.f3328r, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.a();
                return;
            }
            ListenableWorker a10 = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), b10, constraintTrackingWorker.f3329e);
            constraintTrackingWorker.f3333i = a10;
            if (a10 == null) {
                e.c().a(ConstraintTrackingWorker.f3328r, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.a();
                return;
            }
            j h10 = ((l) h.c(constraintTrackingWorker.getApplicationContext()).f18830c.n()).h(constraintTrackingWorker.getId().toString());
            if (h10 == null) {
                constraintTrackingWorker.a();
                return;
            }
            l2.d dVar = new l2.d(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
            dVar.b(Collections.singletonList(h10));
            if (dVar.a(constraintTrackingWorker.getId().toString())) {
                e.c().a(ConstraintTrackingWorker.f3328r, String.format("Constraints met for delegate %s", new Object[]{b10}), new Throwable[0]);
                try {
                    ea.a<ListenableWorker.a> startWork = constraintTrackingWorker.f3333i.startWork();
                    ((b) startWork).a(new s2.a(constraintTrackingWorker, startWork), constraintTrackingWorker.getBackgroundExecutor());
                } catch (Throwable th) {
                    e c10 = e.c();
                    String str = ConstraintTrackingWorker.f3328r;
                    c10.a(str, String.format("Delegated worker %s threw exception in startWork.", new Object[]{b10}), th);
                    synchronized (constraintTrackingWorker.f3330f) {
                        if (constraintTrackingWorker.f3331g) {
                            e.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                            constraintTrackingWorker.b();
                        } else {
                            constraintTrackingWorker.a();
                        }
                    }
                }
            } else {
                e.c().a(ConstraintTrackingWorker.f3328r, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{b10}), new Throwable[0]);
                constraintTrackingWorker.b();
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f3329e = workerParameters;
    }

    public void a() {
        this.f3332h.j(new ListenableWorker.a.C0040a());
    }

    public void b() {
        this.f3332h.j(new ListenableWorker.a.b());
    }

    public void c(List<String> list) {
        e.c().a(f3328r, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f3330f) {
            this.f3331g = true;
        }
    }

    public void e(List<String> list) {
    }

    public r2.a getTaskExecutor() {
        return h.c(getApplicationContext()).f18831d;
    }

    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f3333i;
        if (listenableWorker != null) {
            listenableWorker.stop();
        }
    }

    public ea.a<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f3332h;
    }
}
