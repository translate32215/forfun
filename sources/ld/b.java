package ld;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import ud.e;
import ud.k;
import vd.a;

/* compiled from: Collections.kt */
public final class b<T> implements Collection<T>, a {

    /* renamed from: a  reason: collision with root package name */
    public final T[] f21247a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f21248b;

    public b(T[] tArr, boolean z10) {
        this.f21247a = tArr;
        this.f21248b = z10;
    }

    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return e.b(this.f21247a, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        k.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f21247a.length == 0;
    }

    public Iterator<T> iterator() {
        T[] tArr = this.f21247a;
        k.f(tArr, "array");
        return new ud.a(tArr);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f21247a.length;
    }

    public final Object[] toArray() {
        T[] tArr = this.f21247a;
        boolean z10 = this.f21248b;
        Class<Object[]> cls = Object[].class;
        k.f(tArr, "<this>");
        if (z10 && k.a(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        k.e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public <T> T[] toArray(T[] tArr) {
        k.f(tArr, "array");
        return e.b(this, tArr);
    }
}
