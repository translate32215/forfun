package k8;

import android.os.Bundle;
import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.2 */
public final class j1 extends n1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f20272e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o0 f20273f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ s1 f20274g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j1(s1 s1Var, o0 o0Var, int i10) {
        super(s1Var, true);
        this.f20272e = i10;
        if (i10 != 1) {
            this.f20274g = s1Var;
            this.f20273f = o0Var;
            return;
        }
        this.f20274g = s1Var;
        this.f20273f = o0Var;
        super(s1Var, true);
    }

    public final void a() {
        switch (this.f20272e) {
            case 0:
                s0 s0Var = this.f20274g.f20460f;
                i.h(s0Var);
                s0Var.getCachedAppInstanceId(this.f20273f);
                return;
            default:
                s0 s0Var2 = this.f20274g.f20460f;
                i.h(s0Var2);
                s0Var2.getCurrentScreenClass(this.f20273f);
                return;
        }
    }

    public final void b() {
        switch (this.f20272e) {
            case 0:
                this.f20273f.o0((Bundle) null);
                return;
            default:
                this.f20273f.o0((Bundle) null);
                return;
        }
    }
}
