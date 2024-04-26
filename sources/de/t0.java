package de;

import android.support.v4.media.a;
import kd.o;
import td.l;

/* compiled from: CancellableContinuationImpl.kt */
public final class t0 extends d {

    /* renamed from: a  reason: collision with root package name */
    public final l<Throwable, o> f13331a;

    public t0(l<? super Throwable, o> lVar) {
        this.f13331a = lVar;
    }

    public void a(Throwable th) {
        this.f13331a.c(th);
    }

    public Object c(Object obj) {
        this.f13331a.c((Throwable) obj);
        return o.f20627a;
    }

    public String toString() {
        StringBuilder a10 = a.a("InvokeOnCancel[");
        a10.append(a0.b(this.f13331a));
        a10.append('@');
        a10.append(a0.c(this));
        a10.append(']');
        return a10.toString();
    }
}
