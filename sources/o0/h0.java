package o0;

import android.animation.ValueAnimator;
import android.view.View;
import f.y;

public final /* synthetic */ class h0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l0 f22583a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f22584b;

    public /* synthetic */ h0(l0 l0Var, View view) {
        this.f22583a = l0Var;
        this.f22584b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) y.this.f17989d.getParent()).invalidate();
    }
}
