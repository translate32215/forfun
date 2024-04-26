package v6;

import aa.m;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nonnull;
import v6.t;

/* compiled from: ListenerSet */
public final class o<T, E extends t> {

    /* renamed from: a  reason: collision with root package name */
    public final b f26478a;

    /* renamed from: b  reason: collision with root package name */
    public final b2.t f26479b;

    /* renamed from: c  reason: collision with root package name */
    public final m<E> f26480c;

    /* renamed from: d  reason: collision with root package name */
    public final b<T, E> f26481d;

    /* renamed from: e  reason: collision with root package name */
    public final CopyOnWriteArraySet<c<T, E>> f26482e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque<Runnable> f26483f = new ArrayDeque<>();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque<Runnable> f26484g = new ArrayDeque<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f26485h;

    /* compiled from: ListenerSet */
    public interface a<T> {
        void c(T t10);
    }

    /* compiled from: ListenerSet */
    public interface b<T, E extends t> {
        void c(T t10, E e10);
    }

    /* compiled from: ListenerSet */
    public static final class c<T, E extends t> {
        @Nonnull

        /* renamed from: a  reason: collision with root package name */
        public final T f26486a;

        /* renamed from: b  reason: collision with root package name */
        public E f26487b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f26488c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f26489d;

        public c(@Nonnull T t10, m<E> mVar) {
            this.f26486a = t10;
            this.f26487b = (t) mVar.get();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f26486a.equals(((c) obj).f26486a);
        }

        public int hashCode() {
            return this.f26486a.hashCode();
        }
    }

    public o(CopyOnWriteArraySet<c<T, E>> copyOnWriteArraySet, Looper looper, b bVar, m<E> mVar, b<T, E> bVar2) {
        this.f26478a = bVar;
        this.f26482e = copyOnWriteArraySet;
        this.f26480c = mVar;
        this.f26481d = bVar2;
        this.f26479b = bVar.c(looper, new m(this));
    }

    public void a() {
        if (!this.f26484g.isEmpty()) {
            if (!((Handler) this.f26479b.f3445b).hasMessages(0)) {
                this.f26479b.O(0).sendToTarget();
            }
            boolean z10 = !this.f26483f.isEmpty();
            this.f26483f.addAll(this.f26484g);
            this.f26484g.clear();
            if (!z10) {
                while (!this.f26483f.isEmpty()) {
                    this.f26483f.peekFirst().run();
                    this.f26483f.removeFirst();
                }
            }
        }
    }

    public void b(int i10, a<T> aVar) {
        this.f26484g.add(new n(new CopyOnWriteArraySet(this.f26482e), i10, (a) aVar));
    }

    public void c() {
        Iterator<c<T, E>> it = this.f26482e.iterator();
        while (it.hasNext()) {
            c next = it.next();
            b<T, E> bVar = this.f26481d;
            next.f26489d = true;
            if (next.f26488c) {
                bVar.c(next.f26486a, next.f26487b);
            }
        }
        this.f26482e.clear();
        this.f26485h = true;
    }
}
