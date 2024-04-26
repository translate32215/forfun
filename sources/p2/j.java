package p2;

import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import g2.e;
import h2.h;
import o2.k;
import o2.l;

/* compiled from: StopWorkRunnable */
public class j implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public static final String f23800c = e.e("StopWorkRunnable");

    /* renamed from: a  reason: collision with root package name */
    public h f23801a;

    /* renamed from: b  reason: collision with root package name */
    public String f23802b;

    public j(h hVar, String str) {
        this.f23801a = hVar;
        this.f23802b = str;
    }

    public void run() {
        WorkDatabase workDatabase = this.f23801a.f18830c;
        k n10 = workDatabase.n();
        workDatabase.c();
        try {
            l lVar = (l) n10;
            if (lVar.e(this.f23802b) == d.RUNNING) {
                lVar.n(d.ENQUEUED, this.f23802b);
            }
            boolean d10 = this.f23801a.f18833f.d(this.f23802b);
            e.c().a(f23800c, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f23802b, Boolean.valueOf(d10)}), new Throwable[0]);
            workDatabase.j();
        } finally {
            workDatabase.g();
        }
    }
}
