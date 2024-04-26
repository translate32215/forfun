package k8;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class c4 extends ContentObserver {
    public c4() {
        super((Handler) null);
    }

    public final void onChange(boolean z10) {
        d4.f20111d.set(true);
    }
}
