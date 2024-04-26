package z7;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import b8.c;
import com.google.android.gms.common.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class i {
    public static boolean a(Context context, int i10) {
        if (!b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            b a10 = b.a(context);
            a10.getClass();
            if (packageInfo == null) {
                return false;
            }
            if (!b.d(packageInfo, false)) {
                if (!b.d(packageInfo, true)) {
                    return false;
                }
                if (!s7.i.b(a10.f5801a)) {
                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    public static boolean b(Context context, int i10, String str) {
        b8.b a10 = c.a(context);
        a10.getClass();
        if (h.b()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) a10.f3657a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i10, str);
                } else {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = a10.f3657a.getPackageManager().getPackagesForUid(i10);
            if (str == null || packagesForUid == null) {
                return false;
            }
            int i11 = 0;
            while (i11 < packagesForUid.length) {
                if (!str.equals(packagesForUid[i11])) {
                    i11++;
                }
            }
            return false;
        }
        return true;
    }
}
