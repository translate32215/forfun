package ld;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import ud.e;
import ud.k;
import vd.a;

/* compiled from: Sets.kt */
public final class p implements Set, Serializable, a {

    /* renamed from: a  reason: collision with root package name */
    public static final p f21258a = new p();

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        k.f((Void) obj, "element");
        return false;
    }

    public boolean containsAll(Collection collection) {
        k.f(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return m.f21255a;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public Object[] toArray() {
        return e.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        k.f(tArr, "array");
        return e.b(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
