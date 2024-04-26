package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import c8.b;
import e8.b10;
import e8.ip;
import e8.jp;
import e8.kp;
import e8.mt;
import e8.ru;
import e8.t00;
import e8.w00;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qc implements vb<za, a4, zb> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7939a;

    /* renamed from: b  reason: collision with root package name */
    public final kp f7940b;

    public qc(Context context, kp kpVar) {
        this.f7939a = context;
        this.f7940b = kpVar;
    }

    public final Object a(t00 t00, qe qeVar, mt mtVar) throws b10, ru {
        bc bcVar = new bc(qeVar, (a4) mtVar.f15550b, true);
        ip e10 = this.f7940b.e(new j8(t00, qeVar, mtVar.f15549a), new jp(bcVar));
        bcVar.f6015d = e10.d();
        ((zb) mtVar.f15551c).t6(e10.n());
        return e10.k();
    }

    public final void b(t00 t00, qe qeVar, mt<a4, zb> mtVar) throws b10 {
        try {
            ((a4) mtVar.f15550b).j1(qeVar.T);
            if (((w00) t00.f16700a.f8042b).f17201o.f16946b == 3) {
                ((a4) mtVar.f15550b).Q1(qeVar.O, qeVar.f7968u.toString(), ((w00) t00.f16700a.f8042b).f17190d, new b(this.f7939a), new rc(this, mtVar), (y2) mtVar.f15551c);
            } else {
                ((a4) mtVar.f15550b).v2(qeVar.O, qeVar.f7968u.toString(), ((w00) t00.f16700a.f8042b).f17190d, new b(this.f7939a), new rc(this, mtVar), (y2) mtVar.f15551c);
            }
        } catch (RemoteException e10) {
            e.v("Remote exception loading a rewarded RTB ad", e10);
        }
    }
}
