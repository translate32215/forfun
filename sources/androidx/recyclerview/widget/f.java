package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator */
public class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.a0 f3050a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3051b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3052c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f3053d;

    public f(d dVar, RecyclerView.a0 a0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3053d = dVar;
        this.f3050a = a0Var;
        this.f3051b = view;
        this.f3052c = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        this.f3051b.setAlpha(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.f3052c.setListener((Animator.AnimatorListener) null);
        this.f3053d.d(this.f3050a);
        this.f3053d.f3025o.remove(this.f3050a);
        this.f3053d.p();
    }

    public void onAnimationStart(Animator animator) {
        this.f3053d.getClass();
    }
}
