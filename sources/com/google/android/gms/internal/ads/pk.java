package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kn;
import e8.f80;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pk extends qi<xm> {
    public pk() {
        super(xm.class, new rk(oi.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    public final kn.a c() {
        return kn.a.ASYMMETRIC_PUBLIC;
    }

    public final /* synthetic */ void f(cq cqVar) throws GeneralSecurityException {
        xm xmVar = (xm) cqVar;
        hp.b(xmVar.y());
        g7.h(xmVar.D());
    }

    public final /* synthetic */ cq g(mp mpVar) throws f80 {
        return xm.J(mpVar, up.a());
    }
}
