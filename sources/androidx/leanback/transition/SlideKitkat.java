package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import com.startapp.startappsdk.R;

class SlideKitkat extends Visibility {

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f2090b = new DecelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f2091c = new AccelerateInterpolator();

    /* renamed from: d  reason: collision with root package name */
    public static final g f2092d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final g f2093e = new b();

    /* renamed from: f  reason: collision with root package name */
    public static final g f2094f = new c();

    /* renamed from: g  reason: collision with root package name */
    public static final g f2095g = new d();

    /* renamed from: h  reason: collision with root package name */
    public static final g f2096h = new e();

    /* renamed from: i  reason: collision with root package name */
    public static final g f2097i = new f();

    /* renamed from: a  reason: collision with root package name */
    public g f2098a;

    public static class a extends h {
        public float a(View view) {
            return view.getTranslationX() - ((float) view.getWidth());
        }
    }

    public static class b extends i {
        public float a(View view) {
            return view.getTranslationY() - ((float) view.getHeight());
        }
    }

    public static class c extends h {
        public float a(View view) {
            return view.getTranslationX() + ((float) view.getWidth());
        }
    }

    public static class d extends i {
        public float a(View view) {
            return view.getTranslationY() + ((float) view.getHeight());
        }
    }

    public static class e extends h {
        public float a(View view) {
            if (view.getLayoutDirection() == 1) {
                return view.getTranslationX() + ((float) view.getWidth());
            }
            return view.getTranslationX() - ((float) view.getWidth());
        }
    }

    public static class f extends h {
        public float a(View view) {
            if (view.getLayoutDirection() == 1) {
                return view.getTranslationX() - ((float) view.getWidth());
            }
            return view.getTranslationX() + ((float) view.getWidth());
        }
    }

    public interface g {
        float a(View view);

        float b(View view);

        Property<View, Float> c();
    }

    public static abstract class h implements g {
        public float b(View view) {
            return view.getTranslationX();
        }

        public Property<View, Float> c() {
            return View.TRANSLATION_X;
        }
    }

    public static abstract class i implements g {
        public float b(View view) {
            return view.getTranslationY();
        }

        public Property<View, Float> c() {
            return View.TRANSLATION_Y;
        }
    }

    public static class j extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2099a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f2100b;

        /* renamed from: c  reason: collision with root package name */
        public final View f2101c;

        /* renamed from: d  reason: collision with root package name */
        public final float f2102d;

        /* renamed from: e  reason: collision with root package name */
        public final float f2103e;

        /* renamed from: f  reason: collision with root package name */
        public final int f2104f;

        /* renamed from: g  reason: collision with root package name */
        public final Property<View, Float> f2105g;

        public j(View view, Property<View, Float> property, float f10, float f11, int i10) {
            this.f2105g = property;
            this.f2101c = view;
            this.f2103e = f10;
            this.f2102d = f11;
            this.f2104f = i10;
            view.setVisibility(0);
        }

        public void onAnimationCancel(Animator animator) {
            this.f2101c.setTag(R.id.lb_slide_transition_value, new float[]{this.f2101c.getTranslationX(), this.f2101c.getTranslationY()});
            this.f2105g.set(this.f2101c, Float.valueOf(this.f2103e));
            this.f2099a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f2099a) {
                this.f2105g.set(this.f2101c, Float.valueOf(this.f2103e));
            }
            this.f2101c.setVisibility(this.f2104f);
        }

        public void onAnimationPause(Animator animator) {
            this.f2100b = this.f2105g.get(this.f2101c).floatValue();
            this.f2105g.set(this.f2101c, Float.valueOf(this.f2102d));
            this.f2101c.setVisibility(this.f2104f);
        }

        public void onAnimationResume(Animator animator) {
            this.f2105g.set(this.f2101c, Float.valueOf(this.f2100b));
            this.f2101c.setVisibility(0);
        }
    }

    public SlideKitkat() {
        b(80);
    }

    public final Animator a(View view, Property<View, Float> property, float f10, float f11, float f12, TimeInterpolator timeInterpolator, int i10) {
        float[] fArr = (float[]) view.getTag(R.id.lb_slide_transition_value);
        if (fArr != null) {
            f10 = View.TRANSLATION_Y == property ? fArr[1] : fArr[0];
            view.setTag(R.id.lb_slide_transition_value, (Object) null);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, new float[]{f10, f11});
        j jVar = new j(view, property, f12, f11, i10);
        ofFloat.addListener(jVar);
        ofFloat.addPauseListener(jVar);
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }

    public void b(int i10) {
        if (i10 == 3) {
            this.f2098a = f2092d;
        } else if (i10 == 5) {
            this.f2098a = f2094f;
        } else if (i10 == 48) {
            this.f2098a = f2093e;
        } else if (i10 == 80) {
            this.f2098a = f2095g;
        } else if (i10 == 8388611) {
            this.f2098a = f2096h;
        } else if (i10 == 8388613) {
            this.f2098a = f2097i;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
    }

    public Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i10, TransitionValues transitionValues2, int i11) {
        View view = transitionValues2 != null ? transitionValues2.view : null;
        if (view == null) {
            return null;
        }
        float b10 = this.f2098a.b(view);
        return a(view, this.f2098a.c(), this.f2098a.a(view), b10, b10, f2090b, 0);
    }

    public Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i10, TransitionValues transitionValues2, int i11) {
        View view = transitionValues != null ? transitionValues.view : null;
        if (view == null) {
            return null;
        }
        float b10 = this.f2098a.b(view);
        return a(view, this.f2098a.c(), b10, this.f2098a.a(view), b10, f2091c, 4);
    }

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e1.a.f13538l);
        b(obtainStyledAttributes.getInt(3, 80));
        long j10 = (long) obtainStyledAttributes.getInt(1, -1);
        if (j10 >= 0) {
            setDuration(j10);
        }
        long j11 = (long) obtainStyledAttributes.getInt(2, -1);
        if (j11 > 0) {
            setStartDelay(j11);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }
}
