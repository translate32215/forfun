package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f9603b;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f9603b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public boolean t(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f9603b;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet u10 = u(view, view2, z10, z12);
        this.f9603b = u10;
        u10.addListener(new a());
        this.f9603b.start();
        if (!z11) {
            this.f9603b.end();
        }
        return true;
    }

    public abstract AnimatorSet u(View view, View view2, boolean z10, boolean z11);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
