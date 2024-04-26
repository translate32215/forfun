package k8;

import e8.y9;
import java.io.IOException;
import java.nio.charset.Charset;
import s9.e;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public class o5 extends p5 {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f20392c;

    public o5(byte[] bArr) {
        bArr.getClass();
        this.f20392c = bArr;
    }

    public byte c(int i10) {
        return this.f20392c[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p5) || h() != ((p5) obj).h()) {
            return false;
        }
        if (h() == 0) {
            return true;
        }
        if (!(obj instanceof o5)) {
            return obj.equals(this);
        }
        o5 o5Var = (o5) obj;
        int i10 = this.f20408a;
        int i11 = o5Var.f20408a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int h10 = h();
        if (h10 > o5Var.h()) {
            int h11 = h();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(h10);
            sb2.append(h11);
            throw new IllegalArgumentException(sb2.toString());
        } else if (h10 <= o5Var.h()) {
            byte[] bArr = this.f20392c;
            byte[] bArr2 = o5Var.f20392c;
            o5Var.z();
            int i12 = 0;
            int i13 = 0;
            while (i12 < h10) {
                if (bArr[i12] != bArr2[i13]) {
                    return false;
                }
                i12++;
                i13++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(y9.a(59, "Ran off end of other: 0, ", h10, ", ", o5Var.h()));
        }
    }

    public byte f(int i10) {
        return this.f20392c[i10];
    }

    public int h() {
        return this.f20392c.length;
    }

    public final int i(int i10, int i11, int i12) {
        byte[] bArr = this.f20392c;
        Charset charset = r6.f20450a;
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public final p5 j(int i10, int i11) {
        int x10 = p5.x(0, i11, h());
        if (x10 == 0) {
            return p5.f20407b;
        }
        return new n5(this.f20392c, x10);
    }

    public final String o(Charset charset) {
        return new String(this.f20392c, 0, h(), charset);
    }

    public final void q(e eVar) throws IOException {
        ((r5) eVar).C(this.f20392c, 0, h());
    }

    public final boolean s() {
        return v8.d(this.f20392c, 0, h());
    }

    public int z() {
        return 0;
    }
}
