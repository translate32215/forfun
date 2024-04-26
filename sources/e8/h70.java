package e8;

import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.np;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class h70 extends np {

    /* renamed from: e  reason: collision with root package name */
    public final int f14878e;

    /* renamed from: f  reason: collision with root package name */
    public final int f14879f;

    public h70(byte[] bArr, int i10, int i11) {
        super(bArr);
        mp.H(i10, i10 + i11, bArr.length);
        this.f14878e = i10;
        this.f14879f = i11;
    }

    public final byte D(int i10) {
        mp.q(i10, this.f14879f);
        return this.f7602d[this.f14878e + i10];
    }

    public final byte F(int i10) {
        return this.f7602d[this.f14878e + i10];
    }

    public final int N() {
        return this.f14878e;
    }

    public final void s(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f7602d, this.f14878e + i10, bArr, i11, i12);
    }

    public final int size() {
        return this.f14879f;
    }
}
