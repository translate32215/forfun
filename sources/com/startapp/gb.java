package com.startapp;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import com.startapp.td;
import com.startapp.ud;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class gb implements ud.a {

    /* renamed from: h  reason: collision with root package name */
    public static gb f10469h = new gb();

    /* renamed from: i  reason: collision with root package name */
    public static Handler f10470i = new Handler(Looper.getMainLooper());

    /* renamed from: j  reason: collision with root package name */
    public static Handler f10471j = null;

    /* renamed from: k  reason: collision with root package name */
    public static final Runnable f10472k = new c();

    /* renamed from: l  reason: collision with root package name */
    public static final Runnable f10473l = new d();

    /* renamed from: a  reason: collision with root package name */
    public List<b> f10474a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f10475b;

    /* renamed from: c  reason: collision with root package name */
    public final List<xd> f10476c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public ce f10477d = new ce();

    /* renamed from: e  reason: collision with root package name */
    public td f10478e = new td();

    /* renamed from: f  reason: collision with root package name */
    public vd f10479f = new vd(new ke());

    /* renamed from: g  reason: collision with root package name */
    public long f10480g;

    /* compiled from: Sta */
    public interface a extends b {
        void b(int i10, long j10);
    }

    /* compiled from: Sta */
    public interface b {
        void a(int i10, long j10);
    }

    /* compiled from: Sta */
    public class c implements Runnable {
        public void run() {
            String str;
            Boolean bool;
            gb gbVar = gb.f10469h;
            gbVar.f10475b = 0;
            gbVar.f10476c.clear();
            for (T t10 : Collections.unmodifiableCollection(pd.f11607c.f11609b)) {
                t10.getClass();
            }
            gbVar.f10480g = System.nanoTime();
            td tdVar = gbVar.f10478e;
            tdVar.getClass();
            pd pdVar = pd.f11607c;
            if (pdVar != null) {
                for (T t11 : Collections.unmodifiableCollection(pdVar.f11609b)) {
                    View b10 = t11.b();
                    if (t11.c()) {
                        String str2 = t11.f11681h;
                        if (b10 != null) {
                            if (Build.VERSION.SDK_INT < 19 || b10.isAttachedToWindow()) {
                                if (b10.hasWindowFocus()) {
                                    tdVar.f12635h.remove(b10);
                                    bool = Boolean.FALSE;
                                } else if (tdVar.f12635h.containsKey(b10)) {
                                    bool = tdVar.f12635h.get(b10);
                                } else {
                                    Map<View, Boolean> map = tdVar.f12635h;
                                    Boolean bool2 = Boolean.FALSE;
                                    map.put(b10, bool2);
                                    bool = bool2;
                                }
                                if (bool.booleanValue()) {
                                    str = "noWindowFocus";
                                } else {
                                    HashSet hashSet = new HashSet();
                                    View view = b10;
                                    while (true) {
                                        if (view == null) {
                                            tdVar.f12631d.addAll(hashSet);
                                            str = null;
                                            break;
                                        }
                                        String a10 = ve.a(view);
                                        if (a10 != null) {
                                            str = a10;
                                            break;
                                        }
                                        hashSet.add(view);
                                        ViewParent parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "notAttached";
                            }
                            if (str == null) {
                                tdVar.f12632e.add(str2);
                                tdVar.f12628a.put(b10, str2);
                                for (he next : t11.f11676c) {
                                    View view2 = (View) next.f10518a.get();
                                    if (view2 != null) {
                                        td.a aVar = tdVar.f12629b.get(view2);
                                        if (aVar != null) {
                                            aVar.f12638b.add(t11.f11681h);
                                        } else {
                                            tdVar.f12629b.put(view2, new td.a(next, t11.f11681h));
                                        }
                                    }
                                }
                            } else if (str != "noWindowFocus") {
                                tdVar.f12633f.add(str2);
                                tdVar.f12630c.put(str2, b10);
                                tdVar.f12634g.put(str2, str);
                            }
                        } else {
                            tdVar.f12633f.add(str2);
                            tdVar.f12634g.put(str2, "noAdView");
                        }
                    }
                }
            }
            long nanoTime = System.nanoTime();
            ie ieVar = gbVar.f10477d.f10257b;
            if (gbVar.f10478e.f12633f.size() > 0) {
                Iterator<String> it = gbVar.f10478e.f12633f.iterator();
                while (it.hasNext()) {
                    String next2 = it.next();
                    JSONObject a11 = ieVar.a((View) null);
                    View view3 = gbVar.f10478e.f12630c.get(next2);
                    ne neVar = gbVar.f10477d.f10256a;
                    String str3 = gbVar.f10478e.f12634g.get(next2);
                    if (str3 != null) {
                        JSONObject a12 = neVar.a(view3);
                        WindowManager windowManager = de.f10305a;
                        try {
                            a12.put("adSessionId", next2);
                        } catch (JSONException e10) {
                            Log.e("OMIDLIB", "Error with setting ad session id", e10);
                        }
                        try {
                            a12.put("notVisibleReason", str3);
                        } catch (JSONException e11) {
                            Log.e("OMIDLIB", "Error with setting not visible reason", e11);
                        }
                        de.a(a11, a12);
                    }
                    de.a(a11);
                    HashSet hashSet2 = new HashSet();
                    hashSet2.add(next2);
                    vd vdVar = gbVar.f10479f;
                    vdVar.f12712b.a(new te(vdVar, hashSet2, a11, nanoTime));
                }
            }
            if (gbVar.f10478e.f12632e.size() > 0) {
                JSONObject a13 = ieVar.a((View) null);
                ieVar.a((View) null, a13, gbVar, true, false);
                de.a(a13);
                vd vdVar2 = gbVar.f10479f;
                vdVar2.f12712b.a(new we(vdVar2, gbVar.f10478e.f12632e, a13, nanoTime));
            } else {
                vd vdVar3 = gbVar.f10479f;
                vdVar3.f12712b.a(new oe(vdVar3));
            }
            td tdVar2 = gbVar.f10478e;
            tdVar2.f12628a.clear();
            tdVar2.f12629b.clear();
            tdVar2.f12630c.clear();
            tdVar2.f12631d.clear();
            tdVar2.f12632e.clear();
            tdVar2.f12633f.clear();
            tdVar2.f12634g.clear();
            tdVar2.f12636i = false;
            long nanoTime2 = System.nanoTime() - gbVar.f10480g;
            if (gbVar.f10474a.size() > 0) {
                for (b next3 : gbVar.f10474a) {
                    next3.a(gbVar.f10475b, TimeUnit.NANOSECONDS.toMillis(nanoTime2));
                    if (next3 instanceof a) {
                        ((a) next3).b(gbVar.f10475b, nanoTime2);
                    }
                }
            }
        }
    }

    /* compiled from: Sta */
    public class d implements Runnable {
        public void run() {
            Handler handler = gb.f10471j;
            if (handler != null) {
                handler.post(gb.f10472k);
                gb.f10471j.postDelayed(gb.f10473l, 200);
            }
        }
    }

    public final void a(View view, ud udVar, JSONObject jSONObject, yb.a aVar, boolean z10) {
        udVar.a(view, jSONObject, this, aVar == yb.a.PARENT_VIEW, z10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r11, com.startapp.ud r12, org.json.JSONObject r13, boolean r14) {
        /*
            r10 = this;
            yb.a r0 = yb.a.UNDERLYING_VIEW
            java.lang.String r1 = com.startapp.ve.a(r11)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            if (r1 != 0) goto L_0x0010
            return
        L_0x0010:
            com.startapp.td r1 = r10.f10478e
            java.util.HashSet<android.view.View> r4 = r1.f12631d
            boolean r4 = r4.contains(r11)
            if (r4 == 0) goto L_0x001e
            yb.a r1 = yb.a.PARENT_VIEW
        L_0x001c:
            r8 = r1
            goto L_0x0026
        L_0x001e:
            boolean r1 = r1.f12636i
            if (r1 == 0) goto L_0x0025
            yb.a r1 = yb.a.OBSTRUCTION_VIEW
            goto L_0x001c
        L_0x0025:
            r8 = r0
        L_0x0026:
            if (r8 != r0) goto L_0x0029
            return
        L_0x0029:
            org.json.JSONObject r7 = r12.a(r11)
            com.startapp.de.a((org.json.JSONObject) r13, (org.json.JSONObject) r7)
            com.startapp.td r13 = r10.f10478e
            java.util.HashMap<android.view.View, java.lang.String> r0 = r13.f12628a
            int r0 = r0.size()
            if (r0 != 0) goto L_0x003c
            r13 = 0
            goto L_0x004c
        L_0x003c:
            java.util.HashMap<android.view.View, java.lang.String> r0 = r13.f12628a
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x004b
            java.util.HashMap<android.view.View, java.lang.String> r13 = r13.f12628a
            r13.remove(r11)
        L_0x004b:
            r13 = r0
        L_0x004c:
            java.lang.String r0 = "OMIDLIB"
            if (r13 == 0) goto L_0x0088
            android.view.WindowManager r1 = com.startapp.de.f10305a
            java.lang.String r1 = "adSessionId"
            r7.put(r1, r13)     // Catch:{ JSONException -> 0x0058 }
            goto L_0x005e
        L_0x0058:
            r13 = move-exception
            java.lang.String r1 = "Error with setting ad session id"
            android.util.Log.e(r0, r1, r13)
        L_0x005e:
            com.startapp.td r13 = r10.f10478e
            java.util.Map<android.view.View, java.lang.Boolean> r1 = r13.f12635h
            boolean r1 = r1.containsKey(r11)
            if (r1 == 0) goto L_0x0071
            java.util.Map<android.view.View, java.lang.Boolean> r13 = r13.f12635h
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r13.put(r11, r1)
            r13 = 0
            goto L_0x0072
        L_0x0071:
            r13 = 1
        L_0x0072:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            java.lang.String r1 = "hasWindowFocus"
            r7.put(r1, r13)     // Catch:{ JSONException -> 0x007c }
            goto L_0x0082
        L_0x007c:
            r13 = move-exception
            java.lang.String r1 = "Error with setting not visible reason"
            android.util.Log.e(r0, r1, r13)
        L_0x0082:
            com.startapp.td r13 = r10.f10478e
            r13.f12636i = r3
            r13 = 1
            goto L_0x0089
        L_0x0088:
            r13 = 0
        L_0x0089:
            if (r13 != 0) goto L_0x00ef
            com.startapp.td r13 = r10.f10478e
            java.util.HashMap<android.view.View, com.startapp.td$a> r1 = r13.f12629b
            java.lang.Object r1 = r1.get(r11)
            com.startapp.td$a r1 = (com.startapp.td.a) r1
            if (r1 == 0) goto L_0x009c
            java.util.HashMap<android.view.View, com.startapp.td$a> r13 = r13.f12629b
            r13.remove(r11)
        L_0x009c:
            if (r1 == 0) goto L_0x00e0
            android.view.WindowManager r13 = com.startapp.de.f10305a
            com.startapp.he r13 = r1.f12637a
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.util.ArrayList<java.lang.String> r1 = r1.f12638b
            java.util.Iterator r1 = r1.iterator()
        L_0x00ad:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00bd
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            r4.put(r5)
            goto L_0x00ad
        L_0x00bd:
            java.lang.String r1 = "isFriendlyObstructionFor"
            r7.put(r1, r4)     // Catch:{ JSONException -> 0x00d8 }
            java.lang.String r1 = "friendlyObstructionClass"
            java.lang.String r4 = r13.f10519b     // Catch:{ JSONException -> 0x00d8 }
            r7.put(r1, r4)     // Catch:{ JSONException -> 0x00d8 }
            java.lang.String r1 = "friendlyObstructionPurpose"
            vb.c r4 = r13.f10520c     // Catch:{ JSONException -> 0x00d8 }
            r7.put(r1, r4)     // Catch:{ JSONException -> 0x00d8 }
            java.lang.String r1 = "friendlyObstructionReason"
            java.lang.String r13 = r13.f10521d     // Catch:{ JSONException -> 0x00d8 }
            r7.put(r1, r13)     // Catch:{ JSONException -> 0x00d8 }
            goto L_0x00de
        L_0x00d8:
            r13 = move-exception
            java.lang.String r1 = "Error with setting friendly obstruction"
            android.util.Log.e(r0, r1, r13)
        L_0x00de:
            r13 = 1
            goto L_0x00e1
        L_0x00e0:
            r13 = 0
        L_0x00e1:
            if (r14 != 0) goto L_0x00e8
            if (r13 == 0) goto L_0x00e6
            goto L_0x00e8
        L_0x00e6:
            r9 = 0
            goto L_0x00e9
        L_0x00e8:
            r9 = 1
        L_0x00e9:
            r4 = r10
            r5 = r11
            r6 = r12
            r4.a(r5, r6, r7, r8, r9)
        L_0x00ef:
            int r11 = r10.f10475b
            int r11 = r11 + r3
            r10.f10475b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.gb.a(android.view.View, com.startapp.ud, org.json.JSONObject, boolean):void");
    }

    public void a() {
        if (f10471j == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f10471j = handler;
            handler.post(f10472k);
            f10471j.postDelayed(f10473l, 200);
        }
    }
}
