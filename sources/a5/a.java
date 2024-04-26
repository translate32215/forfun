package a5;

/* compiled from: Buffer */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public int f61a;

    public final void i(int i10) {
        this.f61a = i10 | this.f61a;
    }

    public final boolean m(int i10) {
        return (this.f61a & i10) == i10;
    }

    public final boolean o() {
        return m(268435456);
    }

    public final boolean q() {
        return m(Integer.MIN_VALUE);
    }

    public final boolean r() {
        return m(4);
    }

    public final boolean s() {
        return m(1);
    }
}
