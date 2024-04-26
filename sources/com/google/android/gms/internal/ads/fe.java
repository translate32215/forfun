package com.google.android.gms.internal.ads;

import e8.a00;
import e8.fi;
import e8.mh;
import e8.p50;
import e8.yz;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fe<RequestComponentT extends fi<AdT>, AdT> implements yz<RequestComponentT, AdT> {

    /* renamed from: a  reason: collision with root package name */
    public final yz<RequestComponentT, AdT> f6460a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public RequestComponentT f6461b;

    public fe(yz<RequestComponentT, AdT> yzVar) {
        this.f6460a = yzVar;
    }

    public final synchronized p50<AdT> a(je jeVar, a00<RequestComponentT> a00) {
        if (jeVar.f7149a != null) {
            RequestComponentT requestcomponentt = (fi) a00.C(jeVar.f7150b).b();
            this.f6461b = requestcomponentt;
            mh a10 = requestcomponentt.a();
            l5 l5Var = jeVar.f7149a;
            a10.getClass();
            return a10.c(a10.a(yh.h(l5Var)));
        }
        p50<AdT> a11 = this.f6460a.a(jeVar, a00);
        this.f6461b = (fi) this.f6460a.b();
        return a11;
    }

    public final Object b() {
        RequestComponentT requestcomponentt;
        synchronized (this) {
            requestcomponentt = this.f6461b;
        }
        return requestcomponentt;
    }
}
