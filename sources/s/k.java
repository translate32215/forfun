package s;

import java.util.Iterator;

/* compiled from: SparseArray.kt */
public final class k {

    /* compiled from: SparseArray.kt */
    public static final class a implements Iterator<T>, vd.a {

        /* renamed from: a  reason: collision with root package name */
        public int f24857a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ j f24858b;

        public a(j<T> jVar) {
            this.f24858b = jVar;
        }

        public boolean hasNext() {
            return this.f24857a < this.f24858b.k();
        }

        public T next() {
            j jVar = this.f24858b;
            int i10 = this.f24857a;
            this.f24857a = i10 + 1;
            return jVar.l(i10);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> Iterator<T> a(j<T> jVar) {
        ud.k.g(jVar, "receiver$0");
        return new a(jVar);
    }
}
