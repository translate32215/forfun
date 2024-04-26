package j4;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ads.dy;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.y5;
import e8.dj0;
import k7.a;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class g extends a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractAdViewAdapter f19531a;

    public g(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f19531a = abstractAdViewAdapter;
    }

    public final void w() {
        Bundle bundle;
        if (this.f19531a.zzmj != null && this.f19531a.zzmk != null) {
            dj0 dj0 = this.f19531a.zzmj.f28126a;
            dj0.getClass();
            try {
                dy dyVar = dj0.f14291e;
                if (dyVar != null) {
                    bundle = dyVar.X();
                    g2 g2Var = (g2) this.f19531a.zzmk;
                    g2Var.getClass();
                    i.d("#008 Must be called on the main UI thread.");
                    e.E("Adapter called onAdMetadataChanged.");
                    ((y5) g2Var.f6511b).b0(bundle);
                }
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
            bundle = new Bundle();
            g2 g2Var2 = (g2) this.f19531a.zzmk;
            g2Var2.getClass();
            i.d("#008 Must be called on the main UI thread.");
            e.E("Adapter called onAdMetadataChanged.");
            try {
                ((y5) g2Var2.f6511b).b0(bundle);
            } catch (RemoteException e11) {
                e.F("#007 Could not call remote method.", e11);
            }
        }
    }
}
