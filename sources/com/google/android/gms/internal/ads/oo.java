package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class oo extends qo {
    public oo(byte[] bArr, int i10) throws InvalidKeyException {
        super(bArr, i10);
    }

    public final int[] f(int[] iArr, int i10) {
        if (iArr.length == 3) {
            int[] iArr2 = new int[16];
            qo.e(iArr2, this.f7983a);
            iArr2[12] = i10;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length << 5)}));
    }

    public final int g() {
        return 12;
    }
}
