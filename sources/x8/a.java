package x8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar */
public class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f27870a;

    public a(BottomAppBar bottomAppBar) {
        this.f27870a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        BottomAppBar.z(this.f27870a);
        this.f27870a.f8954h0 = null;
    }

    public void onAnimationStart(Animator animator) {
        this.f27870a.f8959m0++;
    }
}
