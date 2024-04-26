package z5;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import v6.e0;
import x4.b0;
import x4.f;
import z5.r;

/* compiled from: MediaSourceEventListener */
public interface v {
    void B(int i10, r.a aVar, k kVar, n nVar);

    void H(int i10, r.a aVar, k kVar, n nVar, IOException iOException, boolean z10);

    void O(int i10, r.a aVar, n nVar);

    void R(int i10, r.a aVar, n nVar);

    void i(int i10, r.a aVar, k kVar, n nVar);

    void u(int i10, r.a aVar, k kVar, n nVar);

    /* compiled from: MediaSourceEventListener */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f28648a;

        /* renamed from: b  reason: collision with root package name */
        public final r.a f28649b;

        /* renamed from: c  reason: collision with root package name */
        public final CopyOnWriteArrayList<C0289a> f28650c;

        /* renamed from: d  reason: collision with root package name */
        public final long f28651d;

        /* renamed from: z5.v$a$a  reason: collision with other inner class name */
        /* compiled from: MediaSourceEventListener */
        public static final class C0289a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f28652a;

            /* renamed from: b  reason: collision with root package name */
            public v f28653b;

            public C0289a(Handler handler, v vVar) {
                this.f28652a = handler;
                this.f28653b = vVar;
            }
        }

        public a() {
            this.f28650c = new CopyOnWriteArrayList<>();
            this.f28648a = 0;
            this.f28649b = null;
            this.f28651d = 0;
        }

        public final long a(long j10) {
            long c10 = f.c(j10);
            if (c10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f28651d + c10;
        }

        public void b(int i10, b0 b0Var, int i11, Object obj, long j10) {
            c(new n(1, i10, b0Var, i11, obj, a(j10), -9223372036854775807L));
        }

        public void c(n nVar) {
            Iterator<C0289a> it = this.f28650c.iterator();
            while (it.hasNext()) {
                C0289a next = it.next();
                e0.N(next.f28652a, new androidx.emoji2.text.f(this, next.f28653b, nVar));
            }
        }

        public void d(k kVar, int i10) {
            e(kVar, i10, -1, (b0) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }

        public void e(k kVar, int i10, int i11, b0 b0Var, int i12, Object obj, long j10, long j11) {
            k kVar2 = kVar;
            f(kVar, new n(i10, i11, b0Var, i12, obj, a(j10), a(j11)));
        }

        public void f(k kVar, n nVar) {
            Iterator<C0289a> it = this.f28650c.iterator();
            while (it.hasNext()) {
                C0289a next = it.next();
                e0.N(next.f28652a, new s(this, next.f28653b, kVar, nVar, 1));
            }
        }

        public void g(k kVar, int i10) {
            h(kVar, i10, -1, (b0) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }

        public void h(k kVar, int i10, int i11, b0 b0Var, int i12, Object obj, long j10, long j11) {
            k kVar2 = kVar;
            i(kVar, new n(i10, i11, b0Var, i12, obj, a(j10), a(j11)));
        }

        public void i(k kVar, n nVar) {
            Iterator<C0289a> it = this.f28650c.iterator();
            while (it.hasNext()) {
                C0289a next = it.next();
                e0.N(next.f28652a, new s(this, next.f28653b, kVar, nVar, 0));
            }
        }

        public void j(k kVar, int i10, int i11, b0 b0Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            k kVar2 = kVar;
            l(kVar, new n(i10, i11, b0Var, i12, obj, a(j10), a(j11)), iOException, z10);
        }

        public void k(k kVar, int i10, IOException iOException, boolean z10) {
            j(kVar, i10, -1, (b0) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        public void l(k kVar, n nVar, IOException iOException, boolean z10) {
            Iterator<C0289a> it = this.f28650c.iterator();
            while (it.hasNext()) {
                C0289a next = it.next();
                e0.N(next.f28652a, new u(this, next.f28653b, kVar, nVar, iOException, z10));
            }
        }

        public void m(k kVar, int i10) {
            n(kVar, i10, -1, (b0) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }

        public void n(k kVar, int i10, int i11, b0 b0Var, int i12, Object obj, long j10, long j11) {
            k kVar2 = kVar;
            o(kVar, new n(i10, i11, b0Var, i12, obj, a(j10), a(j11)));
        }

        public void o(k kVar, n nVar) {
            Iterator<C0289a> it = this.f28650c.iterator();
            while (it.hasNext()) {
                C0289a next = it.next();
                e0.N(next.f28652a, new t(this, next.f28653b, kVar, nVar));
            }
        }

        public void p(int i10, long j10, long j11) {
            long j12 = j10;
            q(new n(1, i10, (b0) null, 3, (Object) null, a(j10), a(j11)));
        }

        public void q(n nVar) {
            r.a aVar = this.f28649b;
            aVar.getClass();
            Iterator<C0289a> it = this.f28650c.iterator();
            while (it.hasNext()) {
                C0289a next = it.next();
                e0.N(next.f28652a, new t(this, next.f28653b, aVar, nVar));
            }
        }

        public a r(int i10, r.a aVar, long j10) {
            return new a(this.f28650c, i10, aVar, j10);
        }

        public a(CopyOnWriteArrayList<C0289a> copyOnWriteArrayList, int i10, r.a aVar, long j10) {
            this.f28650c = copyOnWriteArrayList;
            this.f28648a = i10;
            this.f28649b = aVar;
            this.f28651d = j10;
        }
    }
}
