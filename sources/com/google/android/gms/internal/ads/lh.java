package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.gh;
import e.f;
import e8.d50;
import e8.i50;
import e8.p50;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import r7.m;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class lh<InputT, OutputT> extends nh<OutputT> {

    /* renamed from: w  reason: collision with root package name */
    public static final Logger f7388w = Logger.getLogger(lh.class.getName());
    @NullableDecl

    /* renamed from: t  reason: collision with root package name */
    public sg<? extends p50<? extends InputT>> f7389t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f7390u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f7391v;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    public lh(sg<? extends p50<? extends InputT>> sgVar, boolean z10, boolean z11) {
        super(sgVar.size());
        this.f7389t = sgVar;
        this.f7390u = z10;
        this.f7391v = z11;
    }

    public static void B(Throwable th) {
        f7388w.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
    }

    public static boolean v(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    public static void y(lh lhVar, sg sgVar) {
        lhVar.getClass();
        int b10 = nh.f7583r.b(lhVar);
        int i10 = 0;
        if (!(b10 >= 0)) {
            throw new IllegalStateException("Less than 0 remaining futures");
        } else if (b10 == 0) {
            if (sgVar != null) {
                d50 d50 = (d50) sgVar.iterator();
                while (d50.hasNext()) {
                    Future future = (Future) d50.next();
                    if (!future.isCancelled()) {
                        lhVar.t(i10, future);
                    }
                    i10++;
                }
            }
            lhVar.f7585h = null;
            lhVar.z();
            lhVar.u(a.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    public final void A(Set<Throwable> set) {
        set.getClass();
        if (!(this.f6648a instanceof gh.b)) {
            Object obj = this.f6648a;
            v(set, obj instanceof gh.d ? ((gh.d) obj).f6656a : null);
        }
    }

    public final void c() {
        sg<? extends p50<? extends InputT>> sgVar = this.f7389t;
        u(a.OUTPUT_FUTURE_DONE);
        if ((this.f6648a instanceof gh.b) && (sgVar != null)) {
            boolean l10 = l();
            d50 d50 = (d50) sgVar.iterator();
            while (d50.hasNext()) {
                ((Future) d50.next()).cancel(l10);
            }
        }
    }

    public final String h() {
        sg<? extends p50<? extends InputT>> sgVar = this.f7389t;
        if (sgVar == null) {
            return super.h();
        }
        String valueOf = String.valueOf(sgVar);
        return f.a(valueOf.length() + 8, "futures=", valueOf);
    }

    public final void s(Throwable th) {
        th.getClass();
        if (this.f7390u && !j(th)) {
            Set<Throwable> set = this.f7585h;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                A(newSetFromMap);
                nh.f7583r.a(this, (Set<Throwable>) null, newSetFromMap);
                set = this.f7585h;
            }
            if (v(set, th)) {
                B(th);
                return;
            }
        }
        if (th instanceof Error) {
            B(th);
        }
    }

    public final void t(int i10, Future<? extends InputT> future) {
        try {
            x(i10, yh.f(future));
        } catch (ExecutionException e10) {
            s(e10.getCause());
        } catch (Throwable th) {
            s(th);
        }
    }

    public void u(a aVar) {
        aVar.getClass();
        this.f7389t = null;
    }

    public final void w() {
        uh uhVar = uh.f8247a;
        if (this.f7389t.isEmpty()) {
            z();
        } else if (this.f7390u) {
            int i10 = 0;
            d50 d50 = (d50) this.f7389t.iterator();
            while (d50.hasNext()) {
                p50 p50 = (p50) d50.next();
                p50.a(new i50(this, p50, i10), uhVar);
                i10++;
            }
        } else {
            m mVar = new m(this, (sg) this.f7391v ? this.f7389t : null);
            d50 d502 = (d50) this.f7389t.iterator();
            while (d502.hasNext()) {
                ((p50) d502.next()).a(mVar, uhVar);
            }
        }
    }

    public abstract void x(int i10, @NullableDecl InputT inputt);

    public abstract void z();
}
