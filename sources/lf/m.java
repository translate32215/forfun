package lf;

import de.g;
import javax.annotation.Nullable;
import ke.d;
import ke.e0;

/* compiled from: HttpServiceMethod */
public abstract class m<ResponseT, ReturnT> extends g0<ReturnT> {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f21363a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f21364b;

    /* renamed from: c  reason: collision with root package name */
    public final j<e0, ResponseT> f21365c;

    /* compiled from: HttpServiceMethod */
    public static final class a<ResponseT, ReturnT> extends m<ResponseT, ReturnT> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, ReturnT> f21366d;

        public a(c0 c0Var, d.a aVar, j<e0, ResponseT> jVar, c<ResponseT, ReturnT> cVar) {
            super(c0Var, aVar, jVar);
            this.f21366d = cVar;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [lf.b<ResponseT>, lf.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ReturnT c(lf.b<ResponseT> r1, java.lang.Object[] r2) {
            /*
                r0 = this;
                lf.c<ResponseT, ReturnT> r2 = r0.f21366d
                java.lang.Object r1 = r2.a(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: lf.m.a.c(lf.b, java.lang.Object[]):java.lang.Object");
        }
    }

    /* compiled from: HttpServiceMethod */
    public static final class b<ResponseT> extends m<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, b<ResponseT>> f21367d;

        public b(c0 c0Var, d.a aVar, j<e0, ResponseT> jVar, c<ResponseT, b<ResponseT>> cVar, boolean z10) {
            super(c0Var, aVar, jVar);
            this.f21367d = cVar;
        }

        public Object c(b<ResponseT> bVar, Object[] objArr) {
            nd.a aVar = nd.a.COROUTINE_SUSPENDED;
            b bVar2 = (b) this.f21367d.a(bVar);
            md.d dVar = objArr[objArr.length - 1];
            try {
                g gVar = new g(q.a.k(dVar), 1);
                gVar.j(new o(bVar2));
                bVar2.J(new p(gVar));
                return gVar.r();
            } catch (Exception e10) {
                s.a(e10, dVar);
                return aVar;
            }
        }
    }

    /* compiled from: HttpServiceMethod */
    public static final class c<ResponseT> extends m<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, b<ResponseT>> f21368d;

        public c(c0 c0Var, d.a aVar, j<e0, ResponseT> jVar, c<ResponseT, b<ResponseT>> cVar) {
            super(c0Var, aVar, jVar);
            this.f21368d = cVar;
        }

        public Object c(b<ResponseT> bVar, Object[] objArr) {
            nd.a aVar = nd.a.COROUTINE_SUSPENDED;
            b bVar2 = (b) this.f21368d.a(bVar);
            md.d dVar = objArr[objArr.length - 1];
            try {
                g gVar = new g(q.a.k(dVar), 1);
                gVar.j(new q(bVar2));
                bVar2.J(new r(gVar));
                return gVar.r();
            } catch (Exception e10) {
                s.a(e10, dVar);
                return aVar;
            }
        }
    }

    public m(c0 c0Var, d.a aVar, j<e0, ResponseT> jVar) {
        this.f21363a = c0Var;
        this.f21364b = aVar;
        this.f21365c = jVar;
    }

    @Nullable
    public final ReturnT a(Object[] objArr) {
        return c(new t(this.f21363a, objArr, this.f21364b, this.f21365c), objArr);
    }

    @Nullable
    public abstract ReturnT c(b<ResponseT> bVar, Object[] objArr);
}
