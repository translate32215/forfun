package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.dj;
import e8.a60;
import e8.z50;
import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ej implements dj.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a60 f6289a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ qi f6290b;

    public ej(a60 a60, qi qiVar) {
        this.f6289a = a60;
        this.f6290b = qiVar;
    }

    public final <Q> z50<Q> a(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new bj(this.f6289a, this.f6290b, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    public final z50<?> b() {
        a60 a60 = this.f6289a;
        return new bj(a60, this.f6290b, a60.f7979c);
    }

    public final Class<?> c() {
        return this.f6289a.getClass();
    }

    public final Set<Class<?>> d() {
        return this.f6289a.d();
    }

    public final Class<?> e() {
        return this.f6290b.getClass();
    }
}
