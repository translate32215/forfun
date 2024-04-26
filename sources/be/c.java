package be;

import java.util.Iterator;
import java.util.NoSuchElementException;
import td.l;

/* compiled from: Sequences.kt */
public final class c<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f3894a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3895b;

    /* renamed from: c  reason: collision with root package name */
    public final l<T, Boolean> f3896c;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, vd.a {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f3897a;

        /* renamed from: b  reason: collision with root package name */
        public int f3898b = -1;

        /* renamed from: c  reason: collision with root package name */
        public T f3899c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c<T> f3900d;

        public a(c<T> cVar) {
            this.f3900d = cVar;
            this.f3897a = cVar.f3894a.iterator();
        }

        public final void a() {
            while (this.f3897a.hasNext()) {
                T next = this.f3897a.next();
                if (this.f3900d.f3896c.c(next).booleanValue() == this.f3900d.f3895b) {
                    this.f3899c = next;
                    this.f3898b = 1;
                    return;
                }
            }
            this.f3898b = 0;
        }

        public boolean hasNext() {
            if (this.f3898b == -1) {
                a();
            }
            return this.f3898b == 1;
        }

        public T next() {
            if (this.f3898b == -1) {
                a();
            }
            if (this.f3898b != 0) {
                T t10 = this.f3899c;
                this.f3899c = null;
                this.f3898b = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(f<? extends T> fVar, boolean z10, l<? super T, Boolean> lVar) {
        this.f3894a = fVar;
        this.f3895b = z10;
        this.f3896c = lVar;
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
