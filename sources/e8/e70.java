package e8;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import z4.w;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class e70 extends d70<Boolean> implements c80<Boolean>, h90 {

    /* renamed from: b  reason: collision with root package name */
    public boolean[] f14379b;

    /* renamed from: c  reason: collision with root package name */
    public int f14380c;

    static {
        new e70(new boolean[0], 0).f14227a = false;
    }

    public e70() {
        this.f14379b = new boolean[10];
        this.f14380c = 0;
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f14380c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        boolean[] zArr = this.f14379b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[w.a(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f14379b, i10, zArr2, i10 + 1, this.f14380c - i10);
            this.f14379b = zArr2;
        }
        this.f14379b[i10] = booleanValue;
        this.f14380c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        Charset charset = v70.f17029a;
        collection.getClass();
        if (!(collection instanceof e70)) {
            return super.addAll(collection);
        }
        e70 e70 = (e70) collection;
        int i10 = e70.f14380c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f14380c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f14379b;
            if (i12 > zArr.length) {
                this.f14379b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(e70.f14379b, 0, this.f14379b, this.f14380c, e70.f14380c);
            this.f14380c = i12;
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
        if (!(obj instanceof e70)) {
            return super.equals(obj);
        }
        e70 e70 = (e70) obj;
        if (this.f14380c != e70.f14380c) {
            return false;
        }
        boolean[] zArr = e70.f14379b;
        for (int i10 = 0; i10 < this.f14380c; i10++) {
            if (this.f14379b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(boolean z10) {
        c();
        int i10 = this.f14380c;
        boolean[] zArr = this.f14379b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[w.a(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f14379b = zArr2;
        }
        boolean[] zArr3 = this.f14379b;
        int i11 = this.f14380c;
        this.f14380c = i11 + 1;
        zArr3[i11] = z10;
    }

    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Boolean.valueOf(this.f14379b[i10]);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f14380c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f14380c; i11++) {
            i10 = (i10 * 31) + v70.a(this.f14379b[i11]);
        }
        return i10;
    }

    public final String i(int i10) {
        return y9.a(35, "Index:", i10, ", Size:", this.f14380c);
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f14380c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f14379b[i11] == booleanValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* synthetic */ c80 r(int i10) {
        if (i10 >= this.f14380c) {
            return new e70(Arrays.copyOf(this.f14379b, i10), this.f14380c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i10) {
        c();
        h(i10);
        boolean[] zArr = this.f14379b;
        boolean z10 = zArr[i10];
        int i11 = this.f14380c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f14380c--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            boolean[] zArr = this.f14379b;
            System.arraycopy(zArr, i11, zArr, i10, this.f14380c - i11);
            this.f14380c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        h(i10);
        boolean[] zArr = this.f14379b;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    public final int size() {
        return this.f14380c;
    }

    public e70(boolean[] zArr, int i10) {
        this.f14379b = zArr;
        this.f14380c = i10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        f(((Boolean) obj).booleanValue());
        return true;
    }
}
