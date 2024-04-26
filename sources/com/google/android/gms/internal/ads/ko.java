package com.google.android.gms.internal.ads;

import e8.i60;
import e8.r60;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import l0.d;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ko implements ep {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<Cipher> f7261d = new i60();

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f7262a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7263b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7264c;

    public ko(byte[] bArr, int i10) throws GeneralSecurityException {
        hp.a(bArr.length);
        this.f7262a = new SecretKeySpec(bArr, "AES");
        int blockSize = f7261d.get().getBlockSize();
        this.f7264c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f7263b = i10;
    }

    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f7263b;
        if (length <= Integer.MAX_VALUE - i10) {
            byte[] bArr2 = new byte[(bArr.length + i10)];
            byte[] a10 = r60.a(i10);
            System.arraycopy(a10, 0, bArr2, 0, this.f7263b);
            int length2 = bArr.length;
            int i11 = this.f7263b;
            Cipher cipher = f7261d.get();
            byte[] bArr3 = new byte[this.f7264c];
            System.arraycopy(a10, 0, bArr3, 0, this.f7263b);
            cipher.init(1, this.f7262a, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length2, bArr2, i11) == length2) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        throw new GeneralSecurityException(d.a(43, "plaintext length can not exceed ", Integer.MAX_VALUE - this.f7263b));
    }
}
