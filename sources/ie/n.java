package ie;

import androidx.appcompat.widget.p;
import be.g;
import be.i;
import de.e1;
import java.util.Iterator;
import java.util.List;

/* compiled from: MainDispatchers.kt */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final e1 f19394a;

    static {
        Object obj;
        p.k("kotlinx.coroutines.fast.service.loader", true);
        List i10 = i.i(g.b(m.a()));
        Iterator it = i10.iterator();
        e1 e1Var = null;
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                int loadPriority = ((l) obj).getLoadPriority();
                do {
                    Object next = it.next();
                    int loadPriority2 = ((l) next).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        obj = next;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
        }
        l lVar = (l) obj;
        if (lVar != null) {
            try {
                e1Var = lVar.createDispatcher(i10);
            } catch (Throwable th) {
                lVar.hintOnError();
                throw th;
            }
        }
        if (e1Var != null) {
            f19394a = e1Var;
            return;
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
