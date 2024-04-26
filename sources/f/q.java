package f;

import android.view.View;
import o0.c0;
import o0.j0;
import o0.k0;

/* compiled from: AppCompatDelegateImpl */
public class q extends k0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f17949a;

    public q(l lVar) {
        this.f17949a = lVar;
    }

    public void b(View view) {
        this.f17949a.f17903w.setAlpha(1.0f);
        this.f17949a.f17906z.d((j0) null);
        this.f17949a.f17906z = null;
    }

    public void c(View view) {
        this.f17949a.f17903w.setVisibility(0);
        if (this.f17949a.f17903w.getParent() instanceof View) {
            c0.A((View) this.f17949a.f17903w.getParent());
        }
    }
}
