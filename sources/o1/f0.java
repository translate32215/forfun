package o1;

import android.os.Bundle;
import e.i;
import ge.b;
import ge.e;
import ge.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import ld.l;
import ld.n;
import ld.p;
import ud.k;

/* compiled from: NavigatorState.kt */
public abstract class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f22681a = new ReentrantLock(true);

    /* renamed from: b  reason: collision with root package name */
    public final b<List<h>> f22682b;

    /* renamed from: c  reason: collision with root package name */
    public final b<Set<h>> f22683c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22684d;

    /* renamed from: e  reason: collision with root package name */
    public final e<List<h>> f22685e;

    /* renamed from: f  reason: collision with root package name */
    public final e<Set<h>> f22686f;

    public f0() {
        f fVar = new f(n.f21256a);
        this.f22682b = fVar;
        f fVar2 = new f(p.f21258a);
        this.f22683c = fVar2;
        this.f22685e = i.b(fVar);
        this.f22686f = i.b(fVar2);
    }

    public abstract h a(r rVar, Bundle bundle);

    public void b(h hVar) {
        b<List<h>> bVar = this.f22682b;
        Iterable value = bVar.getValue();
        Object n10 = l.n(this.f22682b.getValue());
        k.f(value, "<this>");
        ArrayList arrayList = new ArrayList(ld.i.f(value, 10));
        boolean z10 = false;
        for (Object next : value) {
            boolean z11 = true;
            if (!z10 && k.a(next, n10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(next);
            }
        }
        bVar.setValue(l.r(arrayList, hVar));
    }

    public void c(h hVar, boolean z10) {
        k.f(hVar, "popUpTo");
        ReentrantLock reentrantLock = this.f22681a;
        reentrantLock.lock();
        try {
            b<List<h>> bVar = this.f22682b;
            ArrayList arrayList = new ArrayList();
            Iterator it = bVar.getValue().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!(!k.a((h) next, hVar))) {
                    break;
                }
                arrayList.add(next);
            }
            bVar.setValue(arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    public void d(h hVar) {
        k.f(hVar, "backStackEntry");
        ReentrantLock reentrantLock = this.f22681a;
        reentrantLock.lock();
        try {
            b<List<h>> bVar = this.f22682b;
            bVar.setValue(l.r(bVar.getValue(), hVar));
        } finally {
            reentrantLock.unlock();
        }
    }
}
