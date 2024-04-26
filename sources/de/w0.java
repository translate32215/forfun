package de;

import java.util.concurrent.CancellationException;
import kd.o;
import md.f;
import td.l;

/* compiled from: Job.kt */
public interface w0 extends f.b {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f13338l = 0;

    /* compiled from: Job.kt */
    public static final class a {
        public static /* synthetic */ h0 a(w0 w0Var, boolean z10, boolean z11, l lVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return w0Var.G(z10, z11, lVar);
        }
    }

    /* compiled from: Job.kt */
    public static final class b implements f.c<w0> {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ b f13339a = new b();
    }

    h0 G(boolean z10, boolean z11, l<? super Throwable, o> lVar);

    CancellationException N();

    void V(CancellationException cancellationException);

    boolean a();

    boolean start();

    j t(l lVar);
}
