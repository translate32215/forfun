package com.google.android.gms.internal.ads;

import e8.sd0;
import e8.uh0;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class r7 extends w4 {
    public r7() {
        super(0);
    }

    public static List<uh0> c(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                for (String uh0 : (List) next.getValue()) {
                    arrayList.add(new uh0((String) next.getKey(), uh0));
                }
            }
        }
        return arrayList;
    }

    public static void d(HttpURLConnection httpURLConnection, a<?> aVar) throws IOException, sd0 {
        byte[] s10 = aVar.s();
        if (s10 != null) {
            httpURLConnection.setDoOutput(true);
            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=".concat("UTF-8"));
            }
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(s10);
            dataOutputStream.close();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final v6.a0 a(com.google.android.gms.internal.ads.a<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) throws java.io.IOException, e8.sd0 {
        /*
            r6 = this;
            java.lang.String r0 = r7.f5922c
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1.putAll(r8)
            java.util.Map r8 = r7.a()
            r1.putAll(r8)
            java.net.URL r8 = new java.net.URL
            r8.<init>(r0)
            java.net.URLConnection r0 = r8.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            boolean r2 = java.net.HttpURLConnection.getFollowRedirects()
            r0.setInstanceFollowRedirects(r2)
            e8.jg0 r2 = r7.f5930s
            int r2 = r2.f15145a
            r0.setConnectTimeout(r2)
            r0.setReadTimeout(r2)
            r2 = 0
            r0.setUseCaches(r2)
            r3 = 1
            r0.setDoInput(r3)
            java.lang.String r8 = r8.getProtocol()
            java.lang.String r4 = "https"
            r4.equals(r8)
            java.util.Set r8 = r1.keySet()     // Catch:{ all -> 0x00f8 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00f8 }
        L_0x0046:
            boolean r4 = r8.hasNext()     // Catch:{ all -> 0x00f8 }
            if (r4 == 0) goto L_0x005c
            java.lang.Object r4 = r8.next()     // Catch:{ all -> 0x00f8 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00f8 }
            java.lang.Object r5 = r1.get(r4)     // Catch:{ all -> 0x00f8 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00f8 }
            r0.setRequestProperty(r4, r5)     // Catch:{ all -> 0x00f8 }
            goto L_0x0046
        L_0x005c:
            int r8 = r7.f5921b     // Catch:{ all -> 0x00f8 }
            switch(r8) {
                case -1: goto L_0x009d;
                case 0: goto L_0x0098;
                case 1: goto L_0x008f;
                case 2: goto L_0x0086;
                case 3: goto L_0x0080;
                case 4: goto L_0x007a;
                case 5: goto L_0x0074;
                case 6: goto L_0x006e;
                case 7: goto L_0x0065;
                default: goto L_0x0061;
            }     // Catch:{ all -> 0x00f8 }
        L_0x0061:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f8 }
            goto L_0x00f2
        L_0x0065:
            java.lang.String r8 = "PATCH"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x00f8 }
            d(r0, r7)     // Catch:{ all -> 0x00f8 }
            goto L_0x009d
        L_0x006e:
            java.lang.String r8 = "TRACE"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x00f8 }
            goto L_0x009d
        L_0x0074:
            java.lang.String r8 = "OPTIONS"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x00f8 }
            goto L_0x009d
        L_0x007a:
            java.lang.String r8 = "HEAD"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x00f8 }
            goto L_0x009d
        L_0x0080:
            java.lang.String r8 = "DELETE"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x00f8 }
            goto L_0x009d
        L_0x0086:
            java.lang.String r8 = "PUT"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x00f8 }
            d(r0, r7)     // Catch:{ all -> 0x00f8 }
            goto L_0x009d
        L_0x008f:
            java.lang.String r8 = "POST"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x00f8 }
            d(r0, r7)     // Catch:{ all -> 0x00f8 }
            goto L_0x009d
        L_0x0098:
            java.lang.String r8 = "GET"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x00f8 }
        L_0x009d:
            int r8 = r0.getResponseCode()     // Catch:{ all -> 0x00f8 }
            r1 = -1
            if (r8 == r1) goto L_0x00ea
            int r7 = r7.f5921b     // Catch:{ all -> 0x00f8 }
            r4 = 4
            if (r7 == r4) goto L_0x00bb
            r7 = 100
            if (r7 > r8) goto L_0x00b1
            r7 = 200(0xc8, float:2.8E-43)
            if (r8 < r7) goto L_0x00bb
        L_0x00b1:
            r7 = 204(0xcc, float:2.86E-43)
            if (r8 == r7) goto L_0x00bb
            r7 = 304(0x130, float:4.26E-43)
            if (r8 == r7) goto L_0x00bb
            r7 = 1
            goto L_0x00bc
        L_0x00bb:
            r7 = 0
        L_0x00bc:
            if (r7 != 0) goto L_0x00d0
            v6.a0 r7 = new v6.a0     // Catch:{ all -> 0x00f8 }
            java.util.Map r3 = r0.getHeaderFields()     // Catch:{ all -> 0x00f8 }
            java.util.List r3 = c(r3)     // Catch:{ all -> 0x00f8 }
            r4 = 0
            r7.<init>(r8, r3, r1, r4)     // Catch:{ all -> 0x00f8 }
            r0.disconnect()
            return r7
        L_0x00d0:
            v6.a0 r7 = new v6.a0     // Catch:{ all -> 0x00e7 }
            java.util.Map r1 = r0.getHeaderFields()     // Catch:{ all -> 0x00e7 }
            java.util.List r1 = c(r1)     // Catch:{ all -> 0x00e7 }
            int r2 = r0.getContentLength()     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.d8 r4 = new com.google.android.gms.internal.ads.d8     // Catch:{ all -> 0x00e7 }
            r4.<init>(r0)     // Catch:{ all -> 0x00e7 }
            r7.<init>(r8, r1, r2, r4)     // Catch:{ all -> 0x00e7 }
            return r7
        L_0x00e7:
            r7 = move-exception
            r2 = 1
            goto L_0x00f9
        L_0x00ea:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x00f8 }
            java.lang.String r8 = "Could not retrieve response code from HttpUrlConnection."
            r7.<init>(r8)     // Catch:{ all -> 0x00f8 }
            throw r7     // Catch:{ all -> 0x00f8 }
        L_0x00f2:
            java.lang.String r8 = "Unknown method type."
            r7.<init>(r8)     // Catch:{ all -> 0x00f8 }
            throw r7     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r7 = move-exception
        L_0x00f9:
            if (r2 != 0) goto L_0x00fe
            r0.disconnect()
        L_0x00fe:
            goto L_0x0100
        L_0x00ff:
            throw r7
        L_0x0100:
            goto L_0x00ff
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r7.a(com.google.android.gms.internal.ads.a, java.util.Map):v6.a0");
    }
}
