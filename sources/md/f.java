package md;

import md.e;
import td.p;
import ud.k;
import ud.l;

/* compiled from: CoroutineContext.kt */
public interface f {

    /* compiled from: CoroutineContext.kt */
    public static final class a {

        /* renamed from: md.f$a$a  reason: collision with other inner class name */
        /* compiled from: CoroutineContext.kt */
        public static final class C0195a extends l implements p<f, b, f> {

            /* renamed from: b  reason: collision with root package name */
            public static final C0195a f21796b = new C0195a();

            public C0195a() {
                super(2);
            }

            public Object h(Object obj, Object obj2) {
                c cVar;
                f fVar = (f) obj;
                b bVar = (b) obj2;
                k.f(fVar, "acc");
                k.f(bVar, "element");
                f minusKey = fVar.minusKey(bVar.getKey());
                g gVar = g.f21797a;
                if (minusKey == gVar) {
                    return bVar;
                }
                int i10 = e.X;
                e.a aVar = e.a.f21795a;
                e eVar = (e) minusKey.get(aVar);
                if (eVar == null) {
                    cVar = new c(minusKey, bVar);
                } else {
                    f minusKey2 = minusKey.minusKey(aVar);
                    if (minusKey2 == gVar) {
                        return new c(bVar, eVar);
                    }
                    cVar = new c(new c(minusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        public static f a(f fVar, f fVar2) {
            return fVar2 == g.f21797a ? fVar : (f) fVar2.fold(fVar, C0195a.f21796b);
        }
    }

    /* compiled from: CoroutineContext.kt */
    public interface b extends f {

        /* compiled from: CoroutineContext.kt */
        public static final class a {
            public static <R> R a(b bVar, R r10, p<? super R, ? super b, ? extends R> pVar) {
                k.f(pVar, "operation");
                return pVar.h(r10, bVar);
            }

            public static <E extends b> E b(b bVar, c<E> cVar) {
                k.f(cVar, "key");
                if (k.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static f c(b bVar, c<?> cVar) {
                k.f(cVar, "key");
                return k.a(bVar.getKey(), cVar) ? g.f21797a : bVar;
            }

            public static f d(b bVar, f fVar) {
                k.f(fVar, "context");
                return a.a(bVar, fVar);
            }
        }

        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    public interface c<E extends b> {
    }

    <R> R fold(R r10, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    f minusKey(c<?> cVar);

    f plus(f fVar);
}
