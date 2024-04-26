package k0;

import android.content.Context;
import android.os.UserManager;

/* compiled from: UserManagerCompat */
public class l {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
