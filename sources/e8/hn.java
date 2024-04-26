package e8;

import o8.e3;
import o8.s4;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class hn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14923a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14924b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14925c;

    public hn(fn fnVar, boolean z10) {
        this.f14924b = fnVar;
        this.f14925c = z10;
    }

    public final void run() {
        switch (this.f14923a) {
            case 0:
                fn fnVar = (fn) this.f14924b;
                fnVar.f14654j.r(fnVar.f14663s.E1(), fnVar.f14663s.d4(), fnVar.f14663s.B5(), this.f14925c);
                return;
            case 1:
                ((e3) this.f14924b).f23173a.D();
                return;
            default:
                boolean g10 = ((s4) this.f14924b).f8864a.g();
                boolean a10 = ((s4) this.f14924b).f8864a.a();
                ((s4) this.f14924b).f8864a.A = Boolean.valueOf(this.f14925c);
                if (a10 == this.f14925c) {
                    ((s4) this.f14924b).f8864a.d().f8805n.b("Default data collection state already set to", Boolean.valueOf(this.f14925c));
                }
                if (((s4) this.f14924b).f8864a.g() == g10 || ((s4) this.f14924b).f8864a.g() != ((s4) this.f14924b).f8864a.a()) {
                    ((s4) this.f14924b).f8864a.d().f8802k.c("Default data collection is different than actual status", Boolean.valueOf(this.f14925c), Boolean.valueOf(g10));
                }
                ((s4) this.f14924b).E();
                return;
        }
    }

    public hn(e3 e3Var, boolean z10) {
        this.f14924b = e3Var;
        this.f14925c = z10;
    }

    public hn(s4 s4Var, boolean z10) {
        this.f14924b = s4Var;
        this.f14925c = z10;
    }
}
