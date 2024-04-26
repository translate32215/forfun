package ba;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: ImmutableCollection */
public abstract class q<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f3782a = new Object[0];

    /* compiled from: ImmutableCollection */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a  reason: collision with root package name */
        public Object[] f3783a;

        /* renamed from: b  reason: collision with root package name */
        public int f3784b = 0;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3785c;

        public a(int i10) {
            h.b(i10, "initialCapacity");
            this.f3783a = new Object[i10];
        }
    }

    /* compiled from: ImmutableCollection */
    public static abstract class b<E> {
        public static int a(int i10, int i11) {
            if (i11 >= 0) {
                int i12 = i10 + (i10 >> 1) + 1;
                if (i12 < i11) {
                    i12 = Integer.highestOneBit(i11 - 1) << 1;
                }
                if (i12 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i12;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public s<E> c() {
        if (!isEmpty()) {
            return s.s(toArray());
        }
        a<Object> aVar = s.f3795b;
        return o0.f3765e;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@NullableDecl Object obj);

    @CanIgnoreReturnValue
    public int f(Object[] objArr, int i10) {
        y0 q10 = iterator();
        while (q10.hasNext()) {
            objArr[i10] = q10.next();
            i10++;
        }
        return i10;
    }

    public Object[] h() {
        return null;
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    public int j() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean o();

    /* renamed from: q */
    public abstract y0<E> iterator();

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f3782a);
    }

    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] h10 = h();
            if (h10 != null) {
                return Arrays.copyOfRange(h10, j(), i(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        f(tArr, 0);
        return tArr;
    }
}
