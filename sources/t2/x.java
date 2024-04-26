package t2;

import com.adcolony.sdk.h;

public class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f25593a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f25594b;

    public x(h hVar, boolean z10) {
        this.f25594b = hVar;
        this.f25593a = z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x0174  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r0 = r18
            com.adcolony.sdk.h r1 = r0.f25594b
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            com.adcolony.sdk.o r2 = com.adcolony.sdk.f.d()
            com.adcolony.sdk.i r2 = r2.g()
            java.util.HashMap<java.lang.String, com.adcolony.sdk.b> r2 = r2.f4528d
            com.adcolony.sdk.h r3 = r0.f25594b
            java.lang.String r3 = r3.f4514t
            java.lang.Object r2 = r2.get(r3)
            com.adcolony.sdk.b r2 = (com.adcolony.sdk.b) r2
            if (r2 != 0) goto L_0x0022
            r3 = 0
            goto L_0x0026
        L_0x0022:
            com.adcolony.sdk.q0 r3 = r2.getWebView()
        L_0x0026:
            android.content.Context r4 = com.adcolony.sdk.f.f4478a
            boolean r5 = r0.f25593a
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0030
            r2 = 1
            goto L_0x0031
        L_0x0030:
            r2 = 0
        L_0x0031:
            r8 = 0
            if (r1 == 0) goto L_0x017c
            if (r4 != 0) goto L_0x0038
            goto L_0x017c
        L_0x0038:
            int r9 = r1.getVisibility()
            if (r9 != 0) goto L_0x017c
            float r9 = t2.u1.c(r1)
            int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r9 != 0) goto L_0x0048
            goto L_0x017c
        L_0x0048:
            boolean r9 = r4 instanceof android.app.Activity
            if (r9 == 0) goto L_0x0059
            r9 = r4
            android.app.Activity r9 = (android.app.Activity) r9
            boolean r9 = r9.hasWindowFocus()
            if (r9 != 0) goto L_0x0059
            if (r2 != 0) goto L_0x0059
            goto L_0x017c
        L_0x0059:
            int r2 = r1.getHeight()
            r10 = 2
            if (r2 <= 0) goto L_0x00f4
            int r2 = r1.getWidth()
            if (r2 <= 0) goto L_0x00f4
            int r2 = r1.getHeight()
            int r11 = r1.getWidth()
            int r11 = r11 * r2
            float r2 = (float) r11
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            boolean r12 = r1.getGlobalVisibleRect(r11)
            int[] r13 = new int[r10]
            r13 = {-1, -1} // fill-array
            r1.getLocationInWindow(r13)
            int[] r14 = new int[r10]
            r14 = {-1, -1} // fill-array
            r15 = r13[r7]
            int r16 = r1.getWidth()
            int r16 = r16 + r15
            r14[r7] = r16
            r15 = r13[r6]
            int r16 = r1.getHeight()
            int r16 = r16 + r15
            r14[r6] = r16
            int r15 = t2.u1.b(r4)
            int r9 = t2.u1.d(r4)
            r17 = r14[r7]
            if (r17 < 0) goto L_0x017c
            r14 = r14[r6]
            if (r14 < 0) goto L_0x017c
            r14 = r13[r7]
            if (r14 > r9) goto L_0x017c
            r9 = r13[r6]
            if (r9 > r15) goto L_0x017c
            int r9 = r11.top
            if (r9 != 0) goto L_0x00be
            r9 = r13[r6]
            int r15 = r15 / r10
            if (r9 <= r15) goto L_0x00be
            goto L_0x017c
        L_0x00be:
            if (r12 == 0) goto L_0x017c
            int r9 = r11.height()
            int r10 = r11.width()
            int r10 = r10 * r9
            float r9 = (float) r10
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x017c
            if (r5 == 0) goto L_0x00e0
            float r1 = t2.u1.a(r1, r11, r9, r7)     // Catch:{ Exception -> 0x00df }
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x00e0
            int r5 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x00e0
            float r9 = r9 - r1
            goto L_0x00e0
        L_0x00df:
        L_0x00e0:
            float r9 = r9 / r2
            r1 = 1120403456(0x42c80000, float:100.0)
            float r9 = r9 * r1
            int r2 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x00eb
            goto L_0x017c
        L_0x00eb:
            int r2 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f1
            goto L_0x0178
        L_0x00f1:
            r8 = r9
            goto L_0x017c
        L_0x00f4:
            int r2 = r1.getWidth()
            if (r2 <= 0) goto L_0x017c
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            int r2 = r2.height
            r9 = -2
            if (r2 != r9) goto L_0x017c
            int[] r2 = new int[r10]
            r2 = {-1, -1} // fill-array
            r1.getLocationInWindow(r2)
            int[] r9 = new int[r10]
            r9 = {-1, -1} // fill-array
            r11 = r2[r7]
            int r12 = r1.getWidth()
            int r12 = r12 + r11
            r9[r7] = r12
            r11 = r2[r6]
            int r11 = r11 + r6
            r9[r6] = r11
            android.graphics.Rect r11 = new android.graphics.Rect
            r12 = r2[r7]
            r13 = r2[r6]
            r14 = r9[r7]
            r15 = r9[r6]
            r11.<init>(r12, r13, r14, r15)
            int r12 = t2.u1.b(r4)
            int r13 = t2.u1.d(r4)
            r14 = r9[r7]
            if (r14 < 0) goto L_0x017c
            r9 = r9[r6]
            if (r9 < 0) goto L_0x017c
            r9 = r2[r7]
            if (r9 > r13) goto L_0x017c
            r9 = r2[r6]
            if (r9 > r12) goto L_0x017c
            int r9 = r11.top
            if (r9 != 0) goto L_0x014d
            r2 = r2[r6]
            int r12 = r12 / r10
            if (r2 <= r12) goto L_0x014d
            goto L_0x017c
        L_0x014d:
            int r2 = r11.height()
            int r9 = r11.width()
            int r9 = r9 * r2
            float r2 = (float) r9
            if (r5 == 0) goto L_0x0169
            float r1 = t2.u1.a(r1, r11, r2, r6)     // Catch:{ Exception -> 0x0169 }
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0169
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 > 0) goto L_0x0169
            float r1 = r2 - r1
            goto L_0x016a
        L_0x0169:
            r1 = r2
        L_0x016a:
            float r1 = r1 / r2
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r2
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0174
            goto L_0x017c
        L_0x0174:
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x017b
        L_0x0178:
            r8 = 1120403456(0x42c80000, float:100.0)
            goto L_0x017c
        L_0x017b:
            r8 = r1
        L_0x017c:
            if (r4 != 0) goto L_0x0181
            r1 = 0
            goto L_0x0189
        L_0x0181:
            android.media.AudioManager r1 = com.adcolony.sdk.j0.c(r4)
            double r1 = com.adcolony.sdk.j0.a(r1)
        L_0x0189:
            int r4 = com.adcolony.sdk.j0.b(r3)
            int r5 = com.adcolony.sdk.j0.j(r3)
            com.adcolony.sdk.h r9 = r0.f25594b
            int r10 = r9.f4519y
            if (r4 != r10) goto L_0x019d
            int r10 = r9.f4520z
            if (r5 == r10) goto L_0x019c
            goto L_0x019d
        L_0x019c:
            r6 = 0
        L_0x019d:
            java.lang.String r7 = "ad_session_id"
            if (r6 == 0) goto L_0x01f7
            r9.f4519y = r4
            r9.f4520z = r5
            r9.getClass()
            com.adcolony.sdk.o r10 = com.adcolony.sdk.f.d()
            com.adcolony.sdk.w r10 = r10.i()
            float r10 = r10.f()
            if (r3 == 0) goto L_0x01f7
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            java.lang.String r12 = com.adcolony.sdk.j0.t()
            int r12 = com.adcolony.sdk.j0.q(r12)
            java.lang.String r13 = "app_orientation"
            com.adcolony.sdk.r0.j(r11, r13, r12)
            int r12 = r3.f4734y
            float r12 = (float) r12
            float r12 = r12 / r10
            int r12 = (int) r12
            java.lang.String r13 = "width"
            com.adcolony.sdk.r0.j(r11, r13, r12)
            int r3 = r3.A
            float r3 = (float) r3
            float r3 = r3 / r10
            int r3 = (int) r3
            java.lang.String r10 = "height"
            com.adcolony.sdk.r0.j(r11, r10, r3)
            java.lang.String r3 = "x"
            com.adcolony.sdk.r0.j(r11, r3, r4)
            java.lang.String r3 = "y"
            com.adcolony.sdk.r0.j(r11, r3, r5)
            java.lang.String r3 = r9.f4514t
            com.adcolony.sdk.r0.e(r11, r7, r3)
            com.adcolony.sdk.g r3 = new com.adcolony.sdk.g
            int r4 = r9.f4513s
            java.lang.String r5 = "MRAID.on_size_change"
            r3.<init>(r5, r4, r11)
            r3.b()
        L_0x01f7:
            com.adcolony.sdk.h r3 = r0.f25594b
            float r4 = r3.f4517w
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0207
            double r4 = r3.f4518x
            int r9 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r9 != 0) goto L_0x0207
            if (r6 == 0) goto L_0x0232
        L_0x0207:
            r3.getClass()
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            int r5 = r3.f4512r
            java.lang.String r6 = "id"
            com.adcolony.sdk.r0.j(r4, r6, r5)
            java.lang.String r5 = r3.f4514t
            com.adcolony.sdk.r0.e(r4, r7, r5)
            double r5 = (double) r8
            java.lang.String r7 = "exposure"
            com.adcolony.sdk.r0.d(r4, r7, r5)
            java.lang.String r5 = "volume"
            com.adcolony.sdk.r0.d(r4, r5, r1)
            com.adcolony.sdk.g r5 = new com.adcolony.sdk.g
            int r3 = r3.f4513s
            java.lang.String r6 = "AdContainer.on_exposure_change"
            r5.<init>(r6, r3, r4)
            r5.b()
        L_0x0232:
            com.adcolony.sdk.h r3 = r0.f25594b
            r3.f4517w = r8
            r3.f4518x = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.x.run():void");
    }
}
