package e9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: CircularRevealCompat */
public class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f17804a;

    public a(e eVar) {
        this.f17804a = eVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f17804a.a();
    }

    public void onAnimationStart(Animator animator) {
        this.f17804a.b();
    }
}
