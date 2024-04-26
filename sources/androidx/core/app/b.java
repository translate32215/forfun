package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* compiled from: ActivityCompat */
public class b extends d0.a {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f1381c = 0;

    /* compiled from: ActivityCompat */
    public static class a {
        public static void a(Activity activity) {
            activity.finishAffinity();
        }

        public static void b(Activity activity, Intent intent, int i10, Bundle bundle) {
            activity.startActivityForResult(intent, i10, bundle);
        }

        public static void c(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    /* renamed from: androidx.core.app.b$b  reason: collision with other inner class name */
    /* compiled from: ActivityCompat */
    public static class C0016b {
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat */
    public static class c {
        public static <T> T a(Activity activity, int i10) {
            return activity.requireViewById(i10);
        }
    }

    /* compiled from: ActivityCompat */
    public interface d {
        void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat */
    public interface e {
        void a(int i10);
    }
}
