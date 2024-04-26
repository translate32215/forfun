package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.g;
import t2.e0;
import t2.f0;
import t2.i;

public class f {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    public static Context f4478a;

    /* renamed from: b  reason: collision with root package name */
    public static o f4479b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f4480c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f4481d;

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f4482a;

        public a(Context context) {
            this.f4482a = context;
        }

        public void run() {
            f.f4479b.e(this.f4482a, (g) null);
        }
    }

    public static f0 a(String str, f0 f0Var) {
        d().m().d(str, f0Var);
        return f0Var;
    }

    public static void b(Context context, g gVar, boolean z10) {
        f4478a = context;
        f4481d = true;
        if (f4479b == null) {
            f4479b = new o();
            gVar.e(context);
            f4479b.c(gVar, z10);
        } else {
            gVar.e(context);
            o oVar = f4479b;
            synchronized (oVar.f4660d.f4526b) {
                for (Map.Entry<String, d> value : oVar.f4660d.f4526b.entrySet()) {
                    d dVar = (d) value.getValue();
                    i iVar = dVar.f4462a;
                    dVar.f4470i = true;
                }
                oVar.f4660d.f4526b.clear();
            }
            oVar.C = false;
            a.a(f4478a, gVar);
            oVar.d(1);
            oVar.f4675s.clear();
            oVar.f4672p = gVar;
            oVar.f4657a.b();
            oVar.f(true, true);
        }
        try {
            j0.f4565a.execute(new a(context));
        } catch (RejectedExecutionException e10) {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder a10 = android.support.v4.media.a.a("ADC.configure queryAdvertisingId failed with error: ");
            a10.append(e10.toString());
            sb2.append(a10.toString());
            p.f.a(0, 0, sb2.toString(), true);
        }
        p.f.a(0, 2, "Configuring AdColony", false);
        o oVar2 = f4479b;
        oVar2.A = false;
        oVar2.p().f4818h = true;
        f4479b.p().f4819i = true;
        f4479b.p().f4826x = false;
        o oVar3 = f4479b;
        oVar3.D = true;
        oVar3.p().c(false);
    }

    public static void c(String str, f0 f0Var) {
        d().m().d(str, f0Var);
    }

    public static o d() {
        if (!f()) {
            Context context = f4478a;
            if (context == null) {
                return new o();
            }
            f4479b = new o();
            JSONObject m10 = r0.m(context.getFilesDir().getAbsolutePath() + "/adc3/AppInfo");
            JSONArray optJSONArray = m10.optJSONArray("zoneIds");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            g a10 = new g(3).a(m10.optString("appId"));
            a10.b(r0.h(optJSONArray));
            f4479b.c(a10, false);
        }
        return f4479b;
    }

    public static boolean e() {
        return f4478a != null;
    }

    public static boolean f() {
        return f4479b != null;
    }

    public static void g() {
        l m10 = d().m();
        synchronized (m10) {
            synchronized (m10.f4599a) {
                for (int size = m10.f4599a.size() - 1; size >= 0; size--) {
                    m10.f4599a.get(size).a();
                }
            }
            JSONArray jSONArray = null;
            if (m10.f4603e.length() > 0) {
                jSONArray = m10.f4603e;
                m10.f4603e = new JSONArray();
            }
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        String string = jSONObject.getString("m_type");
                        if (jSONObject.getInt("m_origin") >= 2) {
                            j0.h(new e0(m10, string, jSONObject));
                        } else {
                            m10.c(string, jSONObject);
                        }
                    } catch (JSONException e10) {
                        d().l().e(0, 0, "JSON error from message dispatcher's updateModules(): " + e10.toString(), true);
                    }
                }
            }
        }
    }
}
