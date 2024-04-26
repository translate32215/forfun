package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ek implements mi {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f6291c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final mn f6292a;

    /* renamed from: b  reason: collision with root package name */
    public final mi f6293b;

    public ek(mn mnVar, mi miVar) {
        this.f6292a = mnVar;
        this.f6293b = miVar;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] f10 = dj.i(this.f6292a).f();
        byte[] a10 = this.f6293b.a(f10, f6291c);
        mp mpVar = mp.f7494b;
        byte[] a11 = ((mi) dj.b(this.f6292a.y(), mp.I(f10, 0, f10.length), mi.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(a10.length + 4 + a11.length).putInt(a10.length).put(a10).put(a11).array();
    }
}
