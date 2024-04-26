package be;

import java.util.Iterator;
import java.util.NoSuchElementException;
import td.l;
import ud.k;

/* compiled from: Sequences.kt */
public final class d<T, R, E> implements f<E> {

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f3901a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T, R> f3902b;

    /* renamed from: c  reason: collision with root package name */
    public final l<R, Iterator<E>> f3903c;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<E>, vd.a {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f3904a;

        /* renamed from: b  reason: collision with root package name */
        public Iterator<? extends E> f3905b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d<T, R, E> f3906c;

        public a(d<T, R, E> dVar) {
            this.f3906c = dVar;
            this.f3904a = dVar.f3901a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it = this.f3905b;
            if (it != null && !it.hasNext()) {
                this.f3905b = null;
            }
            while (true) {
                if (this.f3905b == null) {
                    if (this.f3904a.hasNext()) {
                        T next = this.f3904a.next();
                        d<T, R, E> dVar = this.f3906c;
                        Iterator<? extends E> c10 = dVar.f3903c.c(dVar.f3902b.c(next));
                        if (c10.hasNext()) {
                            this.f3905b = c10;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        public boolean hasNext() {
            return a();
        }

        public E next() {
            if (a()) {
                Iterator<? extends E> it = this.f3905b;
                k.c(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(f<? extends T> fVar, l<? super T, ? extends R> lVar, l<? super R, ? extends Iterator<? extends E>> lVar2) {
        this.f3901a = fVar;
        this.f3902b = lVar;
        this.f3903c = lVar2;
    }

    public Iterator<E> iterator() {
        return new a(this);
    }
}
