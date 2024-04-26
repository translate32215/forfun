package k8;

import android.app.Activity;
import android.os.Bundle;
import c8.b;
import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.2 */
public final class d1 extends n1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f20103e = 1;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f20104f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f20105g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f20106h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ s1 f20107i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d1(s1 s1Var, Activity activity, String str, String str2) {
        super(s1Var, true);
        this.f20107i = s1Var;
        this.f20106h = activity;
        this.f20104f = str;
        this.f20105g = str2;
    }

    public final void a() {
        switch (this.f20103e) {
            case 0:
                s0 s0Var = this.f20107i.f20460f;
                i.h(s0Var);
                s0Var.clearConditionalUserProperty(this.f20104f, this.f20105g, (Bundle) this.f20106h);
                return;
            default:
                s0 s0Var2 = this.f20107i.f20460f;
                i.h(s0Var2);
                s0Var2.setCurrentScreen(new b((Activity) this.f20106h), this.f20104f, this.f20105g, this.f20370a);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d1(s1 s1Var, String str, String str2, Bundle bundle) {
        super(s1Var, true);
        this.f20107i = s1Var;
        this.f20104f = str;
        this.f20105g = str2;
        this.f20106h = bundle;
    }
}
