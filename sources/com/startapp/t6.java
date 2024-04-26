package com.startapp;

/* compiled from: Sta */
public class t6 {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b6, code lost:
        if (r1.containsKey("forceOrientation") != false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ed, code lost:
        if (r1.containsKey("allowOffscreen") != false) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> a(java.lang.String r12) {
        /*
            r0 = 8
            java.lang.String r12 = r12.substring(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 63
            int r2 = r12.indexOf(r2)
            r3 = 1
            r4 = 0
            r5 = -1
            if (r2 == r5) goto L_0x0041
            java.lang.String r5 = r12.substring(r4, r2)
            int r2 = r2 + r3
            java.lang.String r12 = r12.substring(r2)
            java.lang.String r2 = "&"
            java.lang.String[] r12 = r12.split(r2)
            int r2 = r12.length
            r6 = 0
        L_0x0027:
            if (r6 >= r2) goto L_0x0040
            r7 = r12[r6]
            r8 = 61
            int r8 = r7.indexOf(r8)
            java.lang.String r9 = r7.substring(r4, r8)
            int r8 = r8 + r3
            java.lang.String r7 = r7.substring(r8)
            r1.put(r9, r7)
            int r6 = r6 + 1
            goto L_0x0027
        L_0x0040:
            r12 = r5
        L_0x0041:
            r2 = 10
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r5 = "close"
            r2[r4] = r5
            java.lang.String r5 = "createCalendarEvent"
            r2[r3] = r5
            r6 = 2
            java.lang.String r7 = "expand"
            r2[r6] = r7
            r6 = 3
            java.lang.String r7 = "open"
            r2[r6] = r7
            r6 = 4
            java.lang.String r8 = "playVideo"
            r2[r6] = r8
            r6 = 5
            java.lang.String r9 = "resize"
            r2[r6] = r9
            r6 = 6
            java.lang.String r9 = "setOrientationProperties"
            r2[r6] = r9
            r6 = 7
            java.lang.String r10 = "setResizeProperties"
            r2[r6] = r10
            java.lang.String r6 = "storePicture"
            r2[r0] = r6
            r0 = 9
            java.lang.String r11 = "useCustomClose"
            r2[r0] = r11
            java.util.List r0 = java.util.Arrays.asList(r2)
            boolean r0 = r0.contains(r12)
            r2 = 0
            if (r0 != 0) goto L_0x0081
            return r2
        L_0x0081:
            boolean r0 = r12.equals(r5)
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = "eventJSON"
            boolean r3 = r1.containsKey(r0)
            goto L_0x0103
        L_0x008f:
            boolean r0 = r12.equals(r7)
            if (r0 != 0) goto L_0x00fd
            boolean r0 = r12.equals(r8)
            if (r0 != 0) goto L_0x00fd
            boolean r0 = r12.equals(r6)
            if (r0 == 0) goto L_0x00a2
            goto L_0x00fd
        L_0x00a2:
            boolean r0 = r12.equals(r9)
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = "allowOrientationChange"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "forceOrientation"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x00f0
            goto L_0x0103
        L_0x00b9:
            boolean r0 = r12.equals(r10)
            if (r0 == 0) goto L_0x00f2
            java.lang.String r0 = "width"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "height"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "offsetX"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "offsetY"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "customClosePosition"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "allowOffscreen"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x00f0
            goto L_0x0103
        L_0x00f0:
            r3 = 0
            goto L_0x0103
        L_0x00f2:
            boolean r0 = r12.equals(r11)
            if (r0 == 0) goto L_0x0103
            boolean r3 = r1.containsKey(r11)
            goto L_0x0103
        L_0x00fd:
            java.lang.String r0 = "url"
            boolean r3 = r1.containsKey(r0)
        L_0x0103:
            if (r3 != 0) goto L_0x0106
            return r2
        L_0x0106:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r2 = "command"
            r0.put(r2, r12)
            r0.putAll(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.t6.a(java.lang.String):java.util.Map");
    }
}
