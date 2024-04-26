package androidx.leanback.app;

import android.view.View;
import androidx.fragment.app.p;
import androidx.leanback.app.h;
import androidx.leanback.transition.c;
import androidx.leanback.widget.VerticalGridView;

/* compiled from: BrowseSupportFragment */
public class j extends c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f2016b;

    public j(h hVar) {
        this.f2016b = hVar;
    }

    public void a(Object obj) {
        VerticalGridView verticalGridView;
        p pVar;
        View view;
        h hVar = this.f2016b;
        hVar.f1973r1 = null;
        h.p pVar2 = hVar.P0;
        if (pVar2 != null) {
            pVar2.b();
            h hVar2 = this.f2016b;
            if (!hVar2.f1959d1 && (pVar = hVar2.Q0) != null && (view = pVar.Q) != null && !view.hasFocus()) {
                view.requestFocus();
            }
        }
        l lVar = this.f2016b.R0;
        if (lVar != null) {
            lVar.u0();
            h hVar3 = this.f2016b;
            if (hVar3.f1959d1 && (verticalGridView = hVar3.R0.f1924o0) != null && !verticalGridView.hasFocus()) {
                verticalGridView.requestFocus();
            }
        }
        this.f2016b.N0();
        this.f2016b.getClass();
    }

    public void b(Object obj) {
    }
}
