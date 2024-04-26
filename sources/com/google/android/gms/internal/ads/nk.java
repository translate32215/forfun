package com.google.android.gms.internal.ads;

import e8.y50;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class nk extends si<y50, wm> {
    public nk(Class cls) {
        super(cls);
    }

    public final /* synthetic */ Object a(Object obj) throws GeneralSecurityException {
        wm wmVar = (wm) obj;
        sm D = wmVar.D().D();
        an y10 = D.y();
        vo b10 = g7.b(y10.y());
        byte[] c10 = wmVar.C().c();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, c10), uo.b(b10));
        return new to((ECPrivateKey) zo.f8723i.a("EC").generatePrivate(eCPrivateKeySpec), y10.A().c(), g7.d(y10.z()), g7.c(D.A()), new wk(D.z().y()));
    }
}
