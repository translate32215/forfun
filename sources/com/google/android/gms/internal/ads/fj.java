package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.dj;
import e8.z50;
import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fj implements dj.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ qi f6466a;

    public fj(qi qiVar) {
        this.f6466a = qiVar;
    }

    public final <Q> z50<Q> a(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new pi(this.f6466a, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    public final z50<?> b() {
        qi qiVar = this.f6466a;
        return new pi(qiVar, qiVar.f7979c);
    }

    public final Class<?> c() {
        return this.f6466a.getClass();
    }

    public final Set<Class<?>> d() {
        return this.f6466a.d();
    }

    public final Class<?> e() {
        return null;
    }
}
