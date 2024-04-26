package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class si<PrimitiveT, KeyT> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<PrimitiveT> f8129a;

    public si(Class<PrimitiveT> cls) {
        this.f8129a = cls;
    }

    public abstract PrimitiveT a(KeyT keyt) throws GeneralSecurityException;
}
