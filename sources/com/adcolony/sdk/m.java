package com.adcolony.sdk;

public class m {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a() {
        /*
            r11 = this;
            android.content.Context r0 = com.adcolony.sdk.f.f4478a
            r1 = 0
            java.lang.String r2 = "Exception occurred when retrieving activeNetworkInfo in "
            java.lang.String r3 = "ACCESS_NETWORK_STATE permission: "
            java.lang.String r4 = "SecurityException - please ensure you added the "
            java.lang.String r5 = "connectivity"
            r6 = 0
            r7 = 1
            if (r0 != 0) goto L_0x0010
            goto L_0x002d
        L_0x0010:
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ SecurityException -> 0x0050, Exception -> 0x002f }
            java.lang.Object r0 = r0.getSystemService(r5)     // Catch:{ SecurityException -> 0x0050, Exception -> 0x002f }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ SecurityException -> 0x0050, Exception -> 0x002f }
            if (r0 != 0) goto L_0x001e
            r0 = r1
            goto L_0x0022
        L_0x001e:
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0050, Exception -> 0x002f }
        L_0x0022:
            if (r0 != 0) goto L_0x0025
            goto L_0x002d
        L_0x0025:
            int r0 = r0.getType()     // Catch:{ SecurityException -> 0x0050, Exception -> 0x002f }
            if (r0 != r7) goto L_0x002d
            r0 = 1
            goto L_0x006f
        L_0x002d:
            r0 = 0
            goto L_0x006f
        L_0x002f:
            r0 = move-exception
            com.adcolony.sdk.t0$a r8 = new com.adcolony.sdk.t0$a
            r8.<init>()
            java.lang.StringBuilder r9 = r8.f4784a
            r9.append(r2)
            java.lang.StringBuilder r9 = r8.f4784a
            java.lang.String r10 = "ADCNetwork.using_wifi(): "
            r9.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r9 = r8.f4784a
            r9.append(r0)
            com.adcolony.sdk.t0 r0 = com.adcolony.sdk.t0.f4781f
            r8.a(r0)
            goto L_0x002d
        L_0x0050:
            r0 = move-exception
            com.adcolony.sdk.t0$a r8 = new com.adcolony.sdk.t0$a
            r8.<init>()
            java.lang.StringBuilder r9 = r8.f4784a
            r9.append(r4)
            java.lang.StringBuilder r9 = r8.f4784a
            r9.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r9 = r8.f4784a
            r9.append(r0)
            com.adcolony.sdk.t0 r0 = com.adcolony.sdk.t0.f4780e
            r8.a(r0)
            goto L_0x002d
        L_0x006f:
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = "wifi"
            return r0
        L_0x0074:
            android.content.Context r0 = com.adcolony.sdk.f.f4478a
            if (r0 != 0) goto L_0x0079
            goto L_0x00d7
        L_0x0079:
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ SecurityException -> 0x00b9, Exception -> 0x0098 }
            java.lang.Object r0 = r0.getSystemService(r5)     // Catch:{ SecurityException -> 0x00b9, Exception -> 0x0098 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ SecurityException -> 0x00b9, Exception -> 0x0098 }
            if (r0 != 0) goto L_0x0086
            goto L_0x008a
        L_0x0086:
            android.net.NetworkInfo r1 = r0.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x00b9, Exception -> 0x0098 }
        L_0x008a:
            if (r1 != 0) goto L_0x008d
            goto L_0x00d7
        L_0x008d:
            int r0 = r1.getType()     // Catch:{ SecurityException -> 0x00b9, Exception -> 0x0098 }
            if (r0 == 0) goto L_0x0096
            r1 = 2
            if (r0 < r1) goto L_0x00d7
        L_0x0096:
            r6 = 1
            goto L_0x00d7
        L_0x0098:
            r0 = move-exception
            com.adcolony.sdk.t0$a r1 = new com.adcolony.sdk.t0$a
            r1.<init>()
            java.lang.StringBuilder r3 = r1.f4784a
            r3.append(r2)
            java.lang.StringBuilder r2 = r1.f4784a
            java.lang.String r3 = "ADCNetwork.using_mobile(): "
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = r1.f4784a
            r2.append(r0)
            com.adcolony.sdk.t0 r0 = com.adcolony.sdk.t0.f4781f
            r1.a(r0)
            goto L_0x00d7
        L_0x00b9:
            r0 = move-exception
            com.adcolony.sdk.t0$a r1 = new com.adcolony.sdk.t0$a
            r1.<init>()
            java.lang.StringBuilder r2 = r1.f4784a
            r2.append(r4)
            java.lang.StringBuilder r2 = r1.f4784a
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = r1.f4784a
            r2.append(r0)
            com.adcolony.sdk.t0 r0 = com.adcolony.sdk.t0.f4780e
            r1.a(r0)
        L_0x00d7:
            if (r6 == 0) goto L_0x00dc
            java.lang.String r0 = "cell"
            return r0
        L_0x00dc:
            java.lang.String r0 = "none"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.m.a():java.lang.String");
    }
}
