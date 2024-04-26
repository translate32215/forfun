package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t.f;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public final int f4610a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f4611b = new ArrayList();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f4612a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4613b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4614c;

        /* renamed from: d  reason: collision with root package name */
        public final String[] f4615d;

        /* renamed from: e  reason: collision with root package name */
        public final String[] f4616e;

        /* renamed from: f  reason: collision with root package name */
        public final List<b> f4617f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        public final List<c> f4618g = new ArrayList();

        /* renamed from: h  reason: collision with root package name */
        public final d f4619h;

        /* renamed from: i  reason: collision with root package name */
        public final Map<String, String> f4620i = new HashMap();

        public a(JSONObject jSONObject) throws JSONException {
            this.f4612a = jSONObject.getString("stream");
            this.f4613b = jSONObject.getString("table_name");
            this.f4614c = jSONObject.optInt("max_rows", 10000);
            JSONArray optJSONArray = jSONObject.optJSONArray("event_types");
            this.f4615d = optJSONArray != null ? r0.h(optJSONArray) : new String[0];
            JSONArray optJSONArray2 = jSONObject.optJSONArray("request_types");
            this.f4616e = optJSONArray2 != null ? r0.h(optJSONArray2) : new String[0];
            for (JSONObject bVar : r0.l(jSONObject.getJSONArray("columns"))) {
                this.f4617f.add(new b(bVar));
            }
            for (JSONObject cVar : r0.l(jSONObject.getJSONArray("indexes"))) {
                this.f4618g.add(new c(cVar, this.f4613b));
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("ttl");
            this.f4619h = optJSONObject != null ? new d(optJSONObject) : null;
            JSONObject jSONObject2 = jSONObject.getJSONObject("queries");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.f4620i.put(next, jSONObject2.getString(next));
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f4621a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4622b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f4623c;

        public b(JSONObject jSONObject) throws JSONException {
            this.f4621a = jSONObject.getString("name");
            this.f4622b = jSONObject.getString("type");
            this.f4623c = !jSONObject.isNull("default") ? jSONObject.get("default") : null;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f4624a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f4625b;

        public c(JSONObject jSONObject, String str) throws JSONException {
            StringBuilder a10 = f.a(str, "_");
            a10.append(jSONObject.getString("name"));
            this.f4624a = a10.toString();
            this.f4625b = r0.h(jSONObject.getJSONArray("columns"));
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f4626a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4627b;

        public d(JSONObject jSONObject) throws JSONException {
            this.f4626a = jSONObject.getLong("seconds");
            this.f4627b = jSONObject.getString("column");
        }
    }

    public n(JSONObject jSONObject) throws JSONException {
        this.f4610a = jSONObject.getInt("version");
        for (JSONObject aVar : r0.l(jSONObject.getJSONArray("streams"))) {
            this.f4611b.add(new a(aVar));
        }
    }
}
