package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;
import javax.annotation.Nullable;
import s7.s;
import s7.t;
import s7.u;
import s7.v;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@CheckReturnValue
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class b {
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public static b f5800c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f5801a;

    /* renamed from: b  reason: collision with root package name */
    public volatile String f5802b;

    public b(Context context) {
        this.f5801a = context.getApplicationContext();
    }

    public static b a(Context context) {
        if (context != null) {
            synchronized (b.class) {
                if (f5800c == null) {
                    u uVar = c.f5803a;
                    synchronized (c.class) {
                        if (c.f5807e == null) {
                            c.f5807e = context.getApplicationContext();
                        } else {
                            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                        }
                    }
                    f5800c = new b(context);
                }
            }
            return f5800c;
        }
        throw new NullPointerException("null reference");
    }

    @Nullable
    public static final s c(PackageInfo packageInfo, s... sVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        t tVar = new t(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            if (sVarArr[i10].equals(tVar)) {
                return sVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean d(PackageInfo packageInfo, boolean z10) {
        s sVar;
        if (z10 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z10) {
                sVar = c(packageInfo, v.f25028a);
            } else {
                sVar = c(packageInfo, v.f25028a[0]);
            }
            if (sVar != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0164  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(int r19) {
        /*
            r18 = this;
            r1 = r18
            android.content.Context r0 = r1.f5801a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r2 = r19
            java.lang.String[] r2 = r0.getPackagesForUid(r2)
            if (r2 == 0) goto L_0x0189
            int r3 = r2.length
            if (r3 != 0) goto L_0x0015
            goto L_0x0189
        L_0x0015:
            r4 = 0
            r0 = r4
            r6 = 0
        L_0x0018:
            if (r6 >= r3) goto L_0x0185
            r13 = r2[r6]
            java.lang.String r14 = "Failed to get Google certificates from remote"
            java.lang.String r15 = "GoogleCertificates"
            java.lang.String r7 = "null pkg"
            if (r13 != 0) goto L_0x002b
            com.google.android.gms.common.f r0 = com.google.android.gms.common.f.b(r7)
            r12 = 0
            goto L_0x017c
        L_0x002b:
            java.lang.String r0 = r1.f5802b
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0179
            s7.u r0 = com.google.android.gms.common.c.f5803a
            android.os.StrictMode$ThreadPolicy r8 = android.os.StrictMode.allowThreadDiskReads()
            com.google.android.gms.common.c.b()     // Catch:{ a -> 0x004b, RemoteException -> 0x0049 }
            com.google.android.gms.common.internal.r r0 = com.google.android.gms.common.c.f5805c     // Catch:{ a -> 0x004b, RemoteException -> 0x0049 }
            boolean r0 = r0.q()     // Catch:{ a -> 0x004b, RemoteException -> 0x0049 }
            android.os.StrictMode.setThreadPolicy(r8)
            goto L_0x0053
        L_0x0046:
            r0 = move-exception
            goto L_0x0175
        L_0x0049:
            r0 = move-exception
            goto L_0x004c
        L_0x004b:
            r0 = move-exception
        L_0x004c:
            android.util.Log.e(r15, r14, r0)     // Catch:{ all -> 0x0046 }
            android.os.StrictMode.setThreadPolicy(r8)
            r0 = 0
        L_0x0053:
            r12 = 1
            if (r0 == 0) goto L_0x00e7
            android.content.Context r0 = r1.f5801a
            boolean r9 = s7.i.b(r0)
            android.os.StrictMode$ThreadPolicy r16 = android.os.StrictMode.allowThreadDiskReads()
            android.content.Context r0 = com.google.android.gms.common.c.f5807e     // Catch:{ all -> 0x00e2 }
            com.google.android.gms.common.internal.i.h(r0)     // Catch:{ all -> 0x00e2 }
            com.google.android.gms.common.c.b()     // Catch:{ a -> 0x00c7 }
            s7.w r0 = new s7.w     // Catch:{ all -> 0x00e2 }
            r10 = 0
            android.content.Context r7 = com.google.android.gms.common.c.f5807e     // Catch:{ all -> 0x00e2 }
            c8.b r11 = new c8.b     // Catch:{ all -> 0x00e2 }
            r11.<init>(r7)     // Catch:{ all -> 0x00e2 }
            r17 = 0
            r7 = r0
            r8 = r13
            r5 = 1
            r12 = r17
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00e2 }
            com.google.android.gms.common.internal.r r7 = com.google.android.gms.common.c.f5805c     // Catch:{ RemoteException -> 0x00bc }
            com.google.android.gms.common.d r0 = r7.H5(r0)     // Catch:{ RemoteException -> 0x00bc }
            boolean r7 = r0.f5808a     // Catch:{ all -> 0x00e2 }
            if (r7 == 0) goto L_0x0092
            int r0 = r0.f5811d     // Catch:{ all -> 0x00e2 }
            int r0 = androidx.appcompat.widget.p.n(r0)     // Catch:{ all -> 0x00e2 }
            com.google.android.gms.common.f r7 = new com.google.android.gms.common.f     // Catch:{ all -> 0x00e2 }
            r7.<init>(r5, r0, r4, r4)     // Catch:{ all -> 0x00e2 }
            goto L_0x00de
        L_0x0092:
            java.lang.String r5 = r0.f5809b     // Catch:{ all -> 0x00e2 }
            int r7 = r0.f5810c     // Catch:{ all -> 0x00e2 }
            int r7 = u.b.f(r7)     // Catch:{ all -> 0x00e2 }
            r8 = 4
            if (r7 != r8) goto L_0x00a3
            android.content.pm.PackageManager$NameNotFoundException r7 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ all -> 0x00e2 }
            r7.<init>()     // Catch:{ all -> 0x00e2 }
            goto L_0x00a4
        L_0x00a3:
            r7 = r4
        L_0x00a4:
            java.lang.String r8 = "error checking package certificate"
            if (r5 != 0) goto L_0x00a9
            r5 = r8
        L_0x00a9:
            int r8 = r0.f5811d     // Catch:{ all -> 0x00e2 }
            int r8 = androidx.appcompat.widget.p.n(r8)     // Catch:{ all -> 0x00e2 }
            int r0 = r0.f5810c     // Catch:{ all -> 0x00e2 }
            u.b.f(r0)     // Catch:{ all -> 0x00e2 }
            com.google.android.gms.common.f r0 = new com.google.android.gms.common.f     // Catch:{ all -> 0x00e2 }
            r9 = 0
            r0.<init>(r9, r8, r5, r7)     // Catch:{ all -> 0x00e2 }
            r7 = r0
            goto L_0x00de
        L_0x00bc:
            r0 = move-exception
            android.util.Log.e(r15, r14, r0)     // Catch:{ all -> 0x00e2 }
            java.lang.String r5 = "module call"
            com.google.android.gms.common.f r7 = com.google.android.gms.common.f.c(r5, r0)     // Catch:{ all -> 0x00e2 }
            goto L_0x00de
        L_0x00c7:
            r0 = move-exception
            r5 = r0
            android.util.Log.e(r15, r14, r5)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = "module init: "
            java.lang.String r7 = r5.getMessage()     // Catch:{ all -> 0x00e2 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = r0.concat(r7)     // Catch:{ all -> 0x00e2 }
            com.google.android.gms.common.f r7 = com.google.android.gms.common.f.c(r0, r5)     // Catch:{ all -> 0x00e2 }
        L_0x00de:
            android.os.StrictMode.setThreadPolicy(r16)
            goto L_0x0100
        L_0x00e2:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r16)
            throw r0
        L_0x00e7:
            r5 = 1
            android.content.Context r0 = r1.f5801a     // Catch:{ NameNotFoundException -> 0x0168 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0168 }
            r8 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r13, r8)     // Catch:{ NameNotFoundException -> 0x0168 }
            android.content.Context r8 = r1.f5801a
            boolean r8 = s7.i.b(r8)
            if (r0 != 0) goto L_0x0102
            com.google.android.gms.common.f r7 = com.google.android.gms.common.f.b(r7)
        L_0x0100:
            r12 = 0
            goto L_0x0160
        L_0x0102:
            android.content.pm.Signature[] r7 = r0.signatures
            if (r7 == 0) goto L_0x0159
            int r7 = r7.length
            if (r7 == r5) goto L_0x010a
            goto L_0x0159
        L_0x010a:
            s7.t r7 = new s7.t
            android.content.pm.Signature[] r9 = r0.signatures
            r10 = 0
            r9 = r9[r10]
            byte[] r9 = r9.toByteArray()
            r7.<init>(r9)
            java.lang.String r9 = r0.packageName
            android.os.StrictMode$ThreadPolicy r11 = android.os.StrictMode.allowThreadDiskReads()
            com.google.android.gms.common.f r8 = com.google.android.gms.common.c.a(r9, r7, r8, r10)     // Catch:{ all -> 0x0153 }
            android.os.StrictMode.setThreadPolicy(r11)
            boolean r10 = r8.f5817a
            if (r10 == 0) goto L_0x0150
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            if (r0 == 0) goto L_0x0150
            int r0 = r0.flags
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0150
            android.os.StrictMode$ThreadPolicy r10 = android.os.StrictMode.allowThreadDiskReads()
            r12 = 0
            com.google.android.gms.common.f r0 = com.google.android.gms.common.c.a(r9, r7, r12, r5)     // Catch:{ all -> 0x014a }
            android.os.StrictMode.setThreadPolicy(r10)
            boolean r0 = r0.f5817a
            if (r0 == 0) goto L_0x0151
            java.lang.String r0 = "debuggable release cert app rejected"
            com.google.android.gms.common.f r7 = com.google.android.gms.common.f.b(r0)
            goto L_0x0160
        L_0x014a:
            r0 = move-exception
            r2 = r0
            android.os.StrictMode.setThreadPolicy(r10)
            throw r2
        L_0x0150:
            r12 = 0
        L_0x0151:
            r7 = r8
            goto L_0x0160
        L_0x0153:
            r0 = move-exception
            r2 = r0
            android.os.StrictMode.setThreadPolicy(r11)
            throw r2
        L_0x0159:
            r12 = 0
            java.lang.String r0 = "single cert required"
            com.google.android.gms.common.f r7 = com.google.android.gms.common.f.b(r0)
        L_0x0160:
            boolean r0 = r7.f5817a
            if (r0 == 0) goto L_0x0166
            r1.f5802b = r13
        L_0x0166:
            r0 = r7
            goto L_0x017c
        L_0x0168:
            r0 = move-exception
            r12 = 0
            java.lang.String r5 = "no pkg "
            java.lang.String r5 = r5.concat(r13)
            com.google.android.gms.common.f r0 = com.google.android.gms.common.f.c(r5, r0)
            goto L_0x017c
        L_0x0175:
            android.os.StrictMode.setThreadPolicy(r8)
            throw r0
        L_0x0179:
            r12 = 0
            com.google.android.gms.common.f r0 = com.google.android.gms.common.f.f5816d
        L_0x017c:
            boolean r5 = r0.f5817a
            if (r5 == 0) goto L_0x0181
            goto L_0x018f
        L_0x0181:
            int r6 = r6 + 1
            goto L_0x0018
        L_0x0185:
            com.google.android.gms.common.internal.i.h(r0)
            goto L_0x018f
        L_0x0189:
            java.lang.String r0 = "no pkgs"
            com.google.android.gms.common.f r0 = com.google.android.gms.common.f.b(r0)
        L_0x018f:
            boolean r2 = r0.f5817a
            if (r2 != 0) goto L_0x01b1
            r2 = 3
            java.lang.String r3 = "GoogleCertificatesRslt"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L_0x01b1
            java.lang.Throwable r2 = r0.f5819c
            if (r2 == 0) goto L_0x01aa
            java.lang.String r2 = r0.a()
            java.lang.Throwable r4 = r0.f5819c
            android.util.Log.d(r3, r2, r4)
            goto L_0x01b1
        L_0x01aa:
            java.lang.String r2 = r0.a()
            android.util.Log.d(r3, r2)
        L_0x01b1:
            boolean r0 = r0.f5817a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.b.b(int):boolean");
    }
}
