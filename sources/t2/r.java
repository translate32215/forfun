package t2;

import com.adcolony.sdk.f;
import com.adcolony.sdk.g;
import com.adcolony.sdk.h;
import com.adcolony.sdk.j0;
import com.adcolony.sdk.o;
import com.adcolony.sdk.q0;
import com.adcolony.sdk.r0;
import mb.d;
import org.json.JSONObject;

public class r implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f25558a;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f25559a;

        public a(g gVar) {
            this.f25559a = gVar;
        }

        public void run() {
            h hVar = r.this.f25558a;
            g gVar = this.f25559a;
            hVar.getClass();
            JSONObject jSONObject = gVar.f4485b;
            int optInt = jSONObject.optInt("id");
            boolean optBoolean = jSONObject.optBoolean("is_module");
            o d10 = f.d();
            q0 q0Var = null;
            if (optBoolean) {
                q0 q0Var2 = d10.f4676t.get(Integer.valueOf(jSONObject.optInt("module_id")));
                if (q0Var2 == null) {
                    p.f.a(0, 0, "Module WebView created with invalid id", false);
                    hVar.a(q0Var, d.OTHER);
                }
                q0Var2.f(gVar, optInt, -1, hVar);
                q0Var2.u();
                q0Var = q0Var2;
            } else {
                try {
                    q0Var = new q0(hVar.G, gVar, optInt, d10.m().f(), hVar);
                } catch (RuntimeException e10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e10.toString() + ": during WebView initialization.");
                    sb2.append(" Disabling AdColony.");
                    f.d().l().e(0, 0, sb2.toString(), false);
                    com.adcolony.sdk.a.e();
                }
            }
            hVar.f4505c.put(Integer.valueOf(optInt), q0Var);
            hVar.f4509g.put(Integer.valueOf(optInt), q0Var);
            JSONObject jSONObject2 = new JSONObject();
            r0.j(jSONObject2, "module_id", q0Var.C);
            r0.j(jSONObject2, "mraid_module_id", q0Var.D);
            gVar.a(jSONObject2).b();
            hVar.a(q0Var, d.OTHER);
        }
    }

    public r(h hVar) {
        this.f25558a = hVar;
    }

    public void a(g gVar) {
        if (this.f25558a.b(gVar)) {
            j0.h(new a(gVar));
        }
    }
}
