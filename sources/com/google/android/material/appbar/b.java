package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: AppBarLayout */
public class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f8922a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f8923b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f8924c;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f8924c = baseBehavior;
        this.f8922a = coordinatorLayout;
        this.f8923b = appBarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f8924c.x(this.f8922a, this.f8923b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
