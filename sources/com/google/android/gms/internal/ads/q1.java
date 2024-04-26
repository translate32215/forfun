package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import e8.f3;
import e8.m3;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class q1 implements f3<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7910a = new Object();
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, m3> f7911b = new HashMap();

    public final void a(String str, m3 m3Var) {
        synchronized (this.f7910a) {
            this.f7911b.put(str, m3Var);
        }
    }

    public final void f(Object obj, Map<String, String> map) {
        String str;
        String str2 = map.get("id");
        String str3 = map.get("fail");
        String str4 = map.get("fail_reason");
        String str5 = map.get("fail_stack");
        String str6 = map.get("result");
        if (TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            String valueOf = String.valueOf(str5);
            str = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.f7910a) {
            m3 remove = this.f7911b.remove(str2);
            if (remove == null) {
                String valueOf2 = String.valueOf(str2);
                e.K(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                remove.b(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                remove.a((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (e.O()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        e.H(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.a(jSONObject);
                } catch (JSONException e10) {
                    remove.b(e10.getMessage());
                }
            }
        }
    }
}
