package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.pl;
import e8.f80;
import e8.r60;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class oj extends ti<sl, pl> {
    public oj(mj mjVar, Class cls) {
        super(cls);
    }

    public final /* synthetic */ void a(cq cqVar) throws GeneralSecurityException {
        sl slVar = (sl) cqVar;
        hp.a(slVar.y());
        mj.i(slVar.z());
    }

    public final Object b(cq cqVar) throws GeneralSecurityException {
        sl slVar = (sl) cqVar;
        pl.a E = pl.E();
        tl z10 = slVar.z();
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        pl.A((pl) E.f5970b, z10);
        byte[] a10 = r60.a(slVar.y());
        mp I = mp.I(a10, 0, a10.length);
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        pl.B((pl) E.f5970b, I);
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        pl.z((pl) E.f5970b);
        return (pl) ((aq) E.j());
    }

    public final /* synthetic */ cq c(mp mpVar) throws f80 {
        return sl.C(mpVar, up.a());
    }
}
