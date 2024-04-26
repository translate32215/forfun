package be;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ld.h;
import td.l;
import ud.j;
import ud.k;

/* compiled from: _Sequences.kt */
public class i extends h {

    /* compiled from: Iterables.kt */
    public static final class a implements Iterable<T>, vd.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f3914a;

        public a(f fVar) {
            this.f3914a = fVar;
        }

        public Iterator<T> iterator() {
            return this.f3914a.iterator();
        }
    }

    /* compiled from: _Sequences.kt */
    public /* synthetic */ class b extends j implements l<f<? extends R>, Iterator<? extends R>> {

        /* renamed from: i  reason: collision with root package name */
        public static final b f3915i = new b();

        public b() {
            super(1, f.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        public Object c(Object obj) {
            f fVar = (f) obj;
            k.f(fVar, "p0");
            return fVar.iterator();
        }
    }

    public static final <T> Iterable<T> d(f<? extends T> fVar) {
        return new a(fVar);
    }

    public static final <T> f<T> e(f<? extends T> fVar, l<? super T, Boolean> lVar) {
        return new c(fVar, true, lVar);
    }

    public static final <T, R> f<R> f(f<? extends T> fVar, l<? super T, ? extends f<? extends R>> lVar) {
        return new d(fVar, lVar, b.f3915i);
    }

    public static final <T, R> f<R> g(f<? extends T> fVar, l<? super T, ? extends R> lVar) {
        return new l(fVar, lVar);
    }

    public static final <T, R> f<R> h(f<? extends T> fVar, l<? super T, ? extends R> lVar) {
        return new c(new l(fVar, lVar), false, j.f3916b);
    }

    public static final <T> List<T> i(f<? extends T> fVar) {
        return h.d(j(fVar));
    }

    public static final <T> List<T> j(f<? extends T> fVar) {
        ArrayList arrayList = new ArrayList();
        for (Object add : fVar) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
