package ba;

import aa.g;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractIndexedListIterator */
public abstract class a<E> implements ListIterator {

    /* renamed from: a  reason: collision with root package name */
    public final int f3682a;

    /* renamed from: b  reason: collision with root package name */
    public int f3683b;

    public a(int i10, int i11) {
        g.d(i11, i10);
        this.f3682a = i10;
        this.f3683b = i11;
    }

    public abstract E a(int i10);

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f3683b < this.f3682a;
    }

    public final boolean hasPrevious() {
        return this.f3683b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i10 = this.f3683b;
            this.f3683b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f3683b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f3683b - 1;
            this.f3683b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f3683b - 1;
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
