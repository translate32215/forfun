package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* compiled from: NavUtils */
public final class c {

    /* compiled from: NavUtils */
    public static class a {
        public static Intent a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        public static boolean b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        public static boolean c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    public static Intent a(Activity activity) {
        Intent a10 = a.a(activity);
        if (a10 != null) {
            return a10;
        }
        try {
            String c10 = c(activity, activity.getComponentName());
            if (c10 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, c10);
            try {
                if (c(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + c10 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static Intent b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String c10 = c(context, componentName);
        if (c10 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), c10);
        if (c(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String c(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 640;
        if (i10 >= 29) {
            i11 = 269222528;
        } else if (i10 >= 24) {
            i11 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i11);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }
}
