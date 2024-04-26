package p2;

import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import g2.e;
import g2.g;
import h2.b;
import h2.h;
import java.util.LinkedList;
import o2.k;
import o2.l;

/* compiled from: CancelWorkRunnable */
public abstract class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final b f23781a = new b();

    public void a(h hVar, String str) {
        WorkDatabase workDatabase = hVar.f18830c;
        k n10 = workDatabase.n();
        o2.b k10 = workDatabase.k();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            l lVar = (l) n10;
            d e10 = lVar.e(str2);
            if (!(e10 == d.SUCCEEDED || e10 == d.FAILED)) {
                lVar.n(d.CANCELLED, str2);
            }
            linkedList.addAll(((o2.c) k10).a(str2));
        }
        h2.c cVar = hVar.f18833f;
        synchronized (cVar.f18810i) {
            e c10 = e.c();
            String str3 = h2.c.f18801r;
            c10.a(str3, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            cVar.f18808g.add(str);
            h2.k remove = cVar.f18806e.remove(str);
            if (remove != null) {
                remove.b();
                e.c().a(str3, String.format("WorkerWrapper cancelled for %s", new Object[]{str}), new Throwable[0]);
            } else {
                e.c().a(str3, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            }
        }
        for (h2.d b10 : hVar.f18832e) {
            b10.b(str);
        }
    }

    public abstract void b();

    public void run() {
        try {
            b();
            this.f23781a.a(g.f18410a);
        } catch (Throwable th) {
            this.f23781a.a(new g.b.a(th));
        }
    }
}
