package o8;

import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.n;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public abstract class c4 extends n {

    /* renamed from: b  reason: collision with root package name */
    public boolean f23152b;

    public c4(l lVar) {
        super(lVar);
        lVar.E++;
    }

    public void i() {
    }

    public abstract boolean j();

    public final void k() {
        if (!n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void l() {
        if (this.f23152b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!j()) {
            this.f8864a.F.incrementAndGet();
            this.f23152b = true;
        }
    }

    public final void m() {
        if (!this.f23152b) {
            i();
            this.f8864a.F.incrementAndGet();
            this.f23152b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean n() {
        return this.f23152b;
    }
}
