package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kn;
import com.google.android.gms.internal.ads.rn;
import e8.f80;
import java.security.GeneralSecurityException;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zi {
    @Deprecated
    public static final vi a(byte[] bArr) throws GeneralSecurityException {
        try {
            rn C = rn.C(bArr, up.a());
            for (rn.b next : C.z()) {
                if (next.B().D() == kn.a.UNKNOWN_KEYMATERIAL || next.B().D() == kn.a.SYMMETRIC || next.B().D() == kn.a.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            if (C.A() > 0) {
                return new vi(C);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (f80 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
