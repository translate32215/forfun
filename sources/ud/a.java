package ud;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayIterator.kt */
public final class a<T> implements Iterator<T>, vd.a {

    /* renamed from: a  reason: collision with root package name */
    public final T[] f26179a;

    /* renamed from: b  reason: collision with root package name */
    public int f26180b;

    public a(T[] tArr) {
        this.f26179a = tArr;
    }

    public boolean hasNext() {
        return this.f26180b < this.f26179a.length;
    }

    public T next() {
        try {
            T[] tArr = this.f26179a;
            int i10 = this.f26180b;
            this.f26180b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f26180b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
