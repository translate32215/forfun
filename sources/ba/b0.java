package ba;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Iterators */
public enum b0 implements Iterator<Object> {
    INSTANCE;

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    public void remove() {
        h.c(false);
    }
}
