package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.leanback.widget.o0;
import androidx.leanback.widget.p0;
import com.startapp.startappsdk.R;

public class ParallaxTransition extends Visibility {

    /* renamed from: a  reason: collision with root package name */
    public static Interpolator f2088a = new LinearInterpolator();

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o0 f2089a;

        public a(ParallaxTransition parallaxTransition, o0 o0Var) {
            this.f2089a = o0Var;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            o0 o0Var = this.f2089a;
            for (int i10 = 0; i10 < o0Var.f2453e.size(); i10++) {
                p0 p0Var = o0Var.f2453e.get(i10);
                if (p0Var.f2497a.size() >= 2) {
                    if (o0Var.f2449a.size() >= 2) {
                        float f10 = o0Var.f2452d[0];
                        int i11 = 1;
                        while (i11 < o0Var.f2449a.size()) {
                            float f11 = o0Var.f2452d[i11];
                            if (f11 < f10) {
                                int i12 = i11 - 1;
                                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\"", new Object[]{Integer.valueOf(i11), ((Property) o0Var.f2449a.get(i11)).getName(), Integer.valueOf(i12), ((Property) o0Var.f2449a.get(i12)).getName()}));
                            } else if (f10 == -3.4028235E38f && f11 == Float.MAX_VALUE) {
                                int i13 = i11 - 1;
                                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER", new Object[]{Integer.valueOf(i13), ((Property) o0Var.f2449a.get(i13)).getName(), Integer.valueOf(i11), ((Property) o0Var.f2449a.get(i11)).getName()}));
                            } else {
                                i11++;
                                f10 = f11;
                            }
                        }
                    }
                    boolean z10 = false;
                    for (int i14 = 0; i14 < p0Var.f2498b.size(); i14++) {
                        p0Var.f2498b.get(i14).getClass();
                        if (!z10) {
                            p0Var.a(o0Var);
                            z10 = true;
                        }
                    }
                }
            }
        }
    }

    public ParallaxTransition() {
    }

    public Animator a(View view) {
        o0 o0Var = (o0) view.getTag(R.id.lb_parallax_source);
        if (o0Var == null) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(f2088a);
        ofFloat.addUpdateListener(new a(this, o0Var));
        return ofFloat;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        return a(view);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        return a(view);
    }

    public ParallaxTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
