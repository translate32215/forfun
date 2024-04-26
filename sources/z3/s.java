package z3;

import d4.h;
import g4.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: TargetTracker */
public final class s implements l {

    /* renamed from: a  reason: collision with root package name */
    public final Set<h<?>> f28277a = Collections.newSetFromMap(new WeakHashMap());

    public void Z() {
        Iterator it = ((ArrayList) j.e(this.f28277a)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).Z();
        }
    }

    public void onDestroy() {
        Iterator it = ((ArrayList) j.e(this.f28277a)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onDestroy();
        }
    }

    public void v0() {
        Iterator it = ((ArrayList) j.e(this.f28277a)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).v0();
        }
    }
}
