package com.google.android.gms.internal.ads;

import e8.b10;
import e8.mt;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wc implements ub<a4, zb> {

    /* renamed from: a  reason: collision with root package name */
    public final zc f8443a;

    public wc(zc zcVar) {
        this.f8443a = zcVar;
    }

    public final mt<a4, zb> a(String str, JSONObject jSONObject) throws b10 {
        a4 a10 = this.f8443a.a(str);
        if (a10 == null) {
            return null;
        }
        return new mt<>(a10, new zb(), str);
    }
}
