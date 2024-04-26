package r7;

import android.os.Bundle;
import x4.a0;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class n extends p<Void> {
    public n(int i10, Bundle bundle) {
        super(i10, 2, bundle);
    }

    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            b(null);
        } else {
            c(new a0(4, "Invalid response to one way request"));
        }
    }

    public final boolean d() {
        return true;
    }
}
