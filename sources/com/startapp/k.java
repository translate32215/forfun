package com.startapp;

import xb.a;

/* compiled from: Sta */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final rd f10739a;

    public k(rd rdVar) {
        this.f10739a = rdVar;
    }

    public static k a(n nVar) {
        rd rdVar = (rd) nVar;
        a aVar = rdVar.f11678e;
        if (aVar.f27917b != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        } else if (!rdVar.f11680g) {
            k kVar = new k(rdVar);
            aVar.f27917b = kVar;
            return kVar;
        } else {
            throw new IllegalStateException("AdSession is finished");
        }
    }
}
