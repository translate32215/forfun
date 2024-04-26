package com.adcolony.sdk;

public class l0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k0 f4607a;

    public l0(k0 k0Var) {
        this.f4607a = k0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f8, code lost:
        if (r0.B == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01fa, code lost:
        r0.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            com.adcolony.sdk.k0 r0 = r13.f4607a
            r1 = 0
            r0.f4596z = r1
        L_0x0006:
            com.adcolony.sdk.k0 r0 = r13.f4607a
            boolean r3 = r0.A
            if (r3 != 0) goto L_0x01f4
            boolean r0 = r0.D
            if (r0 != 0) goto L_0x01f4
            boolean r0 = com.adcolony.sdk.f.e()
            if (r0 == 0) goto L_0x01f4
            android.content.Context r0 = com.adcolony.sdk.f.f4478a
            com.adcolony.sdk.k0 r3 = r13.f4607a
            boolean r4 = r3.A
            if (r4 != 0) goto L_0x01f3
            boolean r4 = r3.F
            if (r4 != 0) goto L_0x01f3
            if (r0 == 0) goto L_0x01f3
            boolean r4 = r0 instanceof android.app.Activity
            if (r4 != 0) goto L_0x002a
            goto L_0x01f3
        L_0x002a:
            android.media.MediaPlayer r3 = r3.S
            boolean r3 = r3.isPlaying()
            r4 = 0
            if (r3 == 0) goto L_0x016b
            com.adcolony.sdk.k0 r3 = r13.f4607a
            long r5 = r3.f4596z
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x0045
            boolean r5 = com.adcolony.sdk.f.f4481d
            if (r5 == 0) goto L_0x0045
            long r5 = java.lang.System.currentTimeMillis()
            r3.f4596z = r5
        L_0x0045:
            com.adcolony.sdk.k0 r3 = r13.f4607a
            r5 = 1
            r3.C = r5
            android.media.MediaPlayer r6 = r3.S
            int r6 = r6.getCurrentPosition()
            double r6 = (double) r6
            r8 = 4652007308841189376(0x408f400000000000, double:1000.0)
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r6)
            double r6 = r6 / r8
            r3.f4594x = r6
            com.adcolony.sdk.k0 r3 = r13.f4607a
            android.media.MediaPlayer r6 = r3.S
            int r6 = r6.getDuration()
            double r6 = (double) r6
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r6)
            double r6 = r6 / r8
            r3.f4595y = r6
            long r6 = java.lang.System.currentTimeMillis()
            com.adcolony.sdk.k0 r3 = r13.f4607a
            long r8 = r3.f4596z
            long r6 = r6 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x009d
            boolean r6 = r3.I
            if (r6 != 0) goto L_0x009d
            boolean r6 = com.adcolony.sdk.f.f4481d
            if (r6 == 0) goto L_0x009d
            double r6 = r3.f4594x
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x009b
            java.lang.String r3 = "getCurrentPosition() not working, firing AdSession.on_error"
            p.f.a(r4, r4, r3, r5)
            com.adcolony.sdk.k0 r3 = r13.f4607a
            r3.b()
            goto L_0x009d
        L_0x009b:
            r3.I = r5
        L_0x009d:
            com.adcolony.sdk.k0 r3 = r13.f4607a
            boolean r6 = r3.H
            if (r6 == 0) goto L_0x016b
            boolean r6 = r3.f4584f
            r7 = 1077936128(0x40400000, float:3.0)
            r8 = 1073741824(0x40000000, float:2.0)
            if (r6 == 0) goto L_0x0136
            double r9 = r3.f4595y
            r11 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r11 = r11 / r9
            float r6 = (float) r11
            r3.f4580c = r6
            android.graphics.Paint r6 = r3.f4586h
            r9 = -3355444(0xffffffffffcccccc, float:NaN)
            r6.setColor(r9)
            android.graphics.Paint r6 = r3.f4586h
            float r10 = r3.f4582d
            float r10 = r10 * r8
            int r10 = (int) r10
            float r10 = (float) r10
            r11 = 0
            r12 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.setShadowLayer(r10, r11, r11, r12)
            android.graphics.Paint r6 = r3.f4586h
            android.graphics.Paint$Align r10 = android.graphics.Paint.Align.CENTER
            r6.setTextAlign(r10)
            android.graphics.Paint r6 = r3.f4586h
            r6.setLinearText(r5)
            android.graphics.Paint r5 = r3.f4586h
            float r6 = r3.f4582d
            r10 = 1094713344(0x41400000, float:12.0)
            float r6 = r6 * r10
            r5.setTextSize(r6)
            android.graphics.Paint r5 = r3.f4585g
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r6)
            float r5 = r3.f4582d
            float r5 = r5 * r8
            r6 = 1086324736(0x40c00000, float:6.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00f6
            r5 = 1086324736(0x40c00000, float:6.0)
        L_0x00f6:
            r6 = 1082130432(0x40800000, float:4.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x00fe
            r5 = 1082130432(0x40800000, float:4.0)
        L_0x00fe:
            android.graphics.Paint r6 = r3.f4585g
            r6.setStrokeWidth(r5)
            android.graphics.Paint r5 = r3.f4585g
            float r6 = r3.f4582d
            float r6 = r6 * r7
            int r6 = (int) r6
            float r6 = (float) r6
            r5.setShadowLayer(r6, r11, r11, r12)
            android.graphics.Paint r5 = r3.f4585g
            r5.setColor(r9)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            android.graphics.Paint r6 = r3.f4586h
            r9 = 9
            java.lang.String r10 = "0123456789"
            r6.getTextBounds(r10, r4, r9, r5)
            int r5 = r5.height()
            float r5 = (float) r5
            r3.f4576a = r5
            android.content.Context r5 = com.adcolony.sdk.f.f4478a
            if (r5 == 0) goto L_0x0134
            com.adcolony.sdk.m0 r6 = new com.adcolony.sdk.m0
            r6.<init>(r3, r5)
            com.adcolony.sdk.j0.h(r6)
        L_0x0134:
            r3.f4584f = r4
        L_0x0136:
            double r5 = r3.f4595y
            double r9 = r3.f4594x
            double r5 = r5 - r9
            int r5 = (int) r5
            r3.f4583e = r5
            float r5 = r3.f4576a
            int r6 = (int) r5
            float r6 = (float) r6
            float r7 = r7 * r5
            int r7 = (int) r7
            float r7 = (float) r7
            android.graphics.RectF r9 = r3.P
            float r10 = r5 / r8
            float r11 = r6 - r10
            float r5 = r5 * r8
            float r8 = r7 - r5
            float r6 = r6 + r5
            float r7 = r7 + r10
            r9.set(r11, r8, r6, r7)
            float r5 = r3.f4580c
            double r5 = (double) r5
            double r7 = r3.f4595y
            double r9 = r3.f4594x
            double r7 = r7 - r9
            java.lang.Double.isNaN(r5)
            java.lang.Double.isNaN(r5)
            java.lang.Double.isNaN(r5)
            double r7 = r7 * r5
            float r5 = (float) r7
            r3.f4578b = r5
        L_0x016b:
            com.adcolony.sdk.k0 r3 = r13.f4607a
            boolean r5 = r3.C
            if (r5 == 0) goto L_0x01c2
            boolean r5 = r3.A
            if (r5 != 0) goto L_0x01c2
            boolean r5 = r3.D
            if (r5 != 0) goto L_0x01c2
            org.json.JSONObject r5 = r3.f4577a0
            int r3 = r3.f4591u
            java.lang.String r6 = "id"
            com.adcolony.sdk.r0.j(r5, r6, r3)
            com.adcolony.sdk.k0 r3 = r13.f4607a
            org.json.JSONObject r5 = r3.f4577a0
            com.adcolony.sdk.h r3 = r3.N
            int r3 = r3.f4512r
            java.lang.String r6 = "container_id"
            com.adcolony.sdk.r0.j(r5, r6, r3)
            com.adcolony.sdk.k0 r3 = r13.f4607a
            org.json.JSONObject r5 = r3.f4577a0
            java.lang.String r3 = r3.L
            java.lang.String r6 = "ad_session_id"
            com.adcolony.sdk.r0.e(r5, r6, r3)
            com.adcolony.sdk.k0 r3 = r13.f4607a
            org.json.JSONObject r5 = r3.f4577a0
            double r6 = r3.f4594x
            java.lang.String r3 = "elapsed"
            com.adcolony.sdk.r0.d(r5, r3, r6)
            com.adcolony.sdk.k0 r3 = r13.f4607a
            org.json.JSONObject r5 = r3.f4577a0
            double r6 = r3.f4595y
            java.lang.String r3 = "duration"
            com.adcolony.sdk.r0.d(r5, r3, r6)
            com.adcolony.sdk.g r3 = new com.adcolony.sdk.g
            com.adcolony.sdk.k0 r5 = r13.f4607a
            com.adcolony.sdk.h r6 = r5.N
            int r6 = r6.f4513s
            org.json.JSONObject r5 = r5.f4577a0
            java.lang.String r7 = "VideoView.on_progress"
            r3.<init>(r7, r6, r5)
            r3.b()
        L_0x01c2:
            com.adcolony.sdk.k0 r3 = r13.f4607a
            boolean r3 = r3.B
            if (r3 != 0) goto L_0x01ec
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L_0x01d1
            goto L_0x01ec
        L_0x01d1:
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch:{ InterruptedException -> 0x01d8 }
            goto L_0x0006
        L_0x01d8:
            com.adcolony.sdk.k0 r0 = r13.f4607a
            r0.b()
            com.adcolony.sdk.o r0 = com.adcolony.sdk.f.d()
            t2.m r0 = r0.l()
            java.lang.String r3 = "InterruptedException in ADCVideoView's update thread."
            r0.e(r4, r4, r3, r4)
            goto L_0x0006
        L_0x01ec:
            com.adcolony.sdk.k0 r0 = r13.f4607a
            r0.B = r4
            r0.e()
        L_0x01f3:
            return
        L_0x01f4:
            com.adcolony.sdk.k0 r0 = r13.f4607a
            boolean r1 = r0.B
            if (r1 == 0) goto L_0x01fd
            r0.e()
        L_0x01fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.l0.run():void");
    }
}
