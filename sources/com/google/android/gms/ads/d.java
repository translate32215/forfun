package com.google.android.gms.ads;

import e8.t;
import e8.ti0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class d extends a {

    /* renamed from: e  reason: collision with root package name */
    public final e f5584e;

    public d(int i10, String str, String str2, a aVar, e eVar) {
        super(i10, str, str2, aVar);
        this.f5584e = eVar;
    }

    public final JSONObject b() throws JSONException {
        JSONObject b10 = super.b();
        e eVar = ((Boolean) ti0.f16763j.f16769f.a(t.B4)).booleanValue() ? this.f5584e : null;
        if (eVar == null) {
            b10.put("Response Info", "null");
        } else {
            b10.put("Response Info", eVar.a());
        }
        return b10;
    }

    public final String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
