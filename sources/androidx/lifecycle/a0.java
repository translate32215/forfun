package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import m.b;

/* compiled from: MediatorLiveData */
public class a0<T> extends b0<T> {

    /* renamed from: l  reason: collision with root package name */
    public b<LiveData<?>, a<?>> f2621l = new b<>();

    /* compiled from: MediatorLiveData */
    public static class a<V> implements c0<V> {

        /* renamed from: a  reason: collision with root package name */
        public final LiveData<V> f2622a;

        /* renamed from: b  reason: collision with root package name */
        public final c0<? super V> f2623b;

        /* renamed from: c  reason: collision with root package name */
        public int f2624c = -1;

        public a(LiveData<V> liveData, c0<? super V> c0Var) {
            this.f2622a = liveData;
            this.f2623b = c0Var;
        }

        public void g(V v10) {
            int i10 = this.f2624c;
            int i11 = this.f2622a.f2600g;
            if (i10 != i11) {
                this.f2624c = i11;
                this.f2623b.g(v10);
            }
        }
    }

    public void h() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f2621l.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                a aVar = (a) ((Map.Entry) eVar.next()).getValue();
                aVar.f2622a.g(aVar);
            } else {
                return;
            }
        }
    }

    public void i() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f2621l.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                a aVar = (a) ((Map.Entry) eVar.next()).getValue();
                aVar.f2622a.k(aVar);
            } else {
                return;
            }
        }
    }

    public <S> void m(LiveData<S> liveData, c0<? super S> c0Var) {
        if (liveData != null) {
            a aVar = new a(liveData, c0Var);
            a i10 = this.f2621l.i(liveData, aVar);
            if (i10 != null && i10.f2623b != c0Var) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            } else if (i10 == null && e()) {
                liveData.g(aVar);
            }
        } else {
            throw new NullPointerException("source cannot be null");
        }
    }

    public <S> void n(LiveData<S> liveData) {
        a j10 = this.f2621l.j(liveData);
        if (j10 != null) {
            j10.f2622a.k(j10);
        }
    }
}
