package ld;

import java.util.Iterator;
import vd.a;

/* compiled from: Iterators.kt */
public abstract class q implements Iterator<Integer>, a {
    public abstract int a();

    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
