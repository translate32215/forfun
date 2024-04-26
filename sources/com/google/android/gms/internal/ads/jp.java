package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jp extends qo {
    public jp(byte[] bArr, int i10) throws InvalidKeyException {
        super(bArr, i10);
    }

    public final int[] f(int[] iArr, int i10) {
        if (iArr.length == 6) {
            int[] iArr2 = new int[16];
            int[] iArr3 = new int[16];
            qo.e(iArr3, this.f7983a);
            iArr3[12] = iArr[0];
            iArr3[13] = iArr[1];
            iArr3[14] = iArr[2];
            iArr3[15] = iArr[3];
            qo.h(iArr3);
            iArr3[4] = iArr3[12];
            iArr3[5] = iArr3[13];
            iArr3[6] = iArr3[14];
            iArr3[7] = iArr3[15];
            qo.e(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i10;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length << 5)}));
    }

    public final int g() {
        return 24;
    }
}
