package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import c8.b;
import d7.l;
import e8.f9;
import e8.ji;
import e8.ki;
import e8.pn;
import e8.w00;
import e8.yi;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import l0.e;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ka implements pn {

    /* renamed from: a  reason: collision with root package name */
    public final d3 f7216a;

    /* renamed from: b  reason: collision with root package name */
    public final e3 f7217b;

    /* renamed from: c  reason: collision with root package name */
    public final j3 f7218c;

    /* renamed from: d  reason: collision with root package name */
    public final yi f7219d;

    /* renamed from: e  reason: collision with root package name */
    public final ki f7220e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f7221f;

    /* renamed from: g  reason: collision with root package name */
    public final qe f7222g;

    /* renamed from: h  reason: collision with root package name */
    public final f9 f7223h;

    /* renamed from: i  reason: collision with root package name */
    public final w00 f7224i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7225j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7226k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7227l = true;

    public ka(d3 d3Var, e3 e3Var, j3 j3Var, yi yiVar, ki kiVar, Context context, qe qeVar, f9 f9Var, w00 w00) {
        this.f7216a = d3Var;
        this.f7217b = e3Var;
        this.f7218c = j3Var;
        this.f7219d = yiVar;
        this.f7220e = kiVar;
        this.f7221f = context;
        this.f7222g = qeVar;
        this.f7223h = f9Var;
        this.f7224i = w00;
    }

    public static HashMap<String, View> w(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry next : map.entrySet()) {
                View view = (View) ((WeakReference) next.getValue()).get();
                if (view != null) {
                    hashMap.put((String) next.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        try {
            b bVar = new b(view);
            this.f7227l = x(map, map2);
            HashMap<String, View> w10 = w(map);
            HashMap<String, View> w11 = w(map2);
            j3 j3Var = this.f7218c;
            if (j3Var != null) {
                j3Var.z(bVar, new b(w10), new b(w11));
                return;
            }
            d3 d3Var = this.f7216a;
            if (d3Var != null) {
                d3Var.z(bVar, new b(w10), new b(w11));
                this.f7216a.t0(bVar);
                return;
            }
            e3 e3Var = this.f7217b;
            if (e3Var != null) {
                e3Var.z(bVar, new b(w10), new b(w11));
                this.f7217b.t0(bVar);
            }
        } catch (RemoteException e10) {
            e.D("Failed to call trackView", e10);
        }
    }

    public final void b(Bundle bundle) {
    }

    public final void c(View view) {
    }

    public final void d(xy xyVar) {
        e.K("Mute This Ad is not supported for 3rd party ads");
    }

    public final void destroy() {
    }

    public final void e() {
    }

    public final void f(zy zyVar) {
        e.K("Mute This Ad is not supported for 3rd party ads");
    }

    public final void g() {
    }

    public final void h(j1 j1Var) {
    }

    public final void i(View view, Map<String, WeakReference<View>> map) {
        try {
            b bVar = new b(view);
            j3 j3Var = this.f7218c;
            if (j3Var != null) {
                j3Var.H(bVar);
                return;
            }
            d3 d3Var = this.f7216a;
            if (d3Var != null) {
                d3Var.H(bVar);
                return;
            }
            e3 e3Var = this.f7217b;
            if (e3Var != null) {
                e3Var.H(bVar);
            }
        } catch (RemoteException e10) {
            e.D("Failed to call untrackView", e10);
        }
    }

    public final void j(Bundle bundle) {
    }

    public final void k(View view, MotionEvent motionEvent, View view2) {
    }

    public final void l(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10) {
        if (!this.f7226k || !this.f7222g.G) {
            v(view);
        }
    }

    public final void m(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject jSONObject;
        try {
            boolean z10 = this.f7225j;
            if (!z10 && (jSONObject = this.f7222g.B) != null) {
                this.f7225j = z10 | l.B.f13196m.b(this.f7221f, this.f7223h.f14544a, jSONObject.toString(), this.f7224i.f17192f);
            }
            if (this.f7227l) {
                j3 j3Var = this.f7218c;
                if (j3Var == null || j3Var.G()) {
                    d3 d3Var = this.f7216a;
                    if (d3Var == null || d3Var.G()) {
                        e3 e3Var = this.f7217b;
                        if (e3Var != null && !e3Var.G()) {
                            this.f7217b.x();
                            this.f7219d.O();
                            return;
                        }
                        return;
                    }
                    this.f7216a.x();
                    this.f7219d.O();
                    return;
                }
                this.f7218c.x();
                this.f7219d.O();
            }
        } catch (RemoteException e10) {
            e.D("Failed to call recordImpression", e10);
        }
    }

    public final void n() {
        this.f7226k = true;
    }

    public final void o() {
    }

    public final boolean p(Bundle bundle) {
        return false;
    }

    public final JSONObject q(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    public final void r(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10) {
        if (!this.f7226k) {
            e.K("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.f7222g.G) {
            e.K("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            v(view);
        }
    }

    public final boolean s() {
        return this.f7222g.G;
    }

    public final void t(String str) {
    }

    public final void u() {
        e.K("Mute This Ad is not supported for 3rd party ads");
    }

    public final void v(View view) {
        try {
            j3 j3Var = this.f7218c;
            if (j3Var == null || j3Var.I()) {
                d3 d3Var = this.f7216a;
                if (d3Var == null || d3Var.I()) {
                    e3 e3Var = this.f7217b;
                    if (e3Var != null && !e3Var.I()) {
                        this.f7217b.A(new b(view));
                        this.f7220e.I0(ji.f15149a);
                        return;
                    }
                    return;
                }
                this.f7216a.A(new b(view));
                this.f7220e.I0(ji.f15149a);
                return;
            }
            this.f7218c.A(new b(view));
            this.f7220e.I0(ji.f15149a);
        } catch (RemoteException e10) {
            e.D("Failed to call handleClick", e10);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean x(java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r9, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.qe r0 = r8.f7222g
            org.json.JSONObject r0 = r0.f7951e0
            e8.l<java.lang.Boolean> r1 = e8.t.W0
            e8.ti0 r2 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r2 = r2.f16769f
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 1
            if (r1 == 0) goto L_0x00de
            int r1 = r0.length()
            if (r1 != 0) goto L_0x001f
            goto L_0x00de
        L_0x001f:
            if (r9 != 0) goto L_0x0026
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
        L_0x0026:
            if (r10 != 0) goto L_0x002d
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
        L_0x002d:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1.putAll(r9)
            r1.putAll(r10)
            java.util.Iterator r9 = r0.keys()
        L_0x003c:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00de
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            org.json.JSONArray r3 = r0.optJSONArray(r10)
            if (r3 == 0) goto L_0x003c
            java.lang.Object r4 = r1.get(r10)
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            r5 = 0
            if (r4 != 0) goto L_0x0058
            return r5
        L_0x0058:
            java.lang.Object r4 = r4.get()
            if (r4 != 0) goto L_0x005f
            return r5
        L_0x005f:
            java.lang.Class r4 = r4.getClass()
            e8.l<java.lang.Boolean> r6 = e8.t.X0
            e8.ti0 r7 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r7 = r7.f16769f
            java.lang.Object r6 = r7.a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00a7
            java.lang.String r6 = "3010"
            boolean r10 = r10.equals(r6)
            if (r10 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.j3 r10 = r8.f7218c
            r4 = 0
            if (r10 == 0) goto L_0x0087
            c8.a r10 = r10.E()     // Catch:{ RemoteException -> 0x00a0 }
            goto L_0x009a
        L_0x0087:
            com.google.android.gms.internal.ads.d3 r10 = r8.f7216a
            if (r10 == 0) goto L_0x0090
            c8.a r10 = r10.E()     // Catch:{ RemoteException -> 0x00a0 }
            goto L_0x009a
        L_0x0090:
            com.google.android.gms.internal.ads.e3 r10 = r8.f7217b
            if (r10 == 0) goto L_0x0099
            c8.a r10 = r10.E()     // Catch:{ RemoteException -> 0x00a0 }
            goto L_0x009a
        L_0x0099:
            r10 = r4
        L_0x009a:
            if (r10 == 0) goto L_0x00a0
            java.lang.Object r4 = c8.b.z0(r10)     // Catch:{  }
        L_0x00a0:
            if (r4 != 0) goto L_0x00a3
            return r5
        L_0x00a3:
            java.lang.Class r4 = r4.getClass()
        L_0x00a7:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ JSONException -> 0x00d7 }
            r10.<init>()     // Catch:{ JSONException -> 0x00d7 }
            com.google.android.gms.ads.internal.util.i.c(r3, r10)     // Catch:{ JSONException -> 0x00d7 }
            d7.l r3 = d7.l.B     // Catch:{ JSONException -> 0x00d7 }
            com.google.android.gms.ads.internal.util.p r3 = r3.f13186c     // Catch:{ JSONException -> 0x00d7 }
            android.content.Context r3 = r8.f7221f     // Catch:{ JSONException -> 0x00d7 }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ JSONException -> 0x00d7 }
            e8.d40 r6 = com.google.android.gms.ads.internal.util.p.f5702i     // Catch:{ JSONException -> 0x00d7 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ JSONException -> 0x00d7 }
        L_0x00bf:
            boolean r6 = r10.hasNext()     // Catch:{ JSONException -> 0x00d7 }
            if (r6 == 0) goto L_0x00da
            java.lang.Object r6 = r10.next()     // Catch:{ JSONException -> 0x00d7 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x00d7 }
            java.lang.Class r6 = java.lang.Class.forName(r6, r5, r3)     // Catch:{ all -> 0x00bf }
            boolean r6 = r6.isAssignableFrom(r4)     // Catch:{ all -> 0x00bf }
            if (r6 == 0) goto L_0x00bf
            r10 = 1
            goto L_0x00db
        L_0x00d7:
            goto L_0x003c
        L_0x00da:
            r10 = 0
        L_0x00db:
            if (r10 != 0) goto L_0x003c
            return r5
        L_0x00de:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ka.x(java.util.Map, java.util.Map):boolean");
    }
}
