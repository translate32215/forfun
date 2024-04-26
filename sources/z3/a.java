package z3;

import g4.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: ActivityFragmentLifecycle */
public class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Set<l> f28241a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public boolean f28242b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f28243c;

    public void a(l lVar) {
        this.f28241a.remove(lVar);
    }

    public void b(l lVar) {
        this.f28241a.add(lVar);
        if (this.f28243c) {
            lVar.onDestroy();
        } else if (this.f28242b) {
            lVar.v0();
        } else {
            lVar.Z();
        }
    }

    public void c() {
        this.f28243c = true;
        Iterator it = ((ArrayList) j.e(this.f28241a)).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onDestroy();
        }
    }

    public void d() {
        this.f28242b = true;
        Iterator it = ((ArrayList) j.e(this.f28241a)).iterator();
        while (it.hasNext()) {
            ((l) it.next()).v0();
        }
    }

    public void e() {
        this.f28242b = false;
        Iterator it = ((ArrayList) j.e(this.f28241a)).iterator();
        while (it.hasNext()) {
            ((l) it.next()).Z();
        }
    }
}
