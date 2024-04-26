package ba;

import aa.g;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: ImmutableSet */
public abstract class x<E> extends q<E> implements Set<E> {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f3817c = 0;
    @NullableDecl
    @RetainedWith
    @LazyInit

    /* renamed from: b  reason: collision with root package name */
    public transient s<E> f3818b;

    public static <E> x<E> A(E e10, E e11, E e12) {
        return x(3, e10, e11, e12);
    }

    public static int s(int i10) {
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
            g.b(z10, "collection too large");
            return 1073741824;
        }
    }

    public static <E> x<E> x(int i10, Object... objArr) {
        if (i10 == 0) {
            return q0.f3786i;
        }
        boolean z10 = false;
        if (i10 == 1) {
            return new w0(objArr[0]);
        }
        int s10 = s(i10);
        Object[] objArr2 = new Object[s10];
        int i11 = s10 - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj = objArr[i14];
            m0.a(obj, i14);
            int hashCode = obj.hashCode();
            int a10 = p.a(hashCode);
            while (true) {
                int i15 = a10 & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = obj;
                    objArr2[i15] = obj;
                    i12 += hashCode;
                    i13++;
                    break;
                } else if (obj2.equals(obj)) {
                    break;
                } else {
                    a10++;
                }
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            return new w0(objArr[0], i12);
        }
        if (s(i13) < s10 / 2) {
            return x(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            z10 = true;
        }
        if (z10) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new q0(objArr, i12, objArr2, i11, i13);
    }

    public s<E> c() {
        s<E> sVar = this.f3818b;
        if (sVar != null) {
            return sVar;
        }
        s<E> y10 = y();
        this.f3818b = y10;
        return y10;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof x) && z() && ((x) obj).z() && hashCode() != obj.hashCode()) {
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
        return v0.a(this);
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public s<E> y() {
        return s.s(toArray());
    }

    public boolean z() {
        return this instanceof q0;
    }
}
