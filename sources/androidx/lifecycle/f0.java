package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.o;

/* compiled from: ProcessLifecycleOwner */
public class f0 extends k {
    public final /* synthetic */ e0 this$0;

    /* compiled from: ProcessLifecycleOwner */
    public class a extends k {
        public a() {
        }

        public void onActivityPostResumed(Activity activity) {
            f0.this.this$0.a();
        }

        public void onActivityPostStarted(Activity activity) {
            f0.this.this$0.b();
        }
    }

    public f0(e0 e0Var) {
        this.this$0 = e0Var;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = g0.f2656b;
            ((g0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f2657a = this.this$0.f2645h;
        }
    }

    public void onActivityPaused(Activity activity) {
        e0 e0Var = this.this$0;
        int i10 = e0Var.f2639b - 1;
        e0Var.f2639b = i10;
        if (i10 == 0) {
            e0Var.f2642e.postDelayed(e0Var.f2644g, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new a());
    }

    public void onActivityStopped(Activity activity) {
        e0 e0Var = this.this$0;
        int i10 = e0Var.f2638a - 1;
        e0Var.f2638a = i10;
        if (i10 == 0 && e0Var.f2640c) {
            e0Var.f2643f.f(o.b.ON_STOP);
            e0Var.f2641d = true;
        }
    }
}
