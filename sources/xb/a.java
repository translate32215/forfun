package xb;

import android.os.Build;
import android.webkit.WebView;
import com.startapp.de;
import com.startapp.fe;
import com.startapp.g6;
import com.startapp.k;
import com.startapp.me;
import com.startapp.o;
import com.startapp.p;
import com.startapp.rd;
import com.startapp.re;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Sta */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public fe f27916a = new fe((WebView) null);

    /* renamed from: b  reason: collision with root package name */
    public k f27917b;

    /* renamed from: c  reason: collision with root package name */
    public g6 f27918c;

    /* renamed from: d  reason: collision with root package name */
    public C0280a f27919d;

    /* renamed from: e  reason: collision with root package name */
    public long f27920e;

    /* renamed from: xb.a$a  reason: collision with other inner class name */
    /* compiled from: Sta */
    public enum C0280a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public a() {
        a();
    }

    public void a() {
        this.f27920e = System.nanoTime();
        this.f27919d = C0280a.AD_STATE_IDLE;
    }

    public void a(WebView webView) {
        this.f27916a = new fe(webView);
    }

    public void a(rd rdVar, p pVar) {
        a(rdVar, pVar, (JSONObject) null);
    }

    public void b() {
        this.f27916a.clear();
    }

    public void b(String str, long j10) {
        if (j10 >= this.f27920e) {
            this.f27919d = C0280a.AD_STATE_VISIBLE;
            re.f11684a.a(c(), "setNativeViewHierarchy", str);
        }
    }

    public WebView c() {
        return (WebView) this.f27916a.get();
    }

    public void d() {
    }

    public void a(o oVar) {
        re reVar = re.f11684a;
        WebView c10 = c();
        oVar.getClass();
        JSONObject jSONObject = new JSONObject();
        de.a(jSONObject, "impressionOwner", oVar.f11481a);
        de.a(jSONObject, "mediaEventsOwner", oVar.f11482b);
        de.a(jSONObject, "creativeType", oVar.f11484d);
        de.a(jSONObject, "impressionType", oVar.f11485e);
        de.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(oVar.f11483c));
        reVar.a(c10, "init", jSONObject);
    }

    public void a(rd rdVar, p pVar, JSONObject jSONObject) {
        String str = rdVar.f11681h;
        JSONObject jSONObject2 = new JSONObject();
        de.a(jSONObject2, "environment", "app");
        de.a(jSONObject2, "adSessionType", pVar.f11551h);
        JSONObject jSONObject3 = new JSONObject();
        de.a(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        de.a(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        de.a(jSONObject3, "os", "Android");
        de.a(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        de.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        de.a(jSONObject4, "partnerName", pVar.f11544a.f12878a);
        de.a(jSONObject4, "partnerVersion", pVar.f11544a.f12879b);
        de.a(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        de.a(jSONObject5, "libraryVersion", "1.3.31-Startio");
        de.a(jSONObject5, "appId", me.f10890b.f10891a.getApplicationContext().getPackageName());
        de.a(jSONObject2, "app", jSONObject5);
        String str2 = pVar.f11550g;
        if (str2 != null) {
            de.a(jSONObject2, "contentUrl", str2);
        }
        String str3 = pVar.f11549f;
        if (str3 != null) {
            de.a(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject6 = new JSONObject();
        for (T t10 : Collections.unmodifiableList(pVar.f11546c)) {
            de.a(jSONObject6, t10.f10507a, t10.f10509c);
        }
        re.f11684a.a(c(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
    }

    public void a(String str, long j10) {
        C0280a aVar;
        if (j10 >= this.f27920e && this.f27919d != (aVar = C0280a.AD_STATE_NOTVISIBLE)) {
            this.f27919d = aVar;
            re.f11684a.a(c(), "setNativeViewHierarchy", str);
        }
    }
}
