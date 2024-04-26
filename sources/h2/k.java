package h2;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import g2.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import o2.b;
import o2.c;
import o2.j;
import o2.l;
import o2.n;
import o2.o;
import p2.f;
import q2.d;
import t1.g;

/* compiled from: WorkerWrapper */
public class k implements Runnable {
    public static final String A = e.e("WorkerWrapper");

    /* renamed from: a  reason: collision with root package name */
    public Context f18842a;

    /* renamed from: b  reason: collision with root package name */
    public String f18843b;

    /* renamed from: c  reason: collision with root package name */
    public List<d> f18844c;

    /* renamed from: d  reason: collision with root package name */
    public WorkerParameters.a f18845d;

    /* renamed from: e  reason: collision with root package name */
    public j f18846e;

    /* renamed from: f  reason: collision with root package name */
    public ListenableWorker f18847f;

    /* renamed from: g  reason: collision with root package name */
    public ListenableWorker.a f18848g = new ListenableWorker.a.C0040a();

    /* renamed from: h  reason: collision with root package name */
    public g2.a f18849h;

    /* renamed from: i  reason: collision with root package name */
    public r2.a f18850i;

    /* renamed from: r  reason: collision with root package name */
    public WorkDatabase f18851r;

    /* renamed from: s  reason: collision with root package name */
    public o2.k f18852s;

    /* renamed from: t  reason: collision with root package name */
    public b f18853t;

    /* renamed from: u  reason: collision with root package name */
    public n f18854u;

    /* renamed from: v  reason: collision with root package name */
    public List<String> f18855v;

    /* renamed from: w  reason: collision with root package name */
    public String f18856w;

    /* renamed from: x  reason: collision with root package name */
    public d<Boolean> f18857x = new d<>();

    /* renamed from: y  reason: collision with root package name */
    public ea.a<ListenableWorker.a> f18858y = null;

    /* renamed from: z  reason: collision with root package name */
    public volatile boolean f18859z;

    /* compiled from: WorkerWrapper */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f18860a;

        /* renamed from: b  reason: collision with root package name */
        public r2.a f18861b;

        /* renamed from: c  reason: collision with root package name */
        public g2.a f18862c;

        /* renamed from: d  reason: collision with root package name */
        public WorkDatabase f18863d;

        /* renamed from: e  reason: collision with root package name */
        public String f18864e;

        /* renamed from: f  reason: collision with root package name */
        public List<d> f18865f;

        /* renamed from: g  reason: collision with root package name */
        public WorkerParameters.a f18866g = new WorkerParameters.a();

        public a(Context context, g2.a aVar, r2.a aVar2, WorkDatabase workDatabase, String str) {
            this.f18860a = context.getApplicationContext();
            this.f18861b = aVar2;
            this.f18862c = aVar;
            this.f18863d = workDatabase;
            this.f18864e = str;
        }
    }

    public k(a aVar) {
        this.f18842a = aVar.f18860a;
        this.f18850i = aVar.f18861b;
        this.f18843b = aVar.f18864e;
        this.f18844c = aVar.f18865f;
        this.f18845d = aVar.f18866g;
        this.f18847f = null;
        this.f18849h = aVar.f18862c;
        WorkDatabase workDatabase = aVar.f18863d;
        this.f18851r = workDatabase;
        this.f18852s = workDatabase.n();
        this.f18853t = this.f18851r.k();
        this.f18854u = this.f18851r.o();
    }

    public final void a(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            e.c().d(A, String.format("Worker result SUCCESS for %s", new Object[]{this.f18856w}), new Throwable[0]);
            if (this.f18846e.d()) {
                f();
                return;
            }
            this.f18851r.c();
            try {
                o2.k kVar = this.f18852s;
                ((l) kVar).n(androidx.work.d.SUCCEEDED, this.f18843b);
                androidx.work.b bVar = ((ListenableWorker.a.c) this.f18848g).f3221a;
                ((l) this.f18852s).l(this.f18843b, bVar);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((ArrayList) ((c) this.f18853t).a(this.f18843b)).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (((l) this.f18852s).e(str) == androidx.work.d.BLOCKED && ((c) this.f18853t).b(str)) {
                        e.c().d(A, String.format("Setting status to enqueued for %s", new Object[]{str}), new Throwable[0]);
                        o2.k kVar2 = this.f18852s;
                        ((l) kVar2).n(androidx.work.d.ENQUEUED, str);
                        ((l) this.f18852s).m(str, currentTimeMillis);
                    }
                }
                this.f18851r.j();
            } finally {
                this.f18851r.g();
                g(false);
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            e.c().d(A, String.format("Worker result RETRY for %s", new Object[]{this.f18856w}), new Throwable[0]);
            e();
        } else {
            e.c().d(A, String.format("Worker result FAILURE for %s", new Object[]{this.f18856w}), new Throwable[0]);
            if (this.f18846e.d()) {
                f();
            } else {
                i();
            }
        }
    }

    public void b() {
        this.f18859z = true;
        j();
        ea.a<ListenableWorker.a> aVar = this.f18858y;
        if (aVar != null) {
            ((q2.b) aVar).cancel(true);
        }
        ListenableWorker listenableWorker = this.f18847f;
        if (listenableWorker != null) {
            listenableWorker.stop();
        }
    }

    public final void c(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((l) this.f18852s).e(str2) != androidx.work.d.CANCELLED) {
                o2.k kVar = this.f18852s;
                ((l) kVar).n(androidx.work.d.FAILED, str2);
            }
            linkedList.addAll(((c) this.f18853t).a(str2));
        }
    }

    public void d() {
        boolean z10 = false;
        if (!j()) {
            this.f18851r.c();
            try {
                androidx.work.d e10 = ((l) this.f18852s).e(this.f18843b);
                if (e10 == null) {
                    g(false);
                    z10 = true;
                } else if (e10 == androidx.work.d.RUNNING) {
                    a(this.f18848g);
                    z10 = ((l) this.f18852s).e(this.f18843b).a();
                } else if (!e10.a()) {
                    e();
                }
                this.f18851r.j();
            } finally {
                this.f18851r.g();
            }
        }
        List<d> list = this.f18844c;
        if (list != null) {
            if (z10) {
                for (d b10 : list) {
                    b10.b(this.f18843b);
                }
            }
            e.a(this.f18849h, this.f18851r, this.f18844c);
        }
    }

    public final void e() {
        this.f18851r.c();
        try {
            o2.k kVar = this.f18852s;
            ((l) kVar).n(androidx.work.d.ENQUEUED, this.f18843b);
            ((l) this.f18852s).m(this.f18843b, System.currentTimeMillis());
            ((l) this.f18852s).j(this.f18843b, -1);
            this.f18851r.j();
        } finally {
            this.f18851r.g();
            g(true);
        }
    }

    public final void f() {
        this.f18851r.c();
        try {
            ((l) this.f18852s).m(this.f18843b, System.currentTimeMillis());
            o2.k kVar = this.f18852s;
            ((l) kVar).n(androidx.work.d.ENQUEUED, this.f18843b);
            ((l) this.f18852s).k(this.f18843b);
            ((l) this.f18852s).j(this.f18843b, -1);
            this.f18851r.j();
        } finally {
            this.f18851r.g();
            g(false);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void g(boolean z10) {
        this.f18851r.c();
        try {
            if (((ArrayList) ((l) this.f18851r.n()).a()).isEmpty()) {
                f.a(this.f18842a, RescheduleReceiver.class, false);
            }
            this.f18851r.j();
            this.f18851r.g();
            this.f18857x.j(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.f18851r.g();
            throw th;
        }
    }

    public final void h() {
        androidx.work.d e10 = ((l) this.f18852s).e(this.f18843b);
        if (e10 == androidx.work.d.RUNNING) {
            e.c().a(A, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f18843b}), new Throwable[0]);
            g(true);
            return;
        }
        e.c().a(A, String.format("Status for %s is %s; not doing any work", new Object[]{this.f18843b, e10}), new Throwable[0]);
        g(false);
    }

    public void i() {
        this.f18851r.c();
        try {
            c(this.f18843b);
            androidx.work.b bVar = ((ListenableWorker.a.C0040a) this.f18848g).f3220a;
            ((l) this.f18852s).l(this.f18843b, bVar);
            this.f18851r.j();
        } finally {
            this.f18851r.g();
            g(false);
        }
    }

    public final boolean j() {
        if (!this.f18859z) {
            return false;
        }
        e.c().a(A, String.format("Work interrupted for %s", new Object[]{this.f18856w}), new Throwable[0]);
        androidx.work.d e10 = ((l) this.f18852s).e(this.f18843b);
        if (e10 == null) {
            g(false);
        } else {
            g(!e10.a());
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    public void run() {
        g2.d dVar;
        androidx.work.b a10;
        n nVar = this.f18854u;
        String str = this.f18843b;
        o oVar = (o) nVar;
        oVar.getClass();
        boolean z10 = true;
        g i10 = g.i("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            i10.s(1);
        } else {
            i10.t(1, str);
        }
        oVar.f22893a.b();
        Cursor a11 = v1.a.a(oVar.f22893a, i10, false);
        try {
            ArrayList<String> arrayList = new ArrayList<>(a11.getCount());
            while (a11.moveToNext()) {
                arrayList.add(a11.getString(0));
            }
            a11.close();
            i10.u();
            this.f18855v = arrayList;
            StringBuilder sb2 = new StringBuilder("Work [ id=");
            sb2.append(this.f18843b);
            sb2.append(", tags={ ");
            boolean z11 = true;
            for (String str2 : arrayList) {
                if (z11) {
                    z11 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(str2);
            }
            sb2.append(" } ]");
            this.f18856w = sb2.toString();
            androidx.work.d dVar2 = androidx.work.d.ENQUEUED;
            if (!j()) {
                this.f18851r.c();
                try {
                    j h10 = ((l) this.f18852s).h(this.f18843b);
                    this.f18846e = h10;
                    if (h10 == null) {
                        e.c().b(A, String.format("Didn't find WorkSpec for id %s", new Object[]{this.f18843b}), new Throwable[0]);
                        g(false);
                    } else if (h10.f22865b != dVar2) {
                        h();
                        this.f18851r.j();
                        e.c().a(A, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.f18846e.f22866c}), new Throwable[0]);
                    } else {
                        if (h10.d() || this.f18846e.c()) {
                            long currentTimeMillis = System.currentTimeMillis();
                            j jVar = this.f18846e;
                            if (!(jVar.f22877n == 0) && currentTimeMillis < jVar.a()) {
                                e.c().a(A, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f18846e.f22866c}), new Throwable[0]);
                                g(true);
                            }
                        }
                        this.f18851r.j();
                        this.f18851r.g();
                        if (this.f18846e.d()) {
                            a10 = this.f18846e.f22868e;
                        } else {
                            String str3 = this.f18846e.f22867d;
                            String str4 = g2.d.f18407a;
                            try {
                                dVar = (g2.d) Class.forName(str3).newInstance();
                            } catch (Exception e10) {
                                e.c().b(g2.d.f18407a, j.f.a("Trouble instantiating + ", str3), e10);
                                dVar = null;
                            }
                            if (dVar == null) {
                                e.c().b(A, String.format("Could not create Input Merger %s", new Object[]{this.f18846e.f22867d}), new Throwable[0]);
                                i();
                                return;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(this.f18846e.f22868e);
                            o2.k kVar = this.f18852s;
                            String str5 = this.f18843b;
                            l lVar = (l) kVar;
                            lVar.getClass();
                            g i11 = g.i("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                            if (str5 == null) {
                                i11.s(1);
                            } else {
                                i11.t(1, str5);
                            }
                            lVar.f22882a.b();
                            Cursor a12 = v1.a.a(lVar.f22882a, i11, false);
                            try {
                                ArrayList arrayList3 = new ArrayList(a12.getCount());
                                while (a12.moveToNext()) {
                                    arrayList3.add(androidx.work.b.a(a12.getBlob(0)));
                                }
                                a12.close();
                                i11.u();
                                arrayList2.addAll(arrayList3);
                                a10 = dVar.a(arrayList2);
                            } catch (Throwable th) {
                                a12.close();
                                i11.u();
                                throw th;
                            }
                        }
                        androidx.work.b bVar = a10;
                        UUID fromString = UUID.fromString(this.f18843b);
                        List<String> list = this.f18855v;
                        WorkerParameters.a aVar = this.f18845d;
                        int i12 = this.f18846e.f22874k;
                        g2.a aVar2 = this.f18849h;
                        WorkerParameters workerParameters = new WorkerParameters(fromString, bVar, list, aVar, i12, aVar2.f18387a, this.f18850i, aVar2.f18389c);
                        if (this.f18847f == null) {
                            this.f18847f = this.f18849h.f18389c.a(this.f18842a, this.f18846e.f22866c, workerParameters);
                        }
                        ListenableWorker listenableWorker = this.f18847f;
                        if (listenableWorker == null) {
                            e.c().b(A, String.format("Could not create Worker %s", new Object[]{this.f18846e.f22866c}), new Throwable[0]);
                            i();
                        } else if (listenableWorker.isUsed()) {
                            e.c().b(A, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f18846e.f22866c}), new Throwable[0]);
                            i();
                        } else {
                            this.f18847f.setUsed();
                            this.f18851r.c();
                            try {
                                if (((l) this.f18852s).e(this.f18843b) == dVar2) {
                                    ((l) this.f18852s).n(androidx.work.d.RUNNING, this.f18843b);
                                    ((l) this.f18852s).i(this.f18843b);
                                } else {
                                    z10 = false;
                                }
                                this.f18851r.j();
                                if (!z10) {
                                    h();
                                } else if (!j()) {
                                    d dVar3 = new d();
                                    ((r2.b) this.f18850i).f24502c.execute(new i(this, dVar3));
                                    dVar3.a(new j(this, dVar3, this.f18856w), ((r2.b) this.f18850i).f24500a);
                                }
                            } finally {
                                this.f18851r.g();
                            }
                        }
                    }
                } finally {
                    this.f18851r.g();
                }
            }
        } catch (Throwable th2) {
            a11.close();
            i10.u();
            throw th2;
        }
    }
}
