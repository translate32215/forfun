package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import c8.b;
import e8.b10;
import e8.gf0;
import e8.jm;
import e8.mt;
import e8.rm;
import e8.ru;
import e8.t00;
import e8.w00;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cc implements vb<q9, a4, zb> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6111a;

    /* renamed from: b  reason: collision with root package name */
    public final rm f6112b;

    public cc(Context context, rm rmVar) {
        this.f6111a = context;
        this.f6112b = rmVar;
    }

    public final Object a(t00 t00, qe qeVar, mt mtVar) throws b10, ru {
        bc bcVar = new bc(qeVar, (a4) mtVar.f15550b, false);
        jm a10 = this.f6112b.a(new j8(t00, qeVar, mtVar.f15549a), new gf0((t9) bcVar));
        bcVar.f6015d = a10.d();
        ((zb) mtVar.f15551c).t6(a10.g());
        return a10.j();
    }

    public final void b(t00 t00, qe qeVar, mt<a4, zb> mtVar) throws b10 {
        try {
            ((a4) mtVar.f15550b).j1(qeVar.T);
            ((a4) mtVar.f15550b).a1(qeVar.O, qeVar.f7968u.toString(), ((w00) t00.f16700a.f8042b).f17190d, new b(this.f6111a), new dc(this, mtVar), (y2) mtVar.f15551c);
        } catch (RemoteException e10) {
            throw new b10(e10);
        }
    }
}
