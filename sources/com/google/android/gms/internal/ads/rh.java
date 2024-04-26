package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.lh;
import e8.p50;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class rh<V> extends lh<Object, V> {

    /* renamed from: x  reason: collision with root package name */
    public sh f8039x;

    public rh(sg<? extends p50<?>> sgVar, boolean z10, Executor executor, Callable<V> callable) {
        super(sgVar, z10, false);
        this.f8039x = new sh(this, callable, executor);
        w();
    }

    public final void f() {
        sh shVar = this.f8039x;
        if (shVar != null) {
            shVar.a();
        }
    }

    public final void u(lh.a aVar) {
        super.u(aVar);
        if (aVar == lh.a.OUTPUT_FUTURE_DONE) {
            this.f8039x = null;
        }
    }

    public final void x(int i10, @NullableDecl Object obj) {
    }

    public final void z() {
        sh shVar = this.f8039x;
        if (shVar != null) {
            try {
                shVar.f8125d.execute(shVar);
            } catch (RejectedExecutionException e10) {
                shVar.f8126e.j(e10);
            }
        }
    }
}
