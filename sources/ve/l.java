package ve;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingTimeout */
public class l extends z {

    /* renamed from: e  reason: collision with root package name */
    public z f26749e;

    public l(z zVar) {
        if (zVar != null) {
            this.f26749e = zVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public z a() {
        return this.f26749e.a();
    }

    public z b() {
        return this.f26749e.b();
    }

    public long c() {
        return this.f26749e.c();
    }

    public z d(long j10) {
        return this.f26749e.d(j10);
    }

    public boolean e() {
        return this.f26749e.e();
    }

    public void f() throws IOException {
        this.f26749e.f();
    }

    public z g(long j10, TimeUnit timeUnit) {
        return this.f26749e.g(j10, timeUnit);
    }
}
