package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class ij implements aj<mi, mi> {

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static class a implements mi {

        /* renamed from: a  reason: collision with root package name */
        public final yi<mi> f7096a;

        public a(yi yiVar, o.a aVar) {
            this.f7096a = yiVar;
        }

        public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return g.d(this.f7096a.f8610b.a(), ((mi) this.f7096a.f8610b.f18309a).a(bArr, bArr2));
        }
    }

    static {
        Logger.getLogger(ij.class.getName());
    }

    public final /* synthetic */ Object a(yi yiVar) throws GeneralSecurityException {
        return new a(yiVar, (o.a) null);
    }

    public final Class<mi> b() {
        return mi.class;
    }

    public final Class<mi> c() {
        return mi.class;
    }
}
