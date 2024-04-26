package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.m2;
import com.google.android.gms.internal.ads.n2;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.yh;
import d7.c;
import d7.l;
import e8.f9;
import e8.h9;
import e8.o50;
import e8.p50;
import e8.t;
import e8.ti0;
import e8.u8;
import e8.x4;
import e8.y4;
import javax.annotation.ParametersAreNonnullByDefault;
import l0.e;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public long f5594a = 0;

    public final void a(Context context, f9 f9Var, boolean z10, u8 u8Var, String str, String str2, Runnable runnable) {
        if (l.B.f13193j.a() - this.f5594a < 5000) {
            e.K("Not retrying to fetch app settings");
            return;
        }
        this.f5594a = l.B.f13193j.a();
        boolean z11 = true;
        if (u8Var != null) {
            if (!(l.B.f13193j.b() - u8Var.f16855a > ((Long) ti0.f16763j.f16769f.a(t.V1)).longValue()) && u8Var.f16862h) {
                z11 = false;
            }
        }
        if (z11) {
            if (context == null) {
                e.K("Context not provided to fetch application settings");
            } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                m2 b10 = l.B.f13199p.b(applicationContext, f9Var);
                y4<JSONObject> y4Var = x4.f17438b;
                n2 n2Var = new n2(b10.f7437a, "google.afma.config.fetchAppSettings", y4Var, y4Var);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("app_id", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("ad_unit_id", str2);
                    }
                    jSONObject.put("is_init", z10);
                    jSONObject.put("pn", context.getPackageName());
                    p50 b11 = n2Var.b(jSONObject);
                    oh ohVar = c.f13164a;
                    o50 o50 = h9.f14886f;
                    p50 j10 = yh.j(b11, ohVar, o50);
                    if (runnable != null) {
                        ((d7) b11).f6188a.a(runnable, o50);
                    }
                    e.e.g(j10, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Exception e10) {
                    e.C("Error requesting application settings", e10);
                }
            } else {
                e.K("App settings could not be fetched. Required parameters missing");
            }
        }
    }
}
