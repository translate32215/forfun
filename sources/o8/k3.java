package o8;

import com.google.android.gms.measurement.internal.l;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public abstract class k3 extends w2 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f23305b;

    public k3(l lVar) {
        super(lVar);
        lVar.E++;
    }

    public final void i() {
        if (!this.f23305b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f23305b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!k()) {
            this.f8864a.F.incrementAndGet();
            this.f23305b = true;
        }
    }

    public abstract boolean k();
}
