package e8;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import z4.w;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class w70 extends d70<Integer> implements y70, h90, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final w70 f17224d;

    /* renamed from: b  reason: collision with root package name */
    public int[] f17225b;

    /* renamed from: c  reason: collision with root package name */
    public int f17226c;

    static {
        w70 w70 = new w70(new int[0], 0);
        f17224d = w70;
        w70.f14227a = false;
    }

    public w70() {
        this.f17225b = new int[10];
        this.f17226c = 0;
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f17226c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        int[] iArr = this.f17225b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[w.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f17225b, i10, iArr2, i10 + 1, this.f17226c - i10);
            this.f17225b = iArr2;
        }
        this.f17225b[i10] = intValue;
        this.f17226c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        Charset charset = v70.f17029a;
        collection.getClass();
        if (!(collection instanceof w70)) {
            return super.addAll(collection);
        }
        w70 w70 = (w70) collection;
        int i10 = w70.f17226c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f17226c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f17225b;
            if (i12 > iArr.length) {
                this.f17225b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(w70.f17225b, 0, this.f17225b, this.f17226c, w70.f17226c);
            this.f17226c = i12;
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
        if (!(obj instanceof w70)) {
            return super.equals(obj);
        }
        w70 w70 = (w70) obj;
        if (this.f17226c != w70.f17226c) {
            return false;
        }
        int[] iArr = w70.f17225b;
        for (int i10 = 0; i10 < this.f17226c; i10++) {
            if (this.f17225b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i10) {
        h(i10);
        return this.f17225b[i10];
    }

    public final Object get(int i10) {
        h(i10);
        return Integer.valueOf(this.f17225b[i10]);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f17226c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f17226c; i11++) {
            i10 = (i10 * 31) + this.f17225b[i11];
        }
        return i10;
    }

    public final String i(int i10) {
        return y9.a(35, "Index:", i10, ", Size:", this.f17226c);
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f17226c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f17225b[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final y70 r(int i10) {
        if (i10 >= this.f17226c) {
            return new w70(Arrays.copyOf(this.f17225b, i10), this.f17226c);
        }
        throw new IllegalArgumentException();
    }

    public final void o(int i10) {
        c();
        int i11 = this.f17226c;
        int[] iArr = this.f17225b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[w.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f17225b = iArr2;
        }
        int[] iArr3 = this.f17225b;
        int i12 = this.f17226c;
        this.f17226c = i12 + 1;
        iArr3[i12] = i10;
    }

    public final /* synthetic */ Object remove(int i10) {
        c();
        h(i10);
        int[] iArr = this.f17225b;
        int i11 = iArr[i10];
        int i12 = this.f17226c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f17226c--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            int[] iArr = this.f17225b;
            System.arraycopy(iArr, i11, iArr, i10, this.f17226c - i11);
            this.f17226c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        h(i10);
        int[] iArr = this.f17225b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    public final int size() {
        return this.f17226c;
    }

    public w70(int[] iArr, int i10) {
        this.f17225b = iArr;
        this.f17226c = i10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        o(((Integer) obj).intValue());
        return true;
    }
}
