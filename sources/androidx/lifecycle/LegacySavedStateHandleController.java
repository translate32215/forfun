package androidx.lifecycle;

import androidx.lifecycle.o;
import java.util.HashSet;
import java.util.Iterator;
import w1.a;
import w1.c;

public class LegacySavedStateHandleController {

    public static final class a implements a.C0269a {
        public void a(c cVar) {
            if (cVar instanceof v0) {
                u0 v10 = ((v0) cVar).v();
                w1.a e10 = cVar.e();
                v10.getClass();
                Iterator it = new HashSet(v10.f2735a.keySet()).iterator();
                while (it.hasNext()) {
                    LegacySavedStateHandleController.a(v10.f2735a.get((String) it.next()), e10, cVar.c());
                }
                if (!new HashSet(v10.f2735a.keySet()).isEmpty()) {
                    e10.e(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    public static void a(q0 q0Var, w1.a aVar, o oVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) q0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.f2615b) {
            savedStateHandleController.h(aVar, oVar);
            b(aVar, oVar);
        }
    }

    public static void b(final w1.a aVar, final o oVar) {
        o.c b10 = oVar.b();
        if (b10 != o.c.INITIALIZED) {
            if (!(b10.compareTo(o.c.STARTED) >= 0)) {
                oVar.a(new r() {
                    public void d(t tVar, o.b bVar) {
                        if (bVar == o.b.ON_START) {
                            o.this.c(this);
                            aVar.e(a.class);
                        }
                    }
                });
                return;
            }
        }
        aVar.e(a.class);
    }
}
