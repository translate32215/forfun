package com.google.android.gms.internal.ads;

import android.content.Context;
import e8.ls;
import e8.ns;
import e8.o7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pb implements gf<ls, ns> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7837a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7838b;

    /* renamed from: c  reason: collision with root package name */
    public final o7 f7839c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7840d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7841e;

    public pb(Context context, String str, o7 o7Var, String str2, int i10) {
        this.f7837a = context;
        this.f7838b = str;
        this.f7839c = o7Var;
        this.f7840d = str2;
        this.f7841e = i10;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:53|54|(2:58|59)|60|61) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:99|100|(0)|104|105) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:86|87|(2:89|(1:91)(2:92|93))|94|95|96) */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0298, code lost:
        throw new e8.br(r8, r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r2 = new java.io.InputStreamReader(r11.getInputStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r0 = d7.l.B.f13186c;
        r0 = new java.lang.StringBuilder(8192);
        r3 = new char[2048];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b8, code lost:
        r4 = r2.read(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bd, code lost:
        if (r4 == -1) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        r0.append(r3, 0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c4, code lost:
        r0 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r5.f(r0);
        r10.f15712c = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d4, code lost:
        if (android.text.TextUtils.isEmpty(r0) != false) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e6, code lost:
        if (((java.lang.Boolean) e8.ti0.f16763j.f16769f.a(e8.t.R2)).booleanValue() != false) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01f0, code lost:
        throw new e8.br(com.google.android.gms.internal.ads.we.NO_FILL);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f1, code lost:
        r10.f15713d = d7.l.B.f13193j.a() - r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r11.disconnect();
        r1.f7839c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0206, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0207, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x0210 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0130 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x01cb */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x020d A[SYNTHETIC, Splitter:B:102:0x020d] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012d A[SYNTHETIC, Splitter:B:58:0x012d] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:60:0x0130=Splitter:B:60:0x0130, B:104:0x0210=Splitter:B:104:0x0210, B:86:0x01cb=Splitter:B:86:0x01cb} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r23) throws java.lang.Exception {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            e8.ls r0 = (e8.ls) r0
            e8.e7 r2 = r0.f15424b
            java.lang.String r3 = r2.f14375f
            org.json.JSONObject r0 = r0.f15423a
            java.lang.String r4 = r1.f7840d
            java.lang.String r5 = "Received error HTTP response code: "
            java.lang.String r6 = "doritos_v2"
            java.lang.String r7 = "doritos"
            com.google.android.gms.internal.ads.we r8 = com.google.android.gms.internal.ads.we.INTERNAL_ERROR
            java.lang.String r9 = "http_timeout_millis"
            r10 = 60000(0xea60, float:8.4078E-41)
            int r9 = r0.optInt(r9, r10)     // Catch:{ IOException -> 0x02cc }
            int r10 = r2.f14376g     // Catch:{ IOException -> 0x02cc }
            r11 = -2
            r12 = 1
            if (r10 == r11) goto L_0x0044
            if (r10 != r12) goto L_0x003e
            java.util.List<java.lang.String> r0 = r2.f14370a     // Catch:{ IOException -> 0x02cc }
            if (r0 == 0) goto L_0x0034
            java.lang.String r2 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r2, r0)     // Catch:{ IOException -> 0x02cc }
            l0.e.I(r0)     // Catch:{ IOException -> 0x02cc }
        L_0x0034:
            e8.br r0 = new e8.br     // Catch:{ IOException -> 0x02cc }
            com.google.android.gms.internal.ads.we r2 = com.google.android.gms.internal.ads.we.INVALID_REQUEST     // Catch:{ IOException -> 0x02cc }
            java.lang.String r3 = "Error building request URL."
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x02cc }
            throw r0     // Catch:{ IOException -> 0x02cc }
        L_0x003e:
            e8.br r0 = new e8.br     // Catch:{ IOException -> 0x02cc }
            r0.<init>(r8)     // Catch:{ IOException -> 0x02cc }
            throw r0     // Catch:{ IOException -> 0x02cc }
        L_0x0044:
            e8.ns r10 = new e8.ns     // Catch:{ IOException -> 0x02cc }
            r10.<init>()     // Catch:{ IOException -> 0x02cc }
            java.lang.String r11 = "SDK version: "
            java.lang.String r13 = r1.f7838b     // Catch:{ IOException -> 0x02cc }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ IOException -> 0x02cc }
            int r14 = r13.length()     // Catch:{ IOException -> 0x02cc }
            if (r14 == 0) goto L_0x005c
            java.lang.String r11 = r11.concat(r13)     // Catch:{ IOException -> 0x02cc }
            goto L_0x0062
        L_0x005c:
            java.lang.String r13 = new java.lang.String     // Catch:{ IOException -> 0x02cc }
            r13.<init>(r11)     // Catch:{ IOException -> 0x02cc }
            r11 = r13
        L_0x0062:
            l0.e.J(r11)     // Catch:{ IOException -> 0x02cc }
            java.lang.String r11 = "AdRequestServiceImpl: Sending request: "
            java.lang.String r13 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x02cc }
            int r14 = r13.length()     // Catch:{ IOException -> 0x02cc }
            if (r14 == 0) goto L_0x0076
            java.lang.String r11 = r11.concat(r13)     // Catch:{ IOException -> 0x02cc }
            goto L_0x007c
        L_0x0076:
            java.lang.String r13 = new java.lang.String     // Catch:{ IOException -> 0x02cc }
            r13.<init>(r11)     // Catch:{ IOException -> 0x02cc }
            r11 = r13
        L_0x007c:
            l0.e.E(r11)     // Catch:{ IOException -> 0x02cc }
            java.net.URL r11 = new java.net.URL     // Catch:{ IOException -> 0x02cc }
            r11.<init>(r3)     // Catch:{ IOException -> 0x02cc }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x02cc }
            r3.<init>()     // Catch:{ IOException -> 0x02cc }
            d7.l r13 = d7.l.B     // Catch:{ IOException -> 0x02cc }
            z7.b r13 = r13.f13193j     // Catch:{ IOException -> 0x02cc }
            long r13 = r13.a()     // Catch:{ IOException -> 0x02cc }
            r16 = 0
        L_0x0093:
            e8.o7 r15 = r1.f7839c     // Catch:{ IOException -> 0x02cc }
            int r12 = r1.f7841e     // Catch:{ IOException -> 0x02cc }
            r15.b(r12)     // Catch:{ IOException -> 0x02cc }
            java.net.URLConnection r11 = r11.openConnection()     // Catch:{ IOException -> 0x02cc }
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ IOException -> 0x02cc }
            d7.l r12 = d7.l.B     // Catch:{ br -> 0x029b }
            com.google.android.gms.ads.internal.util.p r12 = r12.f13186c     // Catch:{ br -> 0x029b }
            android.content.Context r15 = r1.f7837a     // Catch:{ br -> 0x029b }
            r17 = r5
            java.lang.String r5 = r1.f7838b     // Catch:{ br -> 0x029b }
            r12.f(r15, r5, r11, r9)     // Catch:{ br -> 0x029b }
            boolean r5 = r2.f14374e     // Catch:{ br -> 0x029b }
            if (r5 == 0) goto L_0x00bc
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ br -> 0x029b }
            if (r5 != 0) goto L_0x00bc
            java.lang.String r5 = "Cookie"
            r11.addRequestProperty(r5, r4)     // Catch:{ br -> 0x029b }
        L_0x00bc:
            boolean r5 = r2.f14373d     // Catch:{ br -> 0x029b }
            java.lang.String r12 = ""
            if (r5 == 0) goto L_0x00fe
            java.lang.String r5 = "pii"
            org.json.JSONObject r5 = r0.optJSONObject(r5)     // Catch:{ br -> 0x029b }
            if (r5 == 0) goto L_0x00f6
            java.lang.String r15 = r5.optString(r7, r12)     // Catch:{ br -> 0x029b }
            boolean r15 = android.text.TextUtils.isEmpty(r15)     // Catch:{ br -> 0x029b }
            if (r15 != 0) goto L_0x00e0
            java.lang.String r15 = "x-afma-drt-cookie"
            r18 = r0
            java.lang.String r0 = r5.optString(r7, r12)     // Catch:{ br -> 0x029b }
            r11.addRequestProperty(r15, r0)     // Catch:{ br -> 0x029b }
            goto L_0x00e2
        L_0x00e0:
            r18 = r0
        L_0x00e2:
            java.lang.String r0 = r5.optString(r6, r12)     // Catch:{ br -> 0x029b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ br -> 0x029b }
            if (r0 != 0) goto L_0x0100
            java.lang.String r0 = "x-afma-drt-v2-cookie"
            java.lang.String r5 = r5.optString(r6, r12)     // Catch:{ br -> 0x029b }
            r11.addRequestProperty(r0, r5)     // Catch:{ br -> 0x029b }
            goto L_0x0100
        L_0x00f6:
            r18 = r0
            java.lang.String r0 = "DSID signal does not exist."
            l0.e.H(r0)     // Catch:{ br -> 0x029b }
            goto L_0x0100
        L_0x00fe:
            r18 = r0
        L_0x0100:
            java.lang.String r0 = r2.f14372c     // Catch:{ br -> 0x029b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ br -> 0x029b }
            if (r0 != 0) goto L_0x0131
            r0 = 1
            r11.setDoOutput(r0)     // Catch:{ br -> 0x029b }
            java.lang.String r0 = r2.f14372c     // Catch:{ br -> 0x029b }
            byte[] r0 = r0.getBytes()     // Catch:{ br -> 0x029b }
            int r15 = r0.length     // Catch:{ br -> 0x029b }
            r11.setFixedLengthStreamingMode(r15)     // Catch:{ br -> 0x029b }
            java.io.BufferedOutputStream r15 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0129 }
            java.io.OutputStream r5 = r11.getOutputStream()     // Catch:{ all -> 0x0129 }
            r15.<init>(r5)     // Catch:{ all -> 0x0129 }
            r15.write(r0)     // Catch:{ all -> 0x0126 }
            r15.close()     // Catch:{ IOException -> 0x0132 }
            goto L_0x0132
        L_0x0126:
            r0 = move-exception
            r5 = r15
            goto L_0x012b
        L_0x0129:
            r0 = move-exception
            r5 = 0
        L_0x012b:
            if (r5 == 0) goto L_0x0130
            r5.close()     // Catch:{ IOException -> 0x0130 }
        L_0x0130:
            throw r0     // Catch:{ br -> 0x029b }
        L_0x0131:
            r0 = 0
        L_0x0132:
            com.google.android.gms.internal.ads.b7 r5 = new com.google.android.gms.internal.ads.b7     // Catch:{ br -> 0x029b }
            r15 = 0
            r5.<init>(r15)     // Catch:{ br -> 0x029b }
            r5.e(r11, r0)     // Catch:{ br -> 0x029b }
            int r0 = r11.getResponseCode()     // Catch:{ br -> 0x029b }
            java.util.Map r19 = r11.getHeaderFields()     // Catch:{ br -> 0x029b }
            java.util.Set r19 = r19.entrySet()     // Catch:{ br -> 0x029b }
            java.util.Iterator r19 = r19.iterator()     // Catch:{ br -> 0x029b }
        L_0x014b:
            boolean r20 = r19.hasNext()     // Catch:{ br -> 0x029b }
            if (r20 == 0) goto L_0x018b
            java.lang.Object r20 = r19.next()     // Catch:{ br -> 0x029b }
            java.util.Map$Entry r20 = (java.util.Map.Entry) r20     // Catch:{ br -> 0x029b }
            java.lang.Object r21 = r20.getKey()     // Catch:{ br -> 0x029b }
            r15 = r21
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ br -> 0x029b }
            java.lang.Object r20 = r20.getValue()     // Catch:{ br -> 0x029b }
            r21 = r2
            r2 = r20
            java.util.List r2 = (java.util.List) r2     // Catch:{ br -> 0x029b }
            boolean r20 = r3.containsKey(r15)     // Catch:{ br -> 0x029b }
            if (r20 == 0) goto L_0x017b
            java.lang.Object r15 = r3.get(r15)     // Catch:{ br -> 0x029b }
            java.util.List r15 = (java.util.List) r15     // Catch:{ br -> 0x029b }
            r15.addAll(r2)     // Catch:{ br -> 0x029b }
            r20 = r4
            goto L_0x0185
        L_0x017b:
            r20 = r4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ br -> 0x029b }
            r4.<init>(r2)     // Catch:{ br -> 0x029b }
            r3.put(r15, r4)     // Catch:{ br -> 0x029b }
        L_0x0185:
            r4 = r20
            r2 = r21
            r15 = 0
            goto L_0x014b
        L_0x018b:
            r21 = r2
            r20 = r4
            r5.d(r11, r0)     // Catch:{ br -> 0x029b }
            r10.f15710a = r0     // Catch:{ br -> 0x029b }
            r10.f15711b = r3     // Catch:{ br -> 0x029b }
            r10.f15712c = r12     // Catch:{ br -> 0x029b }
            r2 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r0 < r2) goto L_0x0211
            if (r0 >= r4) goto L_0x0211
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0209 }
            java.io.InputStream r0 = r11.getInputStream()     // Catch:{ all -> 0x0209 }
            r2.<init>(r0)     // Catch:{ all -> 0x0209 }
            d7.l r0 = d7.l.B     // Catch:{ all -> 0x0206 }
            com.google.android.gms.ads.internal.util.p r0 = r0.f13186c     // Catch:{ all -> 0x0206 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0206 }
            r3 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3)     // Catch:{ all -> 0x0206 }
            r3 = 2048(0x800, float:2.87E-42)
            char[] r3 = new char[r3]     // Catch:{ all -> 0x0206 }
        L_0x01b8:
            int r4 = r2.read(r3)     // Catch:{ all -> 0x0206 }
            r6 = -1
            if (r4 == r6) goto L_0x01c4
            r12 = 0
            r0.append(r3, r12, r4)     // Catch:{ all -> 0x0206 }
            goto L_0x01b8
        L_0x01c4:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0206 }
            r2.close()     // Catch:{ IOException -> 0x01cb }
        L_0x01cb:
            r5.f(r0)     // Catch:{ br -> 0x029b }
            r10.f15712c = r0     // Catch:{ br -> 0x029b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ br -> 0x029b }
            if (r0 == 0) goto L_0x01f1
            e8.l<java.lang.Boolean> r0 = e8.t.R2     // Catch:{ br -> 0x029b }
            e8.ti0 r2 = e8.ti0.f16763j     // Catch:{ br -> 0x029b }
            com.google.android.gms.internal.ads.e r2 = r2.f16769f     // Catch:{ br -> 0x029b }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ br -> 0x029b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ br -> 0x029b }
            boolean r0 = r0.booleanValue()     // Catch:{ br -> 0x029b }
            if (r0 == 0) goto L_0x01e9
            goto L_0x01f1
        L_0x01e9:
            e8.br r0 = new e8.br     // Catch:{ br -> 0x029b }
            com.google.android.gms.internal.ads.we r2 = com.google.android.gms.internal.ads.we.NO_FILL     // Catch:{ br -> 0x029b }
            r0.<init>(r2)     // Catch:{ br -> 0x029b }
            throw r0     // Catch:{ br -> 0x029b }
        L_0x01f1:
            d7.l r0 = d7.l.B     // Catch:{ br -> 0x029b }
            z7.b r0 = r0.f13193j     // Catch:{ br -> 0x029b }
            long r2 = r0.a()     // Catch:{ br -> 0x029b }
            long r2 = r2 - r13
            r10.f15713d = r2     // Catch:{ br -> 0x029b }
            r11.disconnect()     // Catch:{ IOException -> 0x02cc }
            e8.o7 r0 = r1.f7839c     // Catch:{ IOException -> 0x02cc }
            r0.a()     // Catch:{ IOException -> 0x02cc }
            goto L_0x02c1
        L_0x0206:
            r0 = move-exception
            r5 = r2
            goto L_0x020b
        L_0x0209:
            r0 = move-exception
            r5 = 0
        L_0x020b:
            if (r5 == 0) goto L_0x0210
            r5.close()     // Catch:{ IOException -> 0x0210 }
        L_0x0210:
            throw r0     // Catch:{ br -> 0x029b }
        L_0x0211:
            r12 = 0
            if (r0 < r4) goto L_0x026e
            r2 = 400(0x190, float:5.6E-43)
            if (r0 >= r2) goto L_0x026e
            java.lang.String r0 = "Location"
            java.lang.String r0 = r11.getHeaderField(r0)     // Catch:{ br -> 0x029b }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ br -> 0x029b }
            if (r2 != 0) goto L_0x0261
            java.net.URL r2 = new java.net.URL     // Catch:{ br -> 0x029b }
            r2.<init>(r0)     // Catch:{ br -> 0x029b }
            r0 = 1
            int r4 = r16 + 1
            e8.l<java.lang.Integer> r5 = e8.t.E2     // Catch:{ br -> 0x029b }
            e8.ti0 r15 = e8.ti0.f16763j     // Catch:{ br -> 0x029b }
            com.google.android.gms.internal.ads.e r15 = r15.f16769f     // Catch:{ br -> 0x029b }
            java.lang.Object r5 = r15.a(r5)     // Catch:{ br -> 0x029b }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ br -> 0x029b }
            int r5 = r5.intValue()     // Catch:{ br -> 0x029b }
            if (r4 > r5) goto L_0x0254
            r11.disconnect()     // Catch:{ IOException -> 0x02cc }
            e8.o7 r5 = r1.f7839c     // Catch:{ IOException -> 0x02cc }
            r5.a()     // Catch:{ IOException -> 0x02cc }
            r11 = r2
            r16 = r4
            r5 = r17
            r0 = r18
            r4 = r20
            r2 = r21
            r12 = 1
            goto L_0x0093
        L_0x0254:
            java.lang.String r0 = "Too many redirects."
            l0.e.K(r0)     // Catch:{ br -> 0x029b }
            e8.br r0 = new e8.br     // Catch:{ br -> 0x029b }
            java.lang.String r2 = "Too many redirects"
            r0.<init>(r8, r2)     // Catch:{ br -> 0x029b }
            throw r0     // Catch:{ br -> 0x029b }
        L_0x0261:
            java.lang.String r0 = "No location header to follow redirect."
            l0.e.K(r0)     // Catch:{ br -> 0x029b }
            e8.br r0 = new e8.br     // Catch:{ br -> 0x029b }
            java.lang.String r2 = "No location header to follow redirect"
            r0.<init>(r8, r2)     // Catch:{ br -> 0x029b }
            throw r0     // Catch:{ br -> 0x029b }
        L_0x026e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ br -> 0x029b }
            r3 = 46
            r2.<init>(r3)     // Catch:{ br -> 0x029b }
            r4 = r17
            r2.append(r4)     // Catch:{ br -> 0x029b }
            r2.append(r0)     // Catch:{ br -> 0x029b }
            java.lang.String r2 = r2.toString()     // Catch:{ br -> 0x029b }
            l0.e.K(r2)     // Catch:{ br -> 0x029b }
            e8.br r2 = new e8.br     // Catch:{ br -> 0x029b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ br -> 0x029b }
            r5.<init>(r3)     // Catch:{ br -> 0x029b }
            r5.append(r4)     // Catch:{ br -> 0x029b }
            r5.append(r0)     // Catch:{ br -> 0x029b }
            java.lang.String r0 = r5.toString()     // Catch:{ br -> 0x029b }
            r2.<init>(r8, r0)     // Catch:{ br -> 0x029b }
            throw r2     // Catch:{ br -> 0x029b }
        L_0x0299:
            r0 = move-exception
            goto L_0x02c3
        L_0x029b:
            r0 = move-exception
            e8.l<java.lang.Boolean> r2 = e8.t.A4     // Catch:{ all -> 0x0299 }
            e8.ti0 r3 = e8.ti0.f16763j     // Catch:{ all -> 0x0299 }
            com.google.android.gms.internal.ads.e r3 = r3.f16769f     // Catch:{ all -> 0x0299 }
            java.lang.Object r2 = r3.a(r2)     // Catch:{ all -> 0x0299 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0299 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0299 }
            if (r2 == 0) goto L_0x02c2
            d7.l r0 = d7.l.B     // Catch:{ all -> 0x0299 }
            z7.b r0 = r0.f13193j     // Catch:{ all -> 0x0299 }
            long r2 = r0.a()     // Catch:{ all -> 0x0299 }
            long r2 = r2 - r13
            r10.f15713d = r2     // Catch:{ all -> 0x0299 }
            r11.disconnect()     // Catch:{ IOException -> 0x02cc }
            e8.o7 r0 = r1.f7839c     // Catch:{ IOException -> 0x02cc }
            r0.a()     // Catch:{ IOException -> 0x02cc }
        L_0x02c1:
            return r10
        L_0x02c2:
            throw r0     // Catch:{ all -> 0x0299 }
        L_0x02c3:
            r11.disconnect()     // Catch:{ IOException -> 0x02cc }
            e8.o7 r2 = r1.f7839c     // Catch:{ IOException -> 0x02cc }
            r2.a()     // Catch:{ IOException -> 0x02cc }
            throw r0     // Catch:{ IOException -> 0x02cc }
        L_0x02cc:
            r0 = move-exception
            java.lang.String r2 = "Error while connecting to ad server: "
            java.lang.String r3 = r0.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x02e2
            java.lang.String r2 = r2.concat(r3)
            goto L_0x02e8
        L_0x02e2:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            r2 = r3
        L_0x02e8:
            l0.e.K(r2)
            e8.br r3 = new e8.br
            r3.<init>(r8, r2, r0)
            goto L_0x02f2
        L_0x02f1:
            throw r3
        L_0x02f2:
            goto L_0x02f1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pb.apply(java.lang.Object):java.lang.Object");
    }
}
