package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kn;
import e8.f80;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mj extends qi<pl> {
    public mj() {
        super(pl.class, new pj(ep.class));
    }

    public static void h(pl plVar) throws GeneralSecurityException {
        hp.b(plVar.y());
        hp.a(plVar.C().size());
        i(plVar.D());
    }

    public static void i(tl tlVar) throws GeneralSecurityException {
        if (tlVar.y() < 12 || tlVar.y() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final kn.a c() {
        return kn.a.SYMMETRIC;
    }

    public final ti<sl, pl> e() {
        return new oj(this, sl.class);
    }

    public final /* synthetic */ void f(cq cqVar) throws GeneralSecurityException {
        h((pl) cqVar);
    }

    public final /* synthetic */ cq g(mp mpVar) throws f80 {
        return pl.H(mpVar, up.a());
    }
}
