package b2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: Transition */
public class l extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f3428a;

    public l(j jVar) {
        this.f3428a = jVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f3428a.n();
        animator.removeListener(this);
    }
}
