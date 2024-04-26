package ad;

import t2.i;

/* compiled from: AdUtil.kt */
public final class b extends i {
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.adcolony.sdk.d r8) {
        /*
            r7 = this;
            java.lang.String r0 = "ad"
            ud.k.f(r8, r0)
            boolean r0 = com.adcolony.sdk.f.f()
            if (r0 != 0) goto L_0x000d
            goto L_0x00bc
        L_0x000d:
            com.adcolony.sdk.o r0 = com.adcolony.sdk.f.d()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = r8.f4468g
            java.lang.String r3 = "zone_id"
            com.adcolony.sdk.r0.e(r1, r3, r2)
            java.lang.String r2 = "type"
            r3 = 0
            com.adcolony.sdk.r0.j(r1, r2, r3)
            java.lang.String r2 = r8.f4466e
            java.lang.String r4 = "id"
            com.adcolony.sdk.r0.e(r1, r4, r2)
            boolean r2 = r8.f4471j
            java.lang.String r4 = "request_fail_reason"
            r5 = 1
            if (r2 == 0) goto L_0x0044
            r2 = 24
            com.adcolony.sdk.r0.j(r1, r4, r2)
            com.adcolony.sdk.o r2 = com.adcolony.sdk.f.d()
            t2.m r2 = r2.l()
            java.lang.String r4 = "This ad object has already been shown. Please request a new ad via AdColony.requestInterstitial."
            r2.e(r3, r5, r4, r3)
            goto L_0x009d
        L_0x0044:
            boolean r2 = r8.f4470i
            if (r2 == 0) goto L_0x005b
            r2 = 17
            com.adcolony.sdk.r0.j(r1, r4, r2)
            com.adcolony.sdk.o r2 = com.adcolony.sdk.f.d()
            t2.m r2 = r2.l()
            java.lang.String r4 = "This ad object has expired. Please request a new ad via AdColony.requestInterstitial."
            r2.e(r3, r5, r4, r3)
            goto L_0x009d
        L_0x005b:
            boolean r2 = r0.f4682z
            if (r2 == 0) goto L_0x0072
            r2 = 23
            com.adcolony.sdk.r0.j(r1, r4, r2)
            com.adcolony.sdk.o r2 = com.adcolony.sdk.f.d()
            t2.m r2 = r2.l()
            java.lang.String r4 = "Can not show ad while an interstitial is already active."
            r2.e(r3, r5, r4, r3)
            goto L_0x009d
        L_0x0072:
            java.util.HashMap<java.lang.String, com.adcolony.sdk.e> r2 = r0.f4675s
            java.lang.String r6 = r8.f4468g
            java.lang.Object r2 = r2.get(r6)
            com.adcolony.sdk.e r2 = (com.adcolony.sdk.e) r2
            if (r2 == 0) goto L_0x0095
            int r6 = r2.a()
            if (r6 > r5) goto L_0x0085
            goto L_0x0090
        L_0x0085:
            int r6 = r2.f4475c
            if (r6 != 0) goto L_0x0092
            int r6 = r2.a()
            int r6 = r6 - r5
            r2.f4475c = r6
        L_0x0090:
            r2 = 0
            goto L_0x0096
        L_0x0092:
            int r6 = r6 - r5
            r2.f4475c = r6
        L_0x0095:
            r2 = 1
        L_0x0096:
            if (r2 == 0) goto L_0x009d
            r2 = 11
            com.adcolony.sdk.r0.j(r1, r4, r2)
        L_0x009d:
            java.util.HashMap<java.lang.String, com.adcolony.sdk.e> r0 = r0.f4675s
            java.lang.String r8 = r8.f4468g
            java.lang.Object r8 = r0.get(r8)
            com.adcolony.sdk.e r8 = (com.adcolony.sdk.e) r8
            if (r8 == 0) goto L_0x00b2
            boolean r8 = r8.f4476d
            if (r8 == 0) goto L_0x00b2
            java.lang.String r8 = "Rewarded ad: show() called with no reward listener set."
            p.f.a(r3, r5, r8, r3)
        L_0x00b2:
            com.adcolony.sdk.g r8 = new com.adcolony.sdk.g
            java.lang.String r0 = "AdSession.launch_ad_unit"
            r8.<init>(r0, r5, r1)
            r8.b()
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.b.a(com.adcolony.sdk.d):void");
    }
}
