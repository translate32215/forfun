package com.startapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import java.util.Collections;

/* compiled from: Sta */
public class ae implements Application.ActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d  reason: collision with root package name */
    public static ae f10095d = new ae();

    /* renamed from: a  reason: collision with root package name */
    public boolean f10096a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10097b;

    /* renamed from: c  reason: collision with root package name */
    public a f10098c;

    /* compiled from: Sta */
    public interface a {
    }

    public final void a(boolean z10) {
        if (this.f10097b != z10) {
            this.f10097b = z10;
            if (this.f10096a) {
                a();
                if (this.f10098c == null) {
                    return;
                }
                if (!z10) {
                    gb.f10469h.a();
                    return;
                }
                gb.f10469h.getClass();
                Handler handler = gb.f10471j;
                if (handler != null) {
                    handler.removeCallbacks(gb.f10473l);
                    gb.f10471j = null;
                }
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        a(false);
    }

    public void onActivityStopped(Activity activity) {
        View b10;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z10 = true;
        boolean z11 = runningAppProcessInfo.importance != 100;
        boolean z12 = true;
        for (T t10 : Collections.unmodifiableCollection(pd.f11607c.f11609b)) {
            if (t10.c() && (b10 = t10.b()) != null && b10.hasWindowFocus()) {
                z12 = false;
            }
        }
        if (!z11 || !z12) {
            z10 = false;
        }
        a(z10);
    }

    public final void a() {
        boolean z10 = !this.f10097b;
        for (T t10 : Collections.unmodifiableCollection(pd.f11607c.f11608a)) {
            xb.a aVar = t10.f11678e;
            if (aVar.f27916a.get() != null) {
                re.f11684a.a(aVar.c(), "setState", z10 ? "foregrounded" : "backgrounded");
            }
        }
    }
}
