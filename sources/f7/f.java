package f7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18263a;

    /* renamed from: b  reason: collision with root package name */
    public final g f18264b;

    public f(g gVar, int i10) {
        this.f18263a = i10;
        if (i10 != 1) {
            this.f18264b = gVar;
        } else {
            this.f18264b = gVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.f18263a
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x000f
        L_0x0006:
            f7.g r0 = r9.f18264b
            r1 = 4
            r0.f18274f = r1
            r0.a()
            return
        L_0x000f:
            f7.g r0 = r9.f18264b
            r0.getClass()
            d7.l r1 = d7.l.B
            com.google.android.gms.ads.internal.util.b r1 = r1.f13196m
            android.content.Context r2 = r0.f18269a
            java.lang.String r3 = r0.f18271c
            java.lang.String r4 = r0.f18272d
            java.lang.String r0 = r0.f18273e
            boolean r5 = r1.g()
            e8.l<java.lang.String> r6 = e8.t.f16647r2
            e8.ti0 r7 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r7 = r7.f16769f
            java.lang.Object r6 = r7.a(r6)
            java.lang.String r6 = (java.lang.String) r6
            android.net.Uri r6 = r1.d(r2, r6, r3, r4)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = com.google.android.gms.ads.internal.util.b.e(r2, r6, r4)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            r8 = 0
            if (r7 == 0) goto L_0x0049
            java.lang.String r6 = "Not linked for debug signals."
            l0.e.E(r6)
            goto L_0x006e
        L_0x0049:
            java.lang.String r6 = r6.trim()
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0068 }
            r7.<init>(r6)     // Catch:{ JSONException -> 0x0068 }
            java.lang.String r6 = "debug_mode"
            java.lang.String r6 = r7.optString(r6)     // Catch:{ JSONException -> 0x0068 }
            java.lang.String r7 = "1"
            boolean r6 = r7.equals(r6)
            java.lang.Object r7 = r1.f5656a
            monitor-enter(r7)
            r1.f5659d = r6     // Catch:{ all -> 0x0065 }
            monitor-exit(r7)     // Catch:{ all -> 0x0065 }
            goto L_0x006f
        L_0x0065:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0065 }
            throw r0
        L_0x0068:
            r6 = move-exception
            java.lang.String r7 = "Fail to get debug mode response json."
            l0.e.D(r7, r6)
        L_0x006e:
            r6 = 0
        L_0x006f:
            if (r6 == 0) goto L_0x0088
            if (r5 != 0) goto L_0x007c
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x007c
            r1.c(r2, r4, r0, r3)
        L_0x007c:
            java.lang.String r0 = "Device is linked for debug signals."
            l0.e.E(r0)
            java.lang.String r0 = "The device is successfully linked for troubleshooting."
            r3 = 1
            r1.a(r2, r0, r8, r3)
            goto L_0x008b
        L_0x0088:
            r1.f(r2, r3, r4)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.f.run():void");
    }
}
