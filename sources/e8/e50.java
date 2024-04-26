package e8;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public abstract class e50<F, T> implements ListIterator<T>, Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final Iterator<? extends F> f14363a;

    public e50(ListIterator<? extends F> listIterator) {
        listIterator.getClass();
        this.f14363a = listIterator;
    }

    public abstract T a(F f10);

    public void add(T t10) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f14363a.hasNext();
    }

    public final boolean hasPrevious() {
        return ((ListIterator) this.f14363a).hasPrevious();
    }

    public final Object next() {
        return a(this.f14363a.next());
    }

    public final int nextIndex() {
        return ((ListIterator) this.f14363a).nextIndex();
    }

    public final T previous() {
        return a(((ListIterator) this.f14363a).previous());
    }

    public final int previousIndex() {
        return ((ListIterator) this.f14363a).previousIndex();
    }

    public final void remove() {
        this.f14363a.remove();
    }

    public void set(T t10) {
        throw new UnsupportedOperationException();
    }
}
