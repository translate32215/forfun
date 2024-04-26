package com.startapp;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* compiled from: Sta */
public class o8 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11528a;

    public o8(Context context) {
        this.f11528a = context;
    }

    public boolean a(String str) {
        boolean z10 = false;
        for (String file : p8.f11576c) {
            if (new File(file, str).exists()) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean b() {
        String[] strArr = new String[0];
        try {
            strArr = new Scanner(Runtime.getRuntime().exec("mount").getInputStream()).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e10) {
            e10.printStackTrace();
        }
        boolean z10 = false;
        for (String split : strArr) {
            String[] split2 = split.split(" ");
            if (split2.length >= 4) {
                String str = split2[1];
                String str2 = split2[3];
                for (String equalsIgnoreCase : p8.f11577d) {
                    if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                        String[] split3 = str2.split(",");
                        int length = split3.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                break;
                            } else if (split3[i10].equalsIgnoreCase("rw")) {
                                z10 = true;
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            }
        }
        return z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c() {
        /*
            r6 = this;
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0030 }
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = "which"
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
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.o8.c():boolean");
    }

    public final boolean a(List<String> list) {
        PackageManager packageManager = this.f11528a.getPackageManager();
        boolean z10 = false;
        for (String packageInfo : list) {
            try {
                packageManager.getPackageInfo(packageInfo, 0);
                z10 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z10;
    }

    public boolean a() {
        HashMap hashMap = new HashMap();
        hashMap.put("ro.debuggable", "1");
        hashMap.put("ro.secure", "0");
        String[] strArr = new String[0];
        try {
            strArr = new Scanner(Runtime.getRuntime().exec("getprop").getInputStream()).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e10) {
            e10.printStackTrace();
        }
        boolean z10 = false;
        for (String str : strArr) {
            for (String str2 : hashMap.keySet()) {
                if (str.contains(str2)) {
                    if (str.contains("[" + ((String) hashMap.get(str2)) + "]")) {
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }
}
