package com.google.android.gms.internal.ads;

import com.startapp.b4;
import e8.j60;
import e8.k60;
import e8.r60;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class lo implements mi {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadLocal<Cipher> f7403e = new j60();

    /* renamed from: f  reason: collision with root package name */
    public static final ThreadLocal<Cipher> f7404f = new k60();

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f7405a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f7406b;

    /* renamed from: c  reason: collision with root package name */
    public final SecretKeySpec f7407c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7408d;

    public lo(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 == 12 || i10 == 16) {
            this.f7408d = i10;
            hp.a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f7407c = secretKeySpec;
            Cipher cipher = f7403e.get();
            cipher.init(1, secretKeySpec);
            byte[] d10 = d(cipher.doFinal(new byte[16]));
            this.f7405a = d10;
            this.f7406b = d(d10);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    public static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        int i11 = 0;
        while (i11 < 15) {
            int i12 = i11 + 1;
            bArr2[i11] = (byte) ((bArr[i11] << 1) ^ ((bArr[i12] & 255) >>> 7));
            i11 = i12;
        }
        int i13 = bArr[15] << 1;
        if ((bArr[0] & b4.f10104d) != 0) {
            i10 = 135;
        }
        bArr2[15] = (byte) (i13 ^ i10);
        return bArr2;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        int i10 = this.f7408d;
        if (length <= (Integer.MAX_VALUE - i10) - 16) {
            byte[] bArr4 = new byte[(bArr3.length + i10 + 16)];
            byte[] a10 = r60.a(i10);
            System.arraycopy(a10, 0, bArr4, 0, this.f7408d);
            Cipher cipher = f7403e.get();
            cipher.init(1, this.f7407c);
            byte[] b10 = b(cipher, 0, a10, 0, a10.length);
            byte[] bArr5 = bArr2 == null ? new byte[0] : bArr2;
            byte[] b11 = b(cipher, 1, bArr5, 0, bArr5.length);
            Cipher cipher2 = f7404f.get();
            cipher2.init(1, this.f7407c, new IvParameterSpec(b10));
            cipher2.doFinal(bArr, 0, bArr3.length, bArr4, this.f7408d);
            byte[] b12 = b(cipher, 2, bArr4, this.f7408d, bArr3.length);
            int length2 = bArr3.length + this.f7408d;
            for (int i11 = 0; i11 < 16; i11++) {
                bArr4[length2 + i11] = (byte) ((b11[i11] ^ b10[i11]) ^ b12[i11]);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] b(Cipher cipher, int i10, byte[] bArr, int i11, int i12) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i10;
        if (i12 == 0) {
            return cipher.doFinal(c(bArr3, this.f7405a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i13 = 0;
        while (i12 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                doFinal[i14] = (byte) (doFinal[i14] ^ bArr[(i11 + i13) + i14]);
            }
            doFinal = cipher.doFinal(doFinal);
            i13 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i13 + i11, i11 + i12);
        if (copyOfRange.length == 16) {
            bArr2 = c(copyOfRange, this.f7405a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f7406b, 16);
            for (int i15 = 0; i15 < copyOfRange.length; i15++) {
                copyOf[i15] = (byte) (copyOf[i15] ^ copyOfRange[i15]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ b4.f10104d);
            bArr2 = copyOf;
        }
        return cipher.doFinal(c(doFinal, bArr2));
    }
}
