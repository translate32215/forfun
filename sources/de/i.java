package de;

import ie.d;
import java.util.concurrent.CancellationException;
import kd.o;

/* compiled from: JobSupport.kt */
public final class i extends y0 {

    /* renamed from: e  reason: collision with root package name */
    public final g<?> f13290e;

    public i(g<?> gVar) {
        this.f13290e = gVar;
    }

    public /* bridge */ /* synthetic */ Object c(Object obj) {
        q((Throwable) obj);
        return o.f20627a;
    }

    public void q(Throwable th) {
        boolean z10;
        g<?> gVar = this.f13290e;
        b1 r10 = r();
        gVar.getClass();
        CancellationException N = r10.N();
        if (!gVar.u()) {
            z10 = false;
        } else {
            z10 = ((d) gVar.f13283d).l(N);
        }
        if (!z10) {
            gVar.n(N);
            gVar.p();
        }
    }
}
