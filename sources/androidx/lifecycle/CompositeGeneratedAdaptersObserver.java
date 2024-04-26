package androidx.lifecycle;

import androidx.lifecycle.o;
import cb.d;

class CompositeGeneratedAdaptersObserver implements r {

    /* renamed from: a  reason: collision with root package name */
    public final m[] f2587a;

    public CompositeGeneratedAdaptersObserver(m[] mVarArr) {
        this.f2587a = mVarArr;
    }

    public void d(t tVar, o.b bVar) {
        d dVar = new d(2);
        for (m a10 : this.f2587a) {
            a10.a(tVar, bVar, false, dVar);
        }
        for (m a11 : this.f2587a) {
            a11.a(tVar, bVar, true, dVar);
        }
    }
}
