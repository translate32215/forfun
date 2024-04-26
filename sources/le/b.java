package le;

/* compiled from: NamedRunnable */
public abstract class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final String f21260a;

    public b(String str, Object... objArr) {
        this.f21260a = c.m(str, objArr);
    }

    public abstract void a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f21260a);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
