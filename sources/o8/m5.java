package o8;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.r;
import k8.ia;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class m5 {

    /* renamed from: a  reason: collision with root package name */
    public long f23348a;

    /* renamed from: b  reason: collision with root package name */
    public long f23349b;

    /* renamed from: c  reason: collision with root package name */
    public final k f23350c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o5 f23351d;

    public m5(o5 o5Var) {
        this.f23351d = o5Var;
        this.f23350c = new f5(this, (d4) o5Var.f8864a);
        long a10 = o5Var.f8864a.f8850n.a();
        this.f23348a = a10;
        this.f23349b = a10;
    }

    public final boolean a(boolean z10, boolean z11, long j10) {
        this.f23351d.h();
        this.f23351d.i();
        ia.b();
        if (!this.f23351d.f8864a.f8843g.v((String) null, v2.f23518j0)) {
            this.f23351d.f8864a.t().f8819n.b(this.f23351d.f8864a.f8850n.b());
        } else if (this.f23351d.f8864a.g()) {
            this.f23351d.f8864a.t().f8819n.b(this.f23351d.f8864a.f8850n.b());
        }
        long j11 = j10 - this.f23348a;
        if (z10 || j11 >= 1000) {
            if (!z11) {
                j11 = j10 - this.f23349b;
                this.f23349b = j10;
            }
            this.f23351d.f8864a.d().f8805n.b("Recording user engagement, ms", Long.valueOf(j11));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j11);
            r.w(this.f23351d.f8864a.x().o(!this.f23351d.f8864a.f8843g.w()), bundle, true);
            f fVar = this.f23351d.f8864a.f8843g;
            u2<Boolean> u2Var = v2.U;
            if (!fVar.v((String) null, u2Var) && z11) {
                bundle.putLong("_fr", 1);
            }
            if (!this.f23351d.f8864a.f8843g.v((String) null, u2Var) || !z11) {
                this.f23351d.f8864a.v().o("auto", "_e", bundle);
            }
            this.f23348a = j10;
            this.f23350c.a();
            this.f23350c.c(3600000);
            return true;
        }
        this.f23351d.f8864a.d().f8805n.b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
        return false;
    }
}
