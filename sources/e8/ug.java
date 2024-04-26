package e8;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.g1;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.ads.pe;
import e7.e;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import r7.m;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ug extends dg {

    /* renamed from: h  reason: collision with root package name */
    public final g1 f16955h;

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f16956i;

    /* renamed from: j  reason: collision with root package name */
    public final Executor f16957j;

    public ug(zg zgVar, g1 g1Var, Runnable runnable, Executor executor) {
        super(zgVar);
        this.f16955h = g1Var;
        this.f16956i = runnable;
        this.f16957j = executor;
    }

    public final void b() {
        this.f16957j.execute(new m(this, (Runnable) new e(new AtomicReference(this.f16956i))));
    }

    public final hz c() {
        return null;
    }

    public final void d(ViewGroup viewGroup, li0 li0) {
    }

    public final pe e() {
        return null;
    }

    public final View f() {
        return null;
    }

    public final pe g() {
        return null;
    }

    public final int h() {
        return 0;
    }

    public final void i() {
    }
}
