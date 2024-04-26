package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.c;
import e8.cm;
import e8.dj;
import e8.dm;
import e8.ej;
import e8.em;
import e8.fm;
import e8.hm;
import e8.ji;
import e8.ki;
import e8.l5;
import e8.mj;
import e8.nj;
import e8.pk;
import e8.ri;
import e8.rk;
import e8.sk;
import e8.uj;
import e8.vk;
import e8.yi;
import e8.zh0;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class xc extends b3 {

    /* renamed from: a  reason: collision with root package name */
    public final ki f8532a;

    /* renamed from: b  reason: collision with root package name */
    public final yi f8533b;

    /* renamed from: c  reason: collision with root package name */
    public final dj f8534c;

    /* renamed from: d  reason: collision with root package name */
    public final mj f8535d;

    /* renamed from: e  reason: collision with root package name */
    public final vk f8536e;

    /* renamed from: f  reason: collision with root package name */
    public final uj f8537f;

    /* renamed from: g  reason: collision with root package name */
    public final m9 f8538g;

    /* renamed from: h  reason: collision with root package name */
    public final pk f8539h;

    /* renamed from: i  reason: collision with root package name */
    public final ri f8540i;

    public xc(ki kiVar, yi yiVar, dj djVar, mj mjVar, vk vkVar, uj ujVar, m9 m9Var, pk pkVar, ri riVar) {
        this.f8532a = kiVar;
        this.f8533b = yiVar;
        this.f8534c = djVar;
        this.f8535d = mjVar;
        this.f8536e = vkVar;
        this.f8537f = ujVar;
        this.f8538g = m9Var;
        this.f8539h = pkVar;
        this.f8540i = riVar;
    }

    public final void B1(String str) {
    }

    public final void C() {
        this.f8537f.J3(c.OTHER);
    }

    public void E2() {
        m9 m9Var = this.f8538g;
        synchronized (m9Var) {
            m9Var.I0(fm.f14651a);
            m9Var.f7447b = true;
        }
    }

    public final void F() {
        this.f8537f.G1();
        this.f8539h.I0(rk.f16331a);
    }

    public final void J() {
        this.f8534c.I0(ej.f14485a);
    }

    public void O() {
        this.f8533b.O();
        this.f8539h.I0(sk.f16501a);
    }

    @Deprecated
    public final void Q3(int i10) throws RemoteException {
        this.f8540i.J(e.o(we.MEDIATION_SHOW_ERROR, new zh0(i10, "", "undefined", (zh0) null, (IBinder) null)));
    }

    public final void S0(l5 l5Var) {
    }

    public final void U(zh0 zh0) {
    }

    public void V(b6 b6Var) throws RemoteException {
    }

    public void V0() throws RemoteException {
    }

    public final void X5(zh0 zh0) {
        this.f8540i.J(e.o(we.MEDIATION_SHOW_ERROR, zh0));
    }

    public final void a(String str, String str2) {
        this.f8536e.a(str, str2);
    }

    public final void a0() {
        this.f8538g.I0(dm.f14297a);
    }

    public final void b0(Bundle bundle) throws RemoteException {
    }

    public final void c0() throws RemoteException {
        m9 m9Var = this.f8538g;
        synchronized (m9Var) {
            if (!m9Var.f7447b) {
                m9Var.I0(em.f14489a);
                m9Var.f7447b = true;
            }
            m9Var.I0(hm.f14922a);
        }
    }

    public final void g3(String str) {
        this.f8540i.J(e.o(we.MEDIATION_SHOW_ERROR, new zh0(0, str, "undefined", (zh0) null, (IBinder) null)));
    }

    public final void h0(int i10) {
    }

    public void l3(a6 a6Var) {
    }

    public final void n() {
        this.f8532a.I0(ji.f15149a);
    }

    public final void t4(int i10, String str) {
    }

    public final void u0(l0 l0Var, String str) {
    }

    public final void v() {
        this.f8535d.I0(nj.f15692a);
    }

    public void y0() {
        this.f8538g.I0(cm.f14164a);
    }
}
