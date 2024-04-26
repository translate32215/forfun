package e8;

import com.google.android.gms.internal.ads.ia;
import com.google.android.gms.internal.ads.t7;
import java.util.Map;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class xn implements f3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17501a;

    /* renamed from: b  reason: collision with root package name */
    public final ia f17502b;

    public xn(ia iaVar, int i10) {
        this.f17501a = i10;
        if (i10 == 1) {
            this.f17502b = iaVar;
        } else if (i10 != 2) {
            this.f17502b = iaVar;
        } else {
            this.f17502b = iaVar;
        }
    }

    public final void f(Object obj, Map map) {
        switch (this.f17501a) {
            case 0:
                t7 t7Var = (t7) obj;
                this.f17502b.f7058d.u();
                return;
            case 1:
                ia iaVar = this.f17502b;
                iaVar.getClass();
                e.J("Showing native ads overlay.");
                ((t7) obj).getView().setVisibility(0);
                iaVar.f7057c.f14903f = true;
                return;
            default:
                ia iaVar2 = this.f17502b;
                iaVar2.getClass();
                e.J("Hiding native ads overlay.");
                ((t7) obj).getView().setVisibility(8);
                iaVar2.f7057c.f14903f = false;
                return;
        }
    }
}
