package com.startapp;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class na {

    /* renamed from: b  reason: collision with root package name */
    public static final na f10909b = new na(new JSONObject());

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f10910a;

    public na() {
        this(new JSONObject());
    }

    public final void a(int i10, Object obj) {
        try {
            this.f10910a.put(String.valueOf(i10), obj);
        } catch (JSONException unused) {
        }
    }

    public final String b(int i10) {
        Object opt = this.f10910a.opt(String.valueOf(i10));
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public na(JSONObject jSONObject) {
        this.f10910a = jSONObject;
    }

    public final int a(int i10) {
        Object opt = this.f10910a.opt(String.valueOf(i10));
        if (opt instanceof Number) {
            return ((Number) opt).intValue();
        }
        return 0;
    }
}
