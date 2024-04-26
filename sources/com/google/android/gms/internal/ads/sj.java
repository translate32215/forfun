package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kn;
import e8.f80;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class sj extends qi<bm> {
    public sj() {
        super(bm.class, new vj(mi.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public final kn.a c() {
        return kn.a.SYMMETRIC;
    }

    public final ti<em, bm> e() {
        return new uj(this, em.class);
    }

    public final /* synthetic */ void f(cq cqVar) throws GeneralSecurityException {
        bm bmVar = (bm) cqVar;
        hp.b(bmVar.y());
        hp.a(bmVar.B().size());
    }

    public final /* synthetic */ cq g(mp mpVar) throws f80 {
        return bm.E(mpVar, up.a());
    }
}
