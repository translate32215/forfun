package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gp implements wi {

    /* renamed from: a  reason: collision with root package name */
    public final el f6680a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6681b;

    public gp(el elVar, int i10) throws GeneralSecurityException {
        this.f6680a = elVar;
        this.f6681b = i10;
        if (i10 >= 10) {
            elVar.c(new byte[0], i10);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        return this.f6680a.c(bArr, this.f6681b);
    }
}
