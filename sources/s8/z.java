package s8;

import com.google.android.gms.common.internal.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public final class z<TResult> extends i<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f25070a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final x<TResult> f25071b = new x<>();
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    public boolean f25072c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f25073d;
    @GuardedBy("mLock")

    /* renamed from: e  reason: collision with root package name */
    public TResult f25074e;
    @GuardedBy("mLock")

    /* renamed from: f  reason: collision with root package name */
    public Exception f25075f;

    public final i<TResult> a(Executor executor, c cVar) {
        this.f25071b.a(new s(executor, cVar));
        s();
        return this;
    }

    public final i<TResult> b(d<TResult> dVar) {
        this.f25071b.a(new t(k.f25036a, dVar));
        s();
        return this;
    }

    public final i<TResult> c(Executor executor, e eVar) {
        this.f25071b.a(new u(executor, eVar));
        s();
        return this;
    }

    public final i<TResult> d(Executor executor, f<? super TResult> fVar) {
        this.f25071b.a(new v(executor, fVar));
        s();
        return this;
    }

    public final <TContinuationResult> i<TContinuationResult> e(Executor executor, a<TResult, TContinuationResult> aVar) {
        z zVar = new z();
        this.f25071b.a(new q(executor, aVar, zVar, 0));
        s();
        return zVar;
    }

    public final <TContinuationResult> i<TContinuationResult> f(Executor executor, a<TResult, i<TContinuationResult>> aVar) {
        z zVar = new z();
        this.f25071b.a(new q(executor, aVar, zVar, 1));
        s();
        return zVar;
    }

    public final Exception g() {
        Exception exc;
        synchronized (this.f25070a) {
            exc = this.f25075f;
        }
        return exc;
    }

    public final TResult h() {
        TResult tresult;
        synchronized (this.f25070a) {
            i.k(this.f25072c, "Task is not yet complete");
            if (!this.f25073d) {
                Exception exc = this.f25075f;
                if (exc == null) {
                    tresult = this.f25074e;
                } else {
                    throw new g(exc);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return tresult;
    }

    public final <X extends Throwable> TResult i(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f25070a) {
            i.k(this.f25072c, "Task is not yet complete");
            if (this.f25073d) {
                throw new CancellationException("Task is already canceled.");
            } else if (!cls.isInstance(this.f25075f)) {
                Exception exc = this.f25075f;
                if (exc == null) {
                    tresult = this.f25074e;
                } else {
                    throw new g(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.f25075f));
            }
        }
        return tresult;
    }

    public final boolean j() {
        return this.f25073d;
    }

    public final boolean k() {
        boolean z10;
        synchronized (this.f25070a) {
            z10 = this.f25072c;
        }
        return z10;
    }

    public final boolean l() {
        boolean z10;
        synchronized (this.f25070a) {
            z10 = false;
            if (this.f25072c && !this.f25073d && this.f25075f == null) {
                z10 = true;
            }
        }
        return z10;
    }

    public final <TContinuationResult> i<TContinuationResult> m(Executor executor, h<TResult, TContinuationResult> hVar) {
        z zVar = new z();
        this.f25071b.a(new q(executor, hVar, zVar));
        s();
        return zVar;
    }

    public final <TContinuationResult> i<TContinuationResult> n(h<TResult, TContinuationResult> hVar) {
        Executor executor = k.f25036a;
        z zVar = new z();
        this.f25071b.a(new q(executor, hVar, zVar));
        s();
        return zVar;
    }

    public final void o(Exception exc) {
        i.i(exc, "Exception must not be null");
        synchronized (this.f25070a) {
            r();
            this.f25072c = true;
            this.f25075f = exc;
        }
        this.f25071b.b(this);
    }

    public final void p(TResult tresult) {
        synchronized (this.f25070a) {
            r();
            this.f25072c = true;
            this.f25074e = tresult;
        }
        this.f25071b.b(this);
    }

    public final boolean q() {
        synchronized (this.f25070a) {
            if (this.f25072c) {
                return false;
            }
            this.f25072c = true;
            this.f25073d = true;
            this.f25071b.b(this);
            return true;
        }
    }

    @GuardedBy("mLock")
    public final void r() {
        Throwable th;
        String str;
        if (this.f25072c) {
            int i10 = b.f25034a;
            if (k()) {
                Exception g10 = g();
                if (g10 != null) {
                    str = "failure";
                } else if (l()) {
                    str = "result ".concat(String.valueOf(h()));
                } else {
                    str = j() ? "cancellation" : "unknown issue";
                }
                th = new b(str.length() != 0 ? "Complete with: ".concat(str) : new String("Complete with: "), g10);
            } else {
                th = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            throw th;
        }
    }

    public final void s() {
        synchronized (this.f25070a) {
            if (this.f25072c) {
                this.f25071b.b(this);
            }
        }
    }
}
