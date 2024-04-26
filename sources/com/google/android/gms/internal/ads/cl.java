package com.google.android.gms.internal.ads;

import e8.h60;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cl extends si<wi, dn> {
    public cl(Class cls) {
        super(cls);
    }

    public final /* synthetic */ Object a(Object obj) throws GeneralSecurityException {
        dn dnVar = (dn) obj;
        cn z10 = dnVar.D().z();
        SecretKeySpec secretKeySpec = new SecretKeySpec(dnVar.C().c(), "HMAC");
        int y10 = dnVar.D().y();
        int i10 = h60.f14863a[z10.ordinal()];
        if (i10 == 1) {
            return new gp(new fp("HMACSHA1", secretKeySpec), y10);
        }
        if (i10 == 2) {
            return new gp(new fp("HMACSHA256", secretKeySpec), y10);
        }
        if (i10 == 3) {
            return new gp(new fp("HMACSHA512", secretKeySpec), y10);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
