package com.google.android.gms.internal.ads;

import e8.f80;
import e8.m60;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wk implements m60 {

    /* renamed from: a  reason: collision with root package name */
    public final String f8469a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8470b;

    /* renamed from: c  reason: collision with root package name */
    public bm f8471c;

    /* renamed from: d  reason: collision with root package name */
    public ll f8472d;

    /* renamed from: e  reason: collision with root package name */
    public int f8473e;

    public wk(mn mnVar) throws GeneralSecurityException {
        String y10 = mnVar.y();
        this.f8469a = y10;
        if (y10.equals(jj.f7153b)) {
            try {
                em A = em.A(mnVar.z(), up.a());
                this.f8471c = (bm) dj.i(mnVar);
                this.f8470b = A.y();
            } catch (f80 e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e10);
            }
        } else if (y10.equals(jj.f7152a)) {
            try {
                ol B = ol.B(mnVar.z(), up.a());
                this.f8472d = (ll) dj.i(mnVar);
                this.f8473e = B.y().y();
                this.f8470b = this.f8473e + B.z().y();
            } catch (f80 e11) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
            }
        } else {
            String valueOf = String.valueOf(y10);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }
}
