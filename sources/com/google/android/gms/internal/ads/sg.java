package com.google.android.gms.internal.ads;

import e8.d50;
import e8.g50;
import e8.x40;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public abstract class sg<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f8124a = new Object[0];

    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public int c(Object[] objArr, int i10) {
        d50 d50 = (d50) iterator();
        while (d50.hasNext()) {
            objArr[i10] = d50.next();
            i10++;
        }
        return i10;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@NullableDecl Object obj);

    /* renamed from: f */
    public abstract d50<E> iterator();

    @NullableDecl
    public Object[] h() {
        return null;
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    public int j() {
        throw new UnsupportedOperationException();
    }

    public ug<E> o() {
        if (isEmpty()) {
            g50<Object> g50 = ug.f8246b;
            return x40.f17440e;
        }
        Object[] array = toArray();
        g50<Object> g502 = ug.f8246b;
        return ug.z(array, array.length);
    }

    public abstract boolean q();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f8124a);
    }

    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] h10 = h();
            if (h10 != null) {
                return Arrays.copyOfRange(h10, i(), j(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        c(tArr, 0);
        return tArr;
    }
}
