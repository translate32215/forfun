package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kn;
import e8.a60;
import e8.f80;
import e8.y50;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ok extends a60<wm, xm> {
    public ok() {
        super(wm.class, xm.class, new nk(y50.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public final kn.a c() {
        return kn.a.ASYMMETRIC_PRIVATE;
    }

    public final ti<rm, wm> e() {
        return new qk(this, rm.class);
    }

    public final void f(cq cqVar) throws GeneralSecurityException {
        wm wmVar = (wm) cqVar;
        if (!(wmVar.C().size() == 0)) {
            hp.b(wmVar.y());
            g7.h(wmVar.D().D());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    public final /* synthetic */ cq g(mp mpVar) throws f80 {
        return wm.G(mpVar, up.a());
    }
}
