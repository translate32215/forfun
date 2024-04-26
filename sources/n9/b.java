package n9;

import android.animation.ValueAnimator;

/* compiled from: NavigationBarItemView */
public class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f22434a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f22435b;

    public b(a aVar, float f10) {
        this.f22435b = aVar;
        this.f22434a = f10;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f22435b.e(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f22434a);
    }
}
