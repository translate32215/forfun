package ba;

import aa.g;
import ba.q;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: ImmutableList */
public abstract class s<E> extends q<E> implements List<E>, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public static final a<Object> f3795b = new b(o0.f3765e, 0);

    /* compiled from: ImmutableList */
    public static final class a<E> extends q.a<E> {
        public a() {
            super(4);
        }

        @CanIgnoreReturnValue
        public a<E> b(E e10) {
            e10.getClass();
            int i10 = this.f3784b + 1;
            Object[] objArr = this.f3783a;
            if (objArr.length < i10) {
                this.f3783a = Arrays.copyOf(objArr, q.b.a(objArr.length, i10));
                this.f3785c = false;
            } else if (this.f3785c) {
                this.f3783a = (Object[]) objArr.clone();
                this.f3785c = false;
            }
            Object[] objArr2 = this.f3783a;
            int i11 = this.f3784b;
            this.f3784b = i11 + 1;
            objArr2[i11] = e10;
            return this;
        }

        public s<E> c() {
            this.f3785c = true;
            return s.x(this.f3783a, this.f3784b);
        }
    }

    /* compiled from: ImmutableList */
    public static class b<E> extends a<E> {

        /* renamed from: c  reason: collision with root package name */
        public final s<E> f3796c;

        public b(s<E> sVar, int i10) {
            super(sVar.size(), i10);
            this.f3796c = sVar;
        }

        public E a(int i10) {
            return this.f3796c.get(i10);
        }
    }

    /* compiled from: ImmutableList */
    public class c extends s<E> {

        /* renamed from: c  reason: collision with root package name */
        public final transient int f3797c;

        /* renamed from: d  reason: collision with root package name */
        public final transient int f3798d;

        public c(int i10, int i11) {
            this.f3797c = i10;
            this.f3798d = i11;
        }

        /* renamed from: E */
        public s<E> subList(int i10, int i11) {
            g.e(i10, i11, this.f3798d);
            s sVar = s.this;
            int i12 = this.f3797c;
            return sVar.subList(i10 + i12, i11 + i12);
        }

        public E get(int i10) {
            g.c(i10, this.f3798d);
            return s.this.get(i10 + this.f3797c);
        }

        public Object[] h() {
            return s.this.h();
        }

        public int i() {
            return s.this.j() + this.f3797c + this.f3798d;
        }

        public Iterator iterator() {
            return listIterator();
        }

        public int j() {
            return s.this.j() + this.f3797c;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return listIterator();
        }

        public boolean o() {
            return true;
        }

        public int size() {
            return this.f3798d;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return listIterator(i10);
        }
    }

    public static <E> s<E> C(E e10) {
        return y(e10);
    }

    public static <E> s<E> D(E e10, E e11, E e12, E e13, E e14) {
        return y(e10, e11, e12, e13, e14);
    }

    public static <E> s<E> s(Object[] objArr) {
        return x(objArr, objArr.length);
    }

    public static <E> s<E> x(Object[] objArr, int i10) {
        if (i10 == 0) {
            return o0.f3765e;
        }
        return new o0(objArr, i10);
    }

    public static <E> s<E> y(Object... objArr) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            m0.a(objArr[i10], i10);
        }
        return x(objArr, objArr.length);
    }

    public static <E> s<E> z(Collection<? extends E> collection) {
        if (!(collection instanceof q)) {
            return y(collection.toArray());
        }
        s<E> c10 = ((q) collection).c();
        return c10.o() ? s(c10.toArray()) : c10;
    }

    /* renamed from: A */
    public a listIterator() {
        return listIterator(0);
    }

    /* renamed from: B */
    public a listIterator(int i10) {
        g.d(i10, size());
        if (isEmpty()) {
            return f3795b;
        }
        return new b(this, i10);
    }

    /* renamed from: E */
    public s<E> subList(int i10, int i11) {
        g.e(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return o0.f3765e;
        }
        return new c(i10, i12);
    }

    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final s<E> c() {
        return this;
    }

    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            if (r7 != r6) goto L_0x0006
        L_0x0004:
            r0 = 1
            goto L_0x005b
        L_0x0006:
            boolean r2 = r7 instanceof java.util.List
            if (r2 != 0) goto L_0x000b
            goto L_0x005b
        L_0x000b:
            java.util.List r7 = (java.util.List) r7
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0018
            goto L_0x005b
        L_0x0018:
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L_0x0031
            r3 = 0
        L_0x001d:
            if (r3 >= r2) goto L_0x0004
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = aa.f.a(r4, r5)
            if (r4 != 0) goto L_0x002e
            goto L_0x005b
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x0031:
            java.util.Iterator r2 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x0039:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0055
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L_0x0046
            goto L_0x005b
        L_0x0046:
            java.lang.Object r3 = r2.next()
            java.lang.Object r4 = r7.next()
            boolean r3 = aa.f.a(r3, r4)
            if (r3 != 0) goto L_0x0039
            goto L_0x005b
        L_0x0055:
            boolean r7 = r7.hasNext()
            r0 = r7 ^ 1
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.s.equals(java.lang.Object):boolean");
    }

    public int f(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
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

    public Iterator iterator() {
        return listIterator();
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

    /* JADX WARNING: type inference failed for: r0v0, types: [ba.y0<E>, ba.a] */
    public y0<E> q() {
        return listIterator();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }
}
