package k8;

import e8.y9;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import z4.w;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class k5 extends h5<Boolean> implements RandomAccess, q6 {

    /* renamed from: b  reason: collision with root package name */
    public boolean[] f20292b;

    /* renamed from: c  reason: collision with root package name */
    public int f20293c;

    static {
        new k5(new boolean[0], 0).f20240a = false;
    }

    public k5() {
        this.f20292b = new boolean[10];
        this.f20293c = 0;
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f20293c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        boolean[] zArr = this.f20292b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[w.a(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f20292b, i10, zArr2, i10 + 1, this.f20293c - i10);
            this.f20292b = zArr2;
        }
        this.f20292b[i10] = booleanValue;
        this.f20293c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        Charset charset = r6.f20450a;
        collection.getClass();
        if (!(collection instanceof k5)) {
            return super.addAll(collection);
        }
        k5 k5Var = (k5) collection;
        int i10 = k5Var.f20293c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f20293c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f20292b;
            if (i12 > zArr.length) {
                this.f20292b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(k5Var.f20292b, 0, this.f20292b, this.f20293c, k5Var.f20293c);
            this.f20293c = i12;
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
        if (!(obj instanceof k5)) {
            return super.equals(obj);
        }
        k5 k5Var = (k5) obj;
        if (this.f20293c != k5Var.f20293c) {
            return false;
        }
        boolean[] zArr = k5Var.f20292b;
        for (int i10 = 0; i10 < this.f20293c; i10++) {
            if (this.f20292b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(boolean z10) {
        c();
        int i10 = this.f20293c;
        boolean[] zArr = this.f20292b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[w.a(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f20292b = zArr2;
        }
        boolean[] zArr3 = this.f20292b;
        int i11 = this.f20293c;
        this.f20293c = i11 + 1;
        zArr3[i11] = z10;
    }

    public final /* bridge */ /* synthetic */ q6 g(int i10) {
        if (i10 >= this.f20293c) {
            return new k5(Arrays.copyOf(this.f20292b, i10), this.f20293c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        i(i10);
        return Boolean.valueOf(this.f20292b[i10]);
    }

    public final String h(int i10) {
        return y9.a(35, "Index:", i10, ", Size:", this.f20293c);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f20293c; i11++) {
            i10 = (i10 * 31) + r6.a(this.f20292b[i11]);
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f20293c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f20293c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f20292b[i11] == booleanValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        i(i10);
        boolean[] zArr = this.f20292b;
        boolean z10 = zArr[i10];
        int i11 = this.f20293c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f20293c--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            boolean[] zArr = this.f20292b;
            System.arraycopy(zArr, i11, zArr, i10, this.f20293c - i11);
            this.f20293c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        i(i10);
        boolean[] zArr = this.f20292b;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    public final int size() {
        return this.f20293c;
    }

    public k5(boolean[] zArr, int i10) {
        this.f20292b = zArr;
        this.f20293c = i10;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Boolean) obj).booleanValue());
        return true;
    }
}
