package o8;

import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.d;
import com.google.android.gms.measurement.internal.p;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class b5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b6 f23127a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f23128b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ w5 f23129c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ p f23130d;

    public b5(p pVar, b6 b6Var, boolean z10, w5 w5Var) {
        this.f23130d = pVar;
        this.f23127a = b6Var;
        this.f23128b = z10;
        this.f23129c = w5Var;
    }

    public final void run() {
        w5 w5Var;
        p pVar = this.f23130d;
        d dVar = pVar.f8867d;
        if (dVar == null) {
            pVar.f8864a.d().f8797f.a("Discarding data. Failed to set user property");
            return;
        }
        i.h(this.f23127a);
        p pVar2 = this.f23130d;
        if (this.f23128b) {
            w5Var = null;
        } else {
            w5Var = this.f23129c;
        }
        pVar2.l(dVar, w5Var, this.f23127a);
        this.f23130d.s();
    }
}
