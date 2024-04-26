package k8;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class l4 extends ContentObserver {
    public l4() {
        super((Handler) null);
    }

    public final void onChange(boolean z10) {
        w4.f20516h.incrementAndGet();
    }
}
