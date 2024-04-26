package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kn;
import e8.f80;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class lj extends qi<ll> {
    public lj() {
        super(ll.class, new kj(mi.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public final kn.a c() {
        return kn.a.SYMMETRIC;
    }

    public final ti<ol, ll> e() {
        return new nj(this, ol.class);
    }

    public final /* synthetic */ void f(cq cqVar) throws GeneralSecurityException {
        ll llVar = (ll) cqVar;
        hp.b(llVar.y());
        new mj();
        mj.h(llVar.C());
        new zk();
        zk.h(llVar.D());
    }

    public final /* synthetic */ cq g(mp mpVar) throws f80 {
        return ll.G(mpVar, up.a());
    }
}
