package com.google.android.gms.internal.ads;

import e8.b10;
import e8.mt;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ec implements ub<ue, zb> {

    /* renamed from: a  reason: collision with root package name */
    public final gb f6273a;

    public ec(gb gbVar) {
        this.f6273a = gbVar;
    }

    public final mt<ue, zb> a(String str, JSONObject jSONObject) throws b10 {
        return new mt<>(this.f6273a.b(str, jSONObject), new zb(), str);
    }
}
