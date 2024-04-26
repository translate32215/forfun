package e8;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class ji0 {
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0106, code lost:
        if (r3.contains(r4) == false) goto L_0x010a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e8.fi0 a(android.content.Context r29, e8.zi0 r30) {
        /*
            r0 = r30
            java.util.Date r1 = r0.f17758a
            if (r1 == 0) goto L_0x000b
            long r1 = r1.getTime()
            goto L_0x000d
        L_0x000b:
            r1 = -1
        L_0x000d:
            r5 = r1
            r16 = 0
            int r8 = r0.f17760c
            java.util.Set<java.lang.String> r1 = r0.f17761d
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0025
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            r9 = r1
            goto L_0x0026
        L_0x0025:
            r9 = 0
        L_0x0026:
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.oz.c()
            y6.l r1 = r1.f7787g
            e8.ti0 r2 = e8.ti0.f16763j
            e8.y8 r2 = r2.f16764a
            java.lang.String r2 = e8.y8.d(r29)
            java.util.Set<java.lang.String> r4 = r0.f17766i
            boolean r4 = r4.contains(r2)
            r10 = 0
            if (r4 != 0) goto L_0x0050
            r1.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List<java.lang.String> r1 = r1.f28128a
            r4.<init>(r1)
            boolean r1 = r4.contains(r2)
            if (r1 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r1 = 0
            goto L_0x0051
        L_0x0050:
            r1 = 1
        L_0x0051:
            android.location.Location r15 = r0.f17762e
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r2 = com.google.ads.mediation.admob.AdMobAdapter.class
            android.os.Bundle r4 = r0.f17763f
            java.lang.String r2 = r2.getName()
            android.os.Bundle r2 = r4.getBundle(r2)
            r23 = 0
            android.content.Context r4 = r29.getApplicationContext()
            r12 = 2
            if (r4 == 0) goto L_0x010d
            java.lang.String r4 = r4.getPackageName()
            e8.ti0 r11 = e8.ti0.f16763j
            e8.y8 r11 = r11.f16764a
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r11 = r11.getStackTrace()
            r13 = 0
        L_0x0079:
            int r14 = r13 + 1
            int r7 = r11.length
            if (r14 >= r7) goto L_0x00c9
            r7 = r11[r13]
            java.lang.String r13 = r7.getClassName()
            java.lang.String r7 = r7.getMethodName()
            java.lang.String r3 = "loadAd"
            boolean r3 = r3.equalsIgnoreCase(r7)
            if (r3 == 0) goto L_0x00c7
            java.lang.String r3 = e8.y8.f17579c
            boolean r3 = r3.equalsIgnoreCase(r13)
            if (r3 != 0) goto L_0x00c0
            java.lang.String r3 = e8.y8.f17580d
            boolean r3 = r3.equalsIgnoreCase(r13)
            if (r3 != 0) goto L_0x00c0
            java.lang.String r3 = e8.y8.f17581e
            boolean r3 = r3.equalsIgnoreCase(r13)
            if (r3 != 0) goto L_0x00c0
            java.lang.String r3 = e8.y8.f17582f
            boolean r3 = r3.equalsIgnoreCase(r13)
            if (r3 != 0) goto L_0x00c0
            java.lang.String r3 = e8.y8.f17583g
            boolean r3 = r3.equalsIgnoreCase(r13)
            if (r3 != 0) goto L_0x00c0
            java.lang.String r3 = e8.y8.f17584h
            boolean r3 = r3.equalsIgnoreCase(r13)
            if (r3 == 0) goto L_0x00c7
        L_0x00c0:
            r3 = r11[r14]
            java.lang.String r3 = r3.getClassName()
            goto L_0x00ca
        L_0x00c7:
            r13 = r14
            goto L_0x0079
        L_0x00c9:
            r3 = 0
        L_0x00ca:
            if (r4 == 0) goto L_0x0109
            java.util.StringTokenizer r7 = new java.util.StringTokenizer
            java.lang.String r11 = "."
            r7.<init>(r4, r11)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            boolean r14 = r7.hasMoreElements()
            if (r14 == 0) goto L_0x0100
            java.lang.String r4 = r7.nextToken()
            r13.append(r4)
            r4 = 2
        L_0x00e6:
            int r14 = r4 + -1
            if (r4 <= 0) goto L_0x00fc
            boolean r4 = r7.hasMoreElements()
            if (r4 == 0) goto L_0x00fc
            r13.append(r11)
            java.lang.String r4 = r7.nextToken()
            r13.append(r4)
            r4 = r14
            goto L_0x00e6
        L_0x00fc:
            java.lang.String r4 = r13.toString()
        L_0x0100:
            if (r3 == 0) goto L_0x0109
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r3 = 0
        L_0x010a:
            r21 = r3
            goto L_0x010f
        L_0x010d:
            r21 = 0
        L_0x010f:
            boolean r3 = r0.f17769l
            r22 = r3
            com.google.android.gms.internal.ads.oz r3 = com.google.android.gms.internal.ads.oz.c()
            y6.l r3 = r3.f7787g
            int r4 = r0.f17765h
            r3.getClass()
            r3 = -1
            int r11 = java.lang.Math.max(r4, r3)
            int r4 = r0.f17770m
            int r24 = java.lang.Math.max(r4, r3)
            java.lang.String[] r3 = new java.lang.String[r12]
            r4 = 0
            r3[r10] = r4
            java.lang.String r4 = ""
            r7 = 1
            r3[r7] = r4
            java.util.List r3 = java.util.Arrays.asList(r3)
            java.util.Comparator r4 = e8.ii0.f15052a
            java.lang.Object r3 = java.util.Collections.max(r3, r4)
            r25 = r3
            java.lang.String r25 = (java.lang.String) r25
            java.util.ArrayList r3 = new java.util.ArrayList
            r26 = r3
            java.util.List<java.lang.String> r4 = r0.f17759b
            r3.<init>(r4)
            e8.fi0 r28 = new e8.fi0
            r3 = r28
            r4 = 8
            android.os.Bundle r7 = r0.f17763f
            r17 = r7
            android.os.Bundle r7 = r0.f17767j
            r18 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.Set<java.lang.String> r10 = r0.f17768k
            r7.<init>(r10)
            java.util.List r19 = java.util.Collections.unmodifiableList(r7)
            r20 = 0
            int r0 = r0.f17771n
            r27 = r0
            r12 = 0
            r13 = 0
            r14 = 0
            r7 = r2
            r10 = r1
            r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r28
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.ji0.a(android.content.Context, e8.zi0):e8.fi0");
    }
}
