package k5;

import d5.a0;

/* compiled from: TrackEncryptionBox */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20006a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20007b;

    /* renamed from: c  reason: collision with root package name */
    public final a0.a f20008c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20009d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f20010e;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r6.equals("cbc1") == false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L_0x0009
            r2 = 1
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            if (r11 != 0) goto L_0x000e
            r3 = 1
            goto L_0x000f
        L_0x000e:
            r3 = 0
        L_0x000f:
            r2 = r2 ^ r3
            v6.a.a(r2)
            r4.f20006a = r5
            r4.f20007b = r6
            r4.f20009d = r7
            r4.f20010e = r11
            d5.a0$a r5 = new d5.a0$a
            r7 = 2
            if (r6 != 0) goto L_0x0021
            goto L_0x0079
        L_0x0021:
            int r11 = r6.hashCode()
            r2 = 3
            switch(r11) {
                case 3046605: goto L_0x004b;
                case 3046671: goto L_0x0040;
                case 3049879: goto L_0x0035;
                case 3049895: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0053
        L_0x002a:
            java.lang.String r11 = "cens"
            boolean r11 = r6.equals(r11)
            if (r11 != 0) goto L_0x0033
            goto L_0x0053
        L_0x0033:
            r0 = 3
            goto L_0x0054
        L_0x0035:
            java.lang.String r11 = "cenc"
            boolean r11 = r6.equals(r11)
            if (r11 != 0) goto L_0x003e
            goto L_0x0053
        L_0x003e:
            r0 = 2
            goto L_0x0054
        L_0x0040:
            java.lang.String r11 = "cbcs"
            boolean r11 = r6.equals(r11)
            if (r11 != 0) goto L_0x0049
            goto L_0x0053
        L_0x0049:
            r0 = 1
            goto L_0x0054
        L_0x004b:
            java.lang.String r11 = "cbc1"
            boolean r11 = r6.equals(r11)
            if (r11 != 0) goto L_0x0054
        L_0x0053:
            r0 = -1
        L_0x0054:
            if (r0 == 0) goto L_0x0078
            if (r0 == r1) goto L_0x0078
            if (r0 == r7) goto L_0x0079
            if (r0 == r2) goto L_0x0079
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "Unsupported protection scheme type '"
            r7.append(r11)
            r7.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            android.util.Log.w(r7, r6)
            goto L_0x0079
        L_0x0078:
            r1 = 2
        L_0x0079:
            r5.<init>(r1, r8, r9, r10)
            r4.f20008c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.n.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
