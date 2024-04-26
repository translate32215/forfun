package ab;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f201a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    @TargetApi(26)
    public static boolean a(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb2.append(i10);
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Couldn't find resource ");
            sb3.append(i10);
            sb3.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb3.toString());
            return false;
        }
    }
}
