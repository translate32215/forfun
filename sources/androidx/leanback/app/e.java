package androidx.leanback.app;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.leanback.transition.b;
import com.startapp.startappsdk.R;

/* compiled from: BaseSupportFragment */
public class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1944a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f1945b;

    public e(d dVar, View view) {
        this.f1945b = dVar;
        this.f1944a = view;
    }

    public boolean onPreDraw() {
        this.f1944a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f1945b.q() == null) {
            return true;
        }
        d dVar = this.f1945b;
        if (dVar.Q == null) {
            return true;
        }
        dVar.getClass();
        Object c10 = b.c(((h) dVar).q(), R.transition.lb_browse_entrance_transition);
        dVar.I0 = c10;
        if (c10 != null) {
            b.a(c10, new f(dVar));
        }
        h hVar = (h) this.f1945b;
        hVar.R0.A0();
        hVar.P0.d();
        d dVar2 = this.f1945b;
        Object obj = dVar2.I0;
        if (obj != null) {
            b.d(((h) dVar2).f1972q1, obj);
            return false;
        }
        dVar2.H0.c(dVar2.F0);
        return false;
    }
}
