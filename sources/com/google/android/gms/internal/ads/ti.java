package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cq;
import e8.f80;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class ti<KeyFormatProtoT extends cq, KeyT> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<KeyFormatProtoT> f8204a;

    public ti(Class<KeyFormatProtoT> cls) {
        this.f8204a = cls;
    }

    public abstract void a(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public abstract KeyT b(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public abstract KeyFormatProtoT c(mp mpVar) throws f80;
}
