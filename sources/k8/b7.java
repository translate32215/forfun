package k8;

import e8.y9;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import z4.w;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class b7 extends h5<Long> implements RandomAccess, p6, t7 {

    /* renamed from: d  reason: collision with root package name */
    public static final b7 f20077d;

    /* renamed from: b  reason: collision with root package name */
    public long[] f20078b;

    /* renamed from: c  reason: collision with root package name */
    public int f20079c;

    static {
        b7 b7Var = new b7(new long[0], 0);
        f20077d = b7Var;
        b7Var.f20240a = false;
    }

    public b7() {
        this.f20078b = new long[10];
        this.f20079c = 0;
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f20079c)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        long[] jArr = this.f20078b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[w.a(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f20078b, i10, jArr2, i10 + 1, this.f20079c - i10);
            this.f20078b = jArr2;
        }
        this.f20078b[i10] = longValue;
        this.f20079c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        c();
        Charset charset = r6.f20450a;
        collection.getClass();
        if (!(collection instanceof b7)) {
            return super.addAll(collection);
        }
        b7 b7Var = (b7) collection;
        int i10 = b7Var.f20079c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f20079c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f20078b;
            if (i12 > jArr.length) {
                this.f20078b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(b7Var.f20078b, 0, this.f20078b, this.f20079c, b7Var.f20079c);
            this.f20079c = i12;
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
        if (!(obj instanceof b7)) {
            return super.equals(obj);
        }
        b7 b7Var = (b7) obj;
        if (this.f20079c != b7Var.f20079c) {
            return false;
        }
        long[] jArr = b7Var.f20078b;
        for (int i10 = 0; i10 < this.f20079c; i10++) {
            if (this.f20078b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final long f(int i10) {
        o(i10);
        return this.f20078b[i10];
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        o(i10);
        return Long.valueOf(this.f20078b[i10]);
    }

    /* renamed from: h */
    public final p6 g(int i10) {
        if (i10 >= this.f20079c) {
            return new b7(Arrays.copyOf(this.f20078b, i10), this.f20079c);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f20079c; i11++) {
            i10 = (i10 * 31) + r6.b(this.f20078b[i11]);
        }
        return i10;
    }

    public final void i(long j10) {
        c();
        int i10 = this.f20079c;
        long[] jArr = this.f20078b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[w.a(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f20078b = jArr2;
        }
        long[] jArr3 = this.f20078b;
        int i11 = this.f20079c;
        this.f20079c = i11 + 1;
        jArr3[i11] = j10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f20079c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f20078b[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    public final String j(int i10) {
        return y9.a(35, "Index:", i10, ", Size:", this.f20079c);
    }

    public final void o(int i10) {
        if (i10 < 0 || i10 >= this.f20079c) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        o(i10);
        long[] jArr = this.f20078b;
        long j10 = jArr[i10];
        int i11 = this.f20079c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f20079c--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            long[] jArr = this.f20078b;
            System.arraycopy(jArr, i11, jArr, i10, this.f20079c - i11);
            this.f20079c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        o(i10);
        long[] jArr = this.f20078b;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.f20079c;
    }

    public b7(long[] jArr, int i10) {
        this.f20078b = jArr;
        this.f20079c = i10;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Long) obj).longValue());
        return true;
    }
}
