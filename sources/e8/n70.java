package e8;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import z4.w;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class n70 extends d70<Double> implements c80<Double>, h90 {

    /* renamed from: b  reason: collision with root package name */
    public double[] f15597b;

    /* renamed from: c  reason: collision with root package name */
    public int f15598c;

    static {
        new n70(new double[0], 0).f14227a = false;
    }

    public n70() {
        this.f15597b = new double[10];
        this.f15598c = 0;
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f15598c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        double[] dArr = this.f15597b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[w.a(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f15597b, i10, dArr2, i10 + 1, this.f15598c - i10);
            this.f15597b = dArr2;
        }
        this.f15597b[i10] = doubleValue;
        this.f15598c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        c();
        Charset charset = v70.f17029a;
        collection.getClass();
        if (!(collection instanceof n70)) {
            return super.addAll(collection);
        }
        n70 n70 = (n70) collection;
        int i10 = n70.f15598c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f15598c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f15597b;
            if (i12 > dArr.length) {
                this.f15597b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(n70.f15597b, 0, this.f15597b, this.f15598c, n70.f15598c);
            this.f15598c = i12;
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
        if (!(obj instanceof n70)) {
            return super.equals(obj);
        }
        n70 n70 = (n70) obj;
        if (this.f15598c != n70.f15598c) {
            return false;
        }
        double[] dArr = n70.f15597b;
        for (int i10 = 0; i10 < this.f15598c; i10++) {
            if (Double.doubleToLongBits(this.f15597b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void f(double d10) {
        c();
        int i10 = this.f15598c;
        double[] dArr = this.f15597b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[w.a(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f15597b = dArr2;
        }
        double[] dArr3 = this.f15597b;
        int i11 = this.f15598c;
        this.f15598c = i11 + 1;
        dArr3[i11] = d10;
    }

    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Double.valueOf(this.f15597b[i10]);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f15598c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f15598c; i11++) {
            i10 = (i10 * 31) + v70.c(Double.doubleToLongBits(this.f15597b[i11]));
        }
        return i10;
    }

    public final String i(int i10) {
        return y9.a(35, "Index:", i10, ", Size:", this.f15598c);
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i10 = this.f15598c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f15597b[i11] == doubleValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* synthetic */ c80 r(int i10) {
        if (i10 >= this.f15598c) {
            return new n70(Arrays.copyOf(this.f15597b, i10), this.f15598c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i10) {
        c();
        h(i10);
        double[] dArr = this.f15597b;
        double d10 = dArr[i10];
        int i11 = this.f15598c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f15598c--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            double[] dArr = this.f15597b;
            System.arraycopy(dArr, i11, dArr, i10, this.f15598c - i11);
            this.f15598c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        c();
        h(i10);
        double[] dArr = this.f15597b;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    public final int size() {
        return this.f15598c;
    }

    public n70(double[] dArr, int i10) {
        this.f15597b = dArr;
        this.f15598c = i10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        f(((Double) obj).doubleValue());
        return true;
    }
}
