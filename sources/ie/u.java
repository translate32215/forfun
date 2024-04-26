package ie;

import de.l0;
import ie.v;
import java.lang.Comparable;
import java.util.Arrays;
import ud.k;

/* compiled from: ThreadSafeHeap.kt */
public class u<T extends v & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a  reason: collision with root package name */
    public T[] f19402a;

    public final void a(T t10) {
        l0.b bVar = (l0.b) t10;
        bVar.a(this);
        T[] tArr = this.f19402a;
        if (tArr == null) {
            tArr = new v[4];
            this.f19402a = tArr;
        } else if (this._size >= tArr.length) {
            T[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            k.e(copyOf, "copyOf(this, newSize)");
            tArr = (v[]) copyOf;
            this.f19402a = tArr;
        }
        int i10 = this._size;
        this._size = i10 + 1;
        tArr[i10] = t10;
        bVar.f13303c = i10;
        f(i10);
    }

    public final T b() {
        T[] tArr = this.f19402a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    public final boolean c() {
        return this._size == 0;
    }

    public final T d(int i10) {
        T[] tArr = this.f19402a;
        k.c(tArr);
        this._size--;
        if (i10 < this._size) {
            g(i10, this._size);
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                k.c(t10);
                T t11 = tArr[i11];
                k.c(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    g(i10, i11);
                    f(i11);
                }
            }
            while (true) {
                int i12 = (i10 * 2) + 1;
                if (i12 >= this._size) {
                    break;
                }
                T[] tArr2 = this.f19402a;
                k.c(tArr2);
                int i13 = i12 + 1;
                if (i13 < this._size) {
                    T t12 = tArr2[i13];
                    k.c(t12);
                    T t13 = tArr2[i12];
                    k.c(t13);
                    if (((Comparable) t12).compareTo(t13) < 0) {
                        i12 = i13;
                    }
                }
                T t14 = tArr2[i10];
                k.c(t14);
                T t15 = tArr2[i12];
                k.c(t15);
                if (((Comparable) t14).compareTo(t15) <= 0) {
                    break;
                }
                g(i10, i12);
                i10 = i12;
            }
        }
        T t16 = tArr[this._size];
        k.c(t16);
        t16.a((u<?>) null);
        t16.c(-1);
        tArr[this._size] = null;
        return t16;
    }

    public final T e() {
        T d10;
        synchronized (this) {
            d10 = this._size > 0 ? d(0) : null;
        }
        return d10;
    }

    public final void f(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f19402a;
            k.c(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            k.c(t10);
            T t11 = tArr[i10];
            k.c(t11);
            if (((Comparable) t10).compareTo(t11) > 0) {
                g(i10, i11);
                i10 = i11;
            } else {
                return;
            }
        }
    }

    public final void g(int i10, int i11) {
        T[] tArr = this.f19402a;
        k.c(tArr);
        T t10 = tArr[i11];
        k.c(t10);
        T t11 = tArr[i10];
        k.c(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.c(i10);
        t11.c(i11);
    }
}
