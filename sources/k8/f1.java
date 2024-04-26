package k8;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import c8.b;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import o8.r3;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.2 */
public final class f1 extends n1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Context f20201e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Bundle f20202f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ s1 f20203g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f1(s1 s1Var, String str, String str2, Context context, Bundle bundle) {
        super(s1Var, true);
        this.f20203g = s1Var;
        this.f20201e = context;
        this.f20202f = bundle;
    }

    public final void a() {
        s0 s0Var;
        try {
            i.h(this.f20201e);
            s1 s1Var = this.f20203g;
            Context context = this.f20201e;
            s1Var.getClass();
            try {
                s0Var = r0.asInterface(DynamiteModule.d(context, DynamiteModule.f5904d, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.a e10) {
                s1Var.a(e10, true, false);
                s0Var = null;
            }
            s1Var.f20460f = s0Var;
            if (this.f20203g.f20460f == null) {
                this.f20203g.getClass();
                Log.w("FA", "Failed to connect to measurement client.");
                return;
            }
            int a10 = DynamiteModule.a(this.f20201e, ModuleDescriptor.MODULE_ID);
            int b10 = DynamiteModule.b(this.f20201e, ModuleDescriptor.MODULE_ID);
            a1 a1Var = new a1(43042, (long) Math.max(a10, b10), b10 < a10, (String) null, (String) null, (String) null, this.f20202f, r3.a(this.f20201e));
            s0 s0Var2 = this.f20203g.f20460f;
            i.h(s0Var2);
            s0Var2.initialize(new b(this.f20201e), a1Var, this.f20370a);
        } catch (Exception e11) {
            this.f20203g.a(e11, true, false);
        }
    }
}
