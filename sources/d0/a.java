package d0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* compiled from: ContextCompat */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f12940a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f12941b = new Object();

    /* renamed from: d0.a$a  reason: collision with other inner class name */
    /* compiled from: ContextCompat */
    public static class C0126a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* compiled from: ContextCompat */
    public static class b {
        public static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        public static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        public static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    /* compiled from: ContextCompat */
    public static class c {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* compiled from: ContextCompat */
    public static class d {
        public static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* compiled from: ContextCompat */
    public static class e {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public static int a(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        } else if (k0.a.a() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } else {
            return new androidx.core.app.d(context).a() ? 0 : -1;
        }
    }

    public static int b(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.a(context, i10);
        }
        return context.getResources().getColor(i10);
    }

    public static Drawable c(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            return c.b(context, i10);
        }
        return context.getResources().getDrawable(i10);
    }
}
