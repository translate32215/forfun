package t2;

import com.adcolony.sdk.h;

public class t implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f25569a;

    public t(h hVar) {
        this.f25569a = hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: t2.d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: t2.d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: t2.e1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: t2.d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: t2.d1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.adcolony.sdk.g r15) {
        /*
            r14 = this;
            com.adcolony.sdk.h r0 = r14.f25569a
            boolean r0 = r0.b(r15)
            if (r0 == 0) goto L_0x02b1
            com.adcolony.sdk.h r0 = r14.f25569a
            r0.getClass()
            org.json.JSONObject r1 = r15.f4485b
            java.lang.String r2 = "id"
            int r7 = r1.optInt(r2)
            java.lang.String r2 = "editable"
            boolean r2 = r1.optBoolean(r2)
            if (r2 == 0) goto L_0x0248
            t2.e1 r1 = new t2.e1
            android.content.Context r2 = r0.G
            r1.<init>(r2, r15, r7, r0)
            com.adcolony.sdk.g r15 = r1.f25470x
            org.json.JSONObject r15 = r15.f4485b
            java.lang.String r2 = "ad_session_id"
            java.lang.String r2 = r15.optString(r2)
            r1.f25465s = r2
            java.lang.String r2 = "x"
            int r2 = r15.optInt(r2)
            r1.f25456b = r2
            java.lang.String r2 = "y"
            int r2 = r15.optInt(r2)
            r1.f25457c = r2
            java.lang.String r2 = "width"
            int r2 = r15.optInt(r2)
            r1.f25458d = r2
            java.lang.String r2 = "height"
            int r2 = r15.optInt(r2)
            r1.f25459e = r2
            java.lang.String r2 = "font_family"
            int r2 = r15.optInt(r2)
            r1.f25461g = r2
            java.lang.String r2 = "font_style"
            int r2 = r15.optInt(r2)
            r1.f25460f = r2
            java.lang.String r2 = "font_size"
            int r2 = r15.optInt(r2)
            r1.f25462h = r2
            java.lang.String r2 = "background_color"
            java.lang.String r2 = r15.optString(r2)
            r1.f25466t = r2
            java.lang.String r2 = "font_color"
            java.lang.String r2 = r15.optString(r2)
            r1.f25467u = r2
            java.lang.String r2 = "text"
            java.lang.String r2 = r15.optString(r2)
            r1.f25468v = r2
            java.lang.String r2 = "align_x"
            int r2 = r15.optInt(r2)
            r1.f25463i = r2
            java.lang.String r2 = "align_y"
            int r15 = r15.optInt(r2)
            r1.f25464r = r15
            r15 = 4
            r1.setVisibility(r15)
            android.widget.FrameLayout$LayoutParams r15 = new android.widget.FrameLayout$LayoutParams
            int r2 = r1.f25458d
            int r3 = r1.f25459e
            r15.<init>(r2, r3)
            int r2 = r1.f25456b
            int r3 = r1.f25457c
            r4 = 0
            r15.setMargins(r2, r3, r4, r4)
            r15.gravity = r4
            com.adcolony.sdk.h r2 = r1.f25469w
            r2.addView(r1, r15)
            int r15 = r1.f25461g
            r2 = 3
            r3 = 2
            r5 = 1
            if (r15 == 0) goto L_0x00cc
            if (r15 == r5) goto L_0x00c6
            if (r15 == r3) goto L_0x00c0
            if (r15 == r2) goto L_0x00ba
            goto L_0x00d1
        L_0x00ba:
            android.graphics.Typeface r15 = android.graphics.Typeface.MONOSPACE
            r1.setTypeface(r15)
            goto L_0x00d1
        L_0x00c0:
            android.graphics.Typeface r15 = android.graphics.Typeface.SANS_SERIF
            r1.setTypeface(r15)
            goto L_0x00d1
        L_0x00c6:
            android.graphics.Typeface r15 = android.graphics.Typeface.SERIF
            r1.setTypeface(r15)
            goto L_0x00d1
        L_0x00cc:
            android.graphics.Typeface r15 = android.graphics.Typeface.DEFAULT
            r1.setTypeface(r15)
        L_0x00d1:
            int r15 = r1.f25460f
            if (r15 == 0) goto L_0x00f4
            if (r15 == r5) goto L_0x00ec
            if (r15 == r3) goto L_0x00e4
            if (r15 == r2) goto L_0x00dc
            goto L_0x00fb
        L_0x00dc:
            android.graphics.Typeface r15 = r1.getTypeface()
            r1.setTypeface(r15, r2)
            goto L_0x00fb
        L_0x00e4:
            android.graphics.Typeface r15 = r1.getTypeface()
            r1.setTypeface(r15, r3)
            goto L_0x00fb
        L_0x00ec:
            android.graphics.Typeface r15 = r1.getTypeface()
            r1.setTypeface(r15, r5)
            goto L_0x00fb
        L_0x00f4:
            android.graphics.Typeface r15 = r1.getTypeface()
            r1.setTypeface(r15, r4)
        L_0x00fb:
            java.lang.String r15 = r1.f25468v
            r1.setText(r15)
            int r15 = r1.f25462h
            float r15 = (float) r15
            r1.setTextSize(r15)
            int r15 = r1.f25463i
            int r15 = r1.a(r5, r15)
            int r2 = r1.f25464r
            int r2 = r1.a(r4, r2)
            r15 = r15 | r2
            r1.setGravity(r15)
            java.lang.String r15 = r1.f25466t
            java.lang.String r2 = ""
            boolean r15 = r15.equals(r2)
            if (r15 != 0) goto L_0x0129
            java.lang.String r15 = r1.f25466t
            int r15 = com.adcolony.sdk.j0.v(r15)
            r1.setBackgroundColor(r15)
        L_0x0129:
            java.lang.String r15 = r1.f25467u
            boolean r15 = r15.equals(r2)
            if (r15 != 0) goto L_0x013a
            java.lang.String r15 = r1.f25467u
            int r15 = com.adcolony.sdk.j0.v(r15)
            r1.setTextColor(r15)
        L_0x013a:
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<t2.f0> r15 = r15.A
            t2.u0 r2 = new t2.u0
            r2.<init>(r1)
            java.lang.String r3 = "TextView.set_visible"
            com.adcolony.sdk.f.a(r3, r2)
            r15.add(r2)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<t2.f0> r15 = r15.A
            t2.v0 r2 = new t2.v0
            r2.<init>(r1)
            java.lang.String r4 = "TextView.set_bounds"
            com.adcolony.sdk.f.a(r4, r2)
            r15.add(r2)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<t2.f0> r15 = r15.A
            t2.w0 r2 = new t2.w0
            r2.<init>(r1)
            java.lang.String r5 = "TextView.set_font_color"
            com.adcolony.sdk.f.a(r5, r2)
            r15.add(r2)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<t2.f0> r15 = r15.A
            t2.x0 r2 = new t2.x0
            r2.<init>(r1)
            java.lang.String r6 = "TextView.set_background_color"
            com.adcolony.sdk.f.a(r6, r2)
            r15.add(r2)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<t2.f0> r15 = r15.A
            t2.y0 r2 = new t2.y0
            r2.<init>(r1)
            java.lang.String r8 = "TextView.set_typeface"
            com.adcolony.sdk.f.a(r8, r2)
            r15.add(r2)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<t2.f0> r15 = r15.A
            t2.z0 r2 = new t2.z0
            r2.<init>(r1)
            java.lang.String r9 = "TextView.set_font_size"
            com.adcolony.sdk.f.a(r9, r2)
            r15.add(r2)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<t2.f0> r15 = r15.A
            t2.a1 r2 = new t2.a1
            r2.<init>(r1)
            java.lang.String r10 = "TextView.set_font_style"
            com.adcolony.sdk.f.a(r10, r2)
            r15.add(r2)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<t2.f0> r15 = r15.A
            t2.b1 r2 = new t2.b1
            r2.<init>(r1)
            java.lang.String r11 = "TextView.get_text"
            com.adcolony.sdk.f.a(r11, r2)
            r15.add(r2)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<t2.f0> r15 = r15.A
            t2.c1 r2 = new t2.c1
            r2.<init>(r1)
            java.lang.String r12 = "TextView.set_text"
            com.adcolony.sdk.f.a(r12, r2)
            r15.add(r2)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<t2.f0> r15 = r15.A
            t2.t0 r2 = new t2.t0
            r2.<init>(r1)
            java.lang.String r13 = "TextView.align"
            com.adcolony.sdk.f.a(r13, r2)
            r15.add(r2)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<java.lang.String> r15 = r15.B
            r15.add(r3)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<java.lang.String> r15 = r15.B
            r15.add(r4)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<java.lang.String> r15 = r15.B
            r15.add(r5)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<java.lang.String> r15 = r15.B
            r15.add(r6)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<java.lang.String> r15 = r15.B
            r15.add(r8)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<java.lang.String> r15 = r15.B
            r15.add(r9)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<java.lang.String> r15 = r15.B
            r15.add(r10)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<java.lang.String> r15 = r15.B
            r15.add(r11)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<java.lang.String> r15 = r15.B
            r15.add(r12)
            com.adcolony.sdk.h r15 = r1.f25469w
            java.util.ArrayList<java.lang.String> r15 = r15.B
            r15.add(r13)
            java.util.HashMap<java.lang.Integer, t2.e1> r15 = r0.f4506d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r15.put(r2, r1)
            java.util.HashMap<java.lang.Integer, android.view.View> r15 = r0.f4509g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r15.put(r2, r1)
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r15 = r0.f4508f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r15.put(r2, r3)
            goto L_0x02a7
        L_0x0248:
            java.lang.String r2 = "button"
            boolean r1 = r1.optBoolean(r2)
            if (r1 != 0) goto L_0x0278
            t2.d1 r1 = new t2.d1
            android.content.Context r2 = r0.G
            r1.<init>(r2, r15, r7, r0)
            r1.b()
            java.util.HashMap<java.lang.Integer, t2.d1> r15 = r0.f4504b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r15.put(r2, r1)
            java.util.HashMap<java.lang.Integer, android.view.View> r15 = r0.f4509g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r15.put(r2, r1)
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r15 = r0.f4508f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r15.put(r2, r3)
            goto L_0x02a7
        L_0x0278:
            t2.d1 r8 = new t2.d1
            android.content.Context r2 = r0.G
            r3 = 16974145(0x1030141, float:2.40618E-38)
            r1 = r8
            r4 = r15
            r5 = r7
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r8.b()
            java.util.HashMap<java.lang.Integer, t2.d1> r15 = r0.f4504b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r15.put(r1, r8)
            java.util.HashMap<java.lang.Integer, android.view.View> r15 = r0.f4509g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r15.put(r1, r8)
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r15 = r0.f4508f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r15.put(r1, r2)
            r1 = r8
        L_0x02a7:
            mb.d r15 = mb.d.OTHER
            mb.a r0 = r0.F
            if (r0 == 0) goto L_0x02b1
            r2 = 0
            r0.a(r1, r15, r2)     // Catch:{ RuntimeException -> 0x02b1 }
        L_0x02b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.t.a(com.adcolony.sdk.g):void");
    }
}
