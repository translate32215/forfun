package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.gz;
import e8.oi0;
import e8.t;
import e8.ti0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final gz f5585a;

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f5586b = new ArrayList();

    public e(gz gzVar) {
        this.f5585a = gzVar;
        if (((Boolean) ti0.f16763j.f16769f.a(t.B4)).booleanValue()) {
            try {
                List<oi0> d12 = gzVar.d1();
                if (d12 != null) {
                    Iterator<oi0> it = d12.iterator();
                    while (it.hasNext()) {
                        oi0 next = it.next();
                        this.f5586b.add(next != null ? new c(next) : null);
                    }
                }
            } catch (RemoteException e10) {
                l0.e.C("Could not forward getAdapterResponseInfo to ResponseInfo.", e10);
            }
        }
    }

    public final JSONObject a() throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        String str2 = null;
        try {
            str = this.f5585a.S2();
        } catch (RemoteException e10) {
            l0.e.C("Could not forward getResponseId to ResponseInfo.", e10);
            str = null;
        }
        if (str == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", str);
        }
        try {
            str2 = this.f5585a.s();
        } catch (RemoteException e11) {
            l0.e.C("Could not forward getMediationAdapterClassName to ResponseInfo.", e11);
        }
        if (str2 == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", str2);
        }
        JSONArray jSONArray = new JSONArray();
        for (c a10 : this.f5586b) {
            jSONArray.put(a10.a());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
