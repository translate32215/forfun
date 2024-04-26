package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator */
public class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.a0 f3054a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3055b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3056c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3057d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3058e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f3059f;

    public g(d dVar, RecyclerView.a0 a0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3059f = dVar;
        this.f3054a = a0Var;
        this.f3055b = i10;
        this.f3056c = view;
        this.f3057d = i11;
        this.f3058e = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.f3055b != 0) {
            this.f3056c.setTranslationX(0.0f);
        }
        if (this.f3057d != 0) {
            this.f3056c.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.f3058e.setListener((Animator.AnimatorListener) null);
        this.f3059f.d(this.f3054a);
        this.f3059f.f3026p.remove(this.f3054a);
        this.f3059f.p();
    }

    public void onAnimationStart(Animator animator) {
        this.f3059f.getClass();
    }
}
