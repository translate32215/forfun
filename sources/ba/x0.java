package ba;

import java.util.Iterator;
import java.util.Map;

/* compiled from: TransformedIterator */
public abstract class x0<F, T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Iterator<? extends F> f3819a;

    public x0(Iterator<? extends F> it) {
        it.getClass();
        this.f3819a = it;
    }

    public final boolean hasNext() {
        return this.f3819a.hasNext();
    }

    public final T next() {
        return ((Map.Entry) this.f3819a.next()).getValue();
    }

    public final void remove() {
        this.f3819a.remove();
    }
}
