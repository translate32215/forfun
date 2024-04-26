package o8;

import com.google.android.gms.measurement.internal.p;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class e5 extends k {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f23180e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f23181f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e5(p pVar, d4 d4Var) {
        super(d4Var);
        this.f23181f = pVar;
    }

    public final void b() {
        switch (this.f23180e) {
            case 0:
                p pVar = (p) this.f23181f;
                pVar.h();
                if (pVar.n()) {
                    pVar.f8864a.d().f8805n.a("Inactivity, disconnecting from the service");
                    pVar.x();
                    return;
                }
                return;
            default:
                ((p5) this.f23181f).l();
                ((p5) this.f23181f).f8864a.d().f8805n.a("Starting upload from DelayedRunnable");
                ((p5) this.f23181f).f23413b.t();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e5(p5 p5Var, d4 d4Var) {
        super(d4Var);
        this.f23181f = p5Var;
    }
}
