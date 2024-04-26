package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator */
public class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.a0 f3046a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3047b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3048c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f3049d;

    public e(d dVar, RecyclerView.a0 a0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3049d = dVar;
        this.f3046a = a0Var;
        this.f3047b = viewPropertyAnimator;
        this.f3048c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f3047b.setListener((Animator.AnimatorListener) null);
        this.f3048c.setAlpha(1.0f);
        this.f3049d.d(this.f3046a);
        this.f3049d.f3027q.remove(this.f3046a);
        this.f3049d.p();
    }

    public void onAnimationStart(Animator animator) {
        this.f3049d.getClass();
    }
}
