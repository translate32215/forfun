package e8;

import android.view.View;
import com.google.android.gms.internal.ads.bv;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.pe;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qf extends ah {

    /* renamed from: h  reason: collision with root package name */
    public final View f16154h;

    /* renamed from: i  reason: collision with root package name */
    public final t7 f16155i;

    /* renamed from: j  reason: collision with root package name */
    public final int f16156j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f16157k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f16158l;

    /* renamed from: m  reason: collision with root package name */
    public bv f16159m;

    /* renamed from: n  reason: collision with root package name */
    public final j8 f16160n;

    public qf(zg zgVar, View view, t7 t7Var, pe peVar, int i10, boolean z10, boolean z11, j8 j8Var) {
        super(zgVar);
        this.f16154h = view;
        this.f16155i = t7Var;
        this.f16156j = i10;
        this.f16157k = z10;
        this.f16158l = z11;
        this.f16160n = j8Var;
    }

    public final boolean c() {
        t7 t7Var = this.f16155i;
        return (t7Var == null || t7Var.H() == null || !((s7) this.f16155i.H()).y()) ? false : true;
    }
}
