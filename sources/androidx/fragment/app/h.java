package androidx.fragment.app;

import android.animation.Animator;
import android.support.v4.media.a;
import android.util.Log;
import androidx.fragment.app.q0;
import k0.d;

/* compiled from: DefaultSpecialEffectsController */
public class h implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Animator f1690a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q0.d f1691b;

    public h(f fVar, Animator animator, q0.d dVar) {
        this.f1690a = animator;
        this.f1691b = dVar;
    }

    public void a() {
        this.f1690a.end();
        if (a0.N(2)) {
            StringBuilder a10 = a.a("Animator from operation ");
            a10.append(this.f1691b);
            a10.append(" has been canceled.");
            Log.v("FragmentManager", a10.toString());
        }
    }
}
