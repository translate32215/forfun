package v9;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.b;

/* compiled from: DropdownMenuEndIconDelegate */
public class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f26637a;

    public h(b bVar) {
        this.f26637a = bVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f26637a.f26643c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
