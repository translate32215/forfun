package de;

import android.support.v4.media.a;
import kd.o;

/* compiled from: CancellableContinuation.kt */
public final class i0 extends d {

    /* renamed from: a  reason: collision with root package name */
    public final h0 f13291a;

    public i0(h0 h0Var) {
        this.f13291a = h0Var;
    }

    public void a(Throwable th) {
        this.f13291a.f();
    }

    public Object c(Object obj) {
        Throwable th = (Throwable) obj;
        this.f13291a.f();
        return o.f20627a;
    }

    public String toString() {
        StringBuilder a10 = a.a("DisposeOnCancel[");
        a10.append(this.f13291a);
        a10.append(']');
        return a10.toString();
    }
}
