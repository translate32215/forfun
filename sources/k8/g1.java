package k8;

import android.app.Activity;
import c8.b;
import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.2 */
public final class g1 extends n1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f20215e = 1;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f20216f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f20217g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g1(r1 r1Var, Activity activity) {
        super(r1Var.f20446a, true);
        this.f20217g = r1Var;
        this.f20216f = activity;
    }

    public final void a() {
        switch (this.f20215e) {
            case 0:
                s0 s0Var = ((s1) this.f20217g).f20460f;
                i.h(s0Var);
                s0Var.beginAdUnitExposure((String) this.f20216f, this.f20371b);
                return;
            default:
                s0 s0Var2 = ((r1) this.f20217g).f20446a.f20460f;
                i.h(s0Var2);
                s0Var2.onActivityPaused(new b((Activity) this.f20216f), this.f20371b);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g1(s1 s1Var, String str) {
        super(s1Var, true);
        this.f20217g = s1Var;
        this.f20216f = str;
    }
}
