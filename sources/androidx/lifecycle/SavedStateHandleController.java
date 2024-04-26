package androidx.lifecycle;

import androidx.lifecycle.o;
import w1.a;

final class SavedStateHandleController implements r {

    /* renamed from: a  reason: collision with root package name */
    public final String f2614a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2615b = false;

    /* renamed from: c  reason: collision with root package name */
    public final i0 f2616c;

    public SavedStateHandleController(String str, i0 i0Var) {
        this.f2614a = str;
        this.f2616c = i0Var;
    }

    public void d(t tVar, o.b bVar) {
        if (bVar == o.b.ON_DESTROY) {
            this.f2615b = false;
            tVar.c().c(this);
        }
    }

    public void h(a aVar, o oVar) {
        if (!this.f2615b) {
            this.f2615b = true;
            oVar.a(this);
            aVar.d(this.f2614a, this.f2616c.f2670e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }
}
