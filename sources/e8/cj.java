package e8;

import android.content.Context;
import c8.b;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.ue;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cj implements bj {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14146a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14147b;

    public cj(ue ueVar) {
        this.f14147b = ueVar;
    }

    public final void l(Context context) {
        switch (this.f14146a) {
            case 0:
                return;
            default:
                try {
                    ue ueVar = (ue) this.f14147b;
                    ueVar.getClass();
                    ueVar.f8245a.D();
                    if (context != null) {
                        ue ueVar2 = (ue) this.f14147b;
                        ueVar2.getClass();
                        ueVar2.f8245a.J4(new b(context));
                        return;
                    }
                    return;
                } catch (b10 e10) {
                    e.D("Cannot invoke onResume for the mediation adapter.", e10);
                    return;
                } catch (Throwable th) {
                    throw new b10(th);
                }
        }
    }

    public final void m(Context context) {
        switch (this.f14146a) {
            case 0:
                ((t7) ((ri) this.f14147b).f8042b).destroy();
                return;
            default:
                try {
                    ue ueVar = (ue) this.f14147b;
                    ueVar.getClass();
                    ueVar.f8245a.destroy();
                    return;
                } catch (b10 e10) {
                    e.D("Cannot invoke onDestroy for the mediation adapter.", e10);
                    return;
                } catch (Throwable th) {
                    throw new b10(th);
                }
        }
    }

    public final void w(Context context) {
        switch (this.f14146a) {
            case 0:
                return;
            default:
                try {
                    ue ueVar = (ue) this.f14147b;
                    ueVar.getClass();
                    ueVar.f8245a.g();
                    return;
                } catch (b10 e10) {
                    e.D("Cannot invoke onPause for the mediation adapter.", e10);
                    return;
                } catch (Throwable th) {
                    throw new b10(th);
                }
        }
    }

    public cj(ri riVar) {
        this.f14147b = riVar;
    }
}
