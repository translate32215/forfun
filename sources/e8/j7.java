package e8;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.n2;
import com.google.android.gms.internal.ads.yh;
import d7.l;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class j7 extends l7 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f15094a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Context f15095b;

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f15096c;

    /* renamed from: d  reason: collision with root package name */
    public final n2 f15097d;

    public j7(Context context, n2 n2Var) {
        this.f15095b = context.getApplicationContext();
        this.f15097d = n2Var;
    }

    public static JSONObject b(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", f9.i().f14544a);
            jSONObject.put("mf", w0.f17185a.b());
            jSONObject.put("cl", "341976203");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.b(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final p50<Void> a() {
        synchronized (this.f15094a) {
            if (this.f15096c == null) {
                this.f15096c = this.f15095b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (l.B.f13193j.b() - this.f15096c.getLong("js_last_update", 0) < ((Long) w0.f17186b.b()).longValue()) {
            return yh.h(null);
        }
        return yh.i(this.f15097d.b(b(this.f15095b)), new m7(this), h9.f14886f);
    }
}
