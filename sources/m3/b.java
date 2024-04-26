package m3;

import m3.a;

/* compiled from: ActiveResources */
public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f21506a;

    public b(a aVar) {
        this.f21506a = aVar;
    }

    public void run() {
        a aVar = this.f21506a;
        aVar.getClass();
        while (true) {
            try {
                aVar.b((a.b) aVar.f21498d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
