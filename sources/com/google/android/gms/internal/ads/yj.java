package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kn;
import e8.f80;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yj extends qi<jm> {
    public yj() {
        super(jm.class, new bk(mi.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public final kn.a c() {
        return kn.a.SYMMETRIC;
    }

    public final ti<mm, jm> e() {
        return new ak(this, mm.class);
    }

    public final /* synthetic */ void f(cq cqVar) throws GeneralSecurityException {
        jm jmVar = (jm) cqVar;
        hp.b(jmVar.y());
        if (jmVar.B().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    public final /* synthetic */ cq g(mp mpVar) throws f80 {
        return jm.E(mpVar, up.a());
    }
}
