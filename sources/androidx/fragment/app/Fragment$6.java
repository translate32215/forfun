package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.t;

class Fragment$6 implements r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f1572a;

    public Fragment$6(p pVar) {
        this.f1572a = pVar;
    }

    public void d(t tVar, o.b bVar) {
        View view;
        if (bVar == o.b.ON_STOP && (view = this.f1572a.Q) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
