package v9;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.a;

/* compiled from: ClearTextEndIconDelegate */
public class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f26635a;

    public d(a aVar) {
        this.f26635a = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f26635a.f26643c.setScaleX(floatValue);
        this.f26635a.f26643c.setScaleY(floatValue);
    }
}
