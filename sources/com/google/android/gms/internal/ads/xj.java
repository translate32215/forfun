package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kn;
import e8.f80;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xj extends qi<fm> {
    public xj() {
        super(fm.class, new wj(mi.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    public final kn.a c() {
        return kn.a.SYMMETRIC;
    }

    public final ti<im, fm> e() {
        return new zj(this, im.class);
    }

    public final /* synthetic */ void f(cq cqVar) throws GeneralSecurityException {
        fm fmVar = (fm) cqVar;
        hp.b(fmVar.y());
        hp.a(fmVar.B().size());
    }

    public final /* synthetic */ cq g(mp mpVar) throws f80 {
        return fm.E(mpVar, up.a());
    }
}
