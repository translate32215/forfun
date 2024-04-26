package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LifecycleDispatcher */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f2706a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher */
    public static class a extends k {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            g0.c(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }
}
