package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ll;
import e8.f80;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class nj extends ti<ol, ll> {
    public nj(lj ljVar, Class cls) {
        super(cls);
    }

    public final /* synthetic */ void a(cq cqVar) throws GeneralSecurityException {
        ol olVar = (ol) cqVar;
        new mj().e().a(olVar.y());
        new zk().e().a(olVar.z());
        hp.a(olVar.y().y());
    }

    public final Object b(cq cqVar) throws GeneralSecurityException {
        ol olVar = (ol) cqVar;
        pl b10 = new mj().e().b(olVar.y());
        dn b11 = new zk().e().b(olVar.z());
        ll.a E = ll.E();
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        ll.A((ll) E.f5970b, b10);
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        ll.B((ll) E.f5970b, b11);
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        ll.z((ll) E.f5970b, 0);
        return (ll) ((aq) E.j());
    }

    public final /* synthetic */ cq c(mp mpVar) throws f80 {
        return ol.B(mpVar, up.a());
    }
}
