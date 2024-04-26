package l0;

import f0.g;
import g0.e;

/* compiled from: CallbackWithHandler */
public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f20967a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f20968b;

    public b(c cVar, p pVar, int i10) {
        this.f20967a = pVar;
        this.f20968b = i10;
    }

    public void run() {
        p pVar = this.f20967a;
        int i10 = this.f20968b;
        g.f fVar = ((e.a) pVar).f18364a;
        if (fVar != null) {
            fVar.d(i10);
        }
    }
}
