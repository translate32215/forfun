package t2;

import com.adcolony.sdk.a;
import com.adcolony.sdk.f;
import com.adcolony.sdk.g;
import com.adcolony.sdk.i;
import com.adcolony.sdk.j0;
import com.adcolony.sdk.o;
import com.adcolony.sdk.r0;
import org.json.JSONObject;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f25416a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f25417b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f25418c;

    public c(f fVar, String str, e eVar) {
        this.f25416a = fVar;
        this.f25417b = str;
        this.f25418c = eVar;
    }

    public void run() {
        o d10 = f.d();
        if (d10.A || d10.B) {
            p.f.a(0, 0, "The AdColony API is not available while AdColony is disabled.", false);
            a.b(this.f25416a, this.f25417b);
        }
        if (!a.d() && f.e()) {
            a.b(this.f25416a, this.f25417b);
        }
        i g10 = d10.g();
        String str = this.f25417b;
        f fVar = this.f25416a;
        e eVar = this.f25418c;
        g10.getClass();
        String d11 = j0.d();
        JSONObject jSONObject = new JSONObject();
        float f10 = f.d().i().f();
        r0.e(jSONObject, "zone_id", str);
        r0.j(jSONObject, "type", 1);
        eVar.getClass();
        r0.j(jSONObject, "width_pixels", (int) (((float) 320) * f10));
        r0.j(jSONObject, "height_pixels", (int) (((float) 50) * f10));
        r0.j(jSONObject, "width", 320);
        r0.j(jSONObject, "height", 50);
        r0.e(jSONObject, "id", d11);
        fVar.f25471a = str;
        fVar.f25472b = eVar;
        g10.f4527c.put(d11, fVar);
        new g("AdSession.on_request", 1, jSONObject).b();
    }
}
