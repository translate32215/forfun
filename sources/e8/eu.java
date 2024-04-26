package e8;

import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class eu implements zi {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14514a;

    /* renamed from: b  reason: collision with root package name */
    public final t7 f14515b;

    public eu(t7 t7Var, int i10) {
        this.f14514a = i10;
        if (i10 != 1) {
            this.f14515b = t7Var;
        } else {
            this.f14515b = t7Var;
        }
    }

    public final void O() {
        switch (this.f14514a) {
            case 0:
                t7 t7Var = this.f14515b;
                if (t7Var.H() != null) {
                    ((s7) t7Var.H()).C();
                    return;
                }
                return;
            default:
                t7 t7Var2 = this.f14515b;
                if (t7Var2.H() != null) {
                    ((s7) t7Var2.H()).C();
                    return;
                }
                return;
        }
    }
}
