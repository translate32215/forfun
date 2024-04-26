package com.startapp;

import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* compiled from: Sta */
public class y5 {

    /* renamed from: a  reason: collision with root package name */
    public g4 f12875a = new g4();

    /* renamed from: b  reason: collision with root package name */
    public List<w5> f12876b;

    /* renamed from: c  reason: collision with root package name */
    public String f12877c = "";

    public void a(AdDetails adDetails) {
        w5 w5Var = new w5(adDetails);
        this.f12876b.add(w5Var);
        this.f12875a.a(this.f12876b.size() - 1, w5Var.f12743a, w5Var.f12751i);
    }

    public void a() {
        for (j9 next : this.f12875a.f10427a.values()) {
            if (next != null) {
                next.a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
            }
        }
    }

    public void a(r7 r7Var, boolean z10) {
        g4 g4Var = this.f12875a;
        g4Var.f10430d = r7Var;
        if (z10) {
            g4Var.f10429c.clear();
            g4Var.f10431e = 0;
            g4Var.f10432f.clear();
            HashMap<String, j9> hashMap = g4Var.f10427a;
            if (hashMap != null) {
                for (j9 next : hashMap.values()) {
                    if (next != null) {
                        next.a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
                    }
                }
                g4Var.f10427a.clear();
            }
        }
    }
}
