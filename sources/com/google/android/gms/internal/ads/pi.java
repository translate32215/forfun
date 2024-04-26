package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cq;
import com.google.android.gms.internal.ads.kn;
import e8.f80;
import e8.z50;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class pi<PrimitiveT, KeyProtoT extends cq> implements z50<PrimitiveT> {

    /* renamed from: a  reason: collision with root package name */
    public final qi<KeyProtoT> f7862a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<PrimitiveT> f7863b;

    public pi(qi<KeyProtoT> qiVar, Class<PrimitiveT> cls) {
        if (qiVar.d().contains(cls) || Void.class.equals(cls)) {
            this.f7862a = qiVar;
            this.f7863b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{qiVar.toString(), cls.getName()}));
    }

    public final PrimitiveT a(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (!Void.class.equals(this.f7863b)) {
            this.f7862a.f(keyprotot);
            return this.f7862a.b(keyprotot, this.f7863b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public final cq b(mp mpVar) throws GeneralSecurityException {
        try {
            return new ri((ti) this.f7862a.e()).T(mpVar);
        } catch (f80 e10) {
            String name = this.f7862a.e().f8204a.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e10);
        }
    }

    public final kn c(mp mpVar) throws GeneralSecurityException {
        try {
            cq T = new ri((ti) this.f7862a.e()).T(mpVar);
            kn.b E = kn.E();
            String a10 = this.f7862a.a();
            if (E.f5971c) {
                E.n();
                E.f5971c = false;
            }
            kn.A((kn) E.f5970b, a10);
            mp g10 = T.g();
            if (E.f5971c) {
                E.n();
                E.f5971c = false;
            }
            kn.z((kn) E.f5970b, g10);
            kn.a c10 = this.f7862a.c();
            if (E.f5971c) {
                E.n();
                E.f5971c = false;
            }
            kn.y((kn) E.f5970b, c10);
            return (kn) ((aq) E.j());
        } catch (f80 e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }
}
