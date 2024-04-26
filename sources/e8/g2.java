package e8;

import a7.j;
import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.internal.ads.l0;
import com.google.android.gms.internal.ads.w0;
import com.google.android.gms.internal.ads.y2;
import l0.e;
import n2.g;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class g2 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e2 f14701a;

    public g2(e2 e2Var, w90 w90) {
        this.f14701a = e2Var;
    }

    public final void u0(l0 l0Var, String str) {
        e2 e2Var = this.f14701a;
        j.a aVar = e2Var.f14356b;
        if (aVar != null) {
            j a10 = e2.a(e2Var, l0Var);
            g gVar = (g) ((AbstractAdViewAdapter.e) aVar).f5001b;
            gVar.getClass();
            if (a10 instanceof z1) {
                try {
                    ((y2) gVar.f21850a).u0(((z1) a10).f17680a, str);
                } catch (RemoteException e10) {
                    e.F("#007 Could not call remote method.", e10);
                }
            } else {
                e.K("Unexpected native custom template ad type.");
            }
        }
    }
}
