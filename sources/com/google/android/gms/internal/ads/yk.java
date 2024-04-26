package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kn;
import e8.f80;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yk extends qi<gl> {
    public yk() {
        super(gl.class, new xk(wi.class));
    }

    public static void h(kl klVar) throws GeneralSecurityException {
        if (klVar.y() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (klVar.y() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final kn.a c() {
        return kn.a.SYMMETRIC;
    }

    public final ti<hl, gl> e() {
        return new al(hl.class);
    }

    public final void f(cq cqVar) throws GeneralSecurityException {
        gl glVar = (gl) cqVar;
        hp.b(glVar.y());
        if (glVar.C().size() == 32) {
            h(glVar.D());
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }

    public final /* synthetic */ cq g(mp mpVar) throws f80 {
        return gl.G(mpVar, up.a());
    }
}
