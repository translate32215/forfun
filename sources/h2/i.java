package h2;

import g2.e;
import q2.d;

/* compiled from: WorkerWrapper */
public class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f18837a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f18838b;

    public i(k kVar, d dVar) {
        this.f18838b = kVar;
        this.f18837a = dVar;
    }

    public void run() {
        try {
            e.c().a(k.A, String.format("Starting work for %s", new Object[]{this.f18838b.f18846e.f22866c}), new Throwable[0]);
            k kVar = this.f18838b;
            kVar.f18858y = kVar.f18847f.startWork();
            this.f18837a.l(this.f18838b.f18858y);
        } catch (Throwable th) {
            this.f18837a.k(th);
        }
    }
}
