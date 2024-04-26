package dev.pankaj.yacinetv.app;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.v4.media.a;
import android.util.Log;
import bd.s;
import java.io.File;
import java.util.Set;
import n1.e;
import sc.d;
import sc.f;
import ud.k;

/* compiled from: MainApp.kt */
public final class MainApp extends s {

    /* renamed from: i  reason: collision with root package name */
    public static MainApp f13344i;

    public static final MainApp l() {
        MainApp mainApp = f13344i;
        if (mainApp != null) {
            return mainApp;
        }
        k.l("instance");
        throw null;
    }

    public void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        k.f(context, "base");
        super.attachBaseContext(context);
        Set<File> set = e.f21818a;
        Log.i("MultiDex", "Installing application");
        if (e.f21819b) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        try {
            applicationInfo = getApplicationInfo();
        } catch (RuntimeException e10) {
            try {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e10);
                applicationInfo = null;
            } catch (Exception e11) {
                Log.e("MultiDex", "MultiDex installation failure", e11);
                StringBuilder a10 = a.a("MultiDex installation failed (");
                a10.append(e11.getMessage());
                a10.append(").");
                throw new RuntimeException(a10.toString());
            }
        }
        if (applicationInfo == null) {
            Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            return;
        }
        e.c(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir), "secondary-dexes", "", true);
        Log.i("MultiDex", "install done");
    }

    public String f() {
        d b10;
        f c10 = c();
        if (c10 == null || (b10 = c10.b()) == null) {
            return null;
        }
        return b10.b();
    }

    public void onCreate() {
        super.onCreate();
        k.f(this, "<set-?>");
        f13344i = this;
    }
}
