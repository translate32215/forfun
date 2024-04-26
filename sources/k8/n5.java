package k8;

import e8.y9;
import l0.d;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class n5 extends o5 {

    /* renamed from: d  reason: collision with root package name */
    public final int f20375d;

    public n5(byte[] bArr, int i10) {
        super(bArr);
        p5.x(0, i10, bArr.length);
        this.f20375d = i10;
    }

    public final byte c(int i10) {
        int i11 = this.f20375d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f20392c[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(d.a(22, "Index < 0: ", i10));
        }
        throw new ArrayIndexOutOfBoundsException(y9.a(40, "Index > length: ", i10, ", ", i11));
    }

    public final byte f(int i10) {
        return this.f20392c[i10];
    }

    public final int h() {
        return this.f20375d;
    }

    public final int z() {
        return 0;
    }
}
