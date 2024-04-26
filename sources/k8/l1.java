package k8;

import android.app.Activity;
import android.os.Bundle;
import c8.b;
import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.2 */
public final class l1 extends n1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f20301e = 4;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f20302f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f20303g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f20304h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l1(r1 r1Var, Activity activity, o0 o0Var) {
        super(r1Var.f20446a, true);
        this.f20304h = r1Var;
        this.f20302f = activity;
        this.f20303g = o0Var;
    }

    public final void a() {
        Bundle bundle = null;
        switch (this.f20301e) {
            case 0:
                s0 s0Var = ((s1) this.f20304h).f20460f;
                i.h(s0Var);
                s0Var.logHealthData(5, (String) this.f20302f, new b(this.f20303g), new b((Object) null), new b((Object) null));
                return;
            case 1:
                s0 s0Var2 = ((s1) this.f20304h).f20460f;
                i.h(s0Var2);
                s0Var2.performAction((Bundle) this.f20302f, (o0) this.f20303g, this.f20370a);
                return;
            case 2:
                s0 s0Var3 = ((s1) this.f20304h).f20460f;
                i.h(s0Var3);
                s0Var3.getMaxUserProperties((String) this.f20302f, (o0) this.f20303g);
                return;
            case 3:
                if (((Bundle) this.f20302f) != null) {
                    bundle = new Bundle();
                    if (((Bundle) this.f20302f).containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = ((Bundle) this.f20302f).get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                s0 s0Var4 = ((r1) this.f20304h).f20446a.f20460f;
                i.h(s0Var4);
                s0Var4.onActivityCreated(new b((Activity) this.f20303g), bundle, this.f20371b);
                return;
            default:
                s0 s0Var5 = ((r1) this.f20304h).f20446a.f20460f;
                i.h(s0Var5);
                s0Var5.onActivitySaveInstanceState(new b((Activity) this.f20302f), (o0) this.f20303g, this.f20371b);
                return;
        }
    }

    public void b() {
        switch (this.f20301e) {
            case 1:
                ((o0) this.f20303g).o0((Bundle) null);
                return;
            case 2:
                ((o0) this.f20303g).o0((Bundle) null);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l1(r1 r1Var, Bundle bundle, Activity activity) {
        super(r1Var.f20446a, true);
        this.f20304h = r1Var;
        this.f20302f = bundle;
        this.f20303g = activity;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l1(s1 s1Var, Bundle bundle, o0 o0Var) {
        super(s1Var, true);
        this.f20304h = s1Var;
        this.f20302f = bundle;
        this.f20303g = o0Var;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l1(s1 s1Var, String str, Object obj) {
        super(s1Var, false);
        this.f20304h = s1Var;
        this.f20302f = str;
        this.f20303g = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l1(s1 s1Var, String str, o0 o0Var) {
        super(s1Var, true);
        this.f20304h = s1Var;
        this.f20302f = str;
        this.f20303g = o0Var;
    }
}
