package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;

/* compiled from: DefaultItemAnimator */
public class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.C0037d f3064a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3065b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3066c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f3067d;

    public i(d dVar, d.C0037d dVar2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3067d = dVar;
        this.f3064a = dVar2;
        this.f3065b = viewPropertyAnimator;
        this.f3066c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f3065b.setListener((Animator.AnimatorListener) null);
        this.f3066c.setAlpha(1.0f);
        this.f3066c.setTranslationX(0.0f);
        this.f3066c.setTranslationY(0.0f);
        this.f3067d.d(this.f3064a.f3036b);
        this.f3067d.f3028r.remove(this.f3064a.f3036b);
        this.f3067d.p();
    }

    public void onAnimationStart(Animator animator) {
        d dVar = this.f3067d;
        RecyclerView.a0 a0Var = this.f3064a.f3036b;
        dVar.getClass();
    }
}
