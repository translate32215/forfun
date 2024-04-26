package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e.b;
import java.util.ArrayList;
import u8.h;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final h f9616c = new h(75, 150);

    /* renamed from: d  reason: collision with root package name */
    public final h f9617d = new h(0, 150);

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f9618a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f9619b;

        public a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z10, View view) {
            this.f9618a = z10;
            this.f9619b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f9618a) {
                this.f9619b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f9618a) {
                this.f9619b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public AnimatorSet u(View view, View view2, boolean z10, boolean z11) {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        h hVar = z10 ? this.f9616c : this.f9617d;
        if (z10) {
            if (!z11) {
                view2.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f});
        }
        hVar.a(objectAnimator);
        arrayList.add(objectAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        b.b(animatorSet, arrayList);
        animatorSet.addListener(new a(this, z10, view2));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
