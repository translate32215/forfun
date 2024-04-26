package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.b0;
import androidx.leanback.widget.r0;
import androidx.leanback.widget.r1;
import androidx.leanback.widget.y0;

/* compiled from: VerticalGridPresenter */
public class q1 implements j0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r1.b f2507a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r1 f2508b;

    public q1(r1 r1Var, r1.b bVar) {
        this.f2508b = r1Var;
        this.f2507a = bVar;
    }

    public void a(ViewGroup viewGroup, View view, int i10, long j10) {
        b0.d dVar;
        r1 r1Var = this.f2508b;
        r1.b bVar = this.f2507a;
        if (r1Var.f2511b != null) {
            if (view == null) {
                dVar = null;
            } else {
                dVar = (b0.d) bVar.f2519c.K(view);
            }
            if (dVar == null) {
                r1Var.f2511b.a((r0.a) null, (Object) null, (y0.b) null, null);
            } else {
                r1Var.f2511b.a(dVar.f2326v, dVar.f2328x, (y0.b) null, null);
            }
        }
    }
}
