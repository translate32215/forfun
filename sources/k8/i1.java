package k8;

import android.os.Bundle;
import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.2 */
public final class i1 extends n1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f20256e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f20257f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ s1 f20258g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i1(s1 s1Var, Bundle bundle) {
        super(s1Var, true);
        this.f20256e = 2;
        this.f20258g = s1Var;
        this.f20257f = bundle;
    }

    public final void a() {
        switch (this.f20256e) {
            case 0:
                s0 s0Var = this.f20258g.f20460f;
                i.h(s0Var);
                s0Var.getGmpAppId((o0) this.f20257f);
                return;
            case 1:
                s0 s0Var2 = this.f20258g.f20460f;
                i.h(s0Var2);
                s0Var2.getCurrentScreenName((o0) this.f20257f);
                return;
            default:
                s0 s0Var3 = this.f20258g.f20460f;
                i.h(s0Var3);
                s0Var3.setConsent((Bundle) this.f20257f, this.f20370a);
                return;
        }
    }

    public void b() {
        switch (this.f20256e) {
            case 0:
                ((o0) this.f20257f).o0((Bundle) null);
                return;
            case 1:
                ((o0) this.f20257f).o0((Bundle) null);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i1(s1 s1Var, o0 o0Var, int i10) {
        super(s1Var, true);
        this.f20256e = i10;
        if (i10 != 1) {
            this.f20258g = s1Var;
            this.f20257f = o0Var;
            return;
        }
        this.f20258g = s1Var;
        this.f20257f = o0Var;
        super(s1Var, true);
    }
}
