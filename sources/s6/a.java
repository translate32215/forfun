package s6;

import android.animation.ValueAnimator;
import com.google.android.exoplayer2.ui.DefaultTimeBar;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DefaultTimeBar f24965a;

    public /* synthetic */ a(DefaultTimeBar defaultTimeBar) {
        this.f24965a = defaultTimeBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        DefaultTimeBar defaultTimeBar = this.f24965a;
        int i10 = DefaultTimeBar.f5321c0;
        defaultTimeBar.getClass();
        defaultTimeBar.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        defaultTimeBar.invalidate(defaultTimeBar.f5322a);
    }
}
