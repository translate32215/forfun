package o8;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.measurement.internal.l;
import k8.n0;
import t1.c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class o5 extends k3 {

    /* renamed from: c  reason: collision with root package name */
    public Handler f23378c;

    /* renamed from: d  reason: collision with root package name */
    public final n5 f23379d = new n5(this);

    /* renamed from: e  reason: collision with root package name */
    public final m5 f23380e = new m5(this);

    /* renamed from: f  reason: collision with root package name */
    public final c f23381f = new c(this);

    public o5(l lVar) {
        super(lVar);
    }

    public final boolean k() {
        return false;
    }

    public final void l() {
        h();
        if (this.f23378c == null) {
            this.f23378c = new n0(Looper.getMainLooper());
        }
    }
}
