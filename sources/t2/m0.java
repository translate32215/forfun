package t2;

import com.adcolony.sdk.f;
import com.adcolony.sdk.g;
import com.adcolony.sdk.j0;
import org.json.JSONObject;

public class m0 implements f0 {

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25527a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f25528b;

        public a(m0 m0Var, String str, String str2) {
            this.f25527a = str;
            this.f25528b = str2;
        }

        public void run() {
            try {
                h hVar = f.d().f4671o.get(this.f25527a);
                if (hVar != null) {
                    hVar.a(new g(this.f25527a, this.f25528b, 0));
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    public m0() {
        f.c("CustomMessage.controller_send", this);
    }

    public void a(g gVar) {
        JSONObject jSONObject = gVar.f4485b;
        j0.h(new a(this, jSONObject.optString("type"), jSONObject.optString("message")));
    }
}
