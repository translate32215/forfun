package com.google.android.gms.internal.ads;

import e8.b10;
import e8.mt;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class tc implements ub<ue, ac> {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, mt<ue, ac>> f8177a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final gb f8178b;

    public tc(gb gbVar) {
        this.f8178b = gbVar;
    }

    public final mt<ue, ac> a(String str, JSONObject jSONObject) throws b10 {
        mt<ue, ac> mtVar;
        synchronized (this) {
            mtVar = this.f8177a.get(str);
            if (mtVar == null) {
                mtVar = new mt<>(this.f8178b.b(str, jSONObject), new ac(), str);
                this.f8177a.put(str, mtVar);
            }
        }
        return mtVar;
    }
}
