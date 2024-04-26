package com.startapp;

import xb.a;

/* compiled from: Sta */
public final class g6 {

    /* renamed from: a  reason: collision with root package name */
    public final rd f10451a;

    public g6(rd rdVar) {
        this.f10451a = rdVar;
    }

    public static g6 a(n nVar) {
        rd rdVar = (rd) nVar;
        if (!rdVar.e()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        } else if (rdVar.f11679f) {
            throw new IllegalStateException("AdSession is started");
        } else if (!rdVar.f11680g) {
            a aVar = rdVar.f11678e;
            if (aVar.f27918c == null) {
                g6 g6Var = new g6(rdVar);
                aVar.f27918c = g6Var;
                return g6Var;
            }
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        } else {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public final void a(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }
}
