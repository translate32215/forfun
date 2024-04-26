package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import c8.a;
import c8.b;
import e8.co;
import e8.fn;
import e8.hn;
import e8.jn;
import java.util.Collections;
import java.util.List;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wa extends n1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f8437a;

    /* renamed from: b  reason: collision with root package name */
    public final fn f8438b;

    /* renamed from: c  reason: collision with root package name */
    public final jn f8439c;

    public wa(String str, fn fnVar, jn jnVar) {
        this.f8437a = str;
        this.f8438b = fnVar;
        this.f8439c = jnVar;
    }

    public final List<?> T1() throws RemoteException {
        if (u6()) {
            return this.f8439c.g();
        }
        return Collections.emptyList();
    }

    public final String b() throws RemoteException {
        return this.f8439c.e();
    }

    public final String c() throws RemoteException {
        return this.f8439c.a();
    }

    public final String getCallToAction() throws RemoteException {
        return this.f8439c.b();
    }

    public final hz getVideoController() throws RemoteException {
        return this.f8439c.h();
    }

    public final u h() throws RemoteException {
        return this.f8439c.v();
    }

    public final List<?> i() throws RemoteException {
        return this.f8439c.f();
    }

    public final double k() throws RemoteException {
        double d10;
        jn jnVar = this.f8439c;
        synchronized (jnVar) {
            d10 = jnVar.f15169n;
        }
        return d10;
    }

    public final a p() throws RemoteException {
        return this.f8439c.w();
    }

    public final String r() throws RemoteException {
        String t10;
        jn jnVar = this.f8439c;
        synchronized (jnVar) {
            t10 = jnVar.t("price");
        }
        return t10;
    }

    public final void s6() throws RemoteException {
        fn fnVar = this.f8438b;
        synchronized (fnVar) {
            fnVar.f14654j.g();
        }
    }

    public final String t() throws RemoteException {
        String t10;
        jn jnVar = this.f8439c;
        synchronized (jnVar) {
            t10 = jnVar.t("advertiser");
        }
        return t10;
    }

    public final boolean t6() {
        boolean s10;
        fn fnVar = this.f8438b;
        synchronized (fnVar) {
            s10 = fnVar.f14654j.s();
        }
        return s10;
    }

    public final String u() throws RemoteException {
        String t10;
        jn jnVar = this.f8439c;
        synchronized (jnVar) {
            t10 = jnVar.t("store");
        }
        return t10;
    }

    public final boolean u6() throws RemoteException {
        return !this.f8439c.g().isEmpty() && this.f8439c.m() != null;
    }

    public final void v6() {
        fn fnVar = this.f8438b;
        synchronized (fnVar) {
            co coVar = fnVar.f14663s;
            if (coVar == null) {
                e.E("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            } else {
                fnVar.f14652h.execute(new hn(fnVar, coVar instanceof ha));
            }
        }
    }

    public final z w() throws RemoteException {
        z zVar;
        jn jnVar = this.f8439c;
        synchronized (jnVar) {
            zVar = jnVar.f15170o;
        }
        return zVar;
    }

    public final void w6(j1 j1Var) throws RemoteException {
        fn fnVar = this.f8438b;
        synchronized (fnVar) {
            fnVar.f14654j.h(j1Var);
        }
    }

    public final void x6(xy xyVar) throws RemoteException {
        fn fnVar = this.f8438b;
        synchronized (fnVar) {
            fnVar.f14654j.d(xyVar);
        }
    }

    public final a y() throws RemoteException {
        return new b(this.f8438b);
    }

    public final void y5(cz czVar) throws RemoteException {
        fn fnVar = this.f8438b;
        synchronized (fnVar) {
            fnVar.A.f6459a.set(czVar);
        }
    }

    public final void y6(zy zyVar) throws RemoteException {
        fn fnVar = this.f8438b;
        synchronized (fnVar) {
            fnVar.f14654j.f(zyVar);
        }
    }

    public final void z6() {
        fn fnVar = this.f8438b;
        synchronized (fnVar) {
            fnVar.f14654j.n();
        }
    }
}
