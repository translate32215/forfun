package e8;

import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.u7;
import com.google.android.gms.internal.ads.ve;
import com.google.android.gms.internal.ads.yh;
import d7.h;
import d7.l;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class h5 implements oh {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14847a = 3;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14848b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14849c;

    public h5(i5 i5Var, Object obj) {
        this.f14848b = i5Var;
        this.f14849c = obj;
    }

    public final p50 a(Object obj) {
        switch (this.f14847a) {
            case 0:
                i5 i5Var = (i5) this.f14848b;
                Object obj2 = this.f14849c;
                i5Var.getClass();
                d7 d7Var = new d7();
                p pVar = l.B.f13186c;
                String K = p.K();
                q2.f16076p.a(K, new j5(i5Var, d7Var));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", K);
                jSONObject.put("args", i5Var.f14987c.c(obj2));
                ((u4) obj).m((String) i5Var.f14988d, jSONObject);
                return d7Var;
            case 1:
                no noVar = (no) this.f14848b;
                noVar.getClass();
                u7 u7Var = l.B.f13187d;
                t7 a10 = u7.a(noVar.f15698a, wc.a(), "native-omid", false, false, noVar.f15700c, (i0) null, noVar.f15701d, (h) null, noVar.f15702e, noVar.f15703f, (qe) null, (re) null);
                m9 m9Var = new m9(a10);
                ((s7) a10.H()).f8095g = new bc(m9Var, 1);
                a10.loadData((String) this.f14849c, "text/html", "UTF-8");
                return m9Var;
            case 2:
                uo uoVar = (uo) this.f14848b;
                JSONObject jSONObject2 = (JSONObject) this.f14849c;
                t7 t7Var = (t7) obj;
                uoVar.getClass();
                m9 m9Var2 = new m9(t7Var);
                if (uoVar.f16977a.f17189c != null) {
                    t7Var.c0(new wc(5, 0, 0, 0));
                } else {
                    t7Var.c0(new wc(4, 0, 0, 0));
                }
                ((s7) t7Var.H()).f8095g = new wo(uoVar, t7Var, m9Var2, 1);
                t7Var.m("google.afma.nativeAds.renderVideo", jSONObject2);
                return m9Var2;
            case 3:
                br brVar = (br) obj;
                return ((vr) ((ab0) this.f14848b).get()).a((l5) this.f14849c);
            default:
                JSONObject jSONObject3 = (JSONObject) obj;
                ve<cp> veVar = ((hu) this.f14848b).f14946d;
                p50 h10 = yh.h((cp) this.f14849c);
                synchronized (veVar) {
                    veVar.f8360a.addFirst(h10);
                }
                if (jSONObject3.optBoolean("success")) {
                    return yh.h(jSONObject3.getJSONObject("json").getJSONArray("ads"));
                }
                throw new v4("process json failed");
        }
    }

    public h5(no noVar, String str) {
        this.f14848b = noVar;
        this.f14849c = str;
    }

    public h5(uo uoVar, JSONObject jSONObject) {
        this.f14848b = uoVar;
        this.f14849c = jSONObject;
    }

    public h5(hu huVar, cp cpVar) {
        this.f14848b = huVar;
        this.f14849c = cpVar;
    }

    public h5(ab0 ab0, l5 l5Var) {
        this.f14848b = ab0;
        this.f14849c = l5Var;
    }
}
