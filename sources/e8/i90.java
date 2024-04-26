package e8;

import java.util.Arrays;
import java.util.RandomAccess;
import z4.w;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class i90<E> extends d70<E> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final i90<Object> f15001d;

    /* renamed from: b  reason: collision with root package name */
    public E[] f15002b;

    /* renamed from: c  reason: collision with root package name */
    public int f15003c;

    static {
        i90<Object> i90 = new i90<>(new Object[0], 0);
        f15001d = i90;
        i90.f14227a = false;
    }

    public i90(E[] eArr, int i10) {
        this.f15002b = eArr;
        this.f15003c = i10;
    }

    public final boolean add(E e10) {
        c();
        int i10 = this.f15003c;
        E[] eArr = this.f15002b;
        if (i10 == eArr.length) {
            this.f15002b = Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f15002b;
        int i11 = this.f15003c;
        this.f15003c = i11 + 1;
        eArr2[i11] = e10;
        this.modCount++;
        return true;
    }

    public final void f(int i10) {
        if (i10 < 0 || i10 >= this.f15003c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    public final E get(int i10) {
        f(i10);
        return this.f15002b[i10];
    }

    public final String h(int i10) {
        return y9.a(35, "Index:", i10, ", Size:", this.f15003c);
    }

    public final /* synthetic */ c80 r(int i10) {
        if (i10 >= this.f15003c) {
            return new i90(Arrays.copyOf(this.f15002b, i10), this.f15003c);
        }
        throw new IllegalArgumentException();
    }

    public final E remove(int i10) {
        c();
        f(i10);
        E[] eArr = this.f15002b;
        E e10 = eArr[i10];
        int i11 = this.f15003c;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f15003c--;
        this.modCount++;
        return e10;
    }

    public final E set(int i10, E e10) {
        c();
        f(i10);
        E[] eArr = this.f15002b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        this.modCount++;
        return e11;
    }

    public final int size() {
        return this.f15003c;
    }

    public final void add(int i10, E e10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f15003c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        E[] eArr = this.f15002b;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = new Object[w.a(i11, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f15002b, i10, eArr2, i10 + 1, this.f15003c - i10);
            this.f15002b = eArr2;
        }
        this.f15002b[i10] = e10;
        this.f15003c++;
        this.modCount++;
    }
}
