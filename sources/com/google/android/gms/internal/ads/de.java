package com.google.android.gms.internal.ads;

import e8.a00;
import e8.fi;
import e8.p50;
import e8.yz;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class de<RequestComponentT extends fi<AdT>, AdT> implements yz<RequestComponentT, AdT> {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public RequestComponentT f6201a;

    public final synchronized p50<AdT> a(je jeVar, a00<RequestComponentT> a00) {
        RequestComponentT requestcomponentt;
        requestcomponentt = (fi) a00.C(jeVar.f7150b).b();
        this.f6201a = requestcomponentt;
        return requestcomponentt.a().b();
    }

    public final Object b() {
        RequestComponentT requestcomponentt;
        synchronized (this) {
            requestcomponentt = this.f6201a;
        }
        return requestcomponentt;
    }
}
