package e8;

import android.content.res.Resources;
import androidx.appcompat.widget.o;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.we;
import com.startapp.startappsdk.R;
import d7.l;
import e.g;
import java.util.concurrent.Callable;
import l0.d;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class mo implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final t00 f15530a;

    /* renamed from: b  reason: collision with root package name */
    public final qe f15531b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f15532c;

    public mo(ko koVar, t00 t00, qe qeVar, JSONObject jSONObject) {
        this.f15530a = t00;
        this.f15531b = qeVar;
        this.f15532c = jSONObject;
    }

    public final Object call() {
        we weVar = we.INTERNAL_ERROR;
        t00 t00 = this.f15530a;
        qe qeVar = this.f15531b;
        JSONObject jSONObject = this.f15532c;
        jn jnVar = new jn();
        int optInt = jSONObject.optInt("template_id", -1);
        synchronized (jnVar) {
            jnVar.f15156a = optInt;
        }
        String optString = jSONObject.optString("custom_template_id");
        synchronized (jnVar) {
            jnVar.f15172q = optString;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        String optString2 = optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null;
        synchronized (jnVar) {
            jnVar.f15176u = optString2;
        }
        w00 w00 = (w00) t00.f16700a.f8042b;
        if (w00.f17193g.contains(Integer.toString(jnVar.k()))) {
            if (jnVar.k() == 3) {
                if (jnVar.c() == null) {
                    throw new ru(weVar, "No custom template id for custom template ad response.");
                } else if (!w00.f17194h.contains(jnVar.c())) {
                    throw new ru(weVar, "Unexpected custom template id in the response.");
                }
            }
            double optDouble = jSONObject.optDouble("rating", -1.0d);
            synchronized (jnVar) {
                jnVar.f15169n = optDouble;
            }
            String optString3 = jSONObject.optString("headline", (String) null);
            if (qeVar.H) {
                l lVar = l.B;
                p pVar = lVar.f13186c;
                Resources a10 = lVar.f13190g.a();
                String string = a10 != null ? a10.getString(R.string.f28881s7) : "Test Ad";
                optString3 = g.a(o.a(optString3, o.a(string, 3)), string, " : ", optString3);
            }
            jnVar.u("headline", optString3);
            jnVar.u("body", jSONObject.optString("body", (String) null));
            jnVar.u("call_to_action", jSONObject.optString("call_to_action", (String) null));
            jnVar.u("store", jSONObject.optString("store", (String) null));
            jnVar.u("price", jSONObject.optString("price", (String) null));
            jnVar.u("advertiser", jSONObject.optString("advertiser", (String) null));
            return jnVar;
        }
        throw new ru(weVar, d.a(32, "Invalid template ID: ", jnVar.k()));
    }
}
