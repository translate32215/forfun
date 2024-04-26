package com.google.android.gms.internal.ads;

import e8.l60;
import e8.r60;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mo implements mi {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<Cipher> f7492b = new l60();

    /* renamed from: a  reason: collision with root package name */
    public final SecretKey f7493a;

    public mo(byte[] bArr) throws GeneralSecurityException {
        hp.a(bArr.length);
        this.f7493a = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] a10 = r60.a(12);
            System.arraycopy(a10, 0, bArr3, 0, 12);
            int length = a10.length;
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                algorithmParameterSpec = new GCMParameterSpec(128, a10, 0, length);
            } catch (ClassNotFoundException unused) {
                if (a.h()) {
                    algorithmParameterSpec = new IvParameterSpec(a10, 0, length);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            ThreadLocal<Cipher> threadLocal = f7492b;
            threadLocal.get().init(1, this.f7493a, algorithmParameterSpec);
            if (!(bArr2 == null || bArr2.length == 0)) {
                threadLocal.get().updateAAD(bArr2);
            }
            int doFinal = threadLocal.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr.length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
