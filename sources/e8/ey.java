package e8;

import d7.l;
import l0.e;
import o8.y1;
import o8.z4;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class ey implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14518a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14519b;

    /* renamed from: c  reason: collision with root package name */
    public final long f14520c;

    public ey(dy dyVar, long j10) {
        this.f14519b = dyVar;
        this.f14520c = j10;
    }

    public final void run() {
        switch (this.f14518a) {
            case 0:
                long j10 = this.f14520c;
                String canonicalName = ((dy) this.f14519b).getClass().getCanonicalName();
                long a10 = l.B.f13193j.a() - j10;
                StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 40);
                sb2.append("Signal runtime : ");
                sb2.append(canonicalName);
                sb2.append(" = ");
                sb2.append(a10);
                e.H(sb2.toString());
                return;
            case 1:
                ((y1) this.f14519b).n(this.f14520c);
                return;
            default:
                ((z4) this.f14519b).f8864a.n().k(this.f14520c);
                ((z4) this.f14519b).f23642e = null;
                return;
        }
    }

    public ey(y1 y1Var, long j10) {
        this.f14519b = y1Var;
        this.f14520c = j10;
    }

    public ey(z4 z4Var, long j10) {
        this.f14519b = z4Var;
        this.f14520c = j10;
    }
}
