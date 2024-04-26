package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class dl implements aj<wi, wi> {

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static class a implements wi {

        /* renamed from: a  reason: collision with root package name */
        public final yi<wi> f6221a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f6222b = {0};

        public a(yi yiVar, ji jiVar) {
            this.f6221a = yiVar;
        }

        public final byte[] a(byte[] bArr) throws GeneralSecurityException {
            if (((Cdo) this.f6221a.f8610b.f18312d).equals(Cdo.LEGACY)) {
                return g.d(this.f6221a.f8610b.a(), ((wi) this.f6221a.f8610b.f18309a).a(g.d(bArr, this.f6222b)));
            }
            return g.d(this.f6221a.f8610b.a(), ((wi) this.f6221a.f8610b.f18309a).a(bArr));
        }
    }

    static {
        Logger.getLogger(dl.class.getName());
    }

    public final /* synthetic */ Object a(yi yiVar) throws GeneralSecurityException {
        return new a(yiVar, (ji) null);
    }

    public final Class<wi> b() {
        return wi.class;
    }

    public final Class<wi> c() {
        return wi.class;
    }
}
