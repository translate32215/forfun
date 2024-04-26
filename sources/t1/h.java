package t1;

import java.util.concurrent.atomic.AtomicBoolean;
import y1.e;

/* compiled from: SharedSQLiteStatement */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f25407a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final e f25408b;

    /* renamed from: c  reason: collision with root package name */
    public volatile e f25409c;

    public h(e eVar) {
        this.f25408b = eVar;
    }

    public e a() {
        this.f25408b.a();
        if (this.f25407a.compareAndSet(false, true)) {
            if (this.f25409c == null) {
                this.f25409c = this.f25408b.d(b());
            }
            return this.f25409c;
        }
        return this.f25408b.d(b());
    }

    public abstract String b();

    public void c(e eVar) {
        if (eVar == this.f25409c) {
            this.f25407a.set(false);
        }
    }
}
