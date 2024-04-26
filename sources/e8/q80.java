package e8;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import z4.w;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class q80 extends d70<Long> implements d80, h90, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final q80 f16099d;

    /* renamed from: b  reason: collision with root package name */
    public long[] f16100b;

    /* renamed from: c  reason: collision with root package name */
    public int f16101c;

    static {
        q80 q80 = new q80(new long[0], 0);
        f16099d = q80;
        q80.f14227a = false;
    }

    public q80() {
        this.f16100b = new long[10];
        this.f16101c = 0;
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f16101c)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        long[] jArr = this.f16100b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[w.a(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f16100b, i10, jArr2, i10 + 1, this.f16101c - i10);
            this.f16100b = jArr2;
        }
        this.f16100b[i10] = longValue;
        this.f16101c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        c();
        Charset charset = v70.f17029a;
        collection.getClass();
        if (!(collection instanceof q80)) {
            return super.addAll(collection);
        }
        q80 q80 = (q80) collection;
        int i10 = q80.f16101c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f16101c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f16100b;
            if (i12 > jArr.length) {
                this.f16100b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(q80.f16100b, 0, this.f16100b, this.f16101c, q80.f16101c);
            this.f16101c = i12;
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
        if (!(obj instanceof q80)) {
            return super.equals(obj);
        }
        q80 q80 = (q80) obj;
        if (this.f16101c != q80.f16101c) {
            return false;
        }
        long[] jArr = q80.f16100b;
        for (int i10 = 0; i10 < this.f16101c; i10++) {
            if (this.f16100b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final long f(int i10) {
        i(i10);
        return this.f16100b[i10];
    }

    public final Object get(int i10) {
        i(i10);
        return Long.valueOf(this.f16100b[i10]);
    }

    public final void h(long j10) {
        c();
        int i10 = this.f16101c;
        long[] jArr = this.f16100b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[w.a(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f16100b = jArr2;
        }
        long[] jArr3 = this.f16100b;
        int i11 = this.f16101c;
        this.f16101c = i11 + 1;
        jArr3[i11] = j10;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f16101c; i11++) {
            i10 = (i10 * 31) + v70.c(this.f16100b[i11]);
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f16101c) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f16101c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f16100b[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    public final String j(int i10) {
        return y9.a(35, "Index:", i10, ", Size:", this.f16101c);
    }

    /* renamed from: o */
    public final d80 r(int i10) {
        if (i10 >= this.f16101c) {
            return new q80(Arrays.copyOf(this.f16100b, i10), this.f16101c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i10) {
        c();
        i(i10);
        long[] jArr = this.f16100b;
        long j10 = jArr[i10];
        int i11 = this.f16101c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f16101c--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            long[] jArr = this.f16100b;
            System.arraycopy(jArr, i11, jArr, i10, this.f16101c - i11);
            this.f16101c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        i(i10);
        long[] jArr = this.f16100b;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.f16101c;
    }

    public q80(long[] jArr, int i10) {
        this.f16100b = jArr;
        this.f16101c = i10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }
}
