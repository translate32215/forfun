package v6;

/* compiled from: ConditionVariable */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final b f26450a = b.f26424a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26451b;

    public synchronized void a() throws InterruptedException {
        while (!this.f26451b) {
            wait();
        }
    }

    public synchronized boolean b() {
        boolean z10;
        z10 = this.f26451b;
        this.f26451b = false;
        return z10;
    }

    public synchronized boolean c() {
        if (this.f26451b) {
            return false;
        }
        this.f26451b = true;
        notifyAll();
        return true;
    }
}
