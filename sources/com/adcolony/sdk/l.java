package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.f;
import t2.f0;
import t2.h0;

@SuppressLint({"UseSparseArrays"})
public class l {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<h0> f4599a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public HashMap<Integer, h0> f4600b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public int f4601c = 2;

    /* renamed from: d  reason: collision with root package name */
    public HashMap<String, ArrayList<f0>> f4602d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public JSONArray f4603e = new JSONArray();

    /* renamed from: f  reason: collision with root package name */
    public int f4604f = 1;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f4605a;

        public a(Context context) {
            this.f4605a = context;
        }

        public void run() {
            JSONObject jSONObject = (JSONObject) f.d().o().f23743d;
            JSONObject jSONObject2 = new JSONObject();
            r0.e(jSONObject, "os_name", "android");
            r0.e(jSONObject2, "filepath", f.d().q().f4418a + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
            r0.g(jSONObject2, "info", jSONObject);
            r0.j(jSONObject2, "m_origin", 0);
            l lVar = l.this;
            int i10 = lVar.f4604f;
            lVar.f4604f = i10 + 1;
            r0.j(jSONObject2, "m_id", i10);
            r0.e(jSONObject2, "m_type", "Controller.create");
            try {
                new q0(this.f4605a, 1, false).i(true, new g(jSONObject2));
            } catch (RuntimeException e10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e10.toString() + ": during WebView initialization.");
                sb2.append(" Disabling AdColony.");
                f.d().l().e(0, 0, sb2.toString(), false);
                a.e();
            }
        }
    }

    public h0 a(int i10) {
        synchronized (this.f4599a) {
            h0 h0Var = this.f4600b.get(Integer.valueOf(i10));
            if (h0Var == null) {
                return null;
            }
            this.f4599a.remove(h0Var);
            this.f4600b.remove(Integer.valueOf(i10));
            h0Var.b();
            return h0Var;
        }
    }

    public void b() {
        Context context;
        o d10 = f.d();
        if (!d10.A && !d10.B && (context = f.f4478a) != null) {
            j0.h(new a(context));
        }
    }

    public void c(String str, JSONObject jSONObject) {
        synchronized (this.f4602d) {
            ArrayList arrayList = this.f4602d.get(str);
            if (arrayList != null) {
                g gVar = new g(jSONObject);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        ((f0) it.next()).a(gVar);
                    } catch (RuntimeException e10) {
                        f.d().l().e(0, 0, e10.toString(), true);
                        e10.printStackTrace();
                    }
                }
            }
        }
    }

    public void d(String str, f0 f0Var) {
        ArrayList arrayList = this.f4602d.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f4602d.put(str, arrayList);
        }
        arrayList.add(f0Var);
    }

    public void e(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("m_id")) {
                int i10 = this.f4604f;
                this.f4604f = i10 + 1;
                jSONObject.put("m_id", i10);
            }
            if (!jSONObject.has("m_origin")) {
                jSONObject.put("m_origin", 0);
            }
            int i11 = jSONObject.getInt("m_target");
            if (i11 == 0) {
                synchronized (this) {
                    this.f4603e.put(jSONObject);
                }
                return;
            }
            h0 h0Var = this.f4600b.get(Integer.valueOf(i11));
            if (h0Var != null) {
                h0Var.a(jSONObject);
            }
        } catch (JSONException e10) {
            StringBuilder a10 = android.support.v4.media.a.a("JSON error in ADCMessageDispatcher's sendMessage(): ");
            a10.append(e10.toString());
            f.a(0, 0, a10.toString(), true);
        }
    }

    public int f() {
        int i10 = this.f4601c;
        this.f4601c = i10 + 1;
        return i10;
    }
}
