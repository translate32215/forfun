package e8;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.x4;
import com.google.android.gms.internal.ads.zh;
import d7.l;
import java.util.ArrayList;
import l0.e;
import r7.m;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qh implements zh<l5> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16171a = 3;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16172b;

    public qh(x4 x4Var) {
        this.f16172b = x4Var;
    }

    public final void a(Object obj) {
        switch (this.f16171a) {
            case 0:
                l5 l5Var = (l5) obj;
                ((mh) this.f16172b).f15517f.v0(true);
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                ((bi) this.f16172b).f14014a.O();
                return;
            case 2:
                String str = (String) obj;
                synchronized (this) {
                    Object obj2 = this.f16172b;
                    ((yq) obj2).f17650b = true;
                    yq.a((yq) obj2, "com.google.android.gms.ads.MobileAds", true, "", (int) (l.B.f13193j.a() - ((yq) this.f16172b).f17651c));
                    ((yq) this.f16172b).f17656h.execute(new m(this, str));
                }
                return;
            default:
                try {
                    ((x4) this.f16172b).V5((ArrayList) obj);
                    return;
                } catch (RemoteException e10) {
                    e.C("", e10);
                    return;
                }
        }
    }

    public final void n(Throwable th) {
        switch (this.f16171a) {
            case 0:
                ((mh) this.f16172b).f15517f.v0(false);
                return;
            case 1:
                return;
            case 2:
                synchronized (this) {
                    Object obj = this.f16172b;
                    ((yq) obj).f17650b = true;
                    yq.a((yq) obj, "com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (l.B.f13193j.a() - ((yq) this.f16172b).f17651c));
                    ((yq) this.f16172b).f17652d.c(new Exception());
                }
                return;
            default:
                try {
                    x4 x4Var = (x4) this.f16172b;
                    String valueOf = String.valueOf(th.getMessage());
                    x4Var.s0(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
                    return;
                } catch (RemoteException e10) {
                    e.C("", e10);
                    return;
                }
        }
    }

    public qh(mh mhVar) {
        this.f16172b = mhVar;
    }

    public qh(bi biVar) {
        this.f16172b = biVar;
    }

    public qh(yq yqVar) {
        this.f16172b = yqVar;
    }
}
