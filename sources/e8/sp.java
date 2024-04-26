package e8;

import com.google.android.gms.internal.ads.p8;
import com.google.android.gms.internal.ads.t7;
import d7.l;
import java.util.Map;
import l0.e;
import r7.m;
import t1.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class sp implements f3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16505a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16506b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f16507c;

    public sp(op opVar, t7 t7Var) {
        this.f16506b = opVar;
        this.f16507c = t7Var;
    }

    public final void f(Object obj, Map map) {
        switch (this.f16505a) {
            case 0:
                t7 t7Var = (t7) this.f16507c;
                t7 t7Var2 = (t7) obj;
                p8 p8Var = ((op) this.f16506b).f15820h;
                synchronized (p8Var) {
                    p8Var.f7829c.add(t7Var);
                    af afVar = p8Var.f7827a;
                    t7Var.r("/updateActiveView", afVar.f13717e);
                    t7Var.r("/untrackActiveViewUnit", afVar.f13718f);
                }
                return;
            default:
                e30 e30 = (e30) this.f16506b;
                dt dtVar = (dt) this.f16507c;
                pb pbVar = (pb) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    e.K("URL missing from httpTrack GMSG.");
                    return;
                } else if (!pbVar.k().f7949d0) {
                    e30.f14359a.execute(new m(e30, str));
                    return;
                } else {
                    dtVar.i(new c(dtVar, new ft(l.B.f13193j.b(), ((gc) pbVar).p().f8030b, str, 2)));
                    return;
                }
        }
    }

    public sp(e30 e30, dt dtVar) {
        this.f16506b = e30;
        this.f16507c = dtVar;
    }
}
