package k8;

import e8.y9;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import z4.w;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class m6 extends h5<Integer> implements RandomAccess, o6, t7 {

    /* renamed from: d  reason: collision with root package name */
    public static final m6 f20325d;

    /* renamed from: b  reason: collision with root package name */
    public int[] f20326b;

    /* renamed from: c  reason: collision with root package name */
    public int f20327c;

    static {
        m6 m6Var = new m6(new int[0], 0);
        f20325d = m6Var;
        m6Var.f20240a = false;
    }

    public m6() {
        this.f20326b = new int[10];
        this.f20327c = 0;
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f20327c)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        int[] iArr = this.f20326b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[w.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f20326b, i10, iArr2, i10 + 1, this.f20327c - i10);
            this.f20326b = iArr2;
        }
        this.f20326b[i10] = intValue;
        this.f20327c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        Charset charset = r6.f20450a;
        collection.getClass();
        if (!(collection instanceof m6)) {
            return super.addAll(collection);
        }
        m6 m6Var = (m6) collection;
        int i10 = m6Var.f20327c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f20327c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f20326b;
            if (i12 > iArr.length) {
                this.f20326b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(m6Var.f20326b, 0, this.f20326b, this.f20327c, m6Var.f20327c);
            this.f20327c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6)) {
            return super.equals(obj);
        }
        m6 m6Var = (m6) obj;
        if (this.f20327c != m6Var.f20327c) {
            return false;
        }
        int[] iArr = m6Var.f20326b;
        for (int i10 = 0; i10 < this.f20327c; i10++) {
            if (this.f20326b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i10) {
        o(i10);
        return this.f20326b[i10];
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        o(i10);
        return Integer.valueOf(this.f20326b[i10]);
    }

    /* renamed from: h */
    public final o6 g(int i10) {
        if (i10 >= this.f20327c) {
            return new m6(Arrays.copyOf(this.f20326b, i10), this.f20327c);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f20327c; i11++) {
            i10 = (i10 * 31) + this.f20326b[i11];
        }
        return i10;
    }

    public final void i(int i10) {
        c();
        int i11 = this.f20327c;
        int[] iArr = this.f20326b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[w.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f20326b = iArr2;
        }
        int[] iArr3 = this.f20326b;
        int i12 = this.f20327c;
        this.f20327c = i12 + 1;
        iArr3[i12] = i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f20327c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f20326b[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    public final String j(int i10) {
        return y9.a(35, "Index:", i10, ", Size:", this.f20327c);
    }

    public final void o(int i10) {
        if (i10 < 0 || i10 >= this.f20327c) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        o(i10);
        int[] iArr = this.f20326b;
        int i11 = iArr[i10];
        int i12 = this.f20327c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f20327c--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            int[] iArr = this.f20326b;
            System.arraycopy(iArr, i11, iArr, i10, this.f20327c - i11);
            this.f20327c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        o(i10);
        int[] iArr = this.f20326b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    public final int size() {
        return this.f20327c;
    }

    public m6(int[] iArr, int i10) {
        this.f20326b = iArr;
        this.f20327c = i10;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
