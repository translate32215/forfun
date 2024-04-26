package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import s9.f;

/* compiled from: AppBarLayout */
public class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f8920a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f8921b;

    public a(AppBarLayout appBarLayout, f fVar) {
        this.f8921b = appBarLayout;
        this.f8920a = fVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f8920a.q(floatValue);
        Drawable drawable = this.f8921b.f8897y;
        if (drawable instanceof f) {
            ((f) drawable).q(floatValue);
        }
        for (AppBarLayout.d a10 : this.f8921b.f8895w) {
            a10.a(floatValue, this.f8920a.C);
        }
    }
}
