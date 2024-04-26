package sb;

import android.os.Build;
import android.webkit.WebView;
import b2.t;
import cb.d;
import com.google.android.material.datepicker.c;
import java.util.Collections;
import java.util.List;
import mb.h;
import ob.e;
import org.json.JSONArray;
import org.json.JSONObject;
import rb.b;
import t2.g;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public b f25190a = new b((WebView) null);

    /* renamed from: b  reason: collision with root package name */
    public d f25191b;

    /* renamed from: c  reason: collision with root package name */
    public t f25192c;

    /* renamed from: d  reason: collision with root package name */
    public C0243a f25193d = C0243a.AD_STATE_IDLE;

    /* renamed from: e  reason: collision with root package name */
    public long f25194e = System.nanoTime();

    /* renamed from: sb.a$a  reason: collision with other inner class name */
    public enum C0243a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public void a() {
    }

    public void b(float f10) {
        e.f23667a.b(f(), "setDeviceVolume", Float.valueOf(f10));
    }

    public void c(h hVar, c cVar) {
        d(hVar, cVar, (JSONObject) null);
    }

    public void d(h hVar, c cVar, JSONObject jSONObject) {
        String str = hVar.f21786h;
        JSONObject jSONObject2 = new JSONObject();
        qb.a.d(jSONObject2, "environment", "app");
        qb.a.d(jSONObject2, "adSessionType", (mb.b) cVar.f9155h);
        JSONObject jSONObject3 = new JSONObject();
        qb.a.d(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        qb.a.d(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        qb.a.d(jSONObject3, "os", "Android");
        qb.a.d(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        qb.a.d(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        qb.a.d(jSONObject4, "partnerName", ((g) cVar.f9148a).f25478a);
        qb.a.d(jSONObject4, "partnerVersion", ((g) cVar.f9148a).f25479b);
        qb.a.d(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        qb.a.d(jSONObject5, "libraryVersion", "1.3.11-Adcolony");
        qb.a.d(jSONObject5, "appId", ob.c.f23663b.f23664a.getApplicationContext().getPackageName());
        qb.a.d(jSONObject2, "app", jSONObject5);
        String str2 = (String) cVar.f9154g;
        if (str2 != null) {
            qb.a.d(jSONObject2, "contentUrl", str2);
        }
        String str3 = (String) cVar.f9153f;
        if (str3 != null) {
            qb.a.d(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject6 = new JSONObject();
        for (mb.g gVar : Collections.unmodifiableList((List) cVar.f9150c)) {
            qb.a.d(jSONObject6, gVar.f21775a, gVar.f21777c);
        }
        e.f23667a.b(f(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
    }

    public void e() {
        this.f25190a.clear();
    }

    public WebView f() {
        return (WebView) this.f25190a.get();
    }
}
