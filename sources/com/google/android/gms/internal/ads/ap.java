package com.google.android.gms.internal.ads;

import e8.hd0;
import e8.j70;
import e8.v6;
import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ap implements yo<KeyAgreement>, v6, j70, hd0 {
    public ap(int i10) {
    }

    public void a(Throwable th, String str, float f10) {
    }

    public /* synthetic */ Object b(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }

    public void c(Throwable th, String str) {
    }

    public ht[] d() {
        return new ht[]{new nt()};
    }

    public byte[] e(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }
}
