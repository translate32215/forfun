package com.google.android.gms.internal.ads;

import e8.a5;
import e8.d7;
import e8.jg0;
import e8.r5;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class v5 implements wx {

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f8301c = i4.f6915a;

    /* renamed from: a  reason: collision with root package name */
    public final w4 f8302a;

    /* renamed from: b  reason: collision with root package name */
    public final d7 f8303b;

    public v5(w4 w4Var) {
        d7 d7Var = new d7();
        this.f8302a = w4Var;
        this.f8303b = d7Var;
    }

    public static void b(String str, a<?> aVar, r5 r5Var) throws r5 {
        jg0 jg0 = aVar.f5930s;
        int i10 = jg0.f15145a;
        try {
            int i11 = jg0.f15146b + 1;
            jg0.f15146b = i11;
            jg0.f15145a = ((int) (((float) i10) * 1.0f)) + i10;
            if (i11 <= 1) {
                aVar.m(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(i10)}));
                return;
            }
            throw r5Var;
        } catch (r5 e10) {
            aVar.m(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(i10)}));
            throw e10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ed, code lost:
        throw new e8.p(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ee, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ef, code lost:
        r2 = java.lang.String.valueOf(r2.f5922c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01fd, code lost:
        if (r2.length() != 0) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01ff, code lost:
        r2 = "Bad URL ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0204, code lost:
        r2 = new java.lang.String("Bad URL ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x020c, code lost:
        throw new java.lang.RuntimeException(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x020d, code lost:
        b("socket", r2, new e8.u5());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0175, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0176, code lost:
        r15 = r5;
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017c, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0181, code lost:
        r0 = r10.f26422c;
        com.google.android.gms.internal.ads.i4.b("Unexpected response code %d for %s", java.lang.Integer.valueOf(r0), r2.f5922c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0194, code lost:
        if (r11 != null) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0196, code lost:
        r9 = new e8.wi0(r0, r11, false, android.os.SystemClock.elapsedRealtime() - r3, (java.util.List<e8.uh0>) r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a6, code lost:
        if (r0 == 401) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01af, code lost:
        if (r0 < 400) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01bb, code lost:
        throw new e8.xg0(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01be, code lost:
        if (r0 < 500) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01c9, code lost:
        throw new e8.a5(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01cf, code lost:
        throw new e8.a5(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01d0, code lost:
        b("auth", r2, new e8.sd0(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01dc, code lost:
        b("network", r2, new e8.xi0());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01ee A[ExcHandler: MalformedURLException (r0v1 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01e8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e8.wi0 a(com.google.android.gms.internal.ads.a<?> r22) throws e8.r5 {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            long r3 = android.os.SystemClock.elapsedRealtime()
        L_0x0008:
            java.util.List r5 = java.util.Collections.emptyList()
            r6 = 1
            r7 = 2
            r8 = 0
            e8.qe0 r0 = r2.f5931t     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x017b }
            if (r0 != 0) goto L_0x0018
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x017b }
            goto L_0x0038
        L_0x0018:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x017b }
            r10.<init>()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x017b }
            java.lang.String r11 = r0.f16147b     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x017b }
            if (r11 == 0) goto L_0x0026
            java.lang.String r12 = "If-None-Match"
            r10.put(r12, r11)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x017b }
        L_0x0026:
            long r11 = r0.f16149d     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x017b }
            r13 = 0
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0037
            java.lang.String r0 = "If-Modified-Since"
            java.lang.String r11 = e8.va.b(r11)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x017b }
            r10.put(r0, r11)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x017b }
        L_0x0037:
            r0 = r10
        L_0x0038:
            com.google.android.gms.internal.ads.w4 r10 = r1.f8302a     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x017b }
            v6.a0 r10 = r10.a(r2, r0)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x017b }
            int r12 = r10.f26422c     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            java.lang.Object r0 = r10.f26420a     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            java.util.List r5 = java.util.Collections.unmodifiableList(r0)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            r0 = 304(0x130, float:4.26E-43)
            if (r12 != r0) goto L_0x010a
            e8.qe0 r0 = r2.f5931t     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            if (r0 != 0) goto L_0x0064
            e8.wi0 r0 = new e8.wi0     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            r14 = 304(0x130, float:4.26E-43)
            r15 = 0
            r16 = 1
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            long r17 = r11 - r3
            r13 = r0
            r19 = r5
            r13.<init>((int) r14, (byte[]) r15, (boolean) r16, (long) r17, (java.util.List<e8.uh0>) r19)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            return r0
        L_0x0064:
            java.util.TreeSet r11 = new java.util.TreeSet     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            java.util.Comparator r12 = java.lang.String.CASE_INSENSITIVE_ORDER     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            r11.<init>(r12)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            boolean r12 = r5.isEmpty()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            if (r12 != 0) goto L_0x0087
            java.util.Iterator r12 = r5.iterator()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
        L_0x0075:
            boolean r13 = r12.hasNext()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            if (r13 == 0) goto L_0x0087
            java.lang.Object r13 = r12.next()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            e8.uh0 r13 = (e8.uh0) r13     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            java.lang.String r13 = r13.f16960a     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            r11.add(r13)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            goto L_0x0075
        L_0x0087:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            r12.<init>(r5)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            java.util.List<e8.uh0> r13 = r0.f16153h     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            if (r13 == 0) goto L_0x00b4
            boolean r13 = r13.isEmpty()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            if (r13 != 0) goto L_0x00f3
            java.util.List<e8.uh0> r13 = r0.f16153h     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
        L_0x009c:
            boolean r14 = r13.hasNext()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            if (r14 == 0) goto L_0x00f3
            java.lang.Object r14 = r13.next()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            e8.uh0 r14 = (e8.uh0) r14     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            java.lang.String r15 = r14.f16960a     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            boolean r15 = r11.contains(r15)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            if (r15 != 0) goto L_0x009c
            r12.add(r14)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            goto L_0x009c
        L_0x00b4:
            java.util.Map<java.lang.String, java.lang.String> r13 = r0.f16152g     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            boolean r13 = r13.isEmpty()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            if (r13 != 0) goto L_0x00f3
            java.util.Map<java.lang.String, java.lang.String> r13 = r0.f16152g     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            java.util.Set r13 = r13.entrySet()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
        L_0x00c6:
            boolean r14 = r13.hasNext()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            if (r14 == 0) goto L_0x00f3
            java.lang.Object r14 = r13.next()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            java.lang.Object r15 = r14.getKey()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            boolean r15 = r11.contains(r15)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            if (r15 != 0) goto L_0x00c6
            e8.uh0 r15 = new e8.uh0     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            java.lang.Object r16 = r14.getKey()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            r9 = r16
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            r15.<init>(r9, r14)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            r12.add(r15)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            goto L_0x00c6
        L_0x00f3:
            e8.wi0 r9 = new e8.wi0     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            r15 = 304(0x130, float:4.26E-43)
            byte[] r0 = r0.f16146a     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            r17 = 1
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            long r18 = r13 - r3
            r14 = r9
            r16 = r0
            r20 = r12
            r14.<init>((int) r15, (byte[]) r16, (boolean) r17, (long) r18, (java.util.List<e8.uh0>) r20)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            return r9
        L_0x010a:
            V[] r0 = r10.f26421b     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            if (r0 == 0) goto L_0x0117
            int r9 = r10.f26423d     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            byte[] r0 = r1.c(r0, r9)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
            goto L_0x0119
        L_0x0117:
            byte[] r0 = new byte[r8]     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0179 }
        L_0x0119:
            r9 = r0
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            long r13 = r13 - r3
            boolean r0 = f8301c     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            if (r0 != 0) goto L_0x0129
            r15 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0157
        L_0x0129:
            java.lang.String r0 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"
            r11 = 5
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            r11[r8] = r2     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            r11[r6] = r13     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            if (r9 == 0) goto L_0x013e
            int r13 = r9.length     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            goto L_0x0140
        L_0x013e:
            java.lang.String r13 = "null"
        L_0x0140:
            r11[r7] = r13     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            r13 = 3
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            r11[r13] = r14     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            r13 = 4
            e8.jg0 r14 = r2.f5930s     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            int r14 = r14.f15146b     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            r11[r13] = r14     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            com.google.android.gms.internal.ads.i4.a(r0, r11)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
        L_0x0157:
            r0 = 200(0xc8, float:2.8E-43)
            if (r12 < r0) goto L_0x016f
            r0 = 299(0x12b, float:4.19E-43)
            if (r12 > r0) goto L_0x016f
            e8.wi0 r0 = new e8.wi0     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            r14 = 0
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            long r15 = r15 - r3
            r11 = r0
            r13 = r9
            r17 = r5
            r11.<init>((int) r12, (byte[]) r13, (boolean) r14, (long) r15, (java.util.List<e8.uh0>) r17)     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            return r0
        L_0x016f:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x020d, MalformedURLException -> 0x01ee, IOException -> 0x0175 }
        L_0x0175:
            r0 = move-exception
            r15 = r5
            r11 = r9
            goto L_0x017f
        L_0x0179:
            r0 = move-exception
            goto L_0x017d
        L_0x017b:
            r0 = move-exception
            r10 = 0
        L_0x017d:
            r15 = r5
            r11 = 0
        L_0x017f:
            if (r10 == 0) goto L_0x01e8
            int r0 = r10.f26422c
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r5[r8] = r7
            java.lang.String r7 = r2.f5922c
            r5[r6] = r7
            java.lang.String r6 = "Unexpected response code %d for %s"
            com.google.android.gms.internal.ads.i4.b(r6, r5)
            if (r11 == 0) goto L_0x01dc
            e8.wi0 r5 = new e8.wi0
            r12 = 0
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r13 = r6 - r3
            r9 = r5
            r10 = r0
            r9.<init>((int) r10, (byte[]) r11, (boolean) r12, (long) r13, (java.util.List<e8.uh0>) r15)
            r6 = 401(0x191, float:5.62E-43)
            if (r0 == r6) goto L_0x01d0
            r6 = 403(0x193, float:5.65E-43)
            if (r0 != r6) goto L_0x01ad
            goto L_0x01d0
        L_0x01ad:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L_0x01bc
            r2 = 499(0x1f3, float:6.99E-43)
            if (r0 <= r2) goto L_0x01b6
            goto L_0x01bc
        L_0x01b6:
            e8.xg0 r0 = new e8.xg0
            r0.<init>(r5)
            throw r0
        L_0x01bc:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 < r2) goto L_0x01ca
            r2 = 599(0x257, float:8.4E-43)
            if (r0 > r2) goto L_0x01ca
            e8.a5 r0 = new e8.a5
            r0.<init>(r5)
            throw r0
        L_0x01ca:
            e8.a5 r0 = new e8.a5
            r0.<init>(r5)
            throw r0
        L_0x01d0:
            e8.sd0 r0 = new e8.sd0
            r0.<init>(r5)
            java.lang.String r5 = "auth"
            b(r5, r2, r0)
            goto L_0x0008
        L_0x01dc:
            e8.xi0 r0 = new e8.xi0
            r0.<init>()
            java.lang.String r5 = "network"
            b(r5, r2, r0)
            goto L_0x0008
        L_0x01e8:
            e8.p r2 = new e8.p
            r2.<init>(r0)
            throw r2
        L_0x01ee:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Bad URL "
            java.lang.String r2 = r2.f5922c
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r5 = r2.length()
            if (r5 == 0) goto L_0x0204
            java.lang.String r2 = r4.concat(r2)
            goto L_0x0209
        L_0x0204:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
        L_0x0209:
            r3.<init>(r2, r0)
            throw r3
        L_0x020d:
            e8.u5 r0 = new e8.u5
            r0.<init>()
            java.lang.String r5 = "socket"
            b(r5, r2, r0)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v5.a(com.google.android.gms.internal.ads.a):e8.wi0");
    }

    public final byte[] c(InputStream inputStream, int i10) throws IOException, a5 {
        m8 m8Var = new m8(this.f8303b, i10);
        byte[] bArr = null;
        try {
            bArr = this.f8303b.b(1024);
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                m8Var.write(bArr, 0, read);
            }
            return m8Var.toByteArray();
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused) {
                i4.c("Error occurred when closing InputStream", new Object[0]);
            }
            this.f8303b.a(bArr);
            m8Var.close();
        }
    }
}
