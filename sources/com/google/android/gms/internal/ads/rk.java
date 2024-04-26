package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class rk extends si<oi, xm> {
    public rk(Class cls) {
        super(cls);
    }

    public final Object a(Object obj) throws GeneralSecurityException {
        xm xmVar = (xm) obj;
        sm D = xmVar.D();
        an y10 = D.y();
        vo b10 = g7.b(y10.y());
        byte[] c10 = xmVar.E().c();
        byte[] c11 = xmVar.F().c();
        ECParameterSpec b11 = uo.b(b10);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, c10), new BigInteger(1, c11));
        uo.d(eCPoint, b11.getCurve());
        ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPoint, b11);
        return new so((ECPublicKey) zo.f8723i.a("EC").generatePublic(eCPublicKeySpec), y10.A().c(), g7.d(y10.z()), g7.c(D.A()), new wk(D.z().y()));
    }
}
