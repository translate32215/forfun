package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bm;
import e8.f80;
import e8.r60;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class uj extends ti<em, bm> {
    public uj(sj sjVar, Class cls) {
        super(cls);
    }

    public final /* synthetic */ void a(cq cqVar) throws GeneralSecurityException {
        hp.a(((em) cqVar).y());
    }

    public final Object b(cq cqVar) throws GeneralSecurityException {
        bm.a C = bm.C();
        byte[] a10 = r60.a(((em) cqVar).y());
        mp I = mp.I(a10, 0, a10.length);
        if (C.f5971c) {
            C.n();
            C.f5971c = false;
        }
        bm.A((bm) C.f5970b, I);
        if (C.f5971c) {
            C.n();
            C.f5971c = false;
        }
        bm.z((bm) C.f5970b);
        return (bm) ((aq) C.j());
    }

    public final /* synthetic */ cq c(mp mpVar) throws f80 {
        return em.A(mpVar, up.a());
    }
}
