package e8;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import p.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cb0 extends e {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<bb0> f14103a;

    public cb0(bb0 bb0) {
        this.f14103a = new WeakReference<>(bb0);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        bb0 bb0 = (bb0) this.f14103a.get();
        if (bb0 != null) {
            bb0.a();
        }
    }
}
