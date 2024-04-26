package be;

import java.util.Iterator;
import java.util.NoSuchElementException;
import td.l;

/* compiled from: Sequences.kt */
public final class k<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f3917a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T, Boolean> f3918b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, vd.a {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f3919a;

        /* renamed from: b  reason: collision with root package name */
        public int f3920b = -1;

        /* renamed from: c  reason: collision with root package name */
        public T f3921c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ k<T> f3922d;

        public a(k<T> kVar) {
            this.f3922d = kVar;
            this.f3919a = kVar.f3917a.iterator();
        }

        public final void a() {
            if (this.f3919a.hasNext()) {
                T next = this.f3919a.next();
                if (this.f3922d.f3918b.c(next).booleanValue()) {
                    this.f3920b = 1;
                    this.f3921c = next;
                    return;
                }
            }
            this.f3920b = 0;
        }

        public boolean hasNext() {
            if (this.f3920b == -1) {
                a();
            }
            return this.f3920b == 1;
        }

        public T next() {
            if (this.f3920b == -1) {
                a();
            }
            if (this.f3920b != 0) {
                T t10 = this.f3921c;
                this.f3921c = null;
                this.f3920b = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public k(f<? extends T> fVar, l<? super T, Boolean> lVar) {
        this.f3917a = fVar;
        this.f3918b = lVar;
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
