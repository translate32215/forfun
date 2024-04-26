package o8;

import com.google.android.gms.measurement.internal.i;
import java.net.URL;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class d3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final URL f23160a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f23161b;

    /* renamed from: c  reason: collision with root package name */
    public final c3 f23162c;

    /* renamed from: d  reason: collision with root package name */
    public final String f23163d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f23164e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ i f23165f;

    public d3(i iVar, String str, URL url, byte[] bArr, Map<String, String> map, c3 c3Var) {
        this.f23165f = iVar;
        com.google.android.gms.common.internal.i.e(str);
        this.f23160a = url;
        this.f23161b = bArr;
        this.f23162c = c3Var;
        this.f23163d = str;
        this.f23164e = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd A[SYNTHETIC, Splitter:B:41:0x00cd] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00eb A[SYNTHETIC, Splitter:B:61:0x00eb] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0128 A[SYNTHETIC, Splitter:B:74:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.i r1 = r12.f23165f
            r1.g()
            r1 = 0
            r2 = 0
            com.google.android.gms.measurement.internal.i r3 = r12.f23165f     // Catch:{ IOException -> 0x0120, all -> 0x00e4 }
            java.net.URL r4 = r12.f23160a     // Catch:{ IOException -> 0x0120, all -> 0x00e4 }
            java.net.HttpURLConnection r3 = r3.l(r4)     // Catch:{ IOException -> 0x0120, all -> 0x00e4 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r12.f23164e     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            if (r4 == 0) goto L_0x0039
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
        L_0x001d:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            if (r5 == 0) goto L_0x0039
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r3.addRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            goto L_0x001d
        L_0x0039:
            byte[] r4 = r12.f23161b     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            if (r4 == 0) goto L_0x0087
            com.google.android.gms.measurement.internal.i r4 = r12.f23165f     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            o8.u5 r4 = r4.f23413b     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            com.google.android.gms.measurement.internal.q r4 = r4.f23476g     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            o8.u5.I(r4)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            byte[] r5 = r12.f23161b     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            byte[] r4 = r4.O(r5)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            com.google.android.gms.measurement.internal.i r5 = r12.f23165f     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            com.google.android.gms.measurement.internal.l r5 = r5.f8864a     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            com.google.android.gms.measurement.internal.h r5 = r5.d()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            o8.a3 r5 = r5.f8805n     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            int r6 = r4.length     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r7 = "Uploading data. size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r5.b(r7, r8)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r5 = 1
            r3.setDoOutput(r5)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r7 = "gzip"
            r3.addRequestProperty(r5, r7)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r3.setFixedLengthStreamingMode(r6)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r3.connect()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r5.write(r4)     // Catch:{ IOException -> 0x0081, all -> 0x007c }
            r5.close()     // Catch:{ IOException -> 0x0081, all -> 0x007c }
            goto L_0x0087
        L_0x007c:
            r4 = move-exception
            r11 = r2
            r2 = r5
            goto L_0x00e8
        L_0x0081:
            r4 = move-exception
            r11 = r2
            r9 = r4
            r2 = r5
            goto L_0x0125
        L_0x0087:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00c9 }
            r4.<init>()     // Catch:{ all -> 0x00c9 }
            java.io.InputStream r5 = r3.getInputStream()     // Catch:{ all -> 0x00c9 }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00c7 }
        L_0x009c:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x00c7 }
            if (r7 <= 0) goto L_0x00a6
            r4.write(r6, r1, r7)     // Catch:{ all -> 0x00c7 }
            goto L_0x009c
        L_0x00a6:
            byte[] r10 = r4.toByteArray()     // Catch:{ all -> 0x00c7 }
            r5.close()     // Catch:{ IOException -> 0x00d4, all -> 0x00d1 }
            r3.disconnect()
            com.google.android.gms.measurement.internal.i r0 = r12.f23165f
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.k r0 = r0.b()
            o8.z2 r1 = new o8.z2
            java.lang.String r6 = r12.f23163d
            o8.c3 r7 = r12.f23162c
            r9 = 0
            r5 = r1
            r5.<init>((java.lang.String) r6, (o8.c3) r7, (int) r8, (java.lang.Throwable) r9, (byte[]) r10, (java.util.Map) r11)
        L_0x00c3:
            r0.r(r1)
            return
        L_0x00c7:
            r1 = move-exception
            goto L_0x00cb
        L_0x00c9:
            r1 = move-exception
            r5 = r2
        L_0x00cb:
            if (r5 == 0) goto L_0x00d0
            r5.close()     // Catch:{ IOException -> 0x00d4, all -> 0x00d1 }
        L_0x00d0:
            throw r1     // Catch:{ IOException -> 0x00d4, all -> 0x00d1 }
        L_0x00d1:
            r1 = move-exception
            r4 = r1
            goto L_0x00e9
        L_0x00d4:
            r1 = move-exception
            r4 = r1
            goto L_0x00dc
        L_0x00d7:
            r4 = move-exception
            r11 = r2
            goto L_0x00e9
        L_0x00da:
            r4 = move-exception
            r11 = r2
        L_0x00dc:
            r9 = r4
            goto L_0x0126
        L_0x00de:
            r4 = move-exception
            r11 = r2
            goto L_0x00e8
        L_0x00e1:
            r4 = move-exception
            r11 = r2
            goto L_0x0124
        L_0x00e4:
            r3 = move-exception
            r4 = r3
            r3 = r2
            r11 = r3
        L_0x00e8:
            r8 = 0
        L_0x00e9:
            if (r2 == 0) goto L_0x0103
            r2.close()     // Catch:{ IOException -> 0x00ef }
            goto L_0x0103
        L_0x00ef:
            r1 = move-exception
            com.google.android.gms.measurement.internal.i r2 = r12.f23165f
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a
            com.google.android.gms.measurement.internal.h r2 = r2.d()
            o8.a3 r2 = r2.f8797f
            java.lang.String r5 = r12.f23163d
            java.lang.Object r5 = com.google.android.gms.measurement.internal.h.t(r5)
            r2.c(r0, r5, r1)
        L_0x0103:
            if (r3 == 0) goto L_0x0108
            r3.disconnect()
        L_0x0108:
            com.google.android.gms.measurement.internal.i r0 = r12.f23165f
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.k r0 = r0.b()
            o8.z2 r1 = new o8.z2
            java.lang.String r6 = r12.f23163d
            o8.c3 r7 = r12.f23162c
            r9 = 0
            r10 = 0
            r5 = r1
            r5.<init>((java.lang.String) r6, (o8.c3) r7, (int) r8, (java.lang.Throwable) r9, (byte[]) r10, (java.util.Map) r11)
            r0.r(r1)
            throw r4
        L_0x0120:
            r3 = move-exception
            r4 = r3
            r3 = r2
            r11 = r3
        L_0x0124:
            r9 = r4
        L_0x0125:
            r8 = 0
        L_0x0126:
            if (r2 == 0) goto L_0x0140
            r2.close()     // Catch:{ IOException -> 0x012c }
            goto L_0x0140
        L_0x012c:
            r1 = move-exception
            com.google.android.gms.measurement.internal.i r2 = r12.f23165f
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a
            com.google.android.gms.measurement.internal.h r2 = r2.d()
            o8.a3 r2 = r2.f8797f
            java.lang.String r4 = r12.f23163d
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r4)
            r2.c(r0, r4, r1)
        L_0x0140:
            if (r3 == 0) goto L_0x0145
            r3.disconnect()
        L_0x0145:
            com.google.android.gms.measurement.internal.i r0 = r12.f23165f
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.k r0 = r0.b()
            o8.z2 r1 = new o8.z2
            java.lang.String r6 = r12.f23163d
            o8.c3 r7 = r12.f23162c
            r10 = 0
            r5 = r1
            r5.<init>((java.lang.String) r6, (o8.c3) r7, (int) r8, (java.lang.Throwable) r9, (byte[]) r10, (java.util.Map) r11)
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.d3.run():void");
    }
}
