package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import b2.t;
import c8.a;
import c8.b;
import k8.c1;
import k8.d1;
import k8.g1;
import k8.i1;
import k8.s1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class o2 extends x7 {

    /* renamed from: a  reason: collision with root package name */
    public final t f7662a;

    public o2(t tVar) {
        this.f7662a = tVar;
    }

    public final String I3() throws RemoteException {
        return ((s1) this.f7662a.f3445b).f();
    }

    public final void Y5(String str) throws RemoteException {
        s1 s1Var = (s1) this.f7662a.f3445b;
        s1Var.getClass();
        s1Var.f20455a.execute(new c1(s1Var, str));
    }

    public final void l1(a aVar, String str, String str2) throws RemoteException {
        t tVar = this.f7662a;
        Activity activity = aVar != null ? (Activity) b.z0(aVar) : null;
        s1 s1Var = (s1) tVar.f3445b;
        s1Var.getClass();
        s1Var.f20455a.execute(new d1(s1Var, activity, str, str2));
    }

    public final void l5(Bundle bundle) throws RemoteException {
        s1 s1Var = (s1) this.f7662a.f3445b;
        s1Var.getClass();
        s1Var.f20455a.execute(new i1(s1Var, bundle));
    }

    public final void p4(String str) throws RemoteException {
        s1 s1Var = (s1) this.f7662a.f3445b;
        s1Var.getClass();
        s1Var.f20455a.execute(new g1(s1Var, str));
    }

    public final String q2() throws RemoteException {
        return ((s1) this.f7662a.f3445b).g();
    }

    public final String t1() throws RemoteException {
        return ((s1) this.f7662a.f3445b).f20459e;
    }

    public final long v4() throws RemoteException {
        return ((s1) this.f7662a.f3445b).c();
    }

    public final void w0(String str, String str2, Bundle bundle) throws RemoteException {
        ((s1) this.f7662a.f3445b).l(str, str2, bundle);
    }

    public final String x4() throws RemoteException {
        return ((s1) this.f7662a.f3445b).h();
    }

    public final String y1() throws RemoteException {
        return ((s1) this.f7662a.f3445b).i();
    }
}
