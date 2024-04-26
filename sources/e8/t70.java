package e8;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import z4.w;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class t70 extends d70<Float> implements c80<Float>, h90 {

    /* renamed from: b  reason: collision with root package name */
    public float[] f16710b;

    /* renamed from: c  reason: collision with root package name */
    public int f16711c;

    static {
        new t70(new float[0], 0).f14227a = false;
    }

    public t70() {
        this.f16710b = new float[10];
        this.f16711c = 0;
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f16711c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        float[] fArr = this.f16710b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[w.a(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f16710b, i10, fArr2, i10 + 1, this.f16711c - i10);
            this.f16710b = fArr2;
        }
        this.f16710b[i10] = floatValue;
        this.f16711c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        c();
        Charset charset = v70.f17029a;
        collection.getClass();
        if (!(collection instanceof t70)) {
            return super.addAll(collection);
        }
        t70 t70 = (t70) collection;
        int i10 = t70.f16711c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f16711c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f16710b;
            if (i12 > fArr.length) {
                this.f16710b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(t70.f16710b, 0, this.f16710b, this.f16711c, t70.f16711c);
            this.f16711c = i12;
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
        if (!(obj instanceof t70)) {
            return super.equals(obj);
        }
        t70 t70 = (t70) obj;
        if (this.f16711c != t70.f16711c) {
            return false;
        }
        float[] fArr = t70.f16710b;
        for (int i10 = 0; i10 < this.f16711c; i10++) {
            if (Float.floatToIntBits(this.f16710b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i10) {
        if (i10 < 0 || i10 >= this.f16711c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    public final /* synthetic */ Object get(int i10) {
        f(i10);
        return Float.valueOf(this.f16710b[i10]);
    }

    public final String h(int i10) {
        return y9.a(35, "Index:", i10, ", Size:", this.f16711c);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f16711c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f16710b[i11]);
        }
        return i10;
    }

    public final void i(float f10) {
        c();
        int i10 = this.f16711c;
        float[] fArr = this.f16710b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[w.a(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f16710b = fArr2;
        }
        float[] fArr3 = this.f16710b;
        int i11 = this.f16711c;
        this.f16711c = i11 + 1;
        fArr3[i11] = f10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i10 = this.f16711c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f16710b[i11] == floatValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* synthetic */ c80 r(int i10) {
        if (i10 >= this.f16711c) {
            return new t70(Arrays.copyOf(this.f16710b, i10), this.f16711c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i10) {
        c();
        f(i10);
        float[] fArr = this.f16710b;
        float f10 = fArr[i10];
        int i11 = this.f16711c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f16711c--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            float[] fArr = this.f16710b;
            System.arraycopy(fArr, i11, fArr, i10, this.f16711c - i11);
            this.f16711c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        c();
        f(i10);
        float[] fArr = this.f16710b;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.f16711c;
    }

    public t70(float[] fArr, int i10) {
        this.f16710b = fArr;
        this.f16711c = i10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        i(((Float) obj).floatValue());
        return true;
    }
}
