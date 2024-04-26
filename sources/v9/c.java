package v9;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.a;

/* compiled from: ClearTextEndIconDelegate */
public class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f26634a;

    public c(a aVar) {
        this.f26634a = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f26634a.f26643c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
