package e8;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.j1;
import d7.l;
import java.util.Map;
import l0.e;
import t1.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class vn implements f3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17152a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17153b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f17154c;

    public vn(wn wnVar, j1 j1Var) {
        this.f17153b = wnVar;
        this.f17154c = j1Var;
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [e8.pb, e8.lc] */
    public final void f(Object obj, Map map) {
        switch (this.f17152a) {
            case 0:
                wn wnVar = (wn) this.f17153b;
                j1 j1Var = (j1) this.f17154c;
                try {
                    wnVar.f17379f = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    e.I("Failed to call parse unconfirmedClickTimestamp.");
                }
                wnVar.f17378e = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (j1Var == null) {
                    e.E("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    j1Var.P2(str);
                    return;
                } catch (RemoteException e10) {
                    e.F("#007 Could not call remote method.", e10);
                    return;
                }
            default:
                e30 e30 = (e30) this.f17153b;
                dt dtVar = (dt) this.f17154c;
                ? r92 = (pb) obj;
                String str2 = (String) map.get("u");
                if (str2 == null) {
                    e.K("URL missing from click GMSG.");
                    return;
                }
                String a10 = q2.a(r92, str2);
                if (!r92.k().f7949d0) {
                    e30.a(a10);
                    return;
                }
                long b10 = l.B.f13193j.b();
                String str3 = r92.p().f8030b;
                p pVar = l.B.f13186c;
                dtVar.i(new c(dtVar, new ft(b10, str3, a10, p.t(((lc) r92).getContext()) ? 2 : 1)));
                return;
        }
    }

    public vn(e30 e30, dt dtVar) {
        this.f17153b = e30;
        this.f17154c = dtVar;
    }
}
