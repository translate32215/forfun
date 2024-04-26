package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.o;
import com.google.android.gms.internal.ads.cq;
import com.google.android.gms.internal.ads.kn;
import e.g;
import e8.f80;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class qi<KeyProtoT extends cq> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<KeyProtoT> f7977a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, si<?, KeyProtoT>> f7978b;

    /* renamed from: c  reason: collision with root package name */
    public final Class<?> f7979c;

    @SafeVarargs
    public qi(Class<KeyProtoT> cls, si<?, KeyProtoT>... siVarArr) {
        this.f7977a = cls;
        HashMap hashMap = new HashMap();
        int length = siVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            si<?, KeyProtoT> siVar = siVarArr[i10];
            if (hashMap.containsKey(siVar.f8129a)) {
                String valueOf = String.valueOf(siVar.f8129a.getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            } else {
                hashMap.put(siVar.f8129a, siVar);
                i10++;
            }
        }
        if (siVarArr.length > 0) {
            this.f7979c = siVarArr[0].f8129a;
        } else {
            this.f7979c = Void.class;
        }
        this.f7978b = Collections.unmodifiableMap(hashMap);
    }

    public abstract String a();

    public final <P> P b(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        si siVar = this.f7978b.get(cls);
        if (siVar != null) {
            return siVar.a(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException(g.a(o.a(canonicalName, 41), "Requested primitive class ", canonicalName, " not supported."));
    }

    public abstract kn.a c();

    public final Set<Class<?>> d() {
        return this.f7978b.keySet();
    }

    public ti<?, KeyProtoT> e() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract void f(KeyProtoT keyprotot) throws GeneralSecurityException;

    public abstract KeyProtoT g(mp mpVar) throws f80;
}
