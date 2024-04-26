package com.startapp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Signature;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: Sta */
public class w1 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12733a = "w1";

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f12734b = false;

    /* renamed from: c  reason: collision with root package name */
    private static final String f12735c = "cdnconfig.txt";

    /* renamed from: d  reason: collision with root package name */
    private static final String f12736d = "cdnconfig.txt.sig";

    /* renamed from: e  reason: collision with root package name */
    private static final int f12737e = 10000;

    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a() {
        /*
            r0 = 0
            com.startapp.y4 r1 = com.startapp.a5.b()     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = r1.CONNECTIVITY_TEST_CDNCONFIG_URL()     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = "[PROJECTID]"
            com.startapp.y4 r3 = com.startapp.a5.b()     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = r3.PROJECT_ID()     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ all -> 0x0096 }
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0096 }
            r2.<init>(r1)     // Catch:{ all -> 0x0096 }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ all -> 0x0096 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "GET"
            r1.setRequestMethod(r0)     // Catch:{ all -> 0x0094 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r1.setConnectTimeout(r0)     // Catch:{ all -> 0x0094 }
            r1.setReadTimeout(r0)     // Catch:{ all -> 0x0094 }
            com.startapp.b5 r0 = com.startapp.a5.c()     // Catch:{ all -> 0x0094 }
            long r2 = r0.g()     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = a((long) r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = "If-Modified-Since"
            r1.setRequestProperty(r2, r0)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "Connection"
            java.lang.String r2 = "close"
            r1.setRequestProperty(r0, r2)     // Catch:{ all -> 0x0094 }
            int r0 = r1.getResponseCode()     // Catch:{ all -> 0x0094 }
            r2 = 304(0x130, float:4.26E-43)
            if (r0 != r2) goto L_0x005b
            com.startapp.b5 r0 = com.startapp.a5.c()     // Catch:{ all -> 0x0094 }
            long r2 = com.startapp.ua.d()     // Catch:{ all -> 0x0094 }
            r0.e((long) r2)     // Catch:{ all -> 0x0094 }
            goto L_0x009f
        L_0x005b:
            int r0 = r1.getResponseCode()     // Catch:{ all -> 0x0094 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x009f
            long r2 = r1.getLastModified()     // Catch:{ all -> 0x0094 }
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ all -> 0x0094 }
            boolean r4 = a((java.io.InputStream) r0)     // Catch:{ all -> 0x008f }
            r0.close()     // Catch:{ all -> 0x0094 }
            if (r4 == 0) goto L_0x0087
            com.startapp.b5 r0 = com.startapp.a5.c()     // Catch:{ all -> 0x0094 }
            long r4 = com.startapp.ua.d()     // Catch:{ all -> 0x0094 }
            r0.e((long) r4)     // Catch:{ all -> 0x0094 }
            com.startapp.b5 r0 = com.startapp.a5.c()     // Catch:{ all -> 0x0094 }
            r0.b((long) r2)     // Catch:{ all -> 0x0094 }
            goto L_0x009f
        L_0x0087:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = "Verification of downloaded cdn config failed"
            r0.<init>(r2)     // Catch:{ all -> 0x0094 }
            throw r0     // Catch:{ all -> 0x0094 }
        L_0x008f:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0094 }
            throw r2     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            goto L_0x009a
        L_0x0096:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x009a:
            com.startapp.x2.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x00a2
        L_0x009f:
            r1.disconnect()
        L_0x00a2:
            return
        L_0x00a3:
            r0 = move-exception
            if (r1 == 0) goto L_0x00a9
            r1.disconnect()
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.w1.a():void");
    }

    private static boolean a(InputStream inputStream) throws IOException {
        v1 v1Var;
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        byte[] bArr = new byte[512];
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                } else if (!nextEntry.isDirectory()) {
                    if (nextEntry.getName().equalsIgnoreCase(f12735c)) {
                        for (int read = zipInputStream.read(bArr); read != -1; read = zipInputStream.read(bArr)) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byteArrayOutputStream.flush();
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().equalsIgnoreCase(f12736d)) {
                        for (int read2 = zipInputStream.read(bArr); read2 != -1; read2 = zipInputStream.read(bArr)) {
                            byteArrayOutputStream2.write(bArr, 0, read2);
                        }
                        byteArrayOutputStream2.flush();
                        zipInputStream.closeEntry();
                    }
                }
            } catch (Throwable th) {
                x2.b(th);
            }
        }
        zipInputStream.close();
        try {
            byteArrayOutputStream2.close();
        } catch (Throwable th2) {
            x2.b(th2);
        }
        try {
            byteArrayOutputStream.close();
        } catch (Throwable th3) {
            x2.b(th3);
        }
        boolean z10 = true;
        if (a5.b().CONNECTIVITY_TEST_VERIFY_CDNCONFIG_SIGNATURE()) {
            z10 = a(byteArrayOutputStream, byteArrayOutputStream2);
        }
        if (z10 && (v1Var = (v1) r5.a(new String(byteArrayOutputStream.toByteArray(), "UTF-8"), v1.class)) != null) {
            b5 c10 = a5.c();
            c10.a((Set<String>) null);
            c10.b((Set<String>) new HashSet(v1Var.ct.cdn));
            c10.c(v1Var.ct.criteria);
            c10.c((Set<String>) new HashSet(v1Var.ltr.cdn));
            c10.d(v1Var.ltr.criteria);
        }
        return z10;
        throw th;
        byteArrayOutputStream.close();
        throw th;
    }

    private static boolean a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
        try {
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            Signature instance = Signature.getInstance("SHA256withRSA");
            instance.initVerify(a5.e());
            instance.update(byteArray2);
            return instance.verify(byteArray);
        } catch (Throwable th) {
            x2.a(th);
            return false;
        }
    }

    private static String a(long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(Long.valueOf(j10));
    }
}
