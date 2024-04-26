package com.startapp;

import java.io.File;

/* compiled from: Sta */
public class q8 {

    /* renamed from: a  reason: collision with root package name */
    public static o8 f11624a;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r7) {
        /*
            android.content.Context r0 = com.startapp.j0.a(r7)
            if (r0 == 0) goto L_0x0007
            r7 = r0
        L_0x0007:
            com.startapp.o8 r0 = f11624a
            if (r0 != 0) goto L_0x0012
            com.startapp.o8 r0 = new com.startapp.o8
            r0.<init>(r7)
            f11624a = r0
        L_0x0012:
            com.startapp.o8 r0 = f11624a
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String[] r2 = com.startapp.p8.f11574a
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.addAll(r2)
            boolean r1 = r0.a((java.util.List<java.lang.String>) r1)
            java.lang.String r2 = "test-keys"
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L_0x007f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String[] r5 = com.startapp.p8.f11575b
            java.util.List r5 = java.util.Arrays.asList(r5)
            r1.addAll(r5)
            boolean r1 = r0.a((java.util.List<java.lang.String>) r1)
            if (r1 != 0) goto L_0x007f
            java.lang.String r1 = "su"
            boolean r1 = r0.a((java.lang.String) r1)
            if (r1 != 0) goto L_0x007f
            java.lang.String r1 = "busybox"
            boolean r1 = r0.a((java.lang.String) r1)
            if (r1 != 0) goto L_0x007f
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x007f
            boolean r1 = r0.b()
            if (r1 != 0) goto L_0x007f
            java.lang.String r1 = android.os.Build.TAGS
            if (r1 == 0) goto L_0x006b
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x006b
            r1 = 1
            goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            if (r1 != 0) goto L_0x007f
            boolean r1 = r0.c()
            if (r1 != 0) goto L_0x007f
            java.lang.String r1 = "magisk"
            boolean r0 = r0.a((java.lang.String) r1)
            if (r0 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r0 = 0
            goto L_0x0080
        L_0x007f:
            r0 = 1
        L_0x0080:
            if (r0 != 0) goto L_0x00ea
            java.lang.String r0 = android.os.Build.TAGS
            if (r0 == 0) goto L_0x008e
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x008e
            r0 = 1
            goto L_0x008f
        L_0x008e:
            r0 = 0
        L_0x008f:
            if (r0 != 0) goto L_0x00ea
            boolean r0 = a()
            if (r0 != 0) goto L_0x00ea
            boolean r0 = a()
            if (r0 != 0) goto L_0x00ea
            boolean r0 = b()
            if (r0 != 0) goto L_0x00ea
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00af }
            java.lang.String r1 = "/system/app/Superuser.apk"
            r0.<init>(r1)     // Catch:{ all -> 0x00af }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00af }
            goto L_0x00b0
        L_0x00af:
            r0 = 0
        L_0x00b0:
            if (r0 != 0) goto L_0x00ea
            r0 = 6
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "com.noshufou.android.su"
            r1[r3] = r2
            java.lang.String r2 = "com.thirdparty.superuser"
            r1[r4] = r2
            r2 = 2
            java.lang.String r5 = "eu.chainfire.supersu"
            r1[r2] = r5
            r2 = 3
            java.lang.String r5 = "com.koushikdutta.superuser"
            r1[r2] = r5
            r2 = 4
            java.lang.String r5 = "com.zachspong.temprootremovejb"
            r1[r2] = r5
            r2 = 5
            java.lang.String r5 = "com.ramdroid.appquarantine"
            r1[r2] = r5
            r2 = 0
        L_0x00d2:
            if (r2 >= r0) goto L_0x00e7
            r5 = r1[r2]
            android.content.pm.PackageManager r6 = r7.getPackageManager()
            r6.getPackageInfo(r5, r4)     // Catch:{ all -> 0x00df }
            r5 = 1
            goto L_0x00e0
        L_0x00df:
            r5 = 0
        L_0x00e0:
            if (r5 == 0) goto L_0x00e4
            r7 = 1
            goto L_0x00e8
        L_0x00e4:
            int r2 = r2 + 1
            goto L_0x00d2
        L_0x00e7:
            r7 = 0
        L_0x00e8:
            if (r7 == 0) goto L_0x00eb
        L_0x00ea:
            r3 = 1
        L_0x00eb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.q8.a(android.content.Context):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b() {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0030 }
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = "/system/xbin/which"
            r2[r0] = r3     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = "su"
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x0030 }
            java.lang.Process r1 = r1.exec(r2)     // Catch:{ all -> 0x0030 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x002e }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x002e }
            java.io.InputStream r5 = r1.getInputStream()     // Catch:{ all -> 0x002e }
            r3.<init>(r5)     // Catch:{ all -> 0x002e }
            r2.<init>(r3)     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r2.readLine()     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x002a
            r0 = 1
        L_0x002a:
            r1.destroy()
            return r0
        L_0x002e:
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            if (r1 == 0) goto L_0x0036
            r1.destroy()
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.q8.b():boolean");
    }

    public static boolean a() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i10 = 0; i10 < 10; i10++) {
            if (new File(strArr[i10]).exists()) {
                return true;
            }
        }
        return false;
    }
}
