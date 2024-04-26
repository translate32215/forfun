package o8;

import android.content.Context;
import android.content.res.Resources;
import com.startapp.startappsdk.R;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class r3 {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final String b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier != 0) {
            try {
                return resources.getString(identifier);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }
}
