package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: FabTransformationBehavior */
public class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f9621a;

    public a(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.f9621a = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9621a.invalidate();
    }
}
