package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ad extends e4 {

    /* renamed from: a  reason: collision with root package name */
    public final a4 f5949a;

    /* renamed from: b  reason: collision with root package name */
    public d7<JSONObject> f5950b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f5951c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    public boolean f5952d = false;

    public ad(String str, a4 a4Var, d7<JSONObject> d7Var) {
        JSONObject jSONObject = new JSONObject();
        this.f5951c = jSONObject;
        this.f5950b = d7Var;
        this.f5949a = a4Var;
        try {
            jSONObject.put("adapter_version", a4Var.r0().toString());
            jSONObject.put("sdk_version", a4Var.m0().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void s6(java.lang.String r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f5952d     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            org.json.JSONObject r0 = r2.f5951c     // Catch:{ JSONException -> 0x000e }
            java.lang.String r1 = "signal_error"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x000e }
        L_0x000e:
            com.google.android.gms.internal.ads.d7<org.json.JSONObject> r3 = r2.f5950b     // Catch:{ all -> 0x001a }
            org.json.JSONObject r0 = r2.f5951c     // Catch:{ all -> 0x001a }
            r3.b(r0)     // Catch:{ all -> 0x001a }
            r3 = 1
            r2.f5952d = r3     // Catch:{ all -> 0x001a }
            monitor-exit(r2)
            return
        L_0x001a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ad.s6(java.lang.String):void");
    }
}
