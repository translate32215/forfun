package be;

import java.util.Iterator;
import java.util.NoSuchElementException;
import td.l;
import ud.k;

/* compiled from: Sequences.kt */
public final class e<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final td.a<T> f3907a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T, T> f3908b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, vd.a {

        /* renamed from: a  reason: collision with root package name */
        public T f3909a;

        /* renamed from: b  reason: collision with root package name */
        public int f3910b = -2;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e<T> f3911c;

        public a(e<T> eVar) {
            this.f3911c = eVar;
        }

        public final void a() {
            T t10;
            if (this.f3910b == -2) {
                t10 = this.f3911c.f3907a.d();
            } else {
                l<T, T> lVar = this.f3911c.f3908b;
                T t11 = this.f3909a;
                k.c(t11);
                t10 = lVar.c(t11);
            }
            this.f3909a = t10;
            this.f3910b = t10 == null ? 0 : 1;
        }

        public boolean hasNext() {
            if (this.f3910b < 0) {
                a();
            }
            return this.f3910b == 1;
        }

        public T next() {
            if (this.f3910b < 0) {
                a();
            }
            if (this.f3910b != 0) {
                T t10 = this.f3909a;
                k.d(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f3910b = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(td.a<? extends T> aVar, l<? super T, ? extends T> lVar) {
        this.f3907a = aVar;
        this.f3908b = lVar;
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
