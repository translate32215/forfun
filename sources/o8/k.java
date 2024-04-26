package o8;

import android.os.Handler;
import e7.i;
import k8.n0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public abstract class k {

    /* renamed from: d  reason: collision with root package name */
    public static volatile Handler f23298d;

    /* renamed from: a  reason: collision with root package name */
    public final d4 f23299a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f23300b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f23301c;

    public k(d4 d4Var) {
        if (d4Var != null) {
            this.f23299a = d4Var;
            this.f23300b = new i(this, d4Var);
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final void a() {
        this.f23301c = 0;
        d().removeCallbacks(this.f23300b);
    }

    public abstract void b();

    public final void c(long j10) {
        a();
        if (j10 >= 0) {
            this.f23301c = this.f23299a.e().b();
            if (!d().postDelayed(this.f23300b, j10)) {
                this.f23299a.d().f8797f.b("Failed to schedule delayed post. time", Long.valueOf(j10));
            }
        }
    }

    public final Handler d() {
        Handler handler;
        if (f23298d != null) {
            return f23298d;
        }
        synchronized (k.class) {
            if (f23298d == null) {
                f23298d = new n0(this.f23299a.c().getMainLooper());
            }
            handler = f23298d;
        }
        return handler;
    }
}
