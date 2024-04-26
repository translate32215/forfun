package r7;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class r extends p<Bundle> {
    public r(int i10, Bundle bundle) {
        super(i10, 1, bundle);
    }

    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        b(bundle2);
    }

    public final boolean d() {
        return false;
    }
}
