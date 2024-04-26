package e8;

import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.np;
import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class l70 extends OutputStream {

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f15363f = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final int f15364a = 128;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<mp> f15365b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public int f15366c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f15367d = new byte[128];

    /* renamed from: e  reason: collision with root package name */
    public int f15368e;

    public final synchronized mp a() {
        int i10 = this.f15368e;
        byte[] bArr = this.f15367d;
        if (i10 >= bArr.length) {
            this.f15365b.add(new np(this.f15367d));
            this.f15367d = f15363f;
        } else if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            this.f15365b.add(new np(bArr2));
        }
        this.f15366c += this.f15368e;
        this.f15368e = 0;
        return mp.K(this.f15365b);
    }

    public final void d(int i10) {
        this.f15365b.add(new np(this.f15367d));
        int length = this.f15366c + this.f15367d.length;
        this.f15366c = length;
        this.f15367d = new byte[Math.max(this.f15364a, Math.max(i10, length >>> 1))];
        this.f15368e = 0;
    }

    public final String toString() {
        int i10;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i10 = this.f15366c + this.f15368e;
        }
        objArr[1] = Integer.valueOf(i10);
        return String.format("<ByteString.Output@%s size=%d>", objArr);
    }

    public final synchronized void write(int i10) {
        if (this.f15368e == this.f15367d.length) {
            d(1);
        }
        byte[] bArr = this.f15367d;
        int i11 = this.f15368e;
        this.f15368e = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    public final synchronized void write(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.f15367d;
        int length = bArr2.length;
        int i12 = this.f15368e;
        if (i11 <= length - i12) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f15368e += i11;
            return;
        }
        int length2 = bArr2.length - i12;
        System.arraycopy(bArr, i10, bArr2, i12, length2);
        int i13 = i11 - length2;
        d(i13);
        System.arraycopy(bArr, i10 + length2, this.f15367d, 0, i13);
        this.f15368e = i13;
    }
}
