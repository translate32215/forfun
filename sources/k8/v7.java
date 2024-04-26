package k8;

import e8.y9;
import java.util.Arrays;
import java.util.RandomAccess;
import z4.w;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class v7<E> extends h5<E> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final v7<Object> f20508d;

    /* renamed from: b  reason: collision with root package name */
    public E[] f20509b;

    /* renamed from: c  reason: collision with root package name */
    public int f20510c;

    static {
        v7<Object> v7Var = new v7<>(new Object[0], 0);
        f20508d = v7Var;
        v7Var.f20240a = false;
    }

    public v7(E[] eArr, int i10) {
        this.f20509b = eArr;
        this.f20510c = i10;
    }

    public final void add(int i10, E e10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f20510c)) {
            throw new IndexOutOfBoundsException(f(i10));
        }
        E[] eArr = this.f20509b;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = new Object[w.a(i11, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f20509b, i10, eArr2, i10 + 1, this.f20510c - i10);
            this.f20509b = eArr2;
        }
        this.f20509b[i10] = e10;
        this.f20510c++;
        this.modCount++;
    }

    public final String f(int i10) {
        return y9.a(35, "Index:", i10, ", Size:", this.f20510c);
    }

    public final /* bridge */ /* synthetic */ q6 g(int i10) {
        if (i10 >= this.f20510c) {
            return new v7(Arrays.copyOf(this.f20509b, i10), this.f20510c);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i10) {
        h(i10);
        return this.f20509b[i10];
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f20510c) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    public final E remove(int i10) {
        c();
        h(i10);
        E[] eArr = this.f20509b;
        E e10 = eArr[i10];
        int i11 = this.f20510c;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f20510c--;
        this.modCount++;
        return e10;
    }

    public final E set(int i10, E e10) {
        c();
        h(i10);
        E[] eArr = this.f20509b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        this.modCount++;
        return e11;
    }

    public final int size() {
        return this.f20510c;
    }

    public final boolean add(E e10) {
        c();
        int i10 = this.f20510c;
        E[] eArr = this.f20509b;
        if (i10 == eArr.length) {
            this.f20509b = Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f20509b;
        int i11 = this.f20510c;
        this.f20510c = i11 + 1;
        eArr2[i11] = e10;
        this.modCount++;
        return true;
    }
}
