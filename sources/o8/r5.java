package o8;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public abstract class r5 extends q5 {

    /* renamed from: c  reason: collision with root package name */
    public boolean f23422c;

    public r5(u5 u5Var) {
        super(u5Var);
        this.f23413b.f23486q++;
    }

    public final void i() {
        if (!this.f23422c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (!this.f23422c) {
            k();
            this.f23413b.f23487r++;
            this.f23422c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean k();
}
