package e8;

import com.google.android.gms.internal.ads.fi;
import com.google.android.gms.internal.ads.m5;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.zh;
import e7.e;
import f7.j0;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bi implements li, wi, tk, ll {

    /* renamed from: a  reason: collision with root package name */
    public final yi f14014a;

    /* renamed from: b  reason: collision with root package name */
    public final qe f14015b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f14016c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f14017d;

    /* renamed from: e  reason: collision with root package name */
    public fi<Boolean> f14018e = new fi<>();

    /* renamed from: f  reason: collision with root package name */
    public ScheduledFuture<?> f14019f;

    public bi(yi yiVar, qe qeVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f14014a = yiVar;
        this.f14015b = qeVar;
        this.f14016c = scheduledExecutorService;
        this.f14017d = executor;
    }

    public final void C() {
    }

    public final void F() {
        int i10 = this.f14015b.S;
        if (i10 == 0 || i10 == 1) {
            this.f14014a.O();
        }
    }

    public final void J() {
    }

    public final void a() {
    }

    public final void b() {
        if (((Boolean) ti0.f16763j.f16769f.a(t.V0)).booleanValue()) {
            qe qeVar = this.f14015b;
            if (qeVar.S != 2) {
                return;
            }
            if (qeVar.f7963p == 0) {
                this.f14014a.O();
                return;
            }
            fi<Boolean> fiVar = this.f14018e;
            qh qhVar = new qh(this);
            fiVar.a(new j0((Future) fiVar, (zh) qhVar), this.f14017d);
            this.f14019f = this.f14016c.schedule(new e(this), (long) this.f14015b.f7963p, TimeUnit.MILLISECONDS);
        }
    }

    public final void c() {
    }

    public final void d0() {
    }

    public final synchronized void g(zh0 zh0) {
        if (!this.f14018e.isDone()) {
            ScheduledFuture<?> scheduledFuture = this.f14019f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f14018e.j(new Exception());
        }
    }

    public final void g0() {
    }

    public final synchronized void l() {
        if (!this.f14018e.isDone()) {
            ScheduledFuture<?> scheduledFuture = this.f14019f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f14018e.i(Boolean.TRUE);
        }
    }

    public final void t(m5 m5Var, String str, String str2) {
    }
}
