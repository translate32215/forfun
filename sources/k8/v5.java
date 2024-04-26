package k8;

import e8.y9;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import z4.w;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class v5 extends h5<Double> implements RandomAccess, q6 {

    /* renamed from: b  reason: collision with root package name */
    public double[] f20504b;

    /* renamed from: c  reason: collision with root package name */
    public int f20505c;

    static {
        new v5(new double[0], 0).f20240a = false;
    }

    public v5() {
        this.f20504b = new double[10];
        this.f20505c = 0;
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f20505c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        double[] dArr = this.f20504b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[w.a(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f20504b, i10, dArr2, i10 + 1, this.f20505c - i10);
            this.f20504b = dArr2;
        }
        this.f20504b[i10] = doubleValue;
        this.f20505c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        c();
        Charset charset = r6.f20450a;
        collection.getClass();
        if (!(collection instanceof v5)) {
            return super.addAll(collection);
        }
        v5 v5Var = (v5) collection;
        int i10 = v5Var.f20505c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f20505c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f20504b;
            if (i12 > dArr.length) {
                this.f20504b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(v5Var.f20504b, 0, this.f20504b, this.f20505c, v5Var.f20505c);
            this.f20505c = i12;
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
        if (!(obj instanceof v5)) {
            return super.equals(obj);
        }
        v5 v5Var = (v5) obj;
        if (this.f20505c != v5Var.f20505c) {
            return false;
        }
        double[] dArr = v5Var.f20504b;
        for (int i10 = 0; i10 < this.f20505c; i10++) {
            if (Double.doubleToLongBits(this.f20504b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void f(double d10) {
        c();
        int i10 = this.f20505c;
        double[] dArr = this.f20504b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[w.a(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f20504b = dArr2;
        }
        double[] dArr3 = this.f20504b;
        int i11 = this.f20505c;
        this.f20505c = i11 + 1;
        dArr3[i11] = d10;
    }

    public final /* bridge */ /* synthetic */ q6 g(int i10) {
        if (i10 >= this.f20505c) {
            return new v5(Arrays.copyOf(this.f20504b, i10), this.f20505c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        i(i10);
        return Double.valueOf(this.f20504b[i10]);
    }

    public final String h(int i10) {
        return y9.a(35, "Index:", i10, ", Size:", this.f20505c);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f20505c; i11++) {
            i10 = (i10 * 31) + r6.b(Double.doubleToLongBits(this.f20504b[i11]));
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f20505c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i10 = this.f20505c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f20504b[i11] == doubleValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        i(i10);
        double[] dArr = this.f20504b;
        double d10 = dArr[i10];
        int i11 = this.f20505c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f20505c--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            double[] dArr = this.f20504b;
            System.arraycopy(dArr, i11, dArr, i10, this.f20505c - i11);
            this.f20505c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        c();
        i(i10);
        double[] dArr = this.f20504b;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    public final int size() {
        return this.f20505c;
    }

    public v5(double[] dArr, int i10) {
        this.f20504b = dArr;
        this.f20505c = i10;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Double) obj).doubleValue());
        return true;
    }
}
