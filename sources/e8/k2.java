package e8;

import a7.l;
import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ads.e1;
import com.google.android.gms.internal.ads.k1;
import com.google.android.gms.internal.ads.y2;
import g7.g;
import g7.h;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class k2 extends e1 {

    /* renamed from: a  reason: collision with root package name */
    public final l.a f15221a;

    public k2(l.a aVar) {
        this.f15221a = aVar;
    }

    public final void m3(k1 k1Var) {
        l.a aVar = this.f15221a;
        d2 d2Var = new d2(k1Var);
        AbstractAdViewAdapter.e eVar = (AbstractAdViewAdapter.e) aVar;
        g gVar = eVar.f5001b;
        AbstractAdViewAdapter abstractAdViewAdapter = eVar.f5000a;
        AbstractAdViewAdapter.d dVar = new AbstractAdViewAdapter.d(d2Var);
        n2.g gVar2 = (n2.g) gVar;
        gVar2.getClass();
        i.d("#008 Must be called on the main UI thread.");
        e.E("Adapter called onAdLoaded.");
        gVar2.f21852c = dVar;
        gVar2.f21851b = null;
        n2.g.x(abstractAdViewAdapter, dVar, (h) null);
        try {
            ((y2) gVar2.f21850a).v();
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
    }
}
