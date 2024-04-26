package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;

/* compiled from: DefaultItemAnimator */
public class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.C0037d f3060a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3061b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3062c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f3063d;

    public h(d dVar, d.C0037d dVar2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3063d = dVar;
        this.f3060a = dVar2;
        this.f3061b = viewPropertyAnimator;
        this.f3062c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f3061b.setListener((Animator.AnimatorListener) null);
        this.f3062c.setAlpha(1.0f);
        this.f3062c.setTranslationX(0.0f);
        this.f3062c.setTranslationY(0.0f);
        this.f3063d.d(this.f3060a.f3035a);
        this.f3063d.f3028r.remove(this.f3060a.f3035a);
        this.f3063d.p();
    }

    public void onAnimationStart(Animator animator) {
        d dVar = this.f3063d;
        RecyclerView.a0 a0Var = this.f3060a.f3035a;
        dVar.getClass();
    }
}
