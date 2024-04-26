package e8;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.t9;
import com.google.android.gms.internal.ads.ue;
import d7.l;
import l0.e;
import z3.i;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class fu implements t9 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14682a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14683b;

    public fu(d7 d7Var) {
        this.f14682a = 2;
        this.f14683b = d7Var;
    }

    public final void a(boolean z10, Context context) {
        switch (this.f14682a) {
            case 0:
                mt mtVar = (mt) this.f14683b;
                try {
                    ((ue) mtVar.f15550b).b(z10);
                    ue ueVar = (ue) mtVar.f15550b;
                    ueVar.getClass();
                    ueVar.f8245a.showInterstitial();
                    return;
                } catch (b10 e10) {
                    e.J("Cannot show interstitial.");
                    throw new um(e10.getCause());
                } catch (Throwable th) {
                    throw new b10(th);
                }
            case 1:
                mt mtVar2 = (mt) this.f14683b;
                try {
                    ((ue) mtVar2.f15550b).b(z10);
                    ue ueVar2 = (ue) mtVar2.f15550b;
                    ueVar2.getClass();
                    ueVar2.f8245a.showVideo();
                    return;
                } catch (b10 e11) {
                    e.D("Cannot show rewarded video.", e11);
                    throw new um(e11.getCause());
                } catch (Throwable th2) {
                    throw new b10(th2);
                }
            default:
                d7 d7Var = (d7) this.f14683b;
                try {
                    i iVar = l.B.f13185b;
                    i.b(context, (AdOverlayInfoParcel) d7Var.get(), true);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }

    public fu(mt mtVar, int i10) {
        this.f14682a = i10;
        if (i10 != 1) {
            this.f14683b = mtVar;
        } else {
            this.f14683b = mtVar;
        }
    }
}
