package ve;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import t3.a0;

/* compiled from: Timeout */
public class z {

    /* renamed from: d  reason: collision with root package name */
    public static final z f26785d = new a();

    /* renamed from: a  reason: collision with root package name */
    public boolean f26786a;

    /* renamed from: b  reason: collision with root package name */
    public long f26787b;

    /* renamed from: c  reason: collision with root package name */
    public long f26788c;

    /* compiled from: Timeout */
    public class a extends z {
        public z d(long j10) {
            return this;
        }

        public void f() throws IOException {
        }

        public z g(long j10, TimeUnit timeUnit) {
            return this;
        }
    }

    public z a() {
        this.f26786a = false;
        return this;
    }

    public z b() {
        this.f26788c = 0;
        return this;
    }

    public long c() {
        if (this.f26786a) {
            return this.f26787b;
        }
        throw new IllegalStateException("No deadline");
    }

    public z d(long j10) {
        this.f26786a = true;
        this.f26787b = j10;
        return this;
    }

    public boolean e() {
        return this.f26786a;
    }

    public void f() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f26786a && this.f26787b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public z g(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException(a0.a("timeout < 0: ", j10));
        } else if (timeUnit != null) {
            this.f26788c = timeUnit.toNanos(j10);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }
}
