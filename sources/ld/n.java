package ld;

import androidx.appcompat.widget.d0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import ud.e;
import ud.k;
import vd.a;

/* compiled from: Collections.kt */
public final class n implements List, Serializable, RandomAccess, a {

    /* renamed from: a  reason: collision with root package name */
    public static final n f21256a = new n();

    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection collection) {
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
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public Object get(int i10) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i10 + '.');
    }

    public int hashCode() {
        return 1;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        k.f((Void) obj, "element");
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return m.f21255a;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        k.f((Void) obj, "element");
        return -1;
    }

    public ListIterator listIterator() {
        return m.f21255a;
    }

    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public List subList(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11);
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

    public ListIterator listIterator(int i10) {
        if (i10 == 0) {
            return m.f21255a;
        }
        throw new IndexOutOfBoundsException(d0.a("Index: ", i10));
    }
}
