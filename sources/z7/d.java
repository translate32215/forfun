package z7;

import android.content.Context;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class d {
    public static boolean a(Context context, Throwable th) {
        if (context == null) {
            throw new NullPointerException("null reference");
        } else if (th != null) {
            return false;
        } else {
            try {
                throw new NullPointerException("null reference");
            } catch (Exception e10) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
                return false;
            }
        }
    }
}
