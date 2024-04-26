package o8;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.p;
import f7.f0;
import k8.v0;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@19.0.2 */
public final class j4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23294a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v0 f23295b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f23296c;

    public j4(AppMeasurementDynamiteService appMeasurementDynamiteService, v0 v0Var, int i10) {
        this.f23294a = i10;
        if (i10 != 1) {
            this.f23296c = appMeasurementDynamiteService;
            this.f23295b = v0Var;
            return;
        }
        this.f23296c = appMeasurementDynamiteService;
        this.f23295b = v0Var;
    }

    public final void run() {
        switch (this.f23294a) {
            case 0:
                p y10 = this.f23296c.f8778a.y();
                v0 v0Var = this.f23295b;
                y10.h();
                y10.i();
                y10.t(new f0(y10, y10.q(false), v0Var));
                return;
            default:
                this.f23296c.f8778a.A().B(this.f23295b, this.f23296c.f8778a.a());
                return;
        }
    }
}
