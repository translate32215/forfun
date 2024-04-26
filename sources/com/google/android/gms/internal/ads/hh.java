package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import e8.c40;
import e8.t;
import e8.ti0;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class hh implements c40 {
    public static volatile fr B;
    public DisplayMetrics A;

    /* renamed from: a  reason: collision with root package name */
    public MotionEvent f6865a;

    /* renamed from: b  reason: collision with root package name */
    public LinkedList<MotionEvent> f6866b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    public long f6867c = 0;

    /* renamed from: d  reason: collision with root package name */
    public long f6868d = 0;

    /* renamed from: e  reason: collision with root package name */
    public long f6869e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f6870f = 0;

    /* renamed from: g  reason: collision with root package name */
    public long f6871g = 0;

    /* renamed from: h  reason: collision with root package name */
    public long f6872h = 0;

    /* renamed from: i  reason: collision with root package name */
    public long f6873i = 0;

    /* renamed from: r  reason: collision with root package name */
    public double f6874r;

    /* renamed from: s  reason: collision with root package name */
    public double f6875s;

    /* renamed from: t  reason: collision with root package name */
    public double f6876t;

    /* renamed from: u  reason: collision with root package name */
    public float f6877u;

    /* renamed from: v  reason: collision with root package name */
    public float f6878v;

    /* renamed from: w  reason: collision with root package name */
    public float f6879w;

    /* renamed from: x  reason: collision with root package name */
    public float f6880x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f6881y = false;

    /* renamed from: z  reason: collision with root package name */
    public boolean f6882z = false;

    public hh(Context context) {
        try {
            if (((Boolean) ti0.f16763j.f16769f.a(t.f16664u1)).booleanValue()) {
                cd.c();
            } else {
                hr.a(B);
            }
            this.A = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    public final String e(Context context, String str, View view) {
        return g(context, str, view, (Activity) null);
    }

    public abstract String g(Context context, String str, View view, Activity activity);

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0123 A[SYNTHETIC, Splitter:B:66:0x0123] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String h(android.content.Context r24, java.lang.String r25, int r26, android.view.View r27, android.app.Activity r28) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r26
            long r3 = java.lang.System.currentTimeMillis()
            e8.l<java.lang.Boolean> r5 = e8.t.f16610l1
            e8.ti0 r6 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r6 = r6.f16769f
            java.lang.Object r5 = r6.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r6 = 0
            if (r5 == 0) goto L_0x003f
            com.google.android.gms.internal.ads.fr r7 = B
            if (r7 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.fr r7 = B
            com.google.android.gms.internal.ads.pf r7 = r7.f6490l
            goto L_0x0027
        L_0x0026:
            r7 = r6
        L_0x0027:
            e8.l<java.lang.Boolean> r8 = e8.t.f16664u1
            e8.ti0 r9 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r9 = r9.f16769f
            java.lang.Object r8 = r9.a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x003c
            java.lang.String r8 = "be"
            goto L_0x0041
        L_0x003c:
            java.lang.String r8 = "te"
            goto L_0x0041
        L_0x003f:
            r7 = r6
            r8 = r7
        L_0x0041:
            r16 = -1
            r15 = 3
            r14 = 2
            r12 = 1
            if (r2 != r15) goto L_0x007c
            r9 = r1
            com.google.android.gms.internal.ads.yg r9 = (com.google.android.gms.internal.ads.yg) r9     // Catch:{ Exception -> 0x007a }
            com.google.android.gms.internal.ads.ma$a r10 = com.google.android.gms.internal.ads.ma.V()     // Catch:{ Exception -> 0x007a }
            java.lang.String r11 = r9.D     // Catch:{ Exception -> 0x007a }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x007a }
            if (r11 != 0) goto L_0x005c
            java.lang.String r11 = r9.D     // Catch:{ Exception -> 0x007a }
            r10.r(r11)     // Catch:{ Exception -> 0x007a }
        L_0x005c:
            boolean r11 = r9.C     // Catch:{ Exception -> 0x007a }
            com.google.android.gms.internal.ads.fr r18 = com.google.android.gms.internal.ads.yg.o(r0, r11)     // Catch:{ Exception -> 0x007a }
            r22 = 1
            r17 = r9
            r19 = r10
            r20 = r27
            r21 = r28
            r17.m(r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x007a }
            r1.f6881y = r12     // Catch:{ Exception -> 0x0077 }
            r0 = 1002(0x3ea, float:1.404E-42)
            r6 = r10
            r10 = 1002(0x3ea, float:1.404E-42)
            goto L_0x00d0
        L_0x0077:
            r0 = move-exception
            r6 = r10
            goto L_0x00a3
        L_0x007a:
            r0 = move-exception
            goto L_0x00a3
        L_0x007c:
            if (r2 != r14) goto L_0x00a6
            r9 = r1
            com.google.android.gms.internal.ads.yg r9 = (com.google.android.gms.internal.ads.yg) r9     // Catch:{ Exception -> 0x007a }
            com.google.android.gms.internal.ads.ma$a r10 = com.google.android.gms.internal.ads.ma.V()     // Catch:{ Exception -> 0x007a }
            java.lang.String r11 = r9.D     // Catch:{ Exception -> 0x007a }
            r10.r(r11)     // Catch:{ Exception -> 0x007a }
            boolean r11 = r9.C     // Catch:{ Exception -> 0x007a }
            com.google.android.gms.internal.ads.fr r18 = com.google.android.gms.internal.ads.yg.o(r0, r11)     // Catch:{ Exception -> 0x007a }
            r22 = 0
            r17 = r9
            r19 = r10
            r20 = r27
            r21 = r28
            r17.m(r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x007a }
            r0 = 1008(0x3f0, float:1.413E-42)
            r6 = r10
            r10 = 1008(0x3f0, float:1.413E-42)
            goto L_0x00d0
        L_0x00a3:
            r15 = r0
            r1 = 3
            goto L_0x00ee
        L_0x00a6:
            r9 = r1
            com.google.android.gms.internal.ads.yg r9 = (com.google.android.gms.internal.ads.yg) r9     // Catch:{ Exception -> 0x00e8 }
            com.google.android.gms.internal.ads.ma$a r10 = com.google.android.gms.internal.ads.ma.V()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r11 = r9.D     // Catch:{ Exception -> 0x00e8 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x00e8 }
            if (r11 != 0) goto L_0x00ba
            java.lang.String r11 = r9.D     // Catch:{ Exception -> 0x00e8 }
            r10.r(r11)     // Catch:{ Exception -> 0x00e8 }
        L_0x00ba:
            boolean r11 = r9.C     // Catch:{ Exception -> 0x00e8 }
            com.google.android.gms.internal.ads.fr r11 = com.google.android.gms.internal.ads.yg.o(r0, r11)     // Catch:{ Exception -> 0x00e8 }
            java.util.concurrent.ExecutorService r13 = r11.f6480b     // Catch:{ Exception -> 0x00e8 }
            if (r13 == 0) goto L_0x00cb
            java.util.List r0 = r9.l(r11, r0, r10, r6)     // Catch:{ Exception -> 0x00e8 }
            com.google.android.gms.internal.ads.yg.n(r0)     // Catch:{ Exception -> 0x00e8 }
        L_0x00cb:
            r0 = 1000(0x3e8, float:1.401E-42)
            r6 = r10
            r10 = 1000(0x3e8, float:1.401E-42)
        L_0x00d0:
            if (r5 == 0) goto L_0x00eb
            if (r7 == 0) goto L_0x00eb
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00e8 }
            long r17 = r17 - r3
            r11 = -1
            r0 = 0
            r9 = r7
            r12 = r17
            r14 = r8
            r1 = 3
            r15 = r0
            r9.a(r10, r11, r12, r14, r15)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x011c
        L_0x00e6:
            r0 = move-exception
            goto L_0x00ed
        L_0x00e8:
            r0 = move-exception
            r1 = 3
            goto L_0x00ed
        L_0x00eb:
            r1 = 3
            goto L_0x011c
        L_0x00ed:
            r15 = r0
        L_0x00ee:
            if (r5 == 0) goto L_0x011c
            if (r7 == 0) goto L_0x011c
            if (r2 != r1) goto L_0x00fb
            r0 = 1003(0x3eb, float:1.406E-42)
            r10 = 1003(0x3eb, float:1.406E-42)
            r12 = 1
            r14 = 2
            goto L_0x010d
        L_0x00fb:
            r14 = 2
            if (r2 != r14) goto L_0x0104
            r0 = 1009(0x3f1, float:1.414E-42)
            r10 = 1009(0x3f1, float:1.414E-42)
            r12 = 1
            goto L_0x010d
        L_0x0104:
            r12 = 1
            if (r2 != r12) goto L_0x010c
            r0 = 1001(0x3e9, float:1.403E-42)
            r10 = 1001(0x3e9, float:1.403E-42)
            goto L_0x010d
        L_0x010c:
            r10 = -1
        L_0x010d:
            r11 = -1
            long r17 = java.lang.System.currentTimeMillis()
            long r3 = r17 - r3
            r9 = r7
            r12 = r3
            r3 = 2
            r14 = r8
            r9.a(r10, r11, r12, r14, r15)
            goto L_0x011d
        L_0x011c:
            r3 = 2
        L_0x011d:
            long r17 = java.lang.System.currentTimeMillis()
            if (r6 == 0) goto L_0x016f
            com.google.android.gms.internal.ads.cq r0 = r6.j()     // Catch:{ Exception -> 0x016c }
            com.google.android.gms.internal.ads.aq r0 = (com.google.android.gms.internal.ads.aq) r0     // Catch:{ Exception -> 0x016c }
            com.google.android.gms.internal.ads.ma r0 = (com.google.android.gms.internal.ads.ma) r0     // Catch:{ Exception -> 0x016c }
            int r0 = r0.c()     // Catch:{ Exception -> 0x016c }
            if (r0 != 0) goto L_0x0132
            goto L_0x016f
        L_0x0132:
            com.google.android.gms.internal.ads.cq r0 = r6.j()     // Catch:{ Exception -> 0x016c }
            com.google.android.gms.internal.ads.aq r0 = (com.google.android.gms.internal.ads.aq) r0     // Catch:{ Exception -> 0x016c }
            com.google.android.gms.internal.ads.ma r0 = (com.google.android.gms.internal.ads.ma) r0     // Catch:{ Exception -> 0x016c }
            r4 = r25
            java.lang.String r0 = com.google.android.gms.internal.ads.cd.d(r0, r4)     // Catch:{ Exception -> 0x016c }
            if (r5 == 0) goto L_0x01a3
            if (r7 == 0) goto L_0x01a3
            if (r2 != r1) goto L_0x014c
            r4 = 1006(0x3ee, float:1.41E-42)
            r4 = 1
            r10 = 1006(0x3ee, float:1.41E-42)
            goto L_0x015d
        L_0x014c:
            if (r2 != r3) goto L_0x0154
            r4 = 1010(0x3f2, float:1.415E-42)
            r4 = 1
            r10 = 1010(0x3f2, float:1.415E-42)
            goto L_0x015d
        L_0x0154:
            r4 = 1
            if (r2 != r4) goto L_0x015c
            r6 = 1004(0x3ec, float:1.407E-42)
            r10 = 1004(0x3ec, float:1.407E-42)
            goto L_0x015d
        L_0x015c:
            r10 = -1
        L_0x015d:
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0176 }
            long r13 = r11 - r17
            r11 = -1
            r15 = 0
            r9 = r7
            r12 = r13
            r14 = r8
            r9.a(r10, r11, r12, r14, r15)     // Catch:{ Exception -> 0x0176 }
            goto L_0x01a3
        L_0x016c:
            r0 = move-exception
            r4 = 1
            goto L_0x0177
        L_0x016f:
            r4 = 1
            r0 = 5
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Exception -> 0x0176 }
            goto L_0x01a3
        L_0x0176:
            r0 = move-exception
        L_0x0177:
            r15 = r0
            r0 = 7
            java.lang.String r0 = java.lang.Integer.toString(r0)
            if (r5 == 0) goto L_0x01a3
            if (r7 == 0) goto L_0x01a3
            if (r2 != r1) goto L_0x0188
            r1 = 1007(0x3ef, float:1.411E-42)
            r10 = 1007(0x3ef, float:1.411E-42)
            goto L_0x0197
        L_0x0188:
            if (r2 != r3) goto L_0x018f
            r1 = 1011(0x3f3, float:1.417E-42)
            r10 = 1011(0x3f3, float:1.417E-42)
            goto L_0x0197
        L_0x018f:
            if (r2 != r4) goto L_0x0196
            r1 = 1005(0x3ed, float:1.408E-42)
            r10 = 1005(0x3ed, float:1.408E-42)
            goto L_0x0197
        L_0x0196:
            r10 = -1
        L_0x0197:
            r11 = -1
            long r1 = java.lang.System.currentTimeMillis()
            long r12 = r1 - r17
            r9 = r7
            r14 = r8
            r9.a(r10, r11, r12, r14, r15)
        L_0x01a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hh.h(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity):java.lang.String");
    }

    public final void i() {
        this.f6871g = 0;
        this.f6867c = 0;
        this.f6868d = 0;
        this.f6869e = 0;
        this.f6870f = 0;
        this.f6872h = 0;
        this.f6873i = 0;
        if (this.f6866b.size() > 0) {
            Iterator it = this.f6866b.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f6866b.clear();
        } else {
            MotionEvent motionEvent = this.f6865a;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f6865a = null;
    }
}
