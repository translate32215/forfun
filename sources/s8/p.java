package s8;

import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f25040a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final int f25041b;

    /* renamed from: c  reason: collision with root package name */
    public final z<Void> f25042c;
    @GuardedBy("mLock")

    /* renamed from: d  reason: collision with root package name */
    public int f25043d;
    @GuardedBy("mLock")

    /* renamed from: e  reason: collision with root package name */
    public int f25044e;
    @GuardedBy("mLock")

    /* renamed from: f  reason: collision with root package name */
    public int f25045f;
    @GuardedBy("mLock")

    /* renamed from: g  reason: collision with root package name */
    public Exception f25046g;
    @GuardedBy("mLock")

    /* renamed from: h  reason: collision with root package name */
    public boolean f25047h;

    public p(int i10, z<Void> zVar) {
        this.f25041b = i10;
        this.f25042c = zVar;
    }

    public final void a(Object obj) {
        synchronized (this.f25040a) {
            this.f25043d++;
            c();
        }
    }

    public final void b() {
        synchronized (this.f25040a) {
            this.f25045f++;
            this.f25047h = true;
            c();
        }
    }

    @GuardedBy("mLock")
    public final void c() {
        if (this.f25043d + this.f25044e + this.f25045f != this.f25041b) {
            return;
        }
        if (this.f25046g != null) {
            z<Void> zVar = this.f25042c;
            int i10 = this.f25044e;
            int i11 = this.f25041b;
            StringBuilder sb2 = new StringBuilder(54);
            sb2.append(i10);
            sb2.append(" out of ");
            sb2.append(i11);
            sb2.append(" underlying tasks failed");
            zVar.o(new ExecutionException(sb2.toString(), this.f25046g));
        } else if (this.f25047h) {
            this.f25042c.q();
        } else {
            this.f25042c.p(null);
        }
    }

    public final void d(Exception exc) {
        synchronized (this.f25040a) {
            this.f25044e++;
            this.f25046g = exc;
            c();
        }
    }
}
