package z8;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import s9.f;

/* compiled from: BottomSheetBehavior */
public class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f28734a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f28734a = bottomSheetBehavior;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        f fVar = this.f28734a.f8978h;
        if (fVar != null) {
            fVar.s(floatValue);
        }
    }
}
