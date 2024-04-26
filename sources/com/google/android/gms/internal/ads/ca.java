package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.k;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.common.internal.i;
import d7.l;
import e8.cn;
import e8.cp;
import e8.e30;
import e8.f3;
import e8.f9;
import e8.jn;
import e8.ki;
import e8.n1;
import e8.n2;
import e8.p50;
import e8.pn;
import e8.qn;
import e8.t;
import e8.ti0;
import e8.vn;
import e8.w00;
import e8.wn;
import e8.yi;
import f7.j0;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;
import z7.b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ca implements pn {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6079a;

    /* renamed from: b  reason: collision with root package name */
    public final qn f6080b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f6081c;

    /* renamed from: d  reason: collision with root package name */
    public final cp f6082d;

    /* renamed from: e  reason: collision with root package name */
    public final jn f6083e;

    /* renamed from: f  reason: collision with root package name */
    public final tm f6084f;

    /* renamed from: g  reason: collision with root package name */
    public final yi f6085g;

    /* renamed from: h  reason: collision with root package name */
    public final ki f6086h;

    /* renamed from: i  reason: collision with root package name */
    public final qe f6087i;

    /* renamed from: j  reason: collision with root package name */
    public final f9 f6088j;

    /* renamed from: k  reason: collision with root package name */
    public final w00 f6089k;

    /* renamed from: l  reason: collision with root package name */
    public final p8 f6090l;

    /* renamed from: m  reason: collision with root package name */
    public final wn f6091m;

    /* renamed from: n  reason: collision with root package name */
    public final b f6092n;

    /* renamed from: o  reason: collision with root package name */
    public final l9 f6093o;

    /* renamed from: p  reason: collision with root package name */
    public final e30 f6094p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6095q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6096r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6097s = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6098t = false;

    /* renamed from: u  reason: collision with root package name */
    public Point f6099u = new Point();

    /* renamed from: v  reason: collision with root package name */
    public Point f6100v = new Point();

    /* renamed from: w  reason: collision with root package name */
    public long f6101w = 0;

    /* renamed from: x  reason: collision with root package name */
    public long f6102x = 0;

    /* renamed from: y  reason: collision with root package name */
    public xy f6103y;

    public ca(Context context, qn qnVar, JSONObject jSONObject, cp cpVar, jn jnVar, tm tmVar, yi yiVar, ki kiVar, qe qeVar, f9 f9Var, w00 w00, p8 p8Var, wn wnVar, b bVar, l9 l9Var, e30 e30) {
        this.f6079a = context;
        this.f6080b = qnVar;
        this.f6081c = jSONObject;
        this.f6082d = cpVar;
        this.f6083e = jnVar;
        this.f6084f = tmVar;
        this.f6085g = yiVar;
        this.f6086h = kiVar;
        this.f6087i = qeVar;
        this.f6088j = f9Var;
        this.f6089k = w00;
        this.f6090l = p8Var;
        this.f6091m = wnVar;
        this.f6092n = bVar;
        this.f6093o = l9Var;
        this.f6094p = e30;
    }

    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f6099u = new Point();
        this.f6100v = new Point();
        if (!this.f6096r) {
            this.f6093o.K0(view);
            this.f6096r = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        p8 p8Var = this.f6090l;
        p8Var.getClass();
        p8Var.f7836r = new WeakReference<>(this);
        boolean k10 = k.k(this.f6088j.f14546c);
        if (map != null) {
            for (Map.Entry<String, WeakReference<View>> value : map.entrySet()) {
                View view2 = (View) ((WeakReference) value.getValue()).get();
                if (view2 != null) {
                    if (k10) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry<String, WeakReference<View>> value2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) value2.getValue()).get();
                if (view3 != null) {
                    if (k10) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            e.E("Touch event data is null. No touch event is reported.");
        } else if (!z("touch_reporting")) {
            e.I("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            int i10 = bundle.getInt("duration_ms");
            this.f6084f.f8207b.b((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i10);
        }
    }

    public final void c(View view) {
        if (!this.f6081c.optBoolean("custom_one_point_five_click_enabled", false)) {
            e.K("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        wn wnVar = this.f6091m;
        if (view != null) {
            view.setOnClickListener(wnVar);
            view.setClickable(true);
            wnVar.f17380g = new WeakReference<>(view);
        }
    }

    public final void d(xy xyVar) {
        this.f6103y = xyVar;
    }

    public final void destroy() {
        cp cpVar = this.f6082d;
        synchronized (cpVar) {
            p50<t7> p50 = cpVar.f14178l;
            if (p50 != null) {
                ob obVar = new ob(3);
                p50.a(new j0((Future) p50, (zh) obVar), cpVar.f14172f);
                cpVar.f14178l = null;
            }
        }
    }

    public final void e() {
        i.d("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f6081c);
            e.e.g(this.f6082d.e("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e10) {
            e.C("", e10);
        }
    }

    public final void f(zy zyVar) {
        try {
            if (!this.f6097s) {
                if (zyVar != null || this.f6083e.m() == null) {
                    this.f6097s = true;
                    this.f6094p.a(zyVar.Q4());
                    u();
                    return;
                }
                this.f6097s = true;
                this.f6094p.a(this.f6083e.m().f7908b);
                u();
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
    }

    public final void g() {
        if (this.f6081c.optBoolean("custom_one_point_five_click_enabled", false)) {
            wn wnVar = this.f6091m;
            if (wnVar.f17376c != null && wnVar.f17379f != null) {
                wnVar.a();
                try {
                    wnVar.f17376c.c6();
                } catch (RemoteException e10) {
                    e.F("#007 Could not call remote method.", e10);
                }
            }
        }
    }

    public final void h(j1 j1Var) {
        if (!this.f6081c.optBoolean("custom_one_point_five_click_enabled", false)) {
            e.K("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        wn wnVar = this.f6091m;
        wnVar.f17376c = j1Var;
        f3<Object> f3Var = wnVar.f17377d;
        if (f3Var != null) {
            wnVar.f17374a.d("/unconfirmedClick", f3Var);
        }
        vn vnVar = new vn(wnVar, j1Var);
        wnVar.f17377d = vnVar;
        wnVar.f17374a.a("/unconfirmedClick", vnVar);
    }

    public final void i(View view, Map<String, WeakReference<View>> map) {
        this.f6099u = new Point();
        this.f6100v = new Point();
        l9 l9Var = this.f6093o;
        synchronized (l9Var) {
            if (l9Var.f7353b.containsKey(view)) {
                l9Var.f7353b.get(view).f16484t.remove(l9Var);
                l9Var.f7353b.remove(view);
            }
        }
        this.f6096r = false;
    }

    public final void j(Bundle bundle) {
        if (bundle == null) {
            e.E("Click data is null. No click is reported.");
        } else if (!z("click_reporting")) {
            e.I("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            JSONObject jSONObject = null;
            String string = bundle2 != null ? bundle2.getString("asset_id") : null;
            p pVar = l.B.f13186c;
            pVar.getClass();
            try {
                jSONObject = pVar.v(bundle);
            } catch (JSONException e10) {
                e.C("Error converting Bundle to JSON", e10);
            }
            v((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, string, (JSONObject) null, jSONObject, false, false);
        }
    }

    public final void k(View view, MotionEvent motionEvent, View view2) {
        this.f6099u = k.a(motionEvent, view2);
        long b10 = this.f6092n.b();
        this.f6102x = b10;
        if (motionEvent.getAction() == 0) {
            this.f6101w = b10;
            this.f6100v = this.f6099u;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f6099u;
        obtain.setLocation((float) point.x, (float) point.y);
        this.f6084f.f8207b.f(obtain);
        obtain.recycle();
    }

    public final void l(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10) {
        View view3 = view2;
        Map<String, WeakReference<View>> map3 = map;
        JSONObject e10 = k.e(this.f6079a, map, map2, view2);
        JSONObject d10 = k.d(this.f6079a, view2);
        JSONObject l10 = k.l(view2);
        JSONObject h10 = k.h(this.f6079a, view2);
        View view4 = view;
        String y10 = y(view, map);
        v(((Boolean) ti0.f16763j.f16769f.a(t.D1)).booleanValue() ? view3 : view4, d10, e10, l10, h10, y10, k.f(y10, this.f6079a, this.f6100v, this.f6099u), (JSONObject) null, z10, false);
    }

    public final void m(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        String str;
        JSONObject e10 = k.e(this.f6079a, map, map2, view);
        JSONObject d10 = k.d(this.f6079a, view);
        JSONObject l10 = k.l(view);
        JSONObject h10 = k.h(this.f6079a, view);
        if (((Boolean) ti0.f16763j.f16769f.a(t.C1)).booleanValue()) {
            try {
                str = this.f6084f.f8207b.d(this.f6079a, view, (Activity) null);
            } catch (Exception unused) {
                e.I("Exception getting data.");
            }
            w(d10, e10, l10, h10, str, (JSONObject) null, k.g(this.f6079a, this.f6087i));
        }
        str = null;
        w(d10, e10, l10, h10, str, (JSONObject) null, k.g(this.f6079a, this.f6087i));
    }

    public final void n() {
        this.f6098t = true;
    }

    public final void o() {
        w((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, (JSONObject) null, false);
    }

    public final boolean p(Bundle bundle) {
        if (!z("impression_reporting")) {
            e.I("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        p pVar = l.B.f13186c;
        pVar.getClass();
        JSONObject jSONObject = null;
        if (bundle != null) {
            try {
                jSONObject = pVar.v(bundle);
            } catch (JSONException e10) {
                e.C("Error converting Bundle to JSON", e10);
            }
        }
        return w((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, jSONObject, false);
    }

    public final JSONObject q(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject e10 = k.e(this.f6079a, map, map2, view);
        JSONObject d10 = k.d(this.f6079a, view);
        JSONObject l10 = k.l(view);
        JSONObject h10 = k.h(this.f6079a, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", e10);
            jSONObject.put("ad_view_signal", d10);
            jSONObject.put("scroll_view_signal", l10);
            jSONObject.put("lock_screen_signal", h10);
            return jSONObject;
        } catch (JSONException e11) {
            e.C("Unable to create native ad view signals JSON.", e11);
            return null;
        }
    }

    public final void r(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10) {
        View view2 = view;
        Map<String, WeakReference<View>> map3 = map;
        if (!this.f6098t) {
            e.E("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!x()) {
            e.E("Custom click reporting failed. Ad unit id not in the allow list.");
        } else {
            Map<String, WeakReference<View>> map4 = map2;
            JSONObject e10 = k.e(this.f6079a, map, map2, view);
            JSONObject d10 = k.d(this.f6079a, view);
            JSONObject l10 = k.l(view);
            JSONObject h10 = k.h(this.f6079a, view);
            String y10 = y((View) null, map);
            v(view, d10, e10, l10, h10, y10, k.f(y10, this.f6079a, this.f6100v, this.f6099u), (JSONObject) null, z10, true);
        }
    }

    public final boolean s() {
        return x();
    }

    public final void t(String str) {
        v((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, (JSONObject) null, (JSONObject) null, false, false);
    }

    public final void u() {
        try {
            xy xyVar = this.f6103y;
            if (xyVar != null) {
                xyVar.R2();
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
    }

    public final void v(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z10, boolean z11) {
        String str2;
        i.d("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f6081c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z12 = false;
            jSONObject7.put("has_custom_click_handler", this.f6080b.a(this.f6083e.c()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f6083e.k());
            jSONObject8.put("view_aware_api_used", z10);
            n1 n1Var = this.f6089k.f17195i;
            jSONObject8.put("custom_mute_requested", n1Var != null && n1Var.f15577g);
            jSONObject8.put("custom_mute_enabled", !this.f6083e.g().isEmpty() && this.f6083e.m() != null);
            if (this.f6091m.f17376c != null && this.f6081c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f6092n.b());
            if (this.f6098t && x()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z11) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.f6080b.a(this.f6083e.c()) != null) {
                z12 = true;
            }
            jSONObject8.put("has_custom_click_handler", z12);
            try {
                JSONObject optJSONObject = this.f6081c.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f6084f.f8207b.e(this.f6079a, optJSONObject.optString("click_string"), view);
            } catch (Exception e10) {
                e.C("Exception obtaining click signals", e10);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) ti0.f16763j.f16769f.a(t.f16623n2)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long b10 = this.f6092n.b();
            jSONObject9.put("time_from_last_touch_down", b10 - this.f6101w);
            jSONObject9.put("time_from_last_touch", b10 - this.f6102x);
            jSONObject7.put("touch_signal", jSONObject9);
            e.e.g(this.f6082d.e("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e11) {
            e.C("Unable to create click JSON.", e11);
        }
    }

    public final boolean w(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z10) {
        JSONObject jSONObject6;
        i.d("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f6081c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("provided_signals", jSONObject5);
            if (((Boolean) ti0.f16763j.f16769f.a(t.C1)).booleanValue()) {
                jSONObject7.put("view_signals", str);
            }
            jSONObject7.put("policy_validator_enabled", z10);
            jSONObject7.put("screen", k.i(this.f6079a));
            if (((Boolean) ti0.f16763j.f16769f.a(t.F4)).booleanValue()) {
                this.f6082d.a("/clickRecorded", new cn(this, (u.b) null, 0));
            } else {
                this.f6082d.a("/logScionEvent", new n2(this, (u.b) null));
            }
            this.f6082d.a("/nativeImpression", new cn(this, (u.b) null, 1));
            e.e.g(this.f6082d.e("google.afma.nativeAds.handleImpression", jSONObject7), "Error during performing handleImpression");
            boolean z11 = this.f6095q;
            if (!z11 && (jSONObject6 = this.f6087i.B) != null) {
                this.f6095q = z11 | l.B.f13196m.b(this.f6079a, this.f6088j.f14544a, jSONObject6.toString(), this.f6089k.f17192f);
            }
            return true;
        } catch (JSONException e10) {
            e.C("Unable to create impression JSON.", e10);
            return false;
        }
    }

    public final boolean x() {
        return this.f6081c.optBoolean("allow_custom_click_gesture", false);
    }

    public final String y(View view, Map<String, WeakReference<View>> map) {
        if (!(map == null || view == null)) {
            for (Map.Entry next : map.entrySet()) {
                if (view.equals((View) ((WeakReference) next.getValue()).get())) {
                    return (String) next.getKey();
                }
            }
        }
        int k10 = this.f6083e.k();
        if (k10 == 1) {
            return "1099";
        }
        if (k10 == 2) {
            return "2099";
        }
        if (k10 != 6) {
            return null;
        }
        return "3099";
    }

    public final boolean z(String str) {
        JSONObject optJSONObject = this.f6081c.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }
}
