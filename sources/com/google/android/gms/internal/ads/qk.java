package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.wm;
import com.google.android.gms.internal.ads.xm;
import e8.f80;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qk extends ti<rm, wm> {
    public qk(ok okVar, Class cls) {
        super(cls);
    }

    public final /* synthetic */ void a(cq cqVar) throws GeneralSecurityException {
        g7.h(((rm) cqVar).y());
    }

    public final Object b(cq cqVar) throws GeneralSecurityException {
        rm rmVar = (rm) cqVar;
        ECParameterSpec b10 = uo.b(g7.b(rmVar.y().y().y()));
        KeyPairGenerator a10 = zo.f8722h.a("EC");
        a10.initialize(b10);
        KeyPair generateKeyPair = a10.generateKeyPair();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        ECPoint w10 = ((ECPublicKey) generateKeyPair.getPublic()).getW();
        xm.a G = xm.G();
        if (G.f5971c) {
            G.n();
            G.f5971c = false;
        }
        xm.z((xm) G.f5970b);
        sm y10 = rmVar.y();
        if (G.f5971c) {
            G.n();
            G.f5971c = false;
        }
        xm.A((xm) G.f5970b, y10);
        mp L = mp.L(w10.getAffineX().toByteArray());
        if (G.f5971c) {
            G.n();
            G.f5971c = false;
        }
        xm.B((xm) G.f5970b, L);
        mp L2 = mp.L(w10.getAffineY().toByteArray());
        if (G.f5971c) {
            G.n();
            G.f5971c = false;
        }
        xm.C((xm) G.f5970b, L2);
        xm xmVar = (xm) ((aq) G.j());
        wm.a E = wm.E();
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        wm.z((wm) E.f5970b);
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        wm.A((wm) E.f5970b, xmVar);
        mp L3 = mp.L(eCPrivateKey.getS().toByteArray());
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        wm.B((wm) E.f5970b, L3);
        return (wm) ((aq) E.j());
    }

    public final /* synthetic */ cq c(mp mpVar) throws f80 {
        return rm.A(mpVar, up.a());
    }
}
