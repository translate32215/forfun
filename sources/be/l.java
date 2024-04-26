package be;

import java.util.Iterator;

/* compiled from: Sequences.kt */
public final class l<T, R> implements f<R> {

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f3923a;

    /* renamed from: b  reason: collision with root package name */
    public final td.l<T, R> f3924b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, vd.a {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f3925a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l<T, R> f3926b;

        public a(l<T, R> lVar) {
            this.f3926b = lVar;
            this.f3925a = lVar.f3923a.iterator();
        }

        public boolean hasNext() {
            return this.f3925a.hasNext();
        }

        public R next() {
            return this.f3926b.f3924b.c(this.f3925a.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l(f<? extends T> fVar, td.l<? super T, ? extends R> lVar) {
        this.f3923a = fVar;
        this.f3924b = lVar;
    }

    public Iterator<R> iterator() {
        return new a(this);
    }
}
