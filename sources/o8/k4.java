package o8;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.p;
import f7.j0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final /* synthetic */ class k4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23306a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f23307b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f23308c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f23309d;

    public /* synthetic */ k4(s4 s4Var, Bundle bundle, long j10) {
        this.f23307b = s4Var;
        this.f23308c = bundle;
        this.f23309d = j10;
    }

    public final void run() {
        switch (this.f23306a) {
            case 0:
                ((s4) this.f23307b).C((Bundle) this.f23308c, this.f23309d);
                return;
            default:
                ((z4) this.f23308c).n((x4) this.f23307b, false, this.f23309d);
                z4 z4Var = (z4) this.f23308c;
                z4Var.f23642e = null;
                p y10 = z4Var.f8864a.y();
                y10.h();
                y10.i();
                y10.t(new j0(y10, (x4) null));
                return;
        }
    }

    public k4(z4 z4Var, x4 x4Var, long j10) {
        this.f23308c = z4Var;
        this.f23307b = x4Var;
        this.f23309d = j10;
    }
}
