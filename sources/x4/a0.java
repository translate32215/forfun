package x4;

/* compiled from: ExoTimeoutException */
public final class a0 extends Exception {
    public a0(int i10, String str) {
        super(str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r1)
            int r1 = r7.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1743242157: goto L_0x003e;
                case -1290953729: goto L_0x0034;
                case -920906446: goto L_0x002a;
                case -617027085: goto L_0x0020;
                case -95047692: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0048
        L_0x0016:
            java.lang.String r1 = "missing_to"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0048
            r7 = 1
            goto L_0x0049
        L_0x0020:
            java.lang.String r1 = "messagetoobig"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0048
            r7 = 2
            goto L_0x0049
        L_0x002a:
            java.lang.String r1 = "invalid_parameters"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0048
            r7 = 0
            goto L_0x0049
        L_0x0034:
            java.lang.String r1 = "toomanymessages"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0048
            r7 = 4
            goto L_0x0049
        L_0x003e:
            java.lang.String r1 = "service_not_available"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0048
            r7 = 3
            goto L_0x0049
        L_0x0048:
            r7 = -1
        L_0x0049:
            if (r7 == 0) goto L_0x0057
            if (r7 == r5) goto L_0x0057
            if (r7 == r4) goto L_0x0056
            if (r7 == r3) goto L_0x0055
            if (r7 == r2) goto L_0x0054
            return r0
        L_0x0054:
            return r2
        L_0x0055:
            return r3
        L_0x0056:
            return r4
        L_0x0057:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.a0.a(java.lang.String):int");
    }

    public a0(String str) {
        super(str);
        a(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(int i10) {
        super(i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
    }
}
