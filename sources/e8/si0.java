package e8;

import android.content.Context;
import c8.b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.dy;
import com.google.android.gms.internal.ads.nx;
import com.google.android.gms.internal.ads.oy;
import com.google.android.gms.internal.ads.s2;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class si0 extends nx<dy> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f16495b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f16496c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ li0 f16497d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f16498e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s2 f16499f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m30 f16500g;

    public si0(m30 m30, Context context, li0 li0, String str, s2 s2Var, int i10) {
        this.f16495b = i10;
        if (i10 != 1) {
            this.f16500g = m30;
            this.f16496c = context;
            this.f16497d = li0;
            this.f16498e = str;
            this.f16499f = s2Var;
            return;
        }
        this.f16500g = m30;
        this.f16496c = context;
        this.f16497d = li0;
        this.f16498e = str;
        this.f16499f = s2Var;
    }

    public final Object a(oy oyVar) {
        switch (this.f16495b) {
            case 0:
                return oyVar.Y2(new b(this.f16496c), this.f16497d, this.f16498e, this.f16499f, ModuleDescriptor.MODULE_VERSION);
            default:
                return oyVar.D1(new b(this.f16496c), this.f16497d, this.f16498e, this.f16499f, ModuleDescriptor.MODULE_VERSION);
        }
    }

    public final /* synthetic */ Object c() {
        switch (this.f16495b) {
            case 0:
                m30.b(this.f16496c, "banner");
                return new ij0();
            default:
                m30.b(this.f16496c, "interstitial");
                return new ij0();
        }
    }

    public final /* synthetic */ Object d() {
        switch (this.f16495b) {
            case 0:
                return ((di0) this.f16500g.f15451a).c(this.f16496c, this.f16497d, this.f16498e, this.f16499f, 1);
            default:
                return ((di0) this.f16500g.f15451a).c(this.f16496c, this.f16497d, this.f16498e, this.f16499f, 2);
        }
    }
}
