package k8;

import android.app.Activity;
import c8.b;
import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.2 */
public final class o1 extends n1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f20387e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Activity f20388f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ r1 f20389g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o1(r1 r1Var, Activity activity, int i10) {
        super(r1Var.f20446a, true);
        this.f20387e = i10;
        if (i10 != 1) {
            this.f20389g = r1Var;
            this.f20388f = activity;
            return;
        }
        this.f20389g = r1Var;
        this.f20388f = activity;
        super(r1Var.f20446a, true);
    }

    public final void a() {
        switch (this.f20387e) {
            case 0:
                s0 s0Var = this.f20389g.f20446a.f20460f;
                i.h(s0Var);
                s0Var.onActivityStarted(new b(this.f20388f), this.f20371b);
                return;
            default:
                s0 s0Var2 = this.f20389g.f20446a.f20460f;
                i.h(s0Var2);
                s0Var2.onActivityStopped(new b(this.f20388f), this.f20371b);
                return;
        }
    }
}
