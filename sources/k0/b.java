package k0;

import android.os.Bundle;
import android.os.IBinder;
import ud.k;

/* compiled from: Bundle.kt */
public final class b {
    public static final void a(Bundle bundle, String str, IBinder iBinder) {
        k.f(bundle, "bundle");
        k.f(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
