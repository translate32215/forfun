package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.dj;
import e8.z50;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cj implements dj.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z50 f6124a;

    public cj(z50 z50) {
        this.f6124a = z50;
    }

    public final <Q> z50<Q> a(Class<Q> cls) throws GeneralSecurityException {
        if (((pi) this.f6124a).f7863b.equals(cls)) {
            return this.f6124a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    public final z50<?> b() {
        return this.f6124a;
    }

    public final Class<?> c() {
        return this.f6124a.getClass();
    }

    public final Set<Class<?>> d() {
        return Collections.singleton(((pi) this.f6124a).f7863b);
    }

    public final Class<?> e() {
        return null;
    }
}
