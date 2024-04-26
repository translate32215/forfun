package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.p;
import d7.a;
import d7.h;
import d7.l;
import e7.i;
import e8.ec;
import e8.f3;
import e8.f9;
import e8.g4;
import e8.h4;
import e8.i0;
import e8.k4;
import e8.t4;
import e8.ti0;
import e8.u4;
import e8.w4;
import e8.wc;
import e8.y8;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class f2 implements g4, h4 {

    /* renamed from: a  reason: collision with root package name */
    public final t7 f6346a;

    public f2(Context context, f9 f9Var, tm tmVar) throws ec {
        u7 u7Var = l.B.f13187d;
        t7 a10 = u7.a(context, wc.a(), "", false, false, tmVar, (i0) null, f9Var, (h) null, (a) null, new nv(), (qe) null, (re) null);
        this.f6346a = a10;
        a10.getView().setWillNotDraw(true);
    }

    public static void g(Runnable runnable) {
        y8 y8Var = ti0.f16763j.f16764a;
        if (y8.l()) {
            runnable.run();
        } else {
            p.f5702i.post(runnable);
        }
    }

    public final void F(String str, JSONObject jSONObject) {
        androidx.appcompat.widget.p.s(this, str, jSONObject);
    }

    public final void O(String str, Map map) {
        try {
            androidx.appcompat.widget.p.s(this, str, l.B.f13186c.F(map));
        } catch (JSONException unused) {
            e.K("Could not convert parameters to JSON.");
        }
    }

    public final void a(String str) {
        g(new i(this, str));
    }

    public final t4 a0() {
        return new w4(this);
    }

    public final void destroy() {
        this.f6346a.destroy();
    }

    public final void e(String str, f3<? super u4> f3Var) {
        this.f6346a.s0(str, new ri((f3) f3Var));
    }

    public final boolean f() {
        return this.f6346a.f();
    }

    public final void m(String str, JSONObject jSONObject) {
        androidx.appcompat.widget.p.r(this, str, jSONObject.toString());
    }

    public final void r(String str, f3<? super u4> f3Var) {
        this.f6346a.r(str, new k4(this, f3Var));
    }
}
