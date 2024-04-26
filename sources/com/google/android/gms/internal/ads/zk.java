package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kn;
import e8.f80;
import e8.h60;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zk extends qi<dn> {
    public zk() {
        super(dn.class, new cl(wi.class));
    }

    public static void h(dn dnVar) throws GeneralSecurityException {
        hp.b(dnVar.y());
        if (dnVar.C().size() >= 16) {
            i(dnVar.D());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public static void i(hn hnVar) throws GeneralSecurityException {
        if (hnVar.y() >= 10) {
            int i10 = h60.f14863a[hnVar.z().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (hnVar.y() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (hnVar.y() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (hnVar.y() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final kn.a c() {
        return kn.a.SYMMETRIC;
    }

    public final ti<gn, dn> e() {
        return new bl(this, gn.class);
    }

    public final /* synthetic */ void f(cq cqVar) throws GeneralSecurityException {
        h((dn) cqVar);
    }

    public final /* synthetic */ cq g(mp mpVar) throws f80 {
        return dn.H(mpVar, up.a());
    }
}
