package com.google.android.gms.ads.internal.util;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.qe;
import d7.l;
import e8.g40;
import e8.gz;
import e8.k40;
import e8.l40;
import e8.t;
import e8.ti0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nonnull;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class k {
    public static Point a(MotionEvent motionEvent, View view) {
        int[] m10 = m(view);
        return new Point(((int) motionEvent.getRawX()) - m10[0], ((int) motionEvent.getRawY()) - m10[1]);
    }

    public static JSONObject b(Context context, Point point, Point point2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", j(context, point2.x));
            jSONObject.put("y", j(context, point2.y));
            jSONObject.put("start_x", j(context, point.x));
            jSONObject.put("start_y", j(context, point.y));
            return jSONObject;
        } catch (JSONException e10) {
            e.C("Error occurred while putting signals into JSON object.", e10);
            return null;
        }
    }

    public static JSONObject c(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", j(context, rect.right - rect.left));
        jSONObject.put("height", j(context, rect.bottom - rect.top));
        jSONObject.put("x", j(context, rect.left));
        jSONObject.put("y", j(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0123 A[Catch:{ JSONException -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0133 A[Catch:{ JSONException -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x014b A[Catch:{ JSONException -> 0x014f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject d(android.content.Context r16, android.view.View r17) {
        /*
            r0 = r16
            r1 = r17
            java.lang.String r2 = "window"
            java.lang.String r3 = "relative_to"
            java.lang.String r4 = "y"
            java.lang.String r5 = "x"
            java.lang.String r6 = "height"
            java.lang.String r7 = "width"
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            if (r1 != 0) goto L_0x0018
            return r8
        L_0x0018:
            r9 = 2
            r10 = 1
            r11 = 0
            int[] r12 = m(r17)     // Catch:{ Exception -> 0x00db }
            int[] r13 = new int[r9]     // Catch:{ Exception -> 0x00db }
            int r14 = r17.getMeasuredWidth()     // Catch:{ Exception -> 0x00db }
            r13[r11] = r14     // Catch:{ Exception -> 0x00db }
            int r14 = r17.getMeasuredHeight()     // Catch:{ Exception -> 0x00db }
            r13[r10] = r14     // Catch:{ Exception -> 0x00db }
            android.view.ViewParent r14 = r17.getParent()     // Catch:{ Exception -> 0x00db }
        L_0x0031:
            boolean r15 = r14 instanceof android.view.ViewGroup     // Catch:{ Exception -> 0x00db }
            if (r15 == 0) goto L_0x0059
            r15 = r14
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15     // Catch:{ Exception -> 0x00db }
            int r15 = r15.getMeasuredWidth()     // Catch:{ Exception -> 0x00db }
            r9 = r13[r11]     // Catch:{ Exception -> 0x00db }
            int r9 = java.lang.Math.min(r15, r9)     // Catch:{ Exception -> 0x00db }
            r13[r11] = r9     // Catch:{ Exception -> 0x00db }
            r9 = r14
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9     // Catch:{ Exception -> 0x00db }
            int r9 = r9.getMeasuredHeight()     // Catch:{ Exception -> 0x00db }
            r15 = r13[r10]     // Catch:{ Exception -> 0x00db }
            int r9 = java.lang.Math.min(r9, r15)     // Catch:{ Exception -> 0x00db }
            r13[r10] = r9     // Catch:{ Exception -> 0x00db }
            android.view.ViewParent r14 = r14.getParent()     // Catch:{ Exception -> 0x00db }
            r9 = 2
            goto L_0x0031
        L_0x0059:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x00db }
            r9.<init>()     // Catch:{ Exception -> 0x00db }
            int r14 = r17.getMeasuredWidth()     // Catch:{ Exception -> 0x00db }
            int r14 = j(r0, r14)     // Catch:{ Exception -> 0x00db }
            r9.put(r7, r14)     // Catch:{ Exception -> 0x00db }
            int r14 = r17.getMeasuredHeight()     // Catch:{ Exception -> 0x00db }
            int r14 = j(r0, r14)     // Catch:{ Exception -> 0x00db }
            r9.put(r6, r14)     // Catch:{ Exception -> 0x00db }
            r14 = r12[r11]     // Catch:{ Exception -> 0x00db }
            int r14 = j(r0, r14)     // Catch:{ Exception -> 0x00db }
            r9.put(r5, r14)     // Catch:{ Exception -> 0x00db }
            r14 = r12[r10]     // Catch:{ Exception -> 0x00db }
            int r14 = j(r0, r14)     // Catch:{ Exception -> 0x00db }
            r9.put(r4, r14)     // Catch:{ Exception -> 0x00db }
            java.lang.String r14 = "maximum_visible_width"
            r15 = r13[r11]     // Catch:{ Exception -> 0x00db }
            int r15 = j(r0, r15)     // Catch:{ Exception -> 0x00db }
            r9.put(r14, r15)     // Catch:{ Exception -> 0x00db }
            java.lang.String r14 = "maximum_visible_height"
            r13 = r13[r10]     // Catch:{ Exception -> 0x00db }
            int r13 = j(r0, r13)     // Catch:{ Exception -> 0x00db }
            r9.put(r14, r13)     // Catch:{ Exception -> 0x00db }
            r9.put(r3, r2)     // Catch:{ Exception -> 0x00db }
            java.lang.String r13 = "frame"
            r8.put(r13, r9)     // Catch:{ Exception -> 0x00db }
            android.graphics.Rect r9 = new android.graphics.Rect     // Catch:{ Exception -> 0x00db }
            r9.<init>()     // Catch:{ Exception -> 0x00db }
            boolean r13 = r1.getGlobalVisibleRect(r9)     // Catch:{ Exception -> 0x00db }
            if (r13 == 0) goto L_0x00b4
            org.json.JSONObject r0 = c(r0, r9)     // Catch:{ Exception -> 0x00db }
            goto L_0x00d5
        L_0x00b4:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x00db }
            r9.<init>()     // Catch:{ Exception -> 0x00db }
            r9.put(r7, r11)     // Catch:{ Exception -> 0x00db }
            r9.put(r6, r11)     // Catch:{ Exception -> 0x00db }
            r6 = r12[r11]     // Catch:{ Exception -> 0x00db }
            int r6 = j(r0, r6)     // Catch:{ Exception -> 0x00db }
            r9.put(r5, r6)     // Catch:{ Exception -> 0x00db }
            r5 = r12[r10]     // Catch:{ Exception -> 0x00db }
            int r0 = j(r0, r5)     // Catch:{ Exception -> 0x00db }
            r9.put(r4, r0)     // Catch:{ Exception -> 0x00db }
            r9.put(r3, r2)     // Catch:{ Exception -> 0x00db }
            r0 = r9
        L_0x00d5:
            java.lang.String r2 = "visible_bounds"
            r8.put(r2, r0)     // Catch:{ Exception -> 0x00db }
            goto L_0x00e0
        L_0x00db:
            java.lang.String r0 = "Unable to get native ad view bounding box"
            l0.e.K(r0)
        L_0x00e0:
            e8.l<java.lang.Boolean> r0 = e8.t.A3
            e8.ti0 r2 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r2 = r2.f16769f
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0155
            android.view.ViewParent r0 = r17.getParent()
            if (r0 == 0) goto L_0x0117
            java.lang.Class r1 = r0.getClass()     // Catch:{ NoSuchMethodException -> 0x0117, SecurityException -> 0x0111, IllegalAccessException -> 0x010f, InvocationTargetException -> 0x010d }
            java.lang.String r2 = "getTemplateTypeName"
            java.lang.Class[] r3 = new java.lang.Class[r11]     // Catch:{ NoSuchMethodException -> 0x0117, SecurityException -> 0x0111, IllegalAccessException -> 0x010f, InvocationTargetException -> 0x010d }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch:{ NoSuchMethodException -> 0x0117, SecurityException -> 0x0111, IllegalAccessException -> 0x010f, InvocationTargetException -> 0x010d }
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ NoSuchMethodException -> 0x0117, SecurityException -> 0x0111, IllegalAccessException -> 0x010f, InvocationTargetException -> 0x010d }
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch:{ NoSuchMethodException -> 0x0117, SecurityException -> 0x0111, IllegalAccessException -> 0x010f, InvocationTargetException -> 0x010d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NoSuchMethodException -> 0x0117, SecurityException -> 0x0111, IllegalAccessException -> 0x010f, InvocationTargetException -> 0x010d }
            goto L_0x0119
        L_0x010d:
            r0 = move-exception
            goto L_0x0112
        L_0x010f:
            r0 = move-exception
            goto L_0x0112
        L_0x0111:
            r0 = move-exception
        L_0x0112:
            java.lang.String r1 = "Cannot access method getTemplateTypeName: "
            l0.e.C(r1, r0)
        L_0x0117:
            java.lang.String r0 = ""
        L_0x0119:
            r1 = -1
            int r2 = r0.hashCode()     // Catch:{ JSONException -> 0x014f }
            r3 = -2066603854(0xffffffff84d220b2, float:-4.940079E-36)
            if (r2 == r3) goto L_0x0133
            r3 = 2019754500(0x78630204, float:1.8417067E34)
            if (r2 == r3) goto L_0x0129
            goto L_0x013c
        L_0x0129:
            java.lang.String r2 = "medium_template"
            boolean r0 = r0.equals(r2)     // Catch:{ JSONException -> 0x014f }
            if (r0 == 0) goto L_0x013c
            r1 = 1
            goto L_0x013c
        L_0x0133:
            java.lang.String r2 = "small_template"
            boolean r0 = r0.equals(r2)     // Catch:{ JSONException -> 0x014f }
            if (r0 == 0) goto L_0x013c
            r1 = 0
        L_0x013c:
            java.lang.String r0 = "native_template_type"
            if (r1 == 0) goto L_0x014b
            if (r1 == r10) goto L_0x0146
            r8.put(r0, r11)     // Catch:{ JSONException -> 0x014f }
            goto L_0x0155
        L_0x0146:
            r1 = 2
            r8.put(r0, r1)     // Catch:{ JSONException -> 0x014f }
            goto L_0x0155
        L_0x014b:
            r8.put(r0, r10)     // Catch:{ JSONException -> 0x014f }
            goto L_0x0155
        L_0x014f:
            r0 = move-exception
            java.lang.String r1 = "Could not log native template signal to JSON"
            l0.e.C(r1, r0)
        L_0x0155:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.k.d(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static JSONObject e(Context context, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        String str;
        String str2;
        JSONObject jSONObject;
        Context context2 = context;
        Map<String, WeakReference<View>> map3 = map2;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (!(map == null || view == null)) {
            int[] m10 = m(view);
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                View view2 = (View) ((WeakReference) next.getValue()).get();
                if (view2 != null) {
                    int[] m11 = m(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                    try {
                        jSONObject4.put("width", j(context2, view2.getMeasuredWidth()));
                        jSONObject4.put("height", j(context2, view2.getMeasuredHeight()));
                        jSONObject4.put("x", j(context2, m11[0] - m10[0]));
                        jSONObject4.put("y", j(context2, m11[1] - m10[1]));
                        jSONObject4.put(str4, str3);
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = c(context2, rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", j(context2, m11[0] - m10[0]));
                            jSONObject.put("y", j(context2, m11[1] - m10[1]));
                            jSONObject.put(str4, str3);
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            str2 = str3;
                            str = str4;
                            try {
                                jSONObject3.put("font_size", (double) textView.getTextSize());
                                jSONObject3.put("text", textView.getText());
                            } catch (JSONException unused) {
                                e.K("Unable to get asset views information");
                                it = it2;
                                str3 = str2;
                                str4 = str;
                            }
                        } else {
                            str2 = str3;
                            str = str4;
                        }
                        jSONObject3.put("is_clickable", map3 != null && map3.containsKey(next.getKey()) && view2.isClickable());
                        jSONObject2.put((String) next.getKey(), jSONObject3);
                    } catch (JSONException unused2) {
                        str2 = str3;
                        str = str4;
                        e.K("Unable to get asset views information");
                        it = it2;
                        str3 = str2;
                        str4 = str;
                    }
                    it = it2;
                    str3 = str2;
                    str4 = str;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject f(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("click_point", b(context, point, point2));
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e10) {
                e = e10;
                jSONObject = jSONObject2;
            }
        } catch (Exception e11) {
            e = e11;
            e.C("Error occurred while grabbing click signals.", e);
            return jSONObject;
        }
    }

    public static boolean g(Context context, qe qeVar) {
        if (!qeVar.I) {
            return false;
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16607k4)).booleanValue()) {
            return ((Boolean) ti0.f16763j.f16769f.a(t.f16625n4)).booleanValue();
        }
        String str = (String) ti0.f16763j.f16769f.a(t.f16613l4);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            k40 k40 = new k40(new gz((lg) new g40(';')));
            gz gzVar = k40.f15238b;
            gzVar.getClass();
            l40 l40 = new l40(gzVar, k40, str);
            while (l40.hasNext()) {
                if (((String) l40.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject h(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            p pVar = l.B.f13186c;
            jSONObject.put("can_show_on_lock_screen", p.I(view));
            p pVar2 = l.B.f13186c;
            boolean z10 = false;
            if (context != null) {
                Object systemService = context.getSystemService("keyguard");
                KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                    z10 = true;
                }
            }
            jSONObject.put("is_keyguard_locked", z10);
        } catch (JSONException unused) {
            e.K("Unable to get lock screen information");
        }
        return jSONObject;
    }

    public static JSONObject i(@Nonnull Context context) {
        JSONObject jSONObject = new JSONObject();
        p pVar = l.B.f13186c;
        DisplayMetrics c10 = p.c((WindowManager) context.getSystemService("window"));
        try {
            jSONObject.put("width", j(context, c10.widthPixels));
            jSONObject.put("height", j(context, c10.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static int j(Context context, int i10) {
        return ti0.f16763j.f16764a.f(context, i10);
    }

    public static boolean k(int i10) {
        if (!((Boolean) ti0.f16763j.f16769f.a(t.A1)).booleanValue()) {
            return true;
        }
        return ((Boolean) ti0.f16763j.f16769f.a(t.B1)).booleanValue() || i10 <= 15299999;
    }

    public static JSONObject l(View view) {
        int i10;
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            boolean z10 = true;
            if (((Boolean) ti0.f16763j.f16769f.a(t.f16601j4)).booleanValue()) {
                p pVar = l.B.f13186c;
                ViewParent parent = view.getParent();
                while (parent != null && !(parent instanceof ScrollView)) {
                    parent = parent.getParent();
                }
                if (parent == null) {
                    z10 = false;
                }
                jSONObject.put("contained_in_scroll_view", z10);
            } else {
                p pVar2 = l.B.f13186c;
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                if (parent2 == null) {
                    i10 = -1;
                } else {
                    i10 = ((AdapterView) parent2).getPositionForView(view);
                }
                if (i10 == -1) {
                    z10 = false;
                }
                jSONObject.put("contained_in_scroll_view", z10);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static int[] m(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static WindowManager.LayoutParams n() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) ti0.f16763j.f16769f.a(t.f16619m4)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }
}
