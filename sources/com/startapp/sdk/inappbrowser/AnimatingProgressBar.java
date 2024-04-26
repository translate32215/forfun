package com.startapp.sdk.inappbrowser;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;

/* compiled from: Sta */
public class AnimatingProgressBar extends ProgressBar {

    /* renamed from: c  reason: collision with root package name */
    public static final Interpolator f12534c = new AccelerateDecelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public ValueAnimator f12535a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12536b;

    /* compiled from: Sta */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            AnimatingProgressBar.super.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public AnimatingProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12536b = false;
        this.f12536b = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f12535a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void setProgress(int i10) {
        if (!this.f12536b) {
            super.setProgress(i10);
            return;
        }
        ValueAnimator valueAnimator = this.f12535a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (getProgress() >= i10) {
                return;
            }
        } else {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getProgress(), i10});
            this.f12535a = ofInt;
            ofInt.setInterpolator(f12534c);
            this.f12535a.addUpdateListener(new a());
        }
        this.f12535a.setIntValues(new int[]{getProgress(), i10});
        this.f12535a.start();
    }

    public void a() {
        super.setProgress(0);
        ValueAnimator valueAnimator = this.f12535a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
