package e8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wg0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final Application f17352a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Application.ActivityLifecycleCallbacks> f17353b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17354c = false;

    public wg0(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f17353b = new WeakReference<>(activityLifecycleCallbacks);
        this.f17352a = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17353b.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityCreated(activity, bundle);
            } else if (!this.f17354c) {
                this.f17352a.unregisterActivityLifecycleCallbacks(this);
                this.f17354c = true;
            }
        } catch (Exception e10) {
            e.C("Error while dispatching lifecycle callback.", e10);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17353b.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityDestroyed(activity);
            } else if (!this.f17354c) {
                this.f17352a.unregisterActivityLifecycleCallbacks(this);
                this.f17354c = true;
            }
        } catch (Exception e10) {
            e.C("Error while dispatching lifecycle callback.", e10);
        }
    }

    public final void onActivityPaused(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17353b.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityPaused(activity);
            } else if (!this.f17354c) {
                this.f17352a.unregisterActivityLifecycleCallbacks(this);
                this.f17354c = true;
            }
        } catch (Exception e10) {
            e.C("Error while dispatching lifecycle callback.", e10);
        }
    }

    public final void onActivityResumed(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17353b.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityResumed(activity);
            } else if (!this.f17354c) {
                this.f17352a.unregisterActivityLifecycleCallbacks(this);
                this.f17354c = true;
            }
        } catch (Exception e10) {
            e.C("Error while dispatching lifecycle callback.", e10);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17353b.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
            } else if (!this.f17354c) {
                this.f17352a.unregisterActivityLifecycleCallbacks(this);
                this.f17354c = true;
            }
        } catch (Exception e10) {
            e.C("Error while dispatching lifecycle callback.", e10);
        }
    }

    public final void onActivityStarted(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17353b.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityStarted(activity);
            } else if (!this.f17354c) {
                this.f17352a.unregisterActivityLifecycleCallbacks(this);
                this.f17354c = true;
            }
        } catch (Exception e10) {
            e.C("Error while dispatching lifecycle callback.", e10);
        }
    }

    public final void onActivityStopped(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17353b.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityStopped(activity);
            } else if (!this.f17354c) {
                this.f17352a.unregisterActivityLifecycleCallbacks(this);
                this.f17354c = true;
            }
        } catch (Exception e10) {
            e.C("Error while dispatching lifecycle callback.", e10);
        }
    }
}
