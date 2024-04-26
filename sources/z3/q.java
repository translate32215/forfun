package z3;

import c4.c;
import g4.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: RequestTracker */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public final Set<c> f28267a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f28268b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f28269c;

    public boolean a(c cVar) {
        boolean z10 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = this.f28267a.remove(cVar);
        if (!this.f28268b.remove(cVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            cVar.clear();
        }
        return z10;
    }

    public void b() {
        Iterator it = ((ArrayList) j.e(this.f28267a)).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!cVar.l() && !cVar.j()) {
                cVar.clear();
                if (!this.f28269c) {
                    cVar.k();
                } else {
                    this.f28268b.add(cVar);
                }
            }
        }
    }

    public void c() {
        this.f28269c = false;
        Iterator it = ((ArrayList) j.e(this.f28267a)).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!cVar.l() && !cVar.isRunning()) {
                cVar.k();
            }
        }
        this.f28268b.clear();
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f28267a.size() + ", isPaused=" + this.f28269c + "}";
    }
}
