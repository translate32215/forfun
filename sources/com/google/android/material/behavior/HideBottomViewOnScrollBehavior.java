package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public int f8932a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f8933b = 2;

    /* renamed from: c  reason: collision with root package name */
    public int f8934c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ViewPropertyAnimator f8935d;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f8935d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f8932a = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        return false;
    }

    public void l(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        boolean z10 = true;
        boolean z11 = false;
        if (i11 > 0) {
            if (this.f8933b == 1) {
                z11 = true;
            }
            if (!z11) {
                ViewPropertyAnimator viewPropertyAnimator = this.f8935d;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    v10.clearAnimation();
                }
                this.f8933b = 1;
                s(v10, this.f8932a + this.f8934c, 175, u8.a.f26150c);
            }
        } else if (i11 < 0) {
            if (this.f8933b != 2) {
                z10 = false;
            }
            if (!z10) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f8935d;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    v10.clearAnimation();
                }
                this.f8933b = 2;
                s(v10, 0, 225, u8.a.f26151d);
            }
        }
    }

    public boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public final void s(V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f8935d = v10.animate().translationY((float) i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
