package k8;

import android.os.Bundle;
import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.2 */
public final class c1 extends n1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f20088e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f20089f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ s1 f20090g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c1(s1 s1Var, Bundle bundle) {
        super(s1Var, true);
        this.f20090g = s1Var;
        this.f20089f = bundle;
    }

    public final void a() {
        switch (this.f20088e) {
            case 0:
                s0 s0Var = this.f20090g.f20460f;
                i.h(s0Var);
                s0Var.setConditionalUserProperty((Bundle) this.f20089f, this.f20370a);
                return;
            case 1:
                s0 s0Var2 = this.f20090g.f20460f;
                i.h(s0Var2);
                s0Var2.endAdUnitExposure((String) this.f20089f, this.f20371b);
                return;
            default:
                s0 s0Var3 = this.f20090g.f20460f;
                i.h(s0Var3);
                s0Var3.generateEventId((o0) this.f20089f);
                return;
        }
    }

    public void b() {
        switch (this.f20088e) {
            case 2:
                ((o0) this.f20089f).o0((Bundle) null);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c1(s1 s1Var, String str) {
        super(s1Var, true);
        this.f20090g = s1Var;
        this.f20089f = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c1(s1 s1Var, o0 o0Var) {
        super(s1Var, true);
        this.f20090g = s1Var;
        this.f20089f = o0Var;
    }
}
