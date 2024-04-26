package y6;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.dy;
import e8.bi0;
import e8.dj0;
import e8.wh0;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final dj0 f28126a;

    public i(Context context) {
        this.f28126a = new dj0(context);
        com.google.android.gms.common.internal.i.i(context, "Context cannot be null");
    }

    public final void a(c cVar) {
        this.f28126a.b(cVar.f28108a);
    }

    public final void b(a aVar) {
        dj0 dj0 = this.f28126a;
        dj0.getClass();
        try {
            dj0.f14289c = aVar;
            dy dyVar = dj0.f14291e;
            if (dyVar != null) {
                dyVar.p6(new bi0(aVar));
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
        if (aVar instanceof wh0) {
            this.f28126a.a((wh0) aVar);
        }
    }

    public final void c(String str) {
        dj0 dj0 = this.f28126a;
        if (dj0.f14292f == null) {
            dj0.f14292f = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    public final void d(boolean z10) {
        dj0 dj0 = this.f28126a;
        dj0.getClass();
        try {
            dj0.f14296j = Boolean.valueOf(z10);
            dy dyVar = dj0.f14291e;
            if (dyVar != null) {
                dyVar.N(z10);
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
    }

    public final void e() {
        dj0 dj0 = this.f28126a;
        dj0.getClass();
        try {
            dj0.c("show");
            dj0.f14291e.showInterstitial();
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
    }
}
