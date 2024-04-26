package c0;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* compiled from: AppOpsManagerCompat */
public final class f {

    /* compiled from: AppOpsManagerCompat */
    public static class a {
        public static <T> T a(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        public static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        public static int c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        public static String d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* compiled from: AppOpsManagerCompat */
    public static class b {
        public static int a(AppOpsManager appOpsManager, String str, int i10, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i10, str2);
        }

        public static String b(Context context) {
            return context.getOpPackageName();
        }

        public static AppOpsManager c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static int a(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.c((AppOpsManager) a.a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }
}
