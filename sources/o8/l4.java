package o8;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class l4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23323a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f23324b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s4 f23325c;

    public l4(s4 s4Var, long j10, int i10) {
        this.f23323a = i10;
        if (i10 != 1) {
            this.f23325c = s4Var;
            this.f23324b = j10;
            return;
        }
        this.f23325c = s4Var;
        this.f23324b = j10;
    }

    public final void run() {
        switch (this.f23323a) {
            case 0:
                this.f23325c.f8864a.t().f8815j.b(this.f23324b);
                this.f23325c.f8864a.d().f8804m.b("Session timeout duration set", Long.valueOf(this.f23324b));
                return;
            default:
                this.f23325c.r(this.f23324b, true);
                this.f23325c.f8864a.y().y(new AtomicReference());
                return;
        }
    }
}
