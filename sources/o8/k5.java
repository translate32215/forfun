package o8;

import t1.c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class k5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23310a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f23311b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o5 f23312c;

    public k5(o5 o5Var, long j10, int i10) {
        this.f23310a = i10;
        if (i10 != 1) {
            this.f23312c = o5Var;
            this.f23311b = j10;
            return;
        }
        this.f23312c = o5Var;
        this.f23311b = j10;
    }

    public final void run() {
        switch (this.f23310a) {
            case 0:
                o5 o5Var = this.f23312c;
                long j10 = this.f23311b;
                o5Var.h();
                o5Var.l();
                o5Var.f8864a.d().f8805n.b("Activity resumed, time", Long.valueOf(j10));
                if (o5Var.f8864a.f8843g.w() || o5Var.f8864a.t().f8821p.b()) {
                    m5 m5Var = o5Var.f23380e;
                    m5Var.f23351d.h();
                    m5Var.f23350c.a();
                    m5Var.f23348a = j10;
                    m5Var.f23349b = j10;
                }
                c cVar = o5Var.f23381f;
                ((o5) cVar.f25351c).h();
                l5 l5Var = (l5) cVar.f25350b;
                if (l5Var != null) {
                    ((o5) cVar.f25351c).f23378c.removeCallbacks(l5Var);
                }
                ((o5) cVar.f25351c).f8864a.t().f8821p.a(false);
                n5 n5Var = o5Var.f23379d;
                n5Var.f23369a.h();
                if (n5Var.f23369a.f8864a.g()) {
                    n5Var.b(n5Var.f23369a.f8864a.f8850n.b(), false);
                    return;
                }
                return;
            default:
                o5 o5Var2 = this.f23312c;
                long j11 = this.f23311b;
                o5Var2.h();
                o5Var2.l();
                o5Var2.f8864a.d().f8805n.b("Activity paused, time", Long.valueOf(j11));
                c cVar2 = o5Var2.f23381f;
                l5 l5Var2 = new l5(cVar2, ((o5) cVar2.f25351c).f8864a.f8850n.b(), j11);
                cVar2.f25350b = l5Var2;
                ((o5) cVar2.f25351c).f23378c.postDelayed(l5Var2, 2000);
                if (o5Var2.f8864a.f8843g.w()) {
                    o5Var2.f23380e.f23350c.a();
                    return;
                }
                return;
        }
    }
}
