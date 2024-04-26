package com.google.android.gms.internal.ads;

import e8.f80;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public class rq {
    public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws f80 {
        if (!d(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !d(b12) && !d(b13)) {
                byte b14 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((b14 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((b14 & 1023) + 56320);
                return;
            }
        }
        throw f80.h();
    }

    public static void b(byte b10, byte b11, byte b12, char[] cArr, int i10) throws f80 {
        if (d(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || d(b12)))) {
            throw f80.h();
        }
        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
    }

    public static void c(byte b10, byte b11, char[] cArr, int i10) throws f80 {
        if (b10 < -62 || d(b11)) {
            throw f80.h();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    public static boolean d(byte b10) {
        return b10 > -65;
    }

    public static boolean e(byte b10) {
        return b10 >= 0;
    }

    public static byte[] f(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i10 = 0; i10 < 16; i10++) {
                bArr2[i10] = (byte) ((bArr[i10] << 1) & 254);
                if (i10 < 15) {
                    bArr2[i10] = (byte) (bArr2[i10] | ((byte) ((bArr[i10 + 1] >> 7) & 1)));
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }
}
