package q1;

import android.util.Log;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import ld.l;
import o1.h;
import ud.k;

public final /* synthetic */ class b implements r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f24020a;

    public /* synthetic */ b(c cVar) {
        this.f24020a = cVar;
    }

    public final void d(t tVar, o.b bVar) {
        Object obj;
        c cVar = this.f24020a;
        k.f(cVar, "this$0");
        k.f(tVar, "source");
        k.f(bVar, "event");
        boolean z10 = false;
        if (bVar == o.b.ON_CREATE) {
            androidx.fragment.app.o oVar = (androidx.fragment.app.o) tVar;
            Iterable value = cVar.b().f22685e.getValue();
            if (!(value instanceof Collection) || !((Collection) value).isEmpty()) {
                Iterator it = value.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (k.a(((h) it.next()).f22700f, oVar.H)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!z10) {
                oVar.r0();
            }
        } else if (bVar == o.b.ON_STOP) {
            androidx.fragment.app.o oVar2 = (androidx.fragment.app.o) tVar;
            if (!oVar2.u0().isShowing()) {
                List value2 = cVar.b().f22685e.getValue();
                ListIterator listIterator = value2.listIterator(value2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (k.a(((h) obj).f22700f, oVar2.H)) {
                        break;
                    }
                }
                if (obj != null) {
                    h hVar = (h) obj;
                    if (!k.a(l.o(value2), hVar)) {
                        Log.i("DialogFragmentNavigator", "Dialog " + oVar2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                    }
                    cVar.i(hVar, false);
                    return;
                }
                throw new IllegalStateException(("Dialog " + oVar2 + " has already been popped off of the Navigation back stack").toString());
            }
        }
    }
}
