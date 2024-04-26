package androidx.lifecycle;

import androidx.lifecycle.o;
import ud.k;

/* compiled from: SavedStateHandleSupport.kt */
public final class SavedStateHandleAttacher implements r {

    /* renamed from: a  reason: collision with root package name */
    public final k0 f2613a;

    public SavedStateHandleAttacher(k0 k0Var) {
        this.f2613a = k0Var;
    }

    public void d(t tVar, o.b bVar) {
        k.f(tVar, "source");
        k.f(bVar, "event");
        if (bVar == o.b.ON_CREATE) {
            tVar.c().c(this);
            this.f2613a.b();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + bVar).toString());
    }
}
