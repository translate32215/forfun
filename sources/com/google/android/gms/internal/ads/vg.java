package com.google.android.gms.internal.ads;

import e.h;
import e8.b50;
import e8.c50;
import e8.g50;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public abstract class vg<E> extends sg<E> implements Set<E> {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f8364c = 0;
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    public transient ug<E> f8365b;

    public static int A(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d10 = (double) highestOneBit;
                Double.isNaN(d10);
                if (d10 * 0.7d >= ((double) max)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (max >= 1073741824) {
                z10 = false;
            }
            pg.a(z10, "collection too large");
            return 1073741824;
        }
    }

    public static <E> xg<E> B(int i10) {
        h.f(i10, "expectedSize");
        return new xg<>(i10);
    }

    public static <E> vg<E> s(int i10, Object... objArr) {
        while (i10 != 0) {
            boolean z10 = false;
            if (i10 == 1) {
                return new c50(objArr[0]);
            }
            int A = A(i10);
            Object[] objArr2 = new Object[A];
            int i11 = A - 1;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                Object obj = objArr[i14];
                ji.b(obj, i14);
                int hashCode = obj.hashCode();
                int r10 = g7.r(hashCode);
                while (true) {
                    int i15 = r10 & i11;
                    Object obj2 = objArr2[i15];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        r10++;
                    } else {
                        objArr[i13] = obj;
                        objArr2[i15] = obj;
                        i12 += hashCode;
                        i13++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i13, i10, (Object) null);
            if (i13 == 1) {
                return new c50(objArr[0], i12);
            }
            if (A(i13) < A / 2) {
                i10 = i13;
            } else {
                int length = objArr.length;
                if (i13 < (length >> 1) + (length >> 2)) {
                    z10 = true;
                }
                if (z10) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new bh(objArr, i12, objArr2, i11, i13);
            }
        }
        return bh.f6022i;
    }

    @SafeVarargs
    public static <E> vg<E> x(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        pg.a(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return s(length, objArr);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof vg) && y() && ((vg) obj).y() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() != set.size() || !containsAll(set)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return b50.a(this);
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public ug<E> o() {
        ug<E> ugVar = this.f8365b;
        if (ugVar != null) {
            return ugVar;
        }
        ug<E> z10 = z();
        this.f8365b = z10;
        return z10;
    }

    public boolean y() {
        return this instanceof bh;
    }

    public ug<E> z() {
        Object[] array = toArray();
        g50<Object> g50 = ug.f8246b;
        return ug.z(array, array.length);
    }
}
