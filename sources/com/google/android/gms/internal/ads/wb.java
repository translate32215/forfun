package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import c8.b;
import e8.b10;
import e8.be;
import e8.cg;
import e8.dg;
import e8.mt;
import e8.pg;
import e8.ru;
import e8.t00;
import e8.w00;
import e8.xu;
import e8.yt;
import l0.e;
import n2.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wb implements vb<dg, a4, zb> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8440a;

    /* renamed from: b  reason: collision with root package name */
    public final pg f8441b;

    /* renamed from: c  reason: collision with root package name */
    public View f8442c;

    public wb(Context context, pg pgVar) {
        this.f8440a = context;
        this.f8441b = pgVar;
    }

    public final Object a(t00 t00, qe qeVar, mt mtVar) throws b10, ru {
        cg b10 = this.f8441b.b(new j8(t00, qeVar, mtVar.f15549a), new g(this.f8442c, (t7) null, (y8) new yt(mtVar), qeVar.f7967t.get(0)));
        ((be) b10).P0.get().K0(this.f8442c);
        zb zbVar = (zb) mtVar.f15551c;
        xu g10 = b10.g();
        synchronized (zbVar) {
            zbVar.f8692a = g10;
        }
        return b10.h();
    }

    public final void b(t00 t00, qe qeVar, mt<a4, zb> mtVar) throws b10 {
        try {
            ((a4) mtVar.f15550b).j1(qeVar.T);
            ((a4) mtVar.f15550b).X2(qeVar.O, qeVar.f7968u.toString(), ((w00) t00.f16700a.f8042b).f17190d, new b(this.f8440a), new yb(this, mtVar, (e) null), (y2) mtVar.f15551c, ((w00) t00.f16700a.f8042b).f17191e);
        } catch (RemoteException e10) {
            throw new b10(e10);
        }
    }
}
