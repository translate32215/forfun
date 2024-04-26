package com.google.android.gms.ads;

import android.os.IBinder;
import e8.zh0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f5573a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5574b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5575c;

    /* renamed from: d  reason: collision with root package name */
    public final a f5576d;

    public a(int i10, String str, String str2) {
        this.f5573a = i10;
        this.f5574b = str;
        this.f5575c = str2;
        this.f5576d = null;
    }

    public final zh0 a() {
        zh0 zh0;
        a aVar = this.f5576d;
        if (aVar == null) {
            zh0 = null;
        } else {
            zh0 = new zh0(aVar.f5573a, aVar.f5574b, aVar.f5575c, (zh0) null, (IBinder) null);
        }
        return new zh0(this.f5573a, this.f5574b, this.f5575c, zh0, (IBinder) null);
    }

    public JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f5573a);
        jSONObject.put("Message", this.f5574b);
        jSONObject.put("Domain", this.f5575c);
        a aVar = this.f5576d;
        if (aVar == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", aVar.b());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public a(int i10, String str, String str2, a aVar) {
        this.f5573a = i10;
        this.f5574b = str;
        this.f5575c = str2;
        this.f5576d = aVar;
    }
}
