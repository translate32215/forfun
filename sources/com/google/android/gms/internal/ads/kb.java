package com.google.android.gms.internal.ads;

import e8.hq;
import e8.q20;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kb implements q20 {

    /* renamed from: a  reason: collision with root package name */
    public Map<Cif, hq> f7228a;

    /* renamed from: b  reason: collision with root package name */
    public nv f7229b;

    public kb(nv nvVar, Map<Cif, hq> map) {
        this.f7228a = map;
        this.f7229b = nvVar;
    }

    public final void B(Cif ifVar, String str) {
        if (this.f7228a.containsKey(ifVar)) {
            this.f7229b.b(this.f7228a.get(ifVar).f14929a);
        }
    }

    public final void P(Cif ifVar, String str) {
        if (this.f7228a.containsKey(ifVar)) {
            this.f7229b.b(this.f7228a.get(ifVar).f14930b);
        }
    }

    public final void g(Cif ifVar, String str, Throwable th) {
        if (this.f7228a.containsKey(ifVar)) {
            this.f7229b.b(this.f7228a.get(ifVar).f14931c);
        }
    }

    public final void y(Cif ifVar, String str) {
    }
}
