package n0;

import t.d;

/* compiled from: Pools */
public class e<T> extends d {

    /* renamed from: d  reason: collision with root package name */
    public final Object f21814d = new Object();

    public e(int i10) {
        super(i10, 1);
    }

    public boolean a(T t10) {
        boolean a10;
        synchronized (this.f21814d) {
            a10 = super.a(t10);
        }
        return a10;
    }

    public T b() {
        T b10;
        synchronized (this.f21814d) {
            b10 = super.b();
        }
        return b10;
    }
}
