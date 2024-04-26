package b2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import s.a;

/* compiled from: Transition */
public class k extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f3426a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f3427b;

    public k(j jVar, a aVar) {
        this.f3427b = jVar;
        this.f3426a = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f3426a.remove(animator);
        this.f3427b.f3414u.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.f3427b.f3414u.add(animator);
    }
}
