package s7;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import b8.c;
import com.google.android.gms.common.b;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f25015a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f25016b = false;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f25017c = false;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f25018d = new AtomicBoolean();

    public static Context a(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean b(Context context) {
        if (!f25017c) {
            try {
                PackageInfo packageInfo = c.a(context).f3657a.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                b.a(context);
                if (packageInfo == null || b.d(packageInfo, false) || !b.d(packageInfo, true)) {
                    f25016b = false;
                } else {
                    f25016b = true;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
            } finally {
                f25017c = true;
            }
        }
        return f25016b || !"user".equals(Build.TYPE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077 A[RETURN] */
    @android.annotation.TargetApi(21)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r6.equals(r0)
            boolean r1 = z7.h.c()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0036
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ Exception -> 0x0035 }
            android.content.pm.PackageInstaller r1 = r1.getPackageInstaller()     // Catch:{ Exception -> 0x0035 }
            java.util.List r1 = r1.getAllSessions()     // Catch:{ Exception -> 0x0035 }
            java.util.Iterator r1 = r1.iterator()
        L_0x001e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0036
            java.lang.Object r4 = r1.next()
            android.content.pm.PackageInstaller$SessionInfo r4 = (android.content.pm.PackageInstaller.SessionInfo) r4
            java.lang.String r4 = r4.getAppPackageName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x001e
            return r2
        L_0x0035:
            return r3
        L_0x0036:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r4 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r6 = r1.getApplicationInfo(r6, r4)     // Catch:{ NameNotFoundException -> 0x0078 }
            if (r0 == 0) goto L_0x0045
            boolean r5 = r6.enabled     // Catch:{ NameNotFoundException -> 0x0078 }
            return r5
        L_0x0045:
            boolean r6 = r6.enabled     // Catch:{ NameNotFoundException -> 0x0078 }
            if (r6 == 0) goto L_0x0078
            boolean r6 = z7.h.a()     // Catch:{ NameNotFoundException -> 0x0078 }
            if (r6 == 0) goto L_0x0074
            java.lang.String r6 = "user"
            java.lang.Object r6 = r5.getSystemService(r6)     // Catch:{ NameNotFoundException -> 0x0078 }
            com.google.android.gms.common.internal.i.h(r6)     // Catch:{ NameNotFoundException -> 0x0078 }
            android.os.UserManager r6 = (android.os.UserManager) r6     // Catch:{ NameNotFoundException -> 0x0078 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0078 }
            android.os.Bundle r5 = r6.getApplicationRestrictions(r5)     // Catch:{ NameNotFoundException -> 0x0078 }
            if (r5 == 0) goto L_0x0074
            java.lang.String r6 = "restricted_profile"
            java.lang.String r5 = r5.getString(r6)     // Catch:{ NameNotFoundException -> 0x0078 }
            java.lang.String r6 = "true"
            boolean r5 = r6.equals(r5)     // Catch:{ NameNotFoundException -> 0x0078 }
            if (r5 == 0) goto L_0x0074
            r5 = 1
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            if (r5 != 0) goto L_0x0078
            return r2
        L_0x0078:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.i.c(android.content.Context, java.lang.String):boolean");
    }
}
