package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kn;
import e8.f80;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class rj extends qi<wl> {
    public rj() {
        super(wl.class, new qj(mi.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final kn.a c() {
        return kn.a.SYMMETRIC;
    }

    public final ti<xl, wl> e() {
        return new tj(this, xl.class);
    }

    public final /* synthetic */ void f(cq cqVar) throws GeneralSecurityException {
        wl wlVar = (wl) cqVar;
        hp.b(wlVar.y());
        hp.a(wlVar.C().size());
        if (wlVar.D().y() != 12 && wlVar.D().y() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    public final /* synthetic */ cq g(mp mpVar) throws f80 {
        return wl.G(mpVar, up.a());
    }
}
