package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kn;
import e8.f80;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ik extends qi<ho> {
    public ik() {
        super(ho.class, new lk(mi.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public final kn.a c() {
        return kn.a.SYMMETRIC;
    }

    public final ti<io, ho> e() {
        return new kk(this, io.class);
    }

    public final /* synthetic */ void f(cq cqVar) throws GeneralSecurityException {
        ho hoVar = (ho) cqVar;
        hp.b(hoVar.y());
        if (hoVar.B().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    public final /* synthetic */ cq g(mp mpVar) throws f80 {
        return ho.E(mpVar, up.a());
    }
}
