package t1;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import androidx.room.migration.Migration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import s.j;
import x1.b;

/* compiled from: RoomDatabase */
public abstract class e {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public volatile x1.a f25373a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f25374b;

    /* renamed from: c  reason: collision with root package name */
    public x1.b f25375c;

    /* renamed from: d  reason: collision with root package name */
    public final d f25376d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25377e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f25378f;
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public List<b> f25379g;

    /* renamed from: h  reason: collision with root package name */
    public final ReentrantReadWriteLock f25380h = new ReentrantReadWriteLock();

    /* renamed from: i  reason: collision with root package name */
    public final ThreadLocal<Integer> f25381i = new ThreadLocal<>();

    /* compiled from: RoomDatabase */
    public static class a<T extends e> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f25382a;

        /* renamed from: b  reason: collision with root package name */
        public final String f25383b;

        /* renamed from: c  reason: collision with root package name */
        public final Context f25384c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<b> f25385d;

        /* renamed from: e  reason: collision with root package name */
        public Executor f25386e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f25387f;

        /* renamed from: g  reason: collision with root package name */
        public b.C0274b f25388g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f25389h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f25390i = true;

        /* renamed from: j  reason: collision with root package name */
        public boolean f25391j;

        /* renamed from: k  reason: collision with root package name */
        public final c f25392k = new c();

        /* renamed from: l  reason: collision with root package name */
        public Set<Integer> f25393l;

        public a(Context context, Class<T> cls, String str) {
            this.f25384c = context;
            this.f25382a = cls;
            this.f25383b = str;
        }

        public a<T> a(Migration... migrationArr) {
            if (this.f25393l == null) {
                this.f25393l = new HashSet();
            }
            for (u1.a aVar : migrationArr) {
                this.f25393l.add(Integer.valueOf(aVar.f25916a));
                this.f25393l.add(Integer.valueOf(aVar.f25917b));
            }
            c cVar = this.f25392k;
            cVar.getClass();
            for (u1.a aVar2 : migrationArr) {
                int i10 = aVar2.f25916a;
                int i11 = aVar2.f25917b;
                j d10 = cVar.f25394a.d(i10);
                if (d10 == null) {
                    d10 = new j();
                    cVar.f25394a.h(i10, d10);
                }
                u1.a aVar3 = (u1.a) d10.d(i11);
                if (aVar3 != null) {
                    Log.w("ROOM", "Overriding migration " + aVar3 + " with " + aVar2);
                }
                d10.a(i11, aVar2);
            }
            return this;
        }
    }

    /* compiled from: RoomDatabase */
    public static abstract class b {
        public void a(x1.a aVar) {
        }
    }

    /* compiled from: RoomDatabase */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public j<j<u1.a>> f25394a = new j<>();
    }

    public e() {
        new ConcurrentHashMap();
        this.f25376d = e();
    }

    public void a() {
        if (!this.f25377e) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
        }
    }

    public void b() {
        if (!h() && this.f25381i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        x1.a a10 = ((y1.b) this.f25375c).a();
        this.f25376d.d(a10);
        ((y1.a) a10).f27981a.beginTransaction();
    }

    public y1.e d(String str) {
        a();
        b();
        return new y1.e(((y1.a) ((y1.b) this.f25375c).a()).f27981a.compileStatement(str));
    }

    public abstract d e();

    public abstract x1.b f(a aVar);

    @Deprecated
    public void g() {
        ((y1.a) ((y1.b) this.f25375c).a()).f27981a.endTransaction();
        if (!h()) {
            d dVar = this.f25376d;
            if (dVar.f25357e.compareAndSet(false, true)) {
                dVar.f25356d.f25374b.execute(dVar.f25362j);
            }
        }
    }

    public boolean h() {
        return ((y1.a) ((y1.b) this.f25375c).a()).f27981a.inTransaction();
    }

    public boolean i() {
        x1.a aVar = this.f25373a;
        return aVar != null && ((y1.a) aVar).f27981a.isOpen();
    }

    @Deprecated
    public void j() {
        ((y1.a) ((y1.b) this.f25375c).a()).f27981a.setTransactionSuccessful();
    }
}
