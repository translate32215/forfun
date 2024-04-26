package com.startapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* compiled from: Sta */
public class v9 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12700a = "v9";

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f12701b = false;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e A[SYNTHETIC, Splitter:B:19:0x003e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] a(java.lang.String r5) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 10240(0x2800, float:1.4349E-41)
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x0038 }
            r4.<init>(r5)     // Catch:{ all -> 0x0038 }
        L_0x0010:
            int r5 = r4.read(r1)     // Catch:{ all -> 0x0035 }
            r3 = -1
            if (r5 == r3) goto L_0x001b
            r0.write(r1, r2, r5)     // Catch:{ all -> 0x0035 }
            goto L_0x0010
        L_0x001b:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0035 }
            byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "UTF-8"
            r5.<init>(r0, r1)     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "\n"
            java.lang.String[] r5 = r5.split(r0)     // Catch:{ all -> 0x0035 }
            r4.close()     // Catch:{ all -> 0x0030 }
            goto L_0x0034
        L_0x0030:
            r0 = move-exception
            com.startapp.x2.b(r0)
        L_0x0034:
            return r5
        L_0x0035:
            r5 = move-exception
            r3 = r4
            goto L_0x0039
        L_0x0038:
            r5 = move-exception
        L_0x0039:
            com.startapp.x2.a((java.lang.Throwable) r5)     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x0046
            r3.close()     // Catch:{ all -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r5 = move-exception
            com.startapp.x2.b(r5)
        L_0x0046:
            java.lang.String[] r5 = new java.lang.String[r2]
            return r5
        L_0x0049:
            r5 = move-exception
            if (r3 == 0) goto L_0x0054
            r3.close()     // Catch:{ all -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r0 = move-exception
            com.startapp.x2.b(r0)
        L_0x0054:
            goto L_0x0056
        L_0x0055:
            throw r5
        L_0x0056:
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.v9.a(java.lang.String):java.lang.String[]");
    }

    public static String[] b(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            Process exec = Runtime.getRuntime().exec(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            boolean z10 = true;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (!z10) {
                    stringBuffer.append("\n");
                }
                stringBuffer.append(readLine);
                z10 = false;
            }
            bufferedReader.close();
            exec.waitFor();
        } catch (Throwable th) {
            x2.a(th);
        }
        return stringBuffer.toString().split("\\n");
    }
}
