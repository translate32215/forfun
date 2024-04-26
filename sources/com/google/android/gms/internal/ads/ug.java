package com.google.android.gms.internal.ads;

import e8.d50;
import e8.g50;
import e8.p40;
import e8.q40;
import e8.r40;
import e8.x40;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public abstract class ug<E> extends sg<E> implements List<E>, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public static final g50<Object> f8246b = new r40(x40.f17440e, 0);

    public static <E> ug<E> A(Iterable<? extends E> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return x((Collection) iterable);
        }
        Iterator<? extends E> it = iterable.iterator();
        if (!it.hasNext()) {
            return x40.f17440e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return s(next);
        }
        p40 p40 = new p40();
        p40.b(next);
        while (it.hasNext()) {
            p40.a(it.next());
        }
        p40.f8203c = true;
        return z(p40.f8201a, p40.f8202b);
    }

    public static <E> ug<E> s(E e10) {
        Object[] objArr = {e10};
        for (int i10 = 0; i10 <= 0; i10++) {
            ji.b(objArr[0], 0);
        }
        return z(objArr, 1);
    }

    public static <E> ug<E> x(Collection<? extends E> collection) {
        if (collection instanceof sg) {
            ug<E> o10 = ((sg) collection).o();
            if (!o10.q()) {
                return o10;
            }
            Object[] array = o10.toArray();
            return z(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i10 = 0; i10 < length; i10++) {
            ji.b(array2[i10], i10);
        }
        return z(array2, array2.length);
    }

    public static <E> ug<E> y(E[] eArr) {
        if (eArr.length == 0) {
            return x40.f17440e;
        }
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            ji.b(objArr[i10], i10);
        }
        return z(objArr, objArr.length);
    }

    public static <E> ug<E> z(Object[] objArr, int i10) {
        if (i10 == 0) {
            return x40.f17440e;
        }
        return new x40(objArr, i10);
    }

    /* renamed from: B */
    public ug<E> subList(int i10, int i11) {
        pg.e(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return x40.f17440e;
        }
        return new q40(this, i10, i12);
    }

    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public int c(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i10 = 0;
                    while (i10 < size) {
                        if (ng.g(get(i10), list.get(i10))) {
                            i10++;
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator it = list.iterator();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object obj2 = get(i11);
                        i11++;
                        if (!ng.g(obj2, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final d50<E> iterator() {
        return (g50) listIterator();
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ((get(i11).hashCode() + (i10 * 31)) ^ -1) ^ -1;
        }
        return i10;
    }

    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.ListIterator, e8.r40] */
    public /* synthetic */ ListIterator listIterator(int i10) {
        pg.g(i10, size());
        if (isEmpty()) {
            return f8246b;
        }
        return new r40(this, i10);
    }

    public final ug<E> o() {
        return this;
    }

    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ ListIterator listIterator() {
        return (g50) listIterator(0);
    }
}
