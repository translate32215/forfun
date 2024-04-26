package k9;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.d;

/* compiled from: FloatingActionButtonImpl */
public class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f20572a;

    public b(d dVar) {
        this.f20572a = dVar;
    }

    public boolean onPreDraw() {
        d dVar = this.f20572a;
        float rotation = dVar.f9271r.getRotation();
        if (dVar.f9264k == rotation) {
            return true;
        }
        dVar.f9264k = rotation;
        dVar.t();
        return true;
    }
}
