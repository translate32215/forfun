package t2;

import com.adcolony.sdk.e;
import com.adcolony.sdk.f;
import com.adcolony.sdk.g;
import com.adcolony.sdk.i;
import com.adcolony.sdk.j0;
import com.adcolony.sdk.o;
import com.adcolony.sdk.r0;
import org.json.JSONObject;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f25421a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f25422b;

    public class a implements Runnable {
        public a(e eVar) {
        }

        public void run() {
            d.this.f25421a.getClass();
        }
    }

    public d(i iVar, String str) {
        this.f25421a = iVar;
        this.f25422b = str;
    }

    public void run() {
        o d10 = f.d();
        if (d10.A || d10.B) {
            p.f.a(0, 0, "The AdColony API is not available while AdColony is disabled.", false);
            com.adcolony.sdk.a.c(this.f25421a, this.f25422b);
        } else if (com.adcolony.sdk.a.d() || !f.e()) {
            e eVar = d10.f4675s.get(this.f25422b);
            if (eVar == null) {
                eVar = new e(this.f25422b);
            }
            int i10 = eVar.f4473a;
            if (i10 == 2 || i10 == 1) {
                j0.h(new a(eVar));
                return;
            }
            i g10 = d10.g();
            String str = this.f25422b;
            i iVar = this.f25421a;
            g10.getClass();
            String d11 = j0.d();
            o d12 = f.d();
            JSONObject jSONObject = new JSONObject();
            r0.e(jSONObject, "zone_id", str);
            r0.k(jSONObject, "fullscreen", true);
            r0.j(jSONObject, "width", d12.i().h());
            r0.j(jSONObject, "height", d12.i().g());
            r0.j(jSONObject, "type", 0);
            r0.e(jSONObject, "id", d11);
            g10.f4526b.put(d11, new com.adcolony.sdk.d(d11, iVar, str));
            new g("AdSession.on_request", 1, jSONObject).b();
        } else {
            com.adcolony.sdk.a.c(this.f25421a, this.f25422b);
        }
    }
}
