package x8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar */
public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f27874a;

    public c(BottomAppBar bottomAppBar) {
        this.f27874a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        BottomAppBar.z(this.f27874a);
        this.f27874a.getClass();
        this.f27874a.f8955i0 = null;
    }

    public void onAnimationStart(Animator animator) {
        this.f27874a.f8959m0++;
    }
}
