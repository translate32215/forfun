package androidx.fragment.app;

import android.support.v4.media.a;
import android.util.Log;
import androidx.fragment.app.f;
import androidx.fragment.app.q0;

/* compiled from: DefaultSpecialEffectsController */
public class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.d f1758a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q0.d f1759b;

    public n(f fVar, f.d dVar, q0.d dVar2) {
        this.f1758a = dVar;
        this.f1759b = dVar2;
    }

    public void run() {
        this.f1758a.a();
        if (a0.N(2)) {
            StringBuilder a10 = a.a("Transition for operation ");
            a10.append(this.f1759b);
            a10.append("has completed");
            Log.v("FragmentManager", a10.toString());
        }
    }
}
