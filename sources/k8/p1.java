package k8;

import android.app.Activity;
import c8.b;
import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.2 */
public final class p1 extends n1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f20403e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Activity f20404f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ r1 f20405g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p1(r1 r1Var, Activity activity, int i10) {
        super(r1Var.f20446a, true);
        this.f20403e = i10;
        if (i10 != 1) {
            this.f20405g = r1Var;
            this.f20404f = activity;
            return;
        }
        this.f20405g = r1Var;
        this.f20404f = activity;
        super(r1Var.f20446a, true);
    }

    public final void a() {
        switch (this.f20403e) {
            case 0:
                s0 s0Var = this.f20405g.f20446a.f20460f;
                i.h(s0Var);
                s0Var.onActivityResumed(new b(this.f20404f), this.f20371b);
                return;
            default:
                s0 s0Var2 = this.f20405g.f20446a.f20460f;
                i.h(s0Var2);
                s0Var2.onActivityDestroyed(new b(this.f20404f), this.f20371b);
                return;
        }
    }
}
