package e8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class z80 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final Application f17694a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Application.ActivityLifecycleCallbacks> f17695b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17696c = false;

    public z80(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f17695b = new WeakReference<>(activityLifecycleCallbacks);
        this.f17694a = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17695b.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityCreated(activity, bundle);
            } else if (!this.f17696c) {
                this.f17694a.unregisterActivityLifecycleCallbacks(this);
                this.f17696c = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17695b.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityDestroyed(activity);
            } else if (!this.f17696c) {
                this.f17694a.unregisterActivityLifecycleCallbacks(this);
                this.f17696c = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityPaused(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17695b.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityPaused(activity);
            } else if (!this.f17696c) {
                this.f17694a.unregisterActivityLifecycleCallbacks(this);
                this.f17696c = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityResumed(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17695b.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityResumed(activity);
            } else if (!this.f17696c) {
                this.f17694a.unregisterActivityLifecycleCallbacks(this);
                this.f17696c = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17695b.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
            } else if (!this.f17696c) {
                this.f17694a.unregisterActivityLifecycleCallbacks(this);
                this.f17696c = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityStarted(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17695b.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityStarted(activity);
            } else if (!this.f17696c) {
                this.f17694a.unregisterActivityLifecycleCallbacks(this);
                this.f17696c = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityStopped(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17695b.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityStopped(activity);
            } else if (!this.f17696c) {
                this.f17694a.unregisterActivityLifecycleCallbacks(this);
                this.f17696c = true;
            }
        } catch (Exception unused) {
        }
    }
}
