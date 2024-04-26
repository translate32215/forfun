package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fm;
import e8.f80;
import e8.r60;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zj extends ti<im, fm> {
    public zj(xj xjVar, Class cls) {
        super(cls);
    }

    public final /* synthetic */ void a(cq cqVar) throws GeneralSecurityException {
        hp.a(((im) cqVar).y());
    }

    public final Object b(cq cqVar) throws GeneralSecurityException {
        fm.a C = fm.C();
        byte[] a10 = r60.a(((im) cqVar).y());
        mp I = mp.I(a10, 0, a10.length);
        if (C.f5971c) {
            C.n();
            C.f5971c = false;
        }
        fm.A((fm) C.f5970b, I);
        if (C.f5971c) {
            C.n();
            C.f5971c = false;
        }
        fm.z((fm) C.f5970b);
        return (fm) ((aq) C.j());
    }

    public final /* synthetic */ cq c(mp mpVar) throws f80 {
        return im.A(mpVar, up.a());
    }
}
