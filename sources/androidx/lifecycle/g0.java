package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.o;

/* compiled from: ReportFragment */
public class g0 extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f2656b = 0;

    /* renamed from: a  reason: collision with root package name */
    public a f2657a;

    /* compiled from: ReportFragment */
    public interface a {
    }

    /* compiled from: ReportFragment */
    public static class b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            g0.a(activity, o.b.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            g0.a(activity, o.b.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            g0.a(activity, o.b.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            g0.a(activity, o.b.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            g0.a(activity, o.b.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            g0.a(activity, o.b.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public static void a(Activity activity, o.b bVar) {
        if (activity instanceof v) {
            u c10 = ((v) activity).c();
            c10.e("handleLifecycleEvent");
            c10.h(bVar.a());
        } else if (activity instanceof t) {
            o c11 = ((t) activity).c();
            if (c11 instanceof u) {
                u uVar = (u) c11;
                uVar.e("handleLifecycleEvent");
                uVar.h(bVar.a());
            }
        }
    }

    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new g0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void b(o.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), bVar);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(o.b.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        b(o.b.ON_DESTROY);
        this.f2657a = null;
    }

    public void onPause() {
        super.onPause();
        b(o.b.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        a aVar = this.f2657a;
        if (aVar != null) {
            e0.this.a();
        }
        b(o.b.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        a aVar = this.f2657a;
        if (aVar != null) {
            e0.this.b();
        }
        b(o.b.ON_START);
    }

    public void onStop() {
        super.onStop();
        b(o.b.ON_STOP);
    }
}
