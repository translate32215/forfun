package com.google.android.gms.common.util;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class d {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public static String f5900a;

    /* renamed from: b  reason: collision with root package name */
    public static int f5901b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053 A[SYNTHETIC, Splitter:B:25:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005a A[SYNTHETIC, Splitter:B:33:0x005a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = f5900a
            if (r0 != 0) goto L_0x005f
            int r0 = f5901b
            if (r0 != 0) goto L_0x000e
            int r0 = android.os.Process.myPid()
            f5901b = r0
        L_0x000e:
            r1 = 0
            if (r0 > 0) goto L_0x0012
            goto L_0x005d
        L_0x0012:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0057, all -> 0x0050 }
            r2.<init>()     // Catch:{ IOException -> 0x0057, all -> 0x0050 }
            java.lang.String r3 = "/proc/"
            r2.append(r3)     // Catch:{ IOException -> 0x0057, all -> 0x0050 }
            r2.append(r0)     // Catch:{ IOException -> 0x0057, all -> 0x0050 }
            java.lang.String r0 = "/cmdline"
            r2.append(r0)     // Catch:{ IOException -> 0x0057, all -> 0x0050 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0057, all -> 0x0050 }
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ IOException -> 0x0057, all -> 0x0050 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x004b }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x004b }
            r4.<init>(r0)     // Catch:{ all -> 0x004b }
            r3.<init>(r4)     // Catch:{ all -> 0x004b }
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x0057, all -> 0x0050 }
            java.lang.String r0 = r3.readLine()     // Catch:{ IOException -> 0x0058, all -> 0x0048 }
            com.google.android.gms.common.internal.i.h(r0)     // Catch:{ IOException -> 0x0058, all -> 0x0048 }
            java.lang.String r1 = r0.trim()     // Catch:{ IOException -> 0x0058, all -> 0x0048 }
            r3.close()     // Catch:{ IOException -> 0x005d }
            goto L_0x005d
        L_0x0048:
            r0 = move-exception
            r1 = r3
            goto L_0x0051
        L_0x004b:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x0057, all -> 0x0050 }
            throw r0     // Catch:{ IOException -> 0x0057, all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
        L_0x0051:
            if (r1 == 0) goto L_0x0056
            r1.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            throw r0
        L_0x0057:
            r3 = r1
        L_0x0058:
            if (r3 == 0) goto L_0x005d
            r3.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            f5900a = r1
        L_0x005f:
            java.lang.String r0 = f5900a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.d.a():java.lang.String");
    }
}
