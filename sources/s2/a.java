package s2;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: ConstraintTrackingWorker */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ea.a f24902a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f24903b;

    public a(ConstraintTrackingWorker constraintTrackingWorker, ea.a aVar) {
        this.f24903b = constraintTrackingWorker;
        this.f24902a = aVar;
    }

    public void run() {
        synchronized (this.f24903b.f3330f) {
            if (this.f24903b.f3331g) {
                this.f24903b.b();
            } else {
                this.f24903b.f3332h.l(this.f24902a);
            }
        }
    }
}
