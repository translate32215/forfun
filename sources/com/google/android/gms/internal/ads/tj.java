package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.wl;
import e8.f80;
import e8.r60;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class tj extends ti<xl, wl> {
    public tj(rj rjVar, Class cls) {
        super(cls);
    }

    public final /* synthetic */ void a(cq cqVar) throws GeneralSecurityException {
        xl xlVar = (xl) cqVar;
        hp.a(xlVar.y());
        if (xlVar.z().y() != 12 && xlVar.z().y() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    public final Object b(cq cqVar) throws GeneralSecurityException {
        xl xlVar = (xl) cqVar;
        wl.a E = wl.E();
        byte[] a10 = r60.a(xlVar.y());
        mp I = mp.I(a10, 0, a10.length);
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        wl.B((wl) E.f5970b, I);
        am z10 = xlVar.z();
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        wl.A((wl) E.f5970b, z10);
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        wl.z((wl) E.f5970b);
        return (wl) ((aq) E.j());
    }

    public final /* synthetic */ cq c(mp mpVar) throws f80 {
        return xl.B(mpVar, up.a());
    }
}
