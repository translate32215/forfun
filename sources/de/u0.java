package de;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kd.o;
import td.l;

/* compiled from: JobSupport.kt */
public final class u0 extends y0 {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13333f = AtomicIntegerFieldUpdater.newUpdater(u0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: e  reason: collision with root package name */
    public final l<Throwable, o> f13334e;

    public u0(l<? super Throwable, o> lVar) {
        this.f13334e = lVar;
    }

    public /* bridge */ /* synthetic */ Object c(Object obj) {
        q((Throwable) obj);
        return o.f20627a;
    }

    public void q(Throwable th) {
        if (f13333f.compareAndSet(this, 0, 1)) {
            this.f13334e.c(th);
        }
    }
}
