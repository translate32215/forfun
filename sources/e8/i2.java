package e8;

import a7.j;
import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ads.l0;
import com.google.android.gms.internal.ads.x0;
import com.google.android.gms.internal.ads.y2;
import l0.e;
import n2.g;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class i2 extends x0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e2 f14970a;

    public i2(e2 e2Var, w90 w90) {
        this.f14970a = e2Var;
    }

    public final void o2(l0 l0Var) {
        String str;
        e2 e2Var = this.f14970a;
        j.b bVar = e2Var.f14355a;
        j a10 = e2.a(e2Var, l0Var);
        g gVar = (g) ((AbstractAdViewAdapter.e) bVar).f5001b;
        gVar.getClass();
        i.d("#008 Must be called on the main UI thread.");
        try {
            str = ((z1) a10).f17680a.t2();
        } catch (RemoteException e10) {
            e.C("", e10);
            str = null;
        }
        String valueOf = String.valueOf(str);
        e.E(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        gVar.f21853d = a10;
        try {
            ((y2) gVar.f21850a).v();
        } catch (RemoteException e11) {
            e.F("#007 Could not call remote method.", e11);
        }
    }
}
