package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.dn;
import e8.f80;
import e8.r60;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bl extends ti<gn, dn> {
    public bl(zk zkVar, Class cls) {
        super(cls);
    }

    public final /* synthetic */ void a(cq cqVar) throws GeneralSecurityException {
        gn gnVar = (gn) cqVar;
        if (gnVar.y() >= 16) {
            zk.i(gnVar.z());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public final Object b(cq cqVar) throws GeneralSecurityException {
        gn gnVar = (gn) cqVar;
        dn.a E = dn.E();
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        dn.z((dn) E.f5970b);
        hn z10 = gnVar.z();
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        dn.A((dn) E.f5970b, z10);
        byte[] a10 = r60.a(gnVar.y());
        mp I = mp.I(a10, 0, a10.length);
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        dn.B((dn) E.f5970b, I);
        return (dn) ((aq) E.j());
    }

    public final /* synthetic */ cq c(mp mpVar) throws f80 {
        return gn.C(mpVar, up.a());
    }
}
