package ab;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.a;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class l implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final Set<Intent> f229a = Collections.newSetFromMap(new WeakHashMap());

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle extras;
        boolean z10;
        Intent intent = activity.getIntent();
        if (intent != null && this.f229a.add(intent) && (extras = intent.getExtras()) != null) {
            Bundle bundle2 = extras.getBundle("gcm.n.analytics_data");
            if (bundle2 == null) {
                z10 = false;
            } else {
                z10 = "1".equals(bundle2.getString("google.c.a.e"));
            }
            if (z10) {
                if (bundle2 != null) {
                    if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                        a b10 = a.b();
                        b10.a();
                        ja.a aVar = (ja.a) b10.f9665d.a(ja.a.class);
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                        }
                        if (aVar != null) {
                            String string = bundle2.getString("google.c.a.c_id");
                            aVar.d("fcm", "_ln", string);
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("source", "Firebase");
                            bundle3.putString("medium", "notification");
                            bundle3.putString("campaign", string);
                            aVar.w0("fcm", "_cmp", bundle3);
                        } else {
                            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                        }
                    } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                    }
                }
                t.b("_no", bundle2);
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f229a.remove(activity.getIntent());
        }
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
