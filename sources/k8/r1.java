package k8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.2 */
public final class r1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s1 f20446a;

    public r1(s1 s1Var) {
        this.f20446a = s1Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        s1 s1Var = this.f20446a;
        s1Var.f20455a.execute(new l1(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        s1 s1Var = this.f20446a;
        s1Var.f20455a.execute(new p1(this, activity, 1));
    }

    public final void onActivityPaused(Activity activity) {
        s1 s1Var = this.f20446a;
        s1Var.f20455a.execute(new g1(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        s1 s1Var = this.f20446a;
        s1Var.f20455a.execute(new p1(this, activity, 0));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        o0 o0Var = new o0();
        s1 s1Var = this.f20446a;
        s1Var.f20455a.execute(new l1(this, activity, o0Var));
        Bundle Y = o0Var.Y(50);
        if (Y != null) {
            bundle.putAll(Y);
        }
    }

    public final void onActivityStarted(Activity activity) {
        s1 s1Var = this.f20446a;
        s1Var.f20455a.execute(new o1(this, activity, 0));
    }

    public final void onActivityStopped(Activity activity) {
        s1 s1Var = this.f20446a;
        s1Var.f20455a.execute(new o1(this, activity, 1));
    }
}
