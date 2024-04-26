package com.google.android.gms.internal.ads;

import e8.a00;
import e8.ah;
import e8.ei;
import e8.fi;
import e8.i5;
import e8.l50;
import e8.p50;
import e8.r10;
import e8.s10;
import e8.vz;
import e8.w00;
import e8.yz;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yd<R extends fi<AdT>, AdT extends ah> implements yz<R, AdT> {

    /* renamed from: a  reason: collision with root package name */
    public final yz<R, AdT> f8599a;

    /* renamed from: b  reason: collision with root package name */
    public final yz<R, vz<AdT>> f8600b;

    /* renamed from: c  reason: collision with root package name */
    public final df<AdT> f8601c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    public R f8602d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f8603e;

    public yd(yz<R, AdT> yzVar, yz<R, vz<AdT>> yzVar2, df<AdT> dfVar, Executor executor) {
        this.f8599a = yzVar;
        this.f8600b = yzVar2;
        this.f8601c = dfVar;
        this.f8603e = executor;
    }

    /* JADX WARNING: type inference failed for: r10v3, types: [e8.p50<AdT>, e8.l50] */
    public final synchronized p50<AdT> a(je jeVar, a00<R> a00) {
        w00 c10;
        a00 a002;
        je jeVar2;
        c10 = ((fi) a00.C(jeVar.f7150b).b()).c();
        a002 = a00;
        jeVar2 = jeVar;
        return l50.v(this.f8600b.a(jeVar, a00)).u(new i5(this, jeVar, new ae(a002, jeVar2, c10.f17190d, c10.f17192f, this.f8603e, c10.f17196j, (r10) null), (a00) a00), this.f8603e);
    }

    public final Object b() {
        R r10;
        synchronized (this) {
            r10 = this.f8602d;
        }
        return r10;
    }

    public final p50<AdT> c(s10<AdT> s10, je jeVar, a00<R> a00) {
        ei<R> C = a00.C(jeVar.f7150b);
        if (s10.f16366c != null) {
            fi fiVar = (fi) C.b();
            if (fiVar.b() != null) {
                s10.f16366c.f13728e.m(fiVar.b());
            }
            return yh.h(s10.f16366c);
        }
        C.c(s10.f16365b);
        p50<AdT> a10 = this.f8599a.a(jeVar, new ri((ei) C));
        this.f8602d = (fi) this.f8599a.b();
        return a10;
    }
}
