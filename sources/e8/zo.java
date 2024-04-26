package e8;

import android.graphics.Rect;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class zo implements ug0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17780a;

    /* renamed from: b  reason: collision with root package name */
    public final t7 f17781b;

    public zo(t7 t7Var, int i10) {
        this.f17780a = i10;
        if (i10 != 1) {
            this.f17781b = t7Var;
        } else {
            this.f17781b = t7Var;
        }
    }

    public final void t(vg0 vg0) {
        switch (this.f17780a) {
            case 0:
                uc H = this.f17781b.H();
                Rect rect = vg0.f17136d;
                ((s7) H).g(rect.left, rect.top, false);
                return;
            default:
                uc H2 = this.f17781b.H();
                Rect rect2 = vg0.f17136d;
                ((s7) H2).g(rect2.left, rect2.top, false);
                return;
        }
    }
}
