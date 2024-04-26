package c5;

import android.os.Handler;
import androidx.emoji2.text.f;
import f0.i;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import v6.e0;
import z5.r;

/* compiled from: DrmSessionEventListener */
public interface j {
    void E(int i10, r.a aVar);

    void N(int i10, r.a aVar, Exception exc);

    void U(int i10, r.a aVar);

    void t(int i10, r.a aVar);

    void x(int i10, r.a aVar);

    void y(int i10, r.a aVar);

    /* compiled from: DrmSessionEventListener */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f4330a;

        /* renamed from: b  reason: collision with root package name */
        public final r.a f4331b;

        /* renamed from: c  reason: collision with root package name */
        public final CopyOnWriteArrayList<C0061a> f4332c;

        /* renamed from: c5.j$a$a  reason: collision with other inner class name */
        /* compiled from: DrmSessionEventListener */
        public static final class C0061a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f4333a;

            /* renamed from: b  reason: collision with root package name */
            public j f4334b;

            public C0061a(Handler handler, j jVar) {
                this.f4333a = handler;
                this.f4334b = jVar;
            }
        }

        public a() {
            this.f4332c = new CopyOnWriteArrayList<>();
            this.f4330a = 0;
            this.f4331b = null;
        }

        public void a() {
            Iterator<C0061a> it = this.f4332c.iterator();
            while (it.hasNext()) {
                C0061a next = it.next();
                e0.N(next.f4333a, new i(this, next.f4334b, 1));
            }
        }

        public void b() {
            Iterator<C0061a> it = this.f4332c.iterator();
            while (it.hasNext()) {
                C0061a next = it.next();
                e0.N(next.f4333a, new i(this, next.f4334b, 0));
            }
        }

        public void c() {
            Iterator<C0061a> it = this.f4332c.iterator();
            while (it.hasNext()) {
                C0061a next = it.next();
                e0.N(next.f4333a, new h(this, next.f4334b, 1));
            }
        }

        public void d() {
            Iterator<C0061a> it = this.f4332c.iterator();
            while (it.hasNext()) {
                C0061a next = it.next();
                e0.N(next.f4333a, new h(this, next.f4334b, 0));
            }
        }

        public void e(Exception exc) {
            Iterator<C0061a> it = this.f4332c.iterator();
            while (it.hasNext()) {
                C0061a next = it.next();
                e0.N(next.f4333a, new f(this, next.f4334b, exc));
            }
        }

        public void f() {
            Iterator<C0061a> it = this.f4332c.iterator();
            while (it.hasNext()) {
                C0061a next = it.next();
                e0.N(next.f4333a, new i(this, next.f4334b));
            }
        }

        public a g(int i10, r.a aVar) {
            return new a(this.f4332c, i10, aVar);
        }

        public a(CopyOnWriteArrayList<C0061a> copyOnWriteArrayList, int i10, r.a aVar) {
            this.f4332c = copyOnWriteArrayList;
            this.f4330a = i10;
            this.f4331b = aVar;
        }
    }
}
