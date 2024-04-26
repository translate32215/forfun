package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wo implements mi {

    /* renamed from: a  reason: collision with root package name */
    public final ep f8475a;

    /* renamed from: b  reason: collision with root package name */
    public final wi f8476b;

    public wo(ep epVar, wi wiVar, int i10) {
        this.f8475a = epVar;
        this.f8476b = wiVar;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] a10 = this.f8475a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return g.d(a10, this.f8476b.a(g.d(bArr2, a10, copyOf)));
    }
}
