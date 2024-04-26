package k8;

import e8.y9;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import z4.w;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class e6 extends h5<Float> implements RandomAccess, q6 {

    /* renamed from: b  reason: collision with root package name */
    public float[] f20185b;

    /* renamed from: c  reason: collision with root package name */
    public int f20186c;

    static {
        new e6(new float[0], 0).f20240a = false;
    }

    public e6() {
        this.f20185b = new float[10];
        this.f20186c = 0;
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f20186c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        float[] fArr = this.f20185b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[w.a(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f20185b, i10, fArr2, i10 + 1, this.f20186c - i10);
            this.f20185b = fArr2;
        }
        this.f20185b[i10] = floatValue;
        this.f20186c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        c();
        Charset charset = r6.f20450a;
        collection.getClass();
        if (!(collection instanceof e6)) {
            return super.addAll(collection);
        }
        e6 e6Var = (e6) collection;
        int i10 = e6Var.f20186c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f20186c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f20185b;
            if (i12 > fArr.length) {
                this.f20185b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(e6Var.f20185b, 0, this.f20185b, this.f20186c, e6Var.f20186c);
            this.f20186c = i12;
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
        if (!(obj instanceof e6)) {
            return super.equals(obj);
        }
        e6 e6Var = (e6) obj;
        if (this.f20186c != e6Var.f20186c) {
            return false;
        }
        float[] fArr = e6Var.f20185b;
        for (int i10 = 0; i10 < this.f20186c; i10++) {
            if (Float.floatToIntBits(this.f20185b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void f(float f10) {
        c();
        int i10 = this.f20186c;
        float[] fArr = this.f20185b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[w.a(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f20185b = fArr2;
        }
        float[] fArr3 = this.f20185b;
        int i11 = this.f20186c;
        this.f20186c = i11 + 1;
        fArr3[i11] = f10;
    }

    public final /* bridge */ /* synthetic */ q6 g(int i10) {
        if (i10 >= this.f20186c) {
            return new e6(Arrays.copyOf(this.f20185b, i10), this.f20186c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        i(i10);
        return Float.valueOf(this.f20185b[i10]);
    }

    public final String h(int i10) {
        return y9.a(35, "Index:", i10, ", Size:", this.f20186c);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f20186c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f20185b[i11]);
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f20186c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i10 = this.f20186c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f20185b[i11] == floatValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        i(i10);
        float[] fArr = this.f20185b;
        float f10 = fArr[i10];
        int i11 = this.f20186c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f20186c--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            float[] fArr = this.f20185b;
            System.arraycopy(fArr, i11, fArr, i10, this.f20186c - i11);
            this.f20186c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        c();
        i(i10);
        float[] fArr = this.f20185b;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.f20186c;
    }

    public e6(float[] fArr, int i10) {
        this.f20185b = fArr;
        this.f20186c = i10;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Float) obj).floatValue());
        return true;
    }
}
