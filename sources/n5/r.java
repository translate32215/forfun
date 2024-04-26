package n5;

import java.util.Arrays;
import v6.a;

/* compiled from: NalUnitTargetBuffer */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final int f22283a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22284b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22285c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f22286d;

    /* renamed from: e  reason: collision with root package name */
    public int f22287e;

    public r(int i10, int i11) {
        this.f22283a = i10;
        byte[] bArr = new byte[(i11 + 3)];
        this.f22286d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f22284b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f22286d;
            int length = bArr2.length;
            int i13 = this.f22287e;
            if (length < i13 + i12) {
                this.f22286d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f22286d, this.f22287e, i12);
            this.f22287e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f22284b) {
            return false;
        }
        this.f22287e -= i10;
        this.f22284b = false;
        this.f22285c = true;
        return true;
    }

    public void c() {
        this.f22284b = false;
        this.f22285c = false;
    }

    public void d(int i10) {
        boolean z10 = true;
        a.d(!this.f22284b);
        if (i10 != this.f22283a) {
            z10 = false;
        }
        this.f22284b = z10;
        if (z10) {
            this.f22287e = 3;
            this.f22285c = false;
        }
    }
}
