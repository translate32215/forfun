package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

public class FadeAndShortSlide extends Visibility {

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f2077e = new DecelerateInterpolator();

    /* renamed from: f  reason: collision with root package name */
    public static final g f2078f = new a();

    /* renamed from: g  reason: collision with root package name */
    public static final g f2079g = new b();

    /* renamed from: h  reason: collision with root package name */
    public static final g f2080h = new c();

    /* renamed from: i  reason: collision with root package name */
    public static final g f2081i = new d();

    /* renamed from: r  reason: collision with root package name */
    public static final g f2082r = new e();

    /* renamed from: a  reason: collision with root package name */
    public g f2083a;

    /* renamed from: b  reason: collision with root package name */
    public Visibility f2084b = new Fade();

    /* renamed from: c  reason: collision with root package name */
    public float f2085c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public final g f2086d = new f();

    public static class a extends g {
        public float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            boolean z10 = true;
            if (viewGroup.getLayoutDirection() != 1) {
                z10 = false;
            }
            if (!z10) {
                return view.getTranslationX() - fadeAndShortSlide.a(viewGroup);
            }
            return fadeAndShortSlide.a(viewGroup) + view.getTranslationX();
        }
    }

    public static class b extends g {
        public float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            boolean z10 = true;
            if (viewGroup.getLayoutDirection() != 1) {
                z10 = false;
            }
            if (z10) {
                return view.getTranslationX() - fadeAndShortSlide.a(viewGroup);
            }
            return view.getTranslationX() + fadeAndShortSlide.a(viewGroup);
        }
    }

    public static class c extends g {
        public float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int i10;
            int width = (view.getWidth() / 2) + iArr[0];
            viewGroup.getLocationOnScreen(iArr);
            Rect epicenter = fadeAndShortSlide.getEpicenter();
            if (epicenter == null) {
                i10 = (viewGroup.getWidth() / 2) + iArr[0];
            } else {
                i10 = epicenter.centerX();
            }
            if (width < i10) {
                return view.getTranslationX() - fadeAndShortSlide.a(viewGroup);
            }
            return fadeAndShortSlide.a(viewGroup) + view.getTranslationX();
        }
    }

    public static class d extends g {
        public float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return fadeAndShortSlide.b(viewGroup) + view.getTranslationY();
        }
    }

    public static class e extends g {
        public float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY() - fadeAndShortSlide.b(viewGroup);
        }
    }

    public class f extends g {
        public f() {
        }

        public float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int i10;
            int height = (view.getHeight() / 2) + iArr[1];
            viewGroup.getLocationOnScreen(iArr);
            Rect epicenter = FadeAndShortSlide.this.getEpicenter();
            if (epicenter == null) {
                i10 = (viewGroup.getHeight() / 2) + iArr[1];
            } else {
                i10 = epicenter.centerY();
            }
            if (height < i10) {
                return view.getTranslationY() - fadeAndShortSlide.b(viewGroup);
            }
            return fadeAndShortSlide.b(viewGroup) + view.getTranslationY();
        }
    }

    public static abstract class g {
        public float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationX();
        }

        public float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY();
        }
    }

    public FadeAndShortSlide() {
        c(8388611);
    }

    public float a(ViewGroup viewGroup) {
        float f10 = this.f2085c;
        return f10 >= 0.0f ? f10 : (float) (viewGroup.getWidth() / 4);
    }

    public Transition addListener(Transition.TransitionListener transitionListener) {
        this.f2084b.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    public float b(ViewGroup viewGroup) {
        float f10 = this.f2085c;
        return f10 >= 0.0f ? f10 : (float) (viewGroup.getHeight() / 4);
    }

    public void c(int i10) {
        if (i10 == 48) {
            this.f2083a = f2082r;
        } else if (i10 == 80) {
            this.f2083a = f2081i;
        } else if (i10 == 112) {
            this.f2083a = this.f2086d;
        } else if (i10 == 8388611) {
            this.f2083a = f2078f;
        } else if (i10 == 8388613) {
            this.f2083a = f2079g;
        } else if (i10 == 8388615) {
            this.f2083a = f2080h;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
    }

    public void captureEndValues(TransitionValues transitionValues) {
        this.f2084b.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    public void captureStartValues(TransitionValues transitionValues) {
        this.f2084b.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewGroup viewGroup2 = viewGroup;
        ViewGroup viewGroup3 = view;
        TransitionValues transitionValues3 = transitionValues2;
        if (transitionValues3 == null || viewGroup2 == viewGroup3) {
            return null;
        }
        int[] iArr = (int[]) transitionValues3.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i10 = iArr[0];
        int i11 = iArr[1];
        float translationX = view.getTranslationX();
        View view2 = view;
        TransitionValues transitionValues4 = transitionValues2;
        Animator a10 = d.a(view2, transitionValues4, i10, i11, this.f2083a.a(this, viewGroup, viewGroup3, iArr), this.f2083a.b(this, viewGroup, viewGroup3, iArr), translationX, view.getTranslationY(), f2077e, this);
        Animator onAppear = this.f2084b.onAppear(viewGroup, viewGroup3, transitionValues, transitionValues3);
        if (a10 == null) {
            return onAppear;
        }
        if (onAppear == null) {
            return a10;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(a10).with(onAppear);
        return animatorSet;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewGroup viewGroup2 = viewGroup;
        ViewGroup viewGroup3 = view;
        TransitionValues transitionValues3 = transitionValues;
        if (transitionValues3 == null || viewGroup2 == viewGroup3) {
            return null;
        }
        int[] iArr = (int[]) transitionValues3.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i10 = iArr[0];
        int i11 = iArr[1];
        float translationX = view.getTranslationX();
        float a10 = this.f2083a.a(this, viewGroup, viewGroup3, iArr);
        Animator a11 = d.a(view, transitionValues, i10, i11, translationX, view.getTranslationY(), a10, this.f2083a.b(this, viewGroup, viewGroup3, iArr), f2077e, this);
        Animator onDisappear = this.f2084b.onDisappear(viewGroup, viewGroup3, transitionValues3, transitionValues2);
        if (a11 == null) {
            return onDisappear;
        }
        if (onDisappear == null) {
            return a11;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(a11).with(onDisappear);
        return animatorSet;
    }

    public Transition removeListener(Transition.TransitionListener transitionListener) {
        this.f2084b.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    public void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        this.f2084b.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }

    public Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.f2084b = (Visibility) this.f2084b.clone();
        return fadeAndShortSlide;
    }

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e1.a.f13538l);
        c(obtainStyledAttributes.getInt(3, 8388611));
        obtainStyledAttributes.recycle();
    }
}
